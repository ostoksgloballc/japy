public class MethodClass {
    public static void main(String[] args) { //this is the main method, anything done inside this curley bracket belong to this main method.
//method = a block of code that is executed whenever it is called upon.
      //  String name = "Bro";
      //  int age = 18;
     //   double height = 3.14;
       // hello(name, age, height); //Things in this bracket are the argument, and we can pass in more than one argument as long as we have a matching set of parameter below. We can call this method anytime we want.

   // }
    //we will create our own method outside the curley bracket, to do that, we need a recurrent type "void" to start with.
  // static void hello(String name, int age, double height) {//this is the parameter. Anything within this curley bracket belong to the method we are using here "hello".
        //whenever we call the "hello method", it's going to bring everything withing the curley bracket
       //we start with "static" method so that we can call the "hello" from main/PSVM above.
        //System.out.println("hello " + name + " you are " + age + " years old  " + height)



        //Return type "void" explanation.

       int y = 5;
       int x = 8;

      System.out.println(add(x,y));
    }
    //instead of using a return type "void" we use our "date type" in this case "int".
    static int add (int x, int y) {//this return method will "add" the two numbers above "y and x" and return the answer/value.

        return x + y;

    }
}
