//This is polymorphism
//This is the parent class

public class gender {//This is also similar ti inheritance.
    private String name;

    public gender(String name) {//This line is the constructor.
        this.name = name;

    }
    public void race() {
        System.out.println("This man is a black");//This is the method we are trying to override.
    }

    public String getName() {
        return name;

    }
}
