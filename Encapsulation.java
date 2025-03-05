//This is an example of an Encapsulated.

public class Encapsulation{//This is used to hid our property. The access modifier we use strictly private here, we don't use public at all.
    //in order to access what we have encapsulated in other class; we use "Getter and Setter". We go to generator, there we will find "setter and getter".
    private String name;
    private String address;
    private int age;


    //Blow are what can be used to call the information above outside of this Encapsulated class "getName, setName" etc.

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;

    }
}
