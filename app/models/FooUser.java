package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class FooUser extends Model {

    @Id
    public Long id;

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
