import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("welcome to employee wage computation program !");
        int hours = 0;
        int present = 0;
        int fulltime = 0;
        int parttime = 0;
        while (hours < 100 && present < 20) {

            Random value2 = new Random();
            int time = value2.nextInt(2);
            switch (time) {
                case 0:
                    parttime = parttime + 4;
                    break;
                case 1:
                    fulltime = fulltime + 8;
                    break;
            }
            present += 1;
            hours = parttime + fulltime;
        }

        System.out.println("hours = " + hours);
        System.out.println("Working days = " + present);

//      Wage per hour = 20    Parttime for 4 hours = 80    Fulltime for 8 hours = 160
        System.out.println("Total salary = " + hours * 20 + " rupees");
    }
}