import java.util.Scanner;
//scanner and JOptionpane are both used for grading and can be used to input any data
//All the questions comes first between each SOP's then all the answers are written after closing the scanner 'Scanner.close'
public class ScannerJOptionP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Who are you?: ");
        String identity = input.nextLine();
        System.out.println("Where are you from?");
        String origin = input.nextLine();
        System.out.println("How  old are you?");
        int age = Integer.parseInt(input.nextLine());
        System.out.println("Are you a Male or Female?");
        char gender = input.nextLine().charAt(0);
        System.out.println("Are you married True or False?");
//        char married = input.nextLine().charAt(0); //i have a question
        Boolean Input = input.nextBoolean();
        System.out.println("i am " + identity);
        System.out.println("i am from " + origin);
        System.out.println("i am " + age + " years old");
        System.out.println("i am a " + gender);
//        System.out.println("i am married " + input); //how do we use char or boolean in this kind of case.

        if (Input == true) {
            System.out.println("True");
        }else {
            System.out.println("False");

        }
    }
}