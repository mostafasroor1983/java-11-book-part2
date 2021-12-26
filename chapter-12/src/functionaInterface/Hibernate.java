package functionaInterface;


//not functional interface because equals(Hibernate o);
// if we replace it to equals(Object o); then it will be functional interface
public interface Hibernate {
  String toString();
  public boolean equals(Hibernate o);
  public abstract int hashCode();
  public void rest();
}
