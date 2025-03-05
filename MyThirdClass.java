public class MyThirdClass {
    int number1 = 40; //declaration and assignment

    int maxwell = 78; //32 byte

    int[] myNumbers = {2,3,4,5,6,7,8}; //this is how we use an Array


    double[] students = {2,3,4,5,6}; //this is a 'double data type' with an Atrray function. it has 64 byte. it accepts both single number and those wuth decimal point.

    float salary = 79.5F; // Float is always cool with numbers with decimal point, but must always put the float sign (hyyhyf).

    long population = 1000000; // We can also write this way (long population (long) = 1,000,000.

    boolean YesorNo = true; // i have question about this
    boolean AreYouAGirl = YesorNo; // and this too

    char gender = 'M';

    String name = "Mary";




    public static void main(String[] args) {
        MyThirdClass obalola = new MyThirdClass();

        System.out.println(obalola.number1);
        System.out.println(obalola.maxwell);
        System.out.println(obalola.myNumbers[2]);
        System.out.println(obalola.students[4]);
        System.out.println(obalola.salary);
        System.out.println(obalola.population);
        System.out.println(obalola.AreYouAGirl);
        System.out.println(obalola.gender);
        System.out.println(obalola.name);


//



    }
}