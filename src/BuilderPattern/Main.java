package BuilderPattern;

public class Main {
    public static void main(String[] args) throws Exception   {
       // Builder b = new Builder(-1,"hello");
//        System.out.println(b.id);
//        System.out.println(b.name);

//        BuilderHelper bh = new BuilderHelper();
//        bh.setId(1);
//        bh.setName("one");
        //case 1. validation in helper class
       // try {
           // bh.setPsp(-7);
       // }
        //catch(Exception e){
        //    System.out.println(e.getMessage());
      //  }
//        System.out.println(bh.id+" "+bh.name+" "+bh.psp);
//        Builder b = new Builder(bh);
//            b.getInstance();

        //case 2. validation in builder class
  //      BuilderHelper bh = new BuilderHelper();
//        bh.setId(1);
//        bh.setName("one");
        // bh.setPsp(-7);
//        try {
//            Builder b = new Builder(bh);
//            b.getInstance();
//        }
//        catch(Exception e){
 //            System.out.println(e.getMessage());
//          }
       // System.out.println(b);


 //case 3. now create method in helper which returns builder obj,do not create Builder explicit object in main line 29,30
        // do validation also in build method

//        BuilderHelper bh = new BuilderHelper();
//        bh.setId(2);
//        bh.setName("two");
//        bh.setPsp(-98);
//        Builder b = bh.build();

//case 4.instead of writing multiple setters , use Streams to create helper object in single line code
        // for that change the return type of setters to class BUilderHelper class

//        Builder bh = new  BuilderHelper().setId(3).setName("three").setPsp(90).build();
//        System.out.println(bh);

// case 5:  Even now we can't prevent creating object directly to builder class
// so lets make constructor private, but then we can't create object through build class()
// as it cant access the Builder class private constructor.
// so lets make helper class as nested class in BUilder class
        Builder bh = new Builder.BuilderHelper1().setId(3).setName("three").setPsp(90).build();

        // we can avoid this object creation too by using a method which returns builderHelper1 class obj
    Builder builder = Builder.getInstance().setId(4).setName("four").setPsp(89).build();
        System.out.println(bh);

    }
}
