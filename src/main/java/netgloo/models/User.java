package netgloo.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  @NotNull
  private String name;

  @NotNull
  private String password;

  @NotNull
  @OneToOne
  private Company company;

  public User() { }

  public User(long id) { 
    this.id = id;
  }

  public long getId() {
    return id;
  }

  public void setId(long value) {
    this.id = value;
  }
  
  public String getName() {
    return name;
  }

  public void setName(String value) {
    this.name = value;
  }

  public String getPassword() {
    return password;
  }

  public User setPassword(String password) {
    this.password = password;
    return this;
  }

  public Company getCompany() {
    return company;
  }

  public User setCompany(Company company) {
    this.company = company;
    return this;
  }
} // class User
