package netgloo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Menghan on 2016-09-24.
 */

@Entity
@Table(name = "status")
public class Status {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String name;

    public int getId() {
        return id;
    }

    public Status setId(int id) {
        this.id = id;
        return this;
    }


    public String getName() {
        return name;
    }

    public Status setName(String name) {
        this.name = name;
        return this;
    }
}
