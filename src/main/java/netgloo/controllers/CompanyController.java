package netgloo.controllers;

import netgloo.models.Company;
import netgloo.models.CompanyDao;
import netgloo.models.User;
import netgloo.models.UserDao;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Menghan on 2016-09-24.
 */
public class CompanyController {
    @RequestMapping("/create/company")
    @ResponseBody
    public String create(String email, String name) {
        Company company = null;
        try {
            company = new Company();
            companyDao.save(company);
        }
        catch (Exception ex) {
            return "Error creating the user: " + ex.toString();
        }
        return "User succesfully created! (id = " + company.getId() + ")";
    }

    private CompanyDao companyDao;
}
