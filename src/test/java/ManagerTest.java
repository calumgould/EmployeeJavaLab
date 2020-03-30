import org.junit.Before;
import org.junit.Test;

import management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Calum", "CA2402G", 50000, "Software Development and Design");
    }

    @Test
    public void canGetName(){
        assertEquals("Calum", manager.getName());
    }

    @Test
    public void canSetName(){
        manager.setName("Calllllum");
        assertEquals("Calllllum", manager.getName());
    }

    @Test
    public void cannotSetNameIfNull(){
        manager.setName(null);
        assertEquals("Calum", manager.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("CA2402G", manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(50000, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetDept(){
        assertEquals("Software Development and Design", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5000);
        assertEquals(55000, manager.getSalary(), 0.01);
    }

    @Test
    public void cannotRaiseSalaryIfAmountIsNegative(){
        manager.raiseSalary(-8000);
        assertEquals(50000, manager.getSalary(), 0.01);
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(500, manager.calculatePayBonus(), 0.01);
    }
}
