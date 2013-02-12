package models;

import helpers.FakeApplicationTest;
import org.junit.Test;

import java.util.List;

import static org.fest.assertions.Assertions.assertThat;

public class PracticeTest extends FakeApplicationTest {

    @Test
    public void test() {
        FooUser user1 = new FooUser();
        FooUser user2 = new FooUser();
        FooUser user3 = new FooUser();
        user1.save();
        user2.save();
        user3.save();

        Bar bar = new Bar();
        bar.save();

        user1.bar = bar;
        user2.bar = bar;
        user3.bar = null;
        user1.save();
        user2.save();
        user3.save();

        List<FooUser> fooUsers = FooUser.findHasBar(bar);
        assertThat(fooUsers).containsOnly(user1, user2);
    }

}
