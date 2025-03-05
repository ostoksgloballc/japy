import javax.swing.*;

public class StudentsGrading {

    public static void main(String[] args) {

//        int GradeA = 100;
//        int GradeB = 85;
//        int GradeC = 70;
//        int GradeD = 50;
//        int GradeE = 40;
//        int GradeF = 25;


//        if(GradeA < 100) {
//            System.out.println("Distinction");
//        }else {
//            System.out.println("Exellent");
//        } if (GradeB < 85) {
//            System.out.println("Exellent");
//        }else {
//            System.out.println("Pass");
//        }if(GradeC < 75) {
//            System.out.println("Pass");
//        }else {
//            System.out.println("Pass_on_trial");
//        }if(GradeD < 50) {
//            System.out.println("Pass_on_trial");
//        }else {
//            System.out.println("Rewrite_Exam");
//        }if(GradeE < 40) {
//            System.out.println("Rewrite_Exam");
//        }else {
//            System.out.println("Fail");
//        }if(GradeF < 25) {
//            System.out.println("Fail");
//        }


//        double[] Score = {100, 85, 70, 55, 40, 25};

//        int i = 100;
//        double GradeA = =>100;
//        double GradeB = 85;
//        double GradeC = 70;
//        double GradeD = 55;
//        double GradeE = 40;
//        double GradeF = 25;

//        final JPanel grade = new JPanel();
//        String Distinction, Excellent, Pass, Pass_on_trial, Rewrite_Exam, Fail;
//
//        if(GradeA == 100) {
//            System.out.println("Distinction");
//        }else{
//            System.out.println("Not A Distinction");
//        }if(GradeB == 85) {
//            System.out.println("Excellent");
//        }else {
//            System.out.println("Not A Excellent");
//        }if(GradeC == 75) {
//            System.out.println("Pass");
//        }else {
//            System.out.println("Not A Pass");
//        }if(GradeD == 50) {
//            System.out.println("Pass_on_trial");
//        }else {
//            System.out.println("Not A Pass_on_trial");
//        }if(GradeE == 40) {
//            System.out.println("Rewrite_Exam");
//        }else {
//            System.out.println("Not A Rewrite_Exam");
//        }if(GradeF == 25) {
//            System.out.println("Fail");
//        }
        int GradeA = 100;
        int GradeB = 85;
        int GradeC = 70;
        int GradeD = 50;
        int GradeE = 40;
        int GradeF = 25;

        JOptionPane.showInputDialog("Student Result For This Semester Input Today's Date");

        String response;

        response = JOptionPane.showInputDialog(null, "What is your name?");
        String Student_name1 = response;
        response = JOptionPane.showInputDialog(null, "What did you score?");
        int gradeA = Integer.parseInt(response);
        String scoreA = "Your name is " + Student_name1 + " You score Approximately " + gradeA + "% : First Class Upper" ;

        response = JOptionPane.showInputDialog(null, "What is your name?");
        String Student_name2 = response;
        response = JOptionPane.showInputDialog(null, "What did you score?");
        int gradeB = Integer.parseInt(response);
        String scoreB = "Your name is " + Student_name2 + " You Score Only " + gradeB + "% : First Class" ;

        response = JOptionPane.showInputDialog(null, "What is your name?");
        String Student_name3 = response;
        response = JOptionPane.showInputDialog(null, "What did you score?");
        int gradeC = Integer.parseInt(response);
        String scoreC = "Your name is " + Student_name3 + " You Score " + gradeC + "% : Second Class Upper" ;

        response = JOptionPane.showInputDialog(null, "What is your name?");
        String Student_name4 = response;
        response = JOptionPane.showInputDialog(null, "What did you score?");
        int gradeD = Integer.parseInt(response);
        String scoreD = "Your name is " + Student_name4 + " You Barely Pass " + gradeD + "% : Second Class Lower" ;

        response = JOptionPane.showInputDialog(null, "What is your name?");
        String Student_name5 = response;
        response = JOptionPane.showInputDialog(null, "What did you score?");
        int gradeE = Integer.parseInt(response);
        String scoreE = "Your name is " + Student_name5 + " You score " + gradeE + "% : Pass" ;

        response = JOptionPane.showInputDialog(null, "What is your name?");
        String Student_name6 = response;
        response = JOptionPane.showInputDialog(null, "What did you score?");
        int gradeF = Integer.parseInt(response);
        String scoreF = "Your name is " + Student_name6 + " Your score is " + gradeF + "% : Fail" ;

        System.out.println(scoreA);
        System.out.println(scoreB);
        System.out.println(scoreC);
        System.out.println(scoreD);
        System.out.println(scoreE);
        System.out.println(scoreF);
//        response = JOptionPane.showInputDialog(null, "What is your score?");








//        String first_class = JOptionPane.showInputDialog(null, "What did you score?");
//        String second_class = JOptionPane.showInputDialog(null, "What did you score?");
//        String second_class_upper = JOptionPane.showInputDialog(null, "What did you score?");
//        String second_class_lower = JOptionPane.showInputDialog(null, "What did you score?");
//        String pass = JOptionPane.showInputDialog(null, "What did you score?");
//        String fail = JOptionPane.showInputDialog(null, "What did you score?");


//        JOptionPane.showMessageDialog(null, "My name is " + name + " i scored " + first_class );
//        Distinction = JOptionPane.showInputDialog(" Grade A :" + first_class);
//        String second_class = JOptionPane.showInputDialog(null, "What did you score?");
//        JOptionPane.showMessageDialog(null, "My name is: " + name + " i scored " + second_class);
//        Excellent= JOptionPane.showInputDialog(" Grade B :" + second_class);
//        Pass = JOptionPane.showInputDialog("Grade C :" + second_class_upper);
//        Pass_on_trial = JOptionPane.showInputDialog("Grade D :" + second_class_lower);
//        Rewrite_Exam = JOptionPane.showInputDialog("Grade E :" + pass);
//        Fail = JOptionPane.showInputDialog("Grade F :" + fail);


    }
}