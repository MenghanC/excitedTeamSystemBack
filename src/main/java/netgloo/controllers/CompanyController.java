package netgloo.controllers;

import netgloo.models.Company;
import netgloo.models.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Menghan on 2016-09-24.
 */
@Controller
public class CompanyController {
    @Autowired
    private CompanyDao companyDao;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value="/company/create", method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public void createCompany(@RequestBody Map<String, String> data) {
        Company company = new Company();
        company.setAsset(Integer.parseInt(data.get("asset")));
        company.setName(data.get("company_name"));
        company.setDescription(data.get("description"));
        company.setStartDate(data.get("start_date"));
        company.setLegalPerson(data.get("legal_person"));
        company.setCapital(Integer.parseInt(data.get("capital")));
        company.setCapital_lasting(data.get("capital_lasting"));
        company.setFounders(data.get("founders"));
        company.setGross_margin(Integer.parseInt(data.get("gross_margin")));
        company.setIndustry(data.get("industry"));
        company.setLiability(Integer.parseInt(data.get("liability")));
        company.setMainBusiness(data.get("main_business"));
        company.setMonthly_burn_rate(Double.parseDouble(data.get("monthly_burn_rate")));
        company.setRegion(data.get("region"));
        company.setRevenue(Integer.parseInt(data.get("revenue")));
        company.setSector(data.get("sector"));
        company.setSize(data.get("size"));
        company.setNet_income(Integer.parseInt(data.get("net_income")));
        company.setSales(Integer.parseInt(data.get("sales")));
        company.setAverage_total_assets(Integer.parseInt(data.get("average_total_assets")));
        company.setAverage_stockholder_equity(Integer.parseInt(data.get("average_stockholder_equity")));
        company.setInventory(Integer.parseInt(data.get("inventory")));

        company.setProfit_margin(company.getNet_income() / company.getSales());
        company.setReturn_on_assets(company.getNet_income() / company.getAverage_total_assets());
        company.setReturn_on_equity(company.getNet_income() / company.getAverage_stockholder_equity());

        company.setCurrent_ratio(company.getAsset() / company.getLiability());
        company.setQuick_ratio((company.getAsset() - company.getInventory()) / company.getLiability());

        company.setSales(Integer.parseInt(data.get("sales")));
        company.setAverage_total_assets(Integer.parseInt(data.get("average_total_assets")));
        company.setAverage_stockholder_equity(Integer.parseInt(data.get("average_stockholder_equity")));

        company.setIsTrusted(false);
        company.setInfoFlag(true);
        company.setAuthFlag(true);
        companyDao.save(company);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value="/company/create/rating", method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public void updateRating(@RequestBody Map<String, String> data) {
        Company company = companyDao.findById(Integer.parseInt(data.get("id")));
        company.setRating(Double.parseDouble(data.get("rating")));

        companyDao.save(company);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value="/company/create/isTrusted", method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public void updateIsTrusted(@RequestBody Map<String, String> data) {
        Company company = companyDao.findById(Integer.parseInt(data.get("id")));
        company.setIsTrusted(Boolean.parseBoolean(data.get("isTrusted")));

        companyDao.save(company);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/company/get/{name}")
    public ResponseEntity<Map<String, String>> getCompanyInfo(@PathVariable(value = "name") String name) {
        Map<String, String> companyInfoMap = new HashMap<String, String>();

        Company company = companyDao.findByName(name);
        companyInfoMap.put("infoFlag",  Boolean.toString(company.getInfoFlag()));
        companyInfoMap.put("companyName", company.getName());
        companyInfoMap.put("description", company.getDescription());
        companyInfoMap.put("industry", company.getIndustry());
        companyInfoMap.put("isTrusted", Boolean.toString(company.getIsTrusted()));
        companyInfoMap.put("profitMargin", Double.toString(company.getProfit_margin()));
        companyInfoMap.put("returnOnEquity", Double.toString(company.getReturn_on_equity()));
        companyInfoMap.put("returnOnAssets", Double.toString(company.getReturn_on_assets()));
        companyInfoMap.put("currentRatio", Double.toString(company.getCurrent_ratio()));
        companyInfoMap.put("quickRatio", Double.toString(company.getQuick_ratio()));

        return new ResponseEntity<Map<String, String>>(companyInfoMap, HttpStatus.OK);

    }

}
