package serialization.security;

import java.io.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Employee2 implements Serializable {
    private String name;
    private String ssn;
    private static Map<String, Employee2> pool = new ConcurrentHashMap<>();

    private Employee2() {
    }

    public synchronized static Employee2 getEmployee(String name) {
        if (pool.get(name) == null) {
            var e = new Employee2();
            e.name = name;
            pool.put(name, e);
        }
        return pool.get(name);
    }

    public synchronized Object readResolve() throws ObjectStreamException {
        var existingEmployee = pool.get(name);
        if (existingEmployee == null) {
            // New employee not in memory
            pool.put(name, this);
            return this;
        } else {
            // Existing user already in memory
            existingEmployee.name = this.name;
            existingEmployee.ssn = this.ssn;
            return existingEmployee;
        }
    }

    public Object writeReplace() throws ObjectStreamException {
        var e = pool.get(name);
        return e != null ? e : this;
    }

}