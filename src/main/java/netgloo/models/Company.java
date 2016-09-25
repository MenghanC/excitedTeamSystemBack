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
    private String name;

    private boolean is_trusted;

    public boolean getIsTrusted() {
        return is_trusted;
    }

    public void setIsTrusted(boolean is_trusted) {
        this.is_trusted = is_trusted;
    }

    private int net_income;

    private int sales;

    private double profit_margin;

    private int average_stockholder_equity;

    private double return_on_equity;

    private double return_on_assets;

    public double getReturn_on_assets() {
        return return_on_assets;
    }

    public void setReturn_on_assets(double return_on_assets) {
        this.return_on_assets = return_on_assets;
    }

    private double current_ratio;

    private int inventory;

    private double quick_ratio;

    private int average_total_assets;

    public int getAverage_total_assets() {
        return average_total_assets;
    }

    public void setAverage_total_assets(int average_total_assets) {
        this.average_total_assets = average_total_assets;
    }

    public int getNet_income() {
        return net_income;
    }

    public void setNet_income(int net_income) {
        this.net_income = net_income;
    }

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public double getProfit_margin() {
        return profit_margin;
    }

    public void setProfit_margin(double profit_margin) {
        this.profit_margin = profit_margin;
    }

    public int getAverage_stockholder_equity() {
        return average_stockholder_equity;
    }

    public void setAverage_stockholder_equity(int average_stockholder_equity) {
        this.average_stockholder_equity = average_stockholder_equity;
    }

    public double getReturn_on_equity() {
        return return_on_equity;
    }

    public void setReturn_on_equity(double return_on_equity) {
        this.return_on_equity = return_on_equity;
    }

    public double getCurrent_ratio() {
        return current_ratio;
    }

    public void setCurrent_ratio(double current_ratio) {
        this.current_ratio = current_ratio;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public double getQuick_ratio() {
        return quick_ratio;
    }

    public void setQuick_ratio(double quick_ratio) {
        this.quick_ratio = quick_ratio;
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

    private boolean authFlag;

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


    public String getName() {
        return name;
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

    public void setName(String name) {
        this.name = name;
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
