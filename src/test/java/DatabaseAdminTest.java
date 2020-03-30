import org.junit.Before;
import org.junit.Test;

import techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Rops", "RO13579P", 35000);
    }

    @Test
    public void canGetName(){
        assertEquals("Rops", databaseAdmin.getName());
    }

    @Test
    public void canSetName(){
        databaseAdmin.setName("RoRo");
        assertEquals("RoRo", databaseAdmin.getName());
    }

    @Test
    public void cannotSetNameIfNull(){
        databaseAdmin.setName(null);
        assertEquals("Rops", databaseAdmin.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("RO13579P", databaseAdmin.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(35000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(15000);
        assertEquals(50000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryIfAmountIsNegative(){
        databaseAdmin.raiseSalary(-5000);
        assertEquals(35000, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(350, databaseAdmin.calculatePayBonus(), 0.01);
    }


}
