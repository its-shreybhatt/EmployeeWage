import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program !");
        int present = 0;
        int absent = 0;
        int fulltime = 0;
        int parttime = 0;
        Random value1 = new Random();
        int attendance = value1.nextInt(2);
        if (attendance == 0) {
            System.out.println("Present");
            Random value2 = new Random();
            int time = value2.nextInt(2);
            if (time == 0) {
                System.out.println("Employee is Parttime");
                System.out.println("Daily wage = " + 20 * 4);
            } else {
                System.out.println("Employee is Fulltime");
                System.out.println("Daily wage = " + 20 * 8);
            }
        } else System.out.println("Absent .. No wage");
    }
}