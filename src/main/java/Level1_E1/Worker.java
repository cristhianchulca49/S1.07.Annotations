package Level1_E1;

public class Worker {
    private String name;
    private String surname;
    private double priceHour;

    public double getPriceHour() {
        return priceHour;
    }

    public double calculateSalary(int hoursWorked) {
        return hoursWorked * priceHour;
    }
}
