package example;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;


//how to take advantage of annotation by using Java's Reflection API
public class ObjectToJsonConverter {

  public static void main(String[] args) {
    Person p = new Person();
    p.setAge("38");
    p.setFirstName("Mostafa");
    p.setLastName("Srour");
    p.setAddress("Beirut");
    System.out.println(new ObjectToJsonConverter().convertToJson(p));
  }

  //check whether our object is null or not,
  //as well as whether its type has the @JsonSerializable annotation or not.
  private void checkIfSerializable(Object object) {
    if (Objects.isNull(object)) {
      throw new JsonSerializationException("The object to serialize is null");
    }

    Class<?> clazz = object.getClass();
    if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
      throw new JsonSerializationException("The class " + clazz.getSimpleName()
        + " is not annotated with JsonSerializable");
    }
  }


  //look for any method with the @Init annotation, and we execute it to initialize our object's fields:
  private void initializeObject(Object object) throws Exception {
    Class<?> clazz = object.getClass();
    for (Method method : clazz.getDeclaredMethods()) {
      if (method.isAnnotationPresent(Init.class)) {
        //The call of method.setAccessible(true) allows us to execute the private initNames() method.
        method.setAccessible(true);
        method.invoke(object);
      }
    }
  }

  //we iterate over our object's fields, retrieve the key and value of JSON elements,
  //and put them in a map. Then we create the JSON string from the map
  private String getJsonString(Object object) throws Exception {
    Class<?> clazz = object.getClass();
    Map<String, String> jsonElementsMap = new HashMap<>();
    for (Field field : clazz.getDeclaredFields()) {
      field.setAccessible(true);
      if (field.isAnnotationPresent(JsonElement.class)) {
        jsonElementsMap.put(field.getName(), (String) field.get(object));
      }
    }

    String jsonString = jsonElementsMap.entrySet()
      .stream()
      .map(entry -> "\"" + entry.getKey() + "\":\""
        + entry.getValue() + "\"")
      .collect(Collectors.joining(","));
    return "{" + jsonString + "}";
  }

  public String convertToJson(Object object) throws JsonSerializationException {
    try {
      checkIfSerializable(object);
      initializeObject(object);
      return getJsonString(object);
    } catch (Exception e) {
      throw new JsonSerializationException(e.getMessage());
    }
  }

  class JsonSerializationException extends RuntimeException {
    JsonSerializationException(String message) {
      super(message);
    }
  }
}
