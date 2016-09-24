package netgloo.models;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * Created by Menghan on 2016-09-24.
 */
@Entity
@Table(name = "companies")
public class Company implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotNull
    private String start_date;

    @NotNull
    private String company_name;

    @NotNull
    private boolean authFlag;

    @NotNull
    private boolean infoFlag;

    @NotNull
    private String legal_person;

    @NotNull
    private int asset;

    @NotNull
    private String description;

    @NotNull
    private double rating;

    public int getId() {
        return id;
    }

    public Company setId(int id) {
        this.id = id;
        return this;
    }

    public String getStartDate() {
        return start_date;
    }

    public Company setStartDate(String start_date) {
        this.start_date = start_date;
        return this;
    }

    public String getCompanyName() {
        return company_name;
    }

    public Company setCompanyName(String company_name) {
        this.company_name = company_name;
        return this;
    }

    public boolean getAuthFlag() {
        return authFlag;
    }

    public Company setAuthFlat(boolean authFlag) {
        this.authFlag = authFlag;
        return this;
    }

    public boolean getInfoFlag() {
        return infoFlag;
    }

    public Company setInfoFlag(boolean infoFlag) {
        this.infoFlag = infoFlag;
        return this;
    }

    public String getLegalPerson() {
        return legal_person;
    }

    public Company setLegalPerson(String legal_person) {
        this.legal_person = legal_person;
        return this;
    }

    public int getAsset() {
        return asset;
    }

    public Company setAsset(int asset) {
        this.asset = asset;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Company setDescription(String description) {
        this.description = description;
        return this;
    }

    public double getRating() {
        return rating;
    }

    public Company setRating(int rating) {
        this.rating = rating;
        return this;
    }
}
