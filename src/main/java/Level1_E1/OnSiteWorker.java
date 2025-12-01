package Level1_E1;

public class OnSiteWorker extends Worker {
    private static double gasoline;
    private double salary;

    @Override
    public void calculateSalary(int hoursWorkedPerMonth) {
        salary = (hoursWorkedPerMonth * super.getPriceHour()) + gasoline;
    }
}
