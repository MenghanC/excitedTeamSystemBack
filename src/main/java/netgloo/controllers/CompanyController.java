package netgloo.controllers;

import netgloo.models.Company;
import netgloo.models.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Menghan on 2016-09-24.
 */
@Controller
public class CompanyController {
    @Autowired
    private CompanyDao companyDao;

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value="/create/company", method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public void createCompany(@RequestBody Map<String, String> data) {
        Company company = new Company();
        company.setAsset(Integer.parseInt(data.get("asset")));
        company.setCompanyName(data.get("company_name"));
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

        company.setInfoFlag(true);
        company.setAuthFlag(true);
        companyDao.save(company);
    }

    @ResponseStatus(value = HttpStatus.OK)
    @RequestMapping(value="/create/company/rating", method = RequestMethod.POST, produces= MediaType.APPLICATION_JSON_VALUE)
    public void updateRating(@RequestBody Map<String, String> data) {
        Company company = companyDao.findById(Integer.parseInt(data.get("id")));
        company.setRating(Double.parseDouble(data.get("rating")));

        companyDao.save(company);
    }



    /*@RequestMapping(method = RequestMethod.GET, value = "loadFileToLocal/{path}")
    public ResponseEntity<Map<String, String>> provideUploadInfo(@PathVariable(value = "path") String path) throws MalformedURLException {

        Map<String, String> fileUrlMap = new HashMap<String, String>();
        File rootFolder = new File(WebAppInitializer.ROOT +  "/" + path + "/");
        for (final File fileEntry : rootFolder.listFiles()) {
            System.out.println( new File(WebAppInitializer.ROOT +  "/" + path + "/" + fileEntry.getName()).toURI().toURL().toString());
            fileUrlMap.put(fileEntry.getName(),  new File(WebAppInitializer.ROOT +  "/" + path + "/" + fileEntry.getName()).toURI().toURL().toString());
        }
        return new ResponseEntity<Map<String, String>>(fileUrlMap, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/saveFileToLocal/{type}")
    public ResponseEntity<Map<String, String>> handleFileUpload(@PathVariable(value = "type") String type,
                                                                @RequestParam("file") MultipartFile file,
                                                                RedirectAttributes redirectAttributes) throws MalformedURLException {
        Map<String, String> fileUrlMap = new HashMap<String, String>();
        String name = file.getOriginalFilename();
        if (name.contains("/")) {
            redirectAttributes.addFlashAttribute("message", "Folder separators not allowed");
            return new ResponseEntity<Map<String, String>>(fileUrlMap, HttpStatus.OK);
        }
        if (name.contains("/")) {
            redirectAttributes.addFlashAttribute("message", "Relative pathnames not allowed");
            return new ResponseEntity<Map<String, String>>(fileUrlMap, HttpStatus.OK);
        }

        if (!file.isEmpty()) {
            try {
                BufferedOutputStream stream = new BufferedOutputStream(
                        new FileOutputStream(new File(WebAppInitializer.ROOT +  "/" + type + "/" + name)));
                FileCopyUtils.copy(file.getInputStream(), stream);
                stream.close();
                redirectAttributes.addFlashAttribute("message",
                        "You successfully uploaded " + name + "!");
            }
            catch (Exception e) {
                redirectAttributes.addFlashAttribute("message",
                        "You failed to upload " + name + " => " + e.getMessage());
            }
        }
        else {
            redirectAttributes.addFlashAttribute("message",
                    "You failed to upload " + name + " because the file was empty");
        }
        String url = new File(WebAppInitializer.ROOT +  "/" + type + "/" + name).toURI().toURL().toString();
        String final_url = url.substring(6);
        fileUrlMap.put("url",final_url);
        return new ResponseEntity<Map<String, String>>(fileUrlMap, HttpStatus.OK);
    }*/

}
