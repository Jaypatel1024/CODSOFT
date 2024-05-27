import java.util.Scanner;

class Grade {
    private String studentName;

    public Grade(String studentName) {
        this.studentName = studentName;
    }

    public String grade(int avgp) {
        switch (avgp / 10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }

    public String getStudentName() {
        return studentName;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String studentName = sc.next();

        Grade g = new Grade(studentName);

        System.out.print("Enter the number of subjects: ");
        int tsubs = sc.nextInt();
        int tmarks = 0;

        for (int i = 0; i < tsubs; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + ": ");
            int marks = sc.nextInt();
            tmarks += marks;
        }

        double avgp = (double) tmarks / tsubs;
        String grade = g.grade((int) avgp);

        //Displaying all the data
        System.out.println("Student Name: " + g.getStudentName());
        System.out.println("Total Marks Obtained :- " + tmarks);
        System.out.println("Percentage Obtained :- " + String.format("%.2f", avgp) + "%");
        System.out.println("Grade Obtained :- " + grade);

        sc.close();
    }
}