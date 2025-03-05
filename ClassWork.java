public class ClassWork {

    //Operators +=, -=, /=, %=,
    //modulus % can be used to detect if a number is Odd or evening. it will always give us (zero 0) if the number is even and the remainder if the number is odd
    //Comparison Operators ==, (not equal to !=), <, >, <=, >=
    //Logical Operators (and &&), (or ||), (not !)
    // = assignment operator
    // == comparison operator (compare if value are equal)
    // === strict equality operator (compare if value & datatype are equal)
    // != inequality operator
    // !== strict inequality operator


    public static void main(String[] args) {
        int a = 9;
        int b = 12;

        boolean isValid = true;
        if(!isValid){
            System.out.println("unsuccessful"); //true
        }else {
            System.out.println("Successful");
        }if (a <= b){
            System.out.println("Right");
        }else {
            System.out.println("Wrong");
        } if(a == b){
            System.out.println("Right");
        }else {
            System.out.println("Wrong");
        }
    }
    }
