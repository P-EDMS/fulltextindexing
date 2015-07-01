package test;
import junit.framework.TestCase;
import word.Filters;

/**
 * Created by roylee on 6/24/15.
 */
public class FiltersTest extends TestCase {


    public void testItShouldRemovePunctuation() throws Exception {
        Filters.Filter("can't");
    }



}