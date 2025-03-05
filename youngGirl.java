//This is still a continuation of polymorphism

public class youngGirl extends female{

    public youngGirl(String name) {
        super(name);
    }

    @Override
    public void race(){
        System.out.println("The youngGirl cat walks");
    }
}
