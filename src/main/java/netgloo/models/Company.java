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

    private String start_date;

    @NotNull
    private String company_name;

    public String getCompany_name() {
        return company_name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFounders() {
        return founders;
    }

    public void setFounders(String founders) {
        this.founders = founders;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getMain_business() {
        return main_business;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String getCapital_lasting() {
        return capital_lasting;
    }

    public void setCapital_lasting(String capital_lasting) {
        this.capital_lasting = capital_lasting;
    }

    public double getMonthly_burn_rate() {
        return monthly_burn_rate;
    }

    public void setMonthly_burn_rate(double monthly_burn_rate) {
        this.monthly_burn_rate = monthly_burn_rate;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getGross_margin() {
        return gross_margin;
    }

    public void setGross_margin(int gross_margin) {
        this.gross_margin = gross_margin;
    }

    public boolean isAuthFlag() {
        return authFlag;
    }

    public boolean isInfoFlag() {
        return infoFlag;
    }

    public String getLegal_person() {
        return legal_person;
    }

    public int getLiability() {
        return liability;
    }

    public void setLiability(int liability) {
        this.liability = liability;
    }

    private String region;

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    private String size;

    private String founders;

    private String sector;

    private String industry;

    private String main_business;

    private int capital;

    private String capital_lasting;

    private double monthly_burn_rate;

    private int revenue;

    private int gross_margin;




    @NotNull
    private boolean authFlag;

    @NotNull
    private boolean infoFlag;

    private String legal_person;

    private int asset;

    private int liability;

    private String description;

    private double rating;

    public Company() {
        this.authFlag = false;
        this.infoFlag = true;
    }

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


    public String getCompanyName() {
        return company_name;
    }

    public boolean getAuthFlag() {
        return authFlag;
    }

    public void setAuthFlag(boolean authFlag) {
        this.authFlag = authFlag;
    }

    public void setInfoFlag(boolean infoFlag) {
        this.infoFlag = infoFlag;
    }

    public boolean getInfoFlag() {
        return infoFlag;
    }

    public String getLegalPerson() {
        return legal_person;
    }

    public int getAsset() {
        return asset;
    }

    public void setAsset(int asset) {
        this.asset = asset;
    }

    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStartDate(String start_date) {
        this.start_date = start_date;
    }

    public void setLegalPerson(String legal_person) {
        this.legal_person = legal_person;
    }

    public void setMainBusiness(String main_business) {
        this.main_business = main_business;
    }


    public String getDescription() {
        return description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
