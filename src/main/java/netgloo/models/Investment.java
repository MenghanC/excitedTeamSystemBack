package netgloo.models;

import javax.persistence.*;

/**
 * Created by Menghan on 2016-09-24.
 */
@Entity
@Table(name = "investments")
public class Investment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


}
