package Level1.E1;

import Level1_E1.OnSiteWorker;
import Level1_E1.OnlineWorker;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestCalculateSalary {
    @Test
    public void testCalculateSalary() {
        double gasoline = 50.50;
        OnSiteWorker onsiteWorker = new OnSiteWorker(gasoline);
        OnlineWorker onlineWorker = new OnlineWorker();

        double salaryOnsiteWorker = onsiteWorker.calculateSalary(100);
        double salaryOnlineWorker = onlineWorker.calculateSalary(160);

        assertEquals(971.50, salaryOnsiteWorker,0.001);
        assertEquals(1499.16, salaryOnlineWorker,0.001);
    }
}
