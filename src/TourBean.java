import javax.annotation.ManagedBean;
import javax.inject.Named;

@ManagedBean
@Named("tourBean")
public class TourBean {

    private String oneOfTour;

    public TourBean(){

    }

    public String getOneOfTour() {
        return oneOfTour;
    }

    public void setOneOfTour(String oneOfTour) {
        this.oneOfTour = oneOfTour;
    }

    public String startTheTour(){
        if(oneOfTour != null && oneOfTour.equals("city")){
            return "city_tour";
        }
        else{
            return "county_tour";
        }
    }

}
