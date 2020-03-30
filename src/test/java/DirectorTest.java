import org.junit.Before;
import org.junit.Test;

import management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Dreamteam", "DR23272T", 95000, "Software Development and Design", 1000000);
    }

    @Test
    public void canGetName(){
        assertEquals("Dreamteam", director.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("DR23272T", director.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(95000, director.getSalary(), 0.01);
    }

    @Test
    public void canGetDept(){
        assertEquals("Software Development and Design", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(10000);
        assertEquals(105000, director.getSalary(), 0.01);
    }

    @Test
    public void canCalculatePayBonus(){
        assertEquals(950, director.calculatePayBonus(), 0.01);
    }

    @Test
    public void canGetBudget(){
        assertEquals(1000000, director.getBudget(), 0.01);
    }
}
