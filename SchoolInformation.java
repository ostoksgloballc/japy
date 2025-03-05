//This is an example of an inheritance.
//
//
//public class SchoolInformation {//This is the parent class
//
//
//    private String firstName;
//    private String lastName;
//    private String email;
//    private int age;
//
//    public SchoolInformation(String firstName, String lastName, String email, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.email = email;
//        this.age = age;
//    }
//   public void displayDetails() {//this is a "Method" used to display the details
//        System.out.println(firstName + " " + lastName + " " + age + " " + email);
//    }
//}
//
public class SchoolInformation {
    private String name;
    private int age;
    private char gender;
    private double birthday;
    private double weight;

    //We use "Construct" for the next line/method
    public SchoolInformation(String name, int age, char gender, double birthday, double weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthday = birthday;
        this.weight = weight;
    }
    public void displayDetails(){
        System.out.println(name + " " + age + " " + gender + " " + birthday + " " + weight);
    }
}