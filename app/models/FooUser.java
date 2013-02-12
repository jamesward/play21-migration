package models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
@DiscriminatorValue("foo")
public class FooUser extends User {

    @ManyToOne
    public Bar bar;

    private static Finder<Long, FooUser> find =
            new Finder(Long.class, FooUser.class);

    public static List<FooUser> findHasBar(Bar bar) {
        return find
                .fetch("bar")
                .where()
                .eq("bar", bar)
                .findList();
    }
}
