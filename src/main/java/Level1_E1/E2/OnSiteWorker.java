package Level1_E1.E2;

public class OnSiteWorker extends Worker {
    private static double gasoline;

    public OnSiteWorker(double gasolineValue) {
        gasoline = gasolineValue;
    }

    @Override
    public double calculateSalary(int hoursWorkedPerMonth) {
        return (hoursWorkedPerMonth * super.getPriceHour()) + gasoline;
    }
}
