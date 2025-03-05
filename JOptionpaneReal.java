import javax.swing.*;

public class JOptionpaneReal {
    //JOptionpane is an altanative we use for grading and can be used to input any data
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        String age = JOptionPane.showInputDialog(null, "How old are you?");
        String identity = JOptionPane.showInputDialog(null, "What is your identity?");
        JOptionPane.showMessageDialog(null, "My name is, " + name + " I am " + age + " years old, " + " i am a " + identity);

        int OutStanding = 100;
        int Excelent = 90;

        double[] grade ={100, 85, 65, 45, 30};
//        if(grade == 100 == pass ); does this even make any sense?



    }
}
