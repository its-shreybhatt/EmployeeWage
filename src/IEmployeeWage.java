public interface IEmployeeWage {
    public void addCompanyEmpWage(String Company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth);

    public void computeEmpWage();
    public int getTotalWage(String Company );
}
