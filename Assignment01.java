public class Assignment01 {
    public static void main(String[] args) {

        String username = "Oluwale";
        String password = "Oluwale2";
        String account = "trueDetails";




        if(username == password) {
            System.out.println("You are logged in");
        }else {
            System.out.println("You are not logged in");
        }if(username != password && username != "Oluwale2") {
            System.out.println("You are successfully logged in");
        }else{
            System.out.println("You are not successfuly logged in");
        } if(account == password || account == "trueDetails") {
            System.out.println("You are Right");
        }else{
            System.out.println("You are Wrong");
        }
    }
}

