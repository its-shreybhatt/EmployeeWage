import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program !");
        int present = 0;
        int absent = 0;
        Random value1 = new Random();
        int attendance = value1.nextInt(2);
        if (attendance == 0) {
            System.out.println("present");
        }
        else System.out.println("absent");
    }
}