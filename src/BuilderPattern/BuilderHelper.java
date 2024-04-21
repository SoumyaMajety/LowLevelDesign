//package BuilderPattern;
//
//public class BuilderHelper {
//    int id;
//    String name;
//    int psp;
//
//    public int getId() {
//        return id;
//    }
//
//   // public void setId(int id) throws Exception{
//    //changed return type from void to type BuilderHelper
//    public BuilderHelper setId(int id) throws Exception{
//       // if (id < 0 || id > 100)
////            throw new IllegalArgumentException() ;
////        else
//            this.id = id;
//            return this;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    //public void setName(String name) {
//
//        //changed return type from void to type BuilderHelper
//        public BuilderHelper setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public int getPsp() {
//        return psp;
//    }
//
//   // public void setPsp(int psp) throws Exception {
//        //changed return type from void to type BuilderHelper
//        public BuilderHelper setPsp(int psp) throws Exception {
////        if(psp<0)
////            throw new Exception();
//        this.psp = psp;
//        return this;
//    }
//
//    // creating method which returns builder object to avoid creating this object in main class
//    public Builder build() throws Exception {
//   // now do validations here in helper class instead of doing them in builder class (earlier validation in builder class
//       if(this.id<0 || this.id>99)
//           throw new IllegalArgumentException("Age  is less than 0 or greater than 99");
//       if(this.psp<0 || this.psp>100)
//           throw  new IllegalArgumentException("Psp is < 0 or > 100");
////        Builder b = new Builder(this);
////        return b.getInstance();
//        return new Builder(this);
//    }
//}
