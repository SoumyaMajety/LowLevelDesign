package PrototypeRegistry;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
   private Map<String,Student> registry = new HashMap<>();
    public void setObject(String key, Student value){
        registry.put(key,value);
    }
    public Student getObj(String type){
        return registry.get(type).copy();
    }
}
