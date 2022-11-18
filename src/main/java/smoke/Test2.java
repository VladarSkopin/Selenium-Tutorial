package smoke;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test2 {

    @Parameters({"surname"})
    @Test(groups = {"smokeTest", "regress"})
    public void test1 (String surname) {
        System.out.println("Hello, " + surname + "! How are you?");
    }

    @Test (groups = {"smokeTest", "regress"})
    public void test2 () {
        System.out.println("Test 2");
    }



}
