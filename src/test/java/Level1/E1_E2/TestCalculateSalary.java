package Level1.E1_E2;

import Level1_E1.E2.DeprecatedRuntime;
import Level1_E1.E2.OnSiteWorker;
import Level1_E1.E2.OnlineWorker;
import org.junit.Test;
import java.lang.reflect.Method;
import static org.junit.Assert.*;

public class TestCalculateSalary {
    @Test
    public void testCalculateSalary() {
        double gasoline = 50.50;
        OnSiteWorker onsiteWorker = new OnSiteWorker(gasoline);
        OnlineWorker onlineWorker = new OnlineWorker();

        double salaryOnsiteWorker = onsiteWorker.calculateSalary(100);
        double salaryOnlineWorker = onlineWorker.calculateSalary(160);

        assertEquals(971.50, salaryOnsiteWorker, 0.001);
        assertEquals(1499.16, salaryOnlineWorker, 0.001);
    }

    @Test
    public void testCalculateSalaryOld() throws NoSuchMethodException {
        Method deprecatedOnsideWorker = OnSiteWorker.class.getDeclaredMethod("calculateSalaryOld", int.class);
        Method deprecatedOnlineWorker = OnlineWorker.class.getDeclaredMethod("calculateSalaryOld", int.class);

        assertTrue(deprecatedOnsideWorker.isAnnotationPresent(DeprecatedRuntime.class));
        assertTrue(deprecatedOnlineWorker.isAnnotationPresent(DeprecatedRuntime.class));
    }
}