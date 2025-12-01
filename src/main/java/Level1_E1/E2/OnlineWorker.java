package Level1_E1.E2;

public class OnlineWorker extends Worker {
    private final double INTERNET = 25.56;

    @Override
    public double calculateSalary(int hoursWorkedPerMonth) {
        return (hoursWorkedPerMonth * super.getPriceHour()) + INTERNET;
    }

    //Exercise 2
    @Deprecated
    @DeprecatedRuntime(since = "2.0", forRemoval = true)
    public double calculateSalaryOld(int hoursPerWeek) {
        return (hoursPerWeek * super.getPriceHour());
    }
}
