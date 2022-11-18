package smoke;

import org.testng.annotations.Test;

public class Test4 {

    @Test (groups = "regress")
    public void test444() {
        System.out.println("Test 444");
    }

    // WE WANT THIS TEST TO RUN ONLY AFTER THE FIRST TEST IS DONE -> HARD DEPENDENCY! alwaysRun = true TO BE NEVER SKIPPED
    @Test (groups = "regress", dependsOnMethods = {"test4"}, alwaysRun = true)
    public void test44() {
        System.out.println("Test 44");
    }

    @Test
    public void test4() {
        System.out.println("Test 4");
    }
}
