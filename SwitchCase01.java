public class SwitchCase01 {
    public static void main(String[] args) {
//Switch Data Type (A Switch statement is used to fetch out value/result we already know or what it should look like. Switch always use "Case" instead of "if")
//    int month = 7; //Whatever we put as the value here will determine what we will get as our output while using a (Switch) data type. So "7" will give us July while other numbers will give us the month that matches the number and if the value we input does not match any month, it will give us an "invalid month".
//    switch (month) {
//        case 1:
//            System.out.println("January");
//            break; // We will always have a break in between our statements to stop the process once we have the right answer/value.
//        case 2: //NOTE : We can remove the case 2 if case 1 is monitoring lets say January and February.
//            System.out.println("February");
//            break;
//        case 3:
//            System.out.println("March");
//            break;
//        case 4:
//            System.out.println("April");
//            break;
//        case 5:
//            System.out.println("May");
//            break;
//        case 6:
//            System.out.println("June");
//            break;
//        case 7:
//            System.out.println("July");
//            break;
//        case 8:
//            System.out.println("August");
//            break;
//        case 9:
//            System.out.println("September");
//            break;
//        case 10:
//            System.out.println("October");
//            break;
//        case 11:
//            System.out.println("November");
//            break;
//        case 12:
//            System.out.println("December");
//            break;
//
//            default: //We will always have a default after all the conditional statements in order for us to know when the system has exhausted the statements/or Cases we inputted.
//                System.out.println("Invalid month");
//                break;
//    }
//Iterative Statement : When we make use of "For loop", we must always have the length of what we want it to loop through in mind.
// We may have Ten, Twenty, or a Hundred number. The first thing to do is to take care of the length of what we want to loop through E.G int N = 100
        //In "for loop"(initialization(int i = 2;); condition(i <=n);increment/decrement(i++ or i--)){}
        //NOTE : Index "i" always start from 0 (Zero) in Java.
        //for loop is used to execute a block of code at a limited amount of times.

//        String[] myNames = {"john", "joseph", "faith"};
//        for (String name : myNames) {} //We can as well run this by removing the "for loop" which is on this line.
//        System.out.println(myNames[0]);

        int n = 10;
  for (int i = 1; i <=n; i++) {
    if (i % 2 <= 2) { //This line came in to being because we wanted to used break and continue.
        System.out.println("Even numbers" + i);
        break;}
      System.out.println("Odd numbers" + i);
  }

//
//        int m = 12;
//  for (int i = 1; i <=m; i++) {
//    if (i % 3 == 0)
//      System.out.println(i);

//        for (int i = 0; i <= 10; i++) { //this is a program tha will count from 0 to 10. There are three part of this for loop. We declare (int index = 0;), condition statement(i<=10;)this mean we would like to continue this for loop as long as i <= 10 because we state that for this program we would like to count from 0 to 10, in the third portion we will increment out counter i by 1 after each iteration(i++) .
            //NOTE : How many times is this particular for loop is going to iterate. This is going to iterate eleven time because we are counting Zero as well.
//            System.out.println(i);
//        }
            //Let's do a revers now, let's start at 10 and count to 0
//            for (int j = 10; j >=0; j--) {
//                System.out.println(j);
//                break;
//            }
//            System.out.println("It is decreasing!");

//        /For decrement or increment, we just need to edit the third part of out condition statement to increment or decrement.
//            for (int k = 10; k >= 0; k++) {
//                System.out.println(k);
////                break; //This put an end to the process once an answer is detected
//            }
//            System.out.println("Hello there");


//

// Ternary operator : is another way of writing "if" and "else". Variable = (Condition))? True:False.
// ")?" is the ternary operator.
//
//        String name = "Paul"; //our Variable here is name while the value is Paul.
//        String greeting = (name.equals("Paul"))? "Good morning" : "Good afternoon"; //in order to greet Paul, the greeting must be the "name.equals Paul" (name.equals("Paul"))? then the conditional statement "Good Afternoon" (or): "Not Good Afternoon".
//        System.out.println(greeting);
////
//        if (name.equals("Paul")) { //This is also another way of formulating a conditional statement or setting up a question/Password for users to access an Application.
//            System.out.println("Hello Paul");
//        }else {
//            System.out.println("I don't know You");
//        }
//
//        String age = "100";
//        String old = (age.equals("100"))? "you are old":"you are too young"; //The "if" statement overrule this line.
//        if (age.equals("101")) { //The "if' we have her is a conditional statement that changes the trajectory of everything. We can still have a desire result without it.
//            System.out.println("You are old");
//        }else {
//            System.out.println("You are yoo young");
        }}


