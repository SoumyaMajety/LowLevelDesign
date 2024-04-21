package BuilderPattern;

public class Builder {
    int id;
    String name;
    int psp;
    private Builder(BuilderHelper1 bh) throws Exception {
//        if (bh.id < 0 && bh.id > 100)
//            throw new IllegalArgumentException() ;
//        else
            this.id = bh.id;

        this.name = bh.name;
//        if(bh.psp<0)
//            throw new Exception("Exception in creating builder class :psp<0");
//       else
           this.psp = bh.psp;
    }
  public static BuilderHelper1 getInstance(){

        return new BuilderHelper1();
  }

//    public Builder getInstance(){
//        return this;
//    }
public static class BuilderHelper1 {
    int id;
    String name;
    int psp;

    public int getId() {
        return id;
    }

    public BuilderHelper1 setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BuilderHelper1 setName(String name) {
        this.name = name;
        return this;
    }

    public int getPsp() {
        return psp;
    }

    public BuilderHelper1 setPsp(int psp) {
        this.psp = psp;
        return this;
    }

    // creating method which returns builder object to avoid creating this object in main class
    public Builder build() throws Exception {
        // now do validations here in helper class instead of doing them in builder class (earlier validation in builder class
        if(this.id<0 || this.id>99)
            throw new IllegalArgumentException("Age  is less than 0 or greater than 99");
        if(this.psp<0 || this.psp>100)
            throw  new IllegalArgumentException("Psp is < 0 or > 100");
//        Builder b = new Builder(this);
//        return b.getInstance();
        return new Builder(this);
    }
}
}
