package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Bar extends Model {

    @Id
    public Long id;

    public Bar() {
    }
}
