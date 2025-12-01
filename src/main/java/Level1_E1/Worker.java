package Level1_E1;

public class Worker {
    private String name;
    private String surname;
    private double priceHour;

    public void calculateSalary(int hoursWorked) {
        double salary = hoursWorked * priceHour;
    }
}
