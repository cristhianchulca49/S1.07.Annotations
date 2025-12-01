package Level1_E1;

public class Worker {
    private String name;
    private String surname;
    private double priceHour;

    public double getPriceHour() {
        return priceHour;
    }

    public void calculateSalary(int hoursWorked) {
        double salary = hoursWorked * priceHour;
    }
}
