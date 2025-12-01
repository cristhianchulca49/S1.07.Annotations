package Level1_E1.E2;

public class Worker {
    private String name;
    private String surname;
    private double priceHour = 9.21;

    public double getPriceHour() {
        return priceHour;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * priceHour;
    }
}
