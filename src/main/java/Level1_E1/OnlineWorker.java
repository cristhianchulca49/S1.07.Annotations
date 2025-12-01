package Level1_E1;

public class OnlineWorker extends Worker {
    private final double INTERNET = 25.56;
    private double salary;

    @Override
    public void calculateSalary(int hoursWorkedPerMonth) {
        salary = (hoursWorkedPerMonth * super.getPriceHour()) + INTERNET;
    }
}
