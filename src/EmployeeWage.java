import java.util.Random;

public class EmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int NO_OF_WORKING_DAYS = 20;
    public static final int MAX_HOURS_IN_MONTH = 100;
    static int totalEmpHrs = 0;

    public static void main(String[] args) {

        condition();
        print();

    }
    public static void condition() {
//        Variables
        int empHrs = 0, totalWorkingDays = 0;
//        Computation
        while (totalEmpHrs <= MAX_HOURS_IN_MONTH &&
                totalWorkingDays < NO_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day: " + totalWorkingDays + " Emp Hrs: " + empHrs);
        }
    }

    public static void print() {
        int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println("Total Emp Wage = " + totalEmpWage);
    }
}