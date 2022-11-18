package smoke;

import org.testng.annotations.Test;

public class Test2 {

    @Test (groups = {"smokeTest", "regress"})
    public void test2 () {
        System.out.println("Test 2");
    }

}
