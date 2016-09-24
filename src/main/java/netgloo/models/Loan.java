package netgloo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Menghan on 2016-09-24.
 */
@Entity
@Table(name = "loans")
public class Loan{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private int companyId;

    @NotNull
    private double amount;

    @NotNull
    private String time;

    @NotNull
    @ManyToOne
    private Status status;


    public int getId() {
        return id;
    }

    public Loan setId(int id) {
        this.id = id;
        return this;
    }

    public int getCompanyId() {
        return companyId;
    }

    public Loan setCompanyId(int companyId) {
        this.companyId = companyId;
        return this;
    }

    public double getAmount() {
        return amount;
    }

    public Loan setAmount(int amount) {
        this.amount = amount;
        return this;
    }

    public String getTime() {
        return time;
    }

    public Loan setTime(String time) {
        this.time = time;
        return this;
    }

    public Status getStatus() {
        return status;
    }

    public Loan setStatus(Status status) {
        this.status = status;
        return this;
    }
}

