import junit.framework.TestSuite;
import junit.textui.TestRunner;
import test.com.panton.tape.FiltersTest;


public class AllTests {


    public static void main(String[] args) {
        TestSuite suite  = new TestSuite();

        suite.addTestSuite(FiltersTest.class);


        TestRunner.run(suite);
    }


}
