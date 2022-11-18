package smoke;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test3 {

    // METHOD MUST BE STATIC !
    @DataProvider (name = "pizzaType")
    public static Object[][] pizzaNameData() {
        return new Object[][] {
                {"Margarita", 300},
                {"Pepperoni", 400},
                {"Hawaii", 450},
        };
    }

    @Parameters({"pizzaType"})
    @Test(groups = {"regress"}, dataProvider = "pizzaType")
    public void test1 (String pizzaName, int price) {
        System.out.println("You can order " + pizzaName + ", the price is " + price + " rub.");
    }
}

