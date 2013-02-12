package models;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Bar extends BaseModel {

    @Id
    public Long id;

    public Bar() {
    }
}
