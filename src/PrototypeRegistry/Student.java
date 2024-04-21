package PrototypeRegistry;

public class Student implements StudentPrototype<Student>{

     int id;
     String name;
    public Student(){

    }
    public Student(Student s){
        this.id = s.id;
        this.name = s.name;
    }
    public Student copy(){
        Student s = new Student(this);
        return s;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
