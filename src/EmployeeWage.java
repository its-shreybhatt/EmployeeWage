import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeWage implements IEmployeeWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;

    private int numOfCompany = 0;
    ArrayList<CompanyEmpWage> companyEmpWageArray = new ArrayList<>();
    HashMap<String, CompanyEmpWage> map = new HashMap<>();
    ArrayList<Integer> dailyEmpWageArray = new ArrayList<>();

    @Override
    public void addCompanyEmpWage(String Company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        companyEmpWageArray.add(numOfCompany, new CompanyEmpWage(Company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth));
        numOfCompany++;
    }

    @Override
    public void computeEmpWage() {
        for (int i = 0; i < numOfCompany; i++) {
            companyEmpWageArray.get(i).setTotalEmpWage(this.computeEmpWage(companyEmpWageArray.get(i)));
            System.out.println(companyEmpWageArray.get(i));
        }
    }

    @Override
    public int getTotalWage(String Company) {
        return map.get(Company).totalEmpWage;
    }

    private int computeEmpWage(CompanyEmpWage companyEmpWage) {
//        Variables
        int empHrs = 0, totalWorkingDays = 0, totalEmpHrs = 0;
//        Computation
        while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth &&
                totalWorkingDays < companyEmpWage.numOfWorkingDays) {
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
            dailyEmpWageArray.add(empHrs * companyEmpWage.empRatePerHour);
//            System.out.println("Day: " + totalWorkingDays + " Emp Hrs: " + empHrs);
        }
        return totalEmpHrs * companyEmpWage.empRatePerHour;
    }

    public static void main(String[] args) {
        IEmployeeWage employeeWage = new EmployeeWage();
        employeeWage.addCompanyEmpWage("Dmart", 20, 20, 100);
        employeeWage.addCompanyEmpWage("Reliance", 25, 25, 150);
        employeeWage.computeEmpWage();
    }

}