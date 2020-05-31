import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("studentFive")
@SessionScoped
public class StudentFive implements Serializable {

    private String name;
    private String surname;
    private String country;
    private String email;
    private String postcode;
    private String phone;
    private String courseCode;
    private String[] favoriteLang;

    List<String> countryOptions;

    public StudentFive(){
        //pre-populate the bean

        name = "Stefan";
        surname = "Pompka";

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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String[] getFavoriteLang() {
        return favoriteLang;
    }

    public void setFavoriteLang(String[] favoriteLang) {
        this.favoriteLang = favoriteLang;
    }

    public void validateTheCourseCode(FacesContext context, UIComponent component, Object value) throws ValidatorException {
        if (value == null){
            return;
        }
        String data = value.toString();

        if(!data.startsWith("LUV")){
            FacesMessage message = new FacesMessage("Course code must start with LUV");
            throw new ValidatorException(message);
        }
    }

}
