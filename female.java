//This is also a continuation of polymorphism

public class female extends gender {//This has become a parent class for ths "youngGirl" class

    public female(String name) {
        super(name);
    }
    @Override
    public void race(){
        System.out.println("female cat walks");
    }

    public void makeUp(){
        System.out.println("female dress elegant");

    }
}
