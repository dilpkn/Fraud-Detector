package org.example;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FraudRule1Test {

    private FraudRule1 fraudRule1 = new FraudRule1();
    @Test
    public void Rule1Test1()
    {
        Trader trader = new Trader("Alisa","Sydney","Australia");
        Transaction transaction = new Transaction(trader,100);
        assertTrue(fraudRule1.Rule(transaction));
    }
    @Test
    public void Rule1Test2()
    {
        Trader trader = new Trader("Alisa","Minsk","Belarus");
        Transaction transaction = new Transaction(trader,100);
        assertTrue(fraudRule1.Rule(transaction));

    }
    @Test
    public void Rule1Test3()
    {
        Trader trader = new Trader("Alisa","Paris","Belarus");
        Transaction transaction = new Transaction(trader,100);
        assertFalse(fraudRule1.Rule(transaction));

    }
}
class FraudRule2Test {

    private FraudRule2 fraudRule2 = new FraudRule2();
    @Test
    public void Rule2Test1()
    {
        Trader trader = new Trader("Alisa","Berlin","Germany");
        Transaction transaction = new Transaction(trader,100);
        assertFalse(fraudRule2.Rule(transaction));
    }
    @Test
    public void Rule2Test2()
    {
        Trader trader = new Trader("Alisa","Minsk","Belarus");
        Transaction transaction = new Transaction(trader,2000);
        assertFalse(fraudRule2.Rule(transaction));
    }
    @Test
    public void Rule2Test3()
    {
        Trader trader = new Trader("Alisa","Minsk","Belarus");
        Transaction transaction = new Transaction(trader,400);
        assertFalse(fraudRule2.Rule(transaction));
    }
    @Test
    public void Rule2Test4()
    {
        Trader trader = new Trader("Alisa","Berlin","Germany");
        Transaction transaction = new Transaction(trader,2000);
        assertTrue(fraudRule2.Rule(transaction));
    }
}
class FraufRule3Test {
    private FraudRule3 fraudRule3 = new FraudRule3();
    @Test
    public void Rule3Test1() {
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 2000);
        assertTrue(fraudRule3.Rule(transaction));
    }
    @Test
    public void Rule3Test2() {
        Trader trader = new Trader("Alise", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 2000);
        assertFalse(fraudRule3.Rule(transaction));
    }
}

class FraufRule4Test {
    private FraudRule4 fraudRule4 = new FraudRule4();
    @Test
    public void Rule4Test1() {
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 1000004);
        assertTrue(fraudRule4.Rule(transaction));
    }
    @Test
    public void Rule4Test2() {
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 789);
        assertFalse(fraudRule4.Rule(transaction));
    }
}

class FraufRule5Test {
    private FraudRule5 fraudRule5 = new FraudRule5();

    @Test
    public void Rule5Test1() {
        Trader trader = new Trader("Pokemon", "Kingston", "Jamaica");
        Transaction transaction = new Transaction(trader, 2000);
        assertTrue(fraudRule5.Rule(transaction));
    }
    @Test
    public void Rule5Test2() {
        Trader trader = new Trader("Pokemon", "Berlin", "Germany");
        Transaction transaction = new Transaction(trader, 2000);
        assertFalse(fraudRule5.Rule(transaction));
    }
}
