//This is polymorphism
//This is the child's class


public class male extends gender{

    public male(String name) {//The male now can represent the constructor name of the gender.
        super(name);
    }
    //Method "Override": it means the methods will bear the same method name but different information.
    @Override
    public void race(){
        System.out.println("The male is African");//This is what will be printed now if I try to print because this (This man is a black) from the parent class has been override.
    }

    public void smart(){//This is a new method on it own, it's not coming with any information from the parent class.
        System.out.println("The male is a smart");
    }
}
