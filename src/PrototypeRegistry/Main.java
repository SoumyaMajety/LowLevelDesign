package PrototypeRegistry;

public class Main {

    public static void fillRegistry(StudentRegistry sr){

        Student s = new Student();
        s.setId(1); s.setName("alice");
           sr.setObject("Student",s);
        IntelStudent i1 = new IntelStudent();
        i1.setPsp(90);i1.setName("IntelligentAlice");i1.setId(2);
        sr.setObject("IntellStudent",i1);
    }
    public static void main(String[] args){
//
        // without registry
//        Student s = new Student();
//        s.setId(1); s.setName("alice");
//        Student s2 = s.copy();
//        System.out.println(s2.getId()+" "+s2.getName());
//        IntelStudent i1 = new IntelStudent();
//        i1.setPsp(90);i1.setName("IntelligentAlice");i1.setId(2);
//        IntelStudent i2 = i1.copy();
//        System.out.println(i2.getId()+" "+i2.getName()+" "+i2.getPsp());
//        System.out.println();


        //
//        //with registry;
        StudentRegistry sr = new StudentRegistry();
        fillRegistry(sr);
        Student s2 = sr.getObj("Student");
        System.out.println( s2.getId()+" "+s2.getName());
        IntelStudent i1 = (IntelStudent) sr.getObj("IntellStudent");
        System.out.println( i1.getId()+" "+i1.getName()+" "+i1.getPsp());

    }
}
