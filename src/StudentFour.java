import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("studentFour")
@SessionScoped
public class StudentFour implements Serializable {

    private String name;
    private String surname;
    private String country;
    private String[] favoriteLang;

    List<String> countryOptions;

    public StudentFour(){
        countryOptions = new ArrayList<>();
        countryOptions.add("Brazil");
        countryOptions.add("Poland");
        countryOptions.add("France");
        countryOptions.add("Germany");
        countryOptions.add("India");
        countryOptions.add("Turkey");
        countryOptions.add("Japan");
    }

    public List<String> getCountryOptions() {
        return countryOptions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getFavoriteLang() {
        return favoriteLang;
    }

    public void setFavoriteLang(String[] favoriteLang) {
        this.favoriteLang = favoriteLang;
    }
}
