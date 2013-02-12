package helpers;

import base.BaseTest;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import play.test.FakeApplication;

import static play.test.Helpers.*;

public abstract class FakeApplicationTest extends BaseTest {

    protected static FakeApplication application;

    @BeforeClass
    public static void oneTimeSetUp() {
        application = fakeApplication();
        try {
            start(application);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void oneTimeTearDown() {
        stop(application);
    }
}
