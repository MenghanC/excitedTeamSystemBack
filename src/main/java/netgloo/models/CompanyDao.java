package netgloo.models;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by Menghan on 2016-09-24.
 */
public interface CompanyDao extends CrudRepository<Company, Long> {
    public Company findById(int id);
    public Company findByName(String name);
    public List<Company> findAll();
}
