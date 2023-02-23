import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program !");
        int present = 0;
        int absent = 0;
        int fulltime = 0;
        int parttime = 0;
        Random value1 = new Random();
        for (int i = 0; i < 20; i++) {
            int attendance = value1.nextInt(2);
            switch (attendance) {
                case 1:
                    absent += 1;
                    break;
                case 0:
                    present = present + 1;
                    break;
            }
        }
        for (int i = 0; i < present; i++) {
            Random value2 = new Random();
            int time = value2.nextInt(2);
            switch (time) {
                case 0:
                    parttime += 1;
                    break;
                case 1:
                    fulltime += 1;
                    break;
            }
        }
        System.out.print("present :" + present + "/20");
        System.out.println("   absent : " + absent + "/20");
        System.out.print("parttime :" + parttime + "/" + present);
        System.out.println("   fulltime : " + fulltime + "/" + present);
        System.out.println(" *    * ");
//      Wage per hour = 20    Parttime for 4 hours = 80    Fulltime for 8 hours = 160
        System.out.print(parttime + "x80 = " + (parttime * 80) + " for Part time  &  ");
        System.out.println(fulltime + "x160 = " + (fulltime * 160) + " for full time .");
        int finall = ((parttime * 80) + (fulltime * 160));
        System.out.println("Total salary = " + finall + " rupees");
    }
}