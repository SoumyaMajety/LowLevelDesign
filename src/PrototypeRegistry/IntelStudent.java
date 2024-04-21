package PrototypeRegistry;

public class IntelStudent extends Student{
    int psp;

    public IntelStudent(){

    }
    public IntelStudent(IntelStudent is){
        super(is);
        this.psp = is.psp;
    }
    public IntelStudent copy(){
        IntelStudent i1 = new IntelStudent(this);
        return i1;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }


}
