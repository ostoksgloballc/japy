public class Loops_DoWhileLoop {
    public static void main(String[] args) {
        //While loop : executes a block of code as long as it's condition remains trues.
        //Example 1
//        Scanner scanner = new Scanner(System.in);
//        String name = "";
//
//        while (name.isEmpty()) {
//            System.out.println("Enter your name: ");
//            name = scanner.nextLine();
//        }
//        System.out.println("Hello " + name + "!");
//
        //Example 2
//        Scanner scanner = new Scanner(System.in);
//        String month ="";
//
//        while (month.isBlank()) {
//            System.out.print("Enter month: ");
//            month = scanner.nextLine();
//        }
//        System.out.print("it's the month of " + month + ": ");

//Example 3......Question on this
//        Scanner scanner1 = new Scanner(System.in);
//        String loggedIn = "True";
//        String UserName = "Wale";
//        String Password = "Wale123";
//
//        while(loggedIn.equals("True")) {
//            System.out.print("Enter your UserName : ");
//            UserName = scanner1.nextLine();
//            System.out.print("Enter your Password : ");
//            Password = scanner1.nextLine();
//
//            if (UserName == "Wale" || Password == "Wale123") {
//                loggedIn = String.valueOf(true);
//                System.out.println("Logged in successfully");
//            }
//            else {
//                System.out.println("Username or Password is incorrect");
//            }
//

//        }


//        This is a variation of "while loop" called "do loop" where we move the condition to the end of the block of code and preceding the block of code; we write "do".
//        With the do loop, we perform our block of code at least once before checking the condition compare to "while loop" which always check the condition first to see if it's true or not.
//        In "do while" we move the condition(while) to the end
//        Example 1
//        Scanner scanner1 = new Scanner(System.in);
//        String Name = "";
//        do {
//            System.out.println("Enter your name: ");
//            Name = scanner1.nextLine();
//        }while (!Name.isBlank());
//        System.out.println("Hello: " + Name);

        //Example 2
//        Scanner scanner1 = new Scanner(System.in);
//        String Name = "John";
//        do {
//            System.out.println("Enter your name: ");
//            Name = scanner1.nextLine();
//        }while (Name.isBlank());
//        System.out.println("Hello: " + Name);

    }
}
