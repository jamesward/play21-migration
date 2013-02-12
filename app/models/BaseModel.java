package models;

import play.db.ebean.Model;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import java.util.Date;

@MappedSuperclass
public abstract class BaseModel extends Model {

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    private Date modified;

    @Version
    private int version;
}
