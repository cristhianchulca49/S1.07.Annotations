package Level1_E1;

public class OnSiteWorker extends Worker {
    private static double gasoline;

    @Override
    public double calculateSalary(int hoursWorkedPerMonth) {
        return (hoursWorkedPerMonth * super.getPriceHour()) + gasoline;
    }
}
