//This is an example of an inheritance.
//
//public class StudentInformation extends SchoolInformation{//This is the child's class. we use "extends" to inherit information from the parent class which is SchoolInformation.
//
//
//    private String level;
//
//    public StudentInformation(String firstName, String lastName, String email, int age, String level) {
//        super(firstName, lastName, email, age);//The "supper" key word on this line is used to call the constructor method from the parent class.
//        this.level = level;
//    }
//
//    public void displayStudentInformation(){
//        System.out.println("level: " + level);
//    }
//
//    public static void main(String[] args){
//        StudentInformation StudentInformation = new StudentInformation ("john", "francis", "john@gmail.com", 18, "firstYear");
//    StudentInformation.displayDetails();
//    }
//}

public class StudentInformation extends SchoolInformation{

    private double height;

    //We use "Construct" for the next line/method
    public StudentInformation(String name, int age, char gender, double birthday, double weight, double height) {
        super(name, age, gender, birthday, weight);
        this.height = height;
    }

    public void displayStudentInformation() {
        displayDetails();//This is also from the parent class.
        System.out.println("height: " + height);
    }

    public static void main(String[] args){
        StudentInformation StudentInformation = new StudentInformation("paul", 35, 'M', 01.1990, 70.5, 6.0);
        StudentInformation.displayStudentInformation();
    }
}

