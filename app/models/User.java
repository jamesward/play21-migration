package models;

import javax.persistence.*;

@Entity
@Inheritance
@DiscriminatorColumn(name = "type")
public abstract class User extends BaseModel {

    @Id
    public Long id;
}