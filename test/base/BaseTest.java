package base;

import org.junit.Rule;
import org.junit.rules.TestName;

public class BaseTest {

    @Rule
    public TestName name = new TestName();
}
