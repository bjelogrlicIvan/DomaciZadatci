package Zadaca.Zadatak2;

import org.testng.annotations.Test;

public class TestSuite {
    @Test
    public void negative1 () throws InterruptedException {
        NegativeCase1 negativeCase1 = new NegativeCase1();
        negativeCase1.main(null);
    }
    @Test
    public void negative2 () throws InterruptedException {
        NegativeCase2 negativeCase2 = new NegativeCase2();
        negativeCase2.main(null);
    }
    @Test
    public void negative3 () throws InterruptedException {
        NegativeCase3 negativeCase3 = new NegativeCase3();
        negativeCase3.main(null);
    }
    @Test
    public void negative4 () throws InterruptedException {
        NegativeCase4 negativeCase4 = new NegativeCase4();
        negativeCase4.main(null);
    }
    @Test
    public void negative5 () throws InterruptedException {
        NegativeCase5 negativeCase5 = new NegativeCase5();
        negativeCase5.main(null);
    }
    @Test
    public void negative6 () throws InterruptedException {
        NegativeCase6 negativeCase6 = new NegativeCase6();
        negativeCase6.main(null);
    }
    @Test
    public void negative7 () throws InterruptedException {
        NegativeCase7 negativeCase7 = new NegativeCase7();
        negativeCase7.main(null);
    }
    @Test
    public void negative8 () throws InterruptedException {
        NegativeCase8 negativeCase8 = new NegativeCase8();
        negativeCase8.main(null);
    }
    @Test
    public void negative9 () throws InterruptedException {
        NegativeCase9 negativeCase9 = new NegativeCase9();
        negativeCase9.main(null);
    }
}
