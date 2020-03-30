import org.junit.Before;
import org.junit.Test;

import techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Roosa", "RO27242C", 24000);
    }

    @Test
    public void canGetName(){
        assertEquals("Roosa", developer.getName());
    }

    @Test
    public void canSetName(){
        developer.setName("Rosa");
        assertEquals("Rosa", developer.getName());
    }

    @Test
    public void cannotSetNameIfNull(){
        developer.setName(null);
        assertEquals("Roosa", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("RO27242C", developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(24000, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(20000);
        assertEquals(44000, developer.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryIfAmountIsNegative(){
        developer.raiseSalary(-10000);
        assertEquals(24000, developer.getSalary(), 0.01);
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(240, developer.calculatePayBonus(), 0.01);
    }


}
