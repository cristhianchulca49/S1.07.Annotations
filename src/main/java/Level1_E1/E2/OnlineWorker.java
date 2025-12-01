package Level1_E1.E2;

public class OnlineWorker extends Worker {
    private final double INTERNET = 25.56;

    @Override
    public double calculateSalary(int hoursWorkedPerMonth) {
        return (hoursWorkedPerMonth * super.getPriceHour()) + INTERNET;
    }
}
