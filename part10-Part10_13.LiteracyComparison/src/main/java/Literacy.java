
/**
 *
 * @author micheal
 */
public class Literacy {

    private String literacyRate;
    private String ageGroup;
    private String gender;
    private String country;
    private int year;
    private double literaryPercentage;

    public Literacy(String literacyRate, String ageGroup, String gender, String country, int year, double literaryPercentage) {
        this.literacyRate = literacyRate;
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.country = country;
        this.year = year;
        this.literaryPercentage = literaryPercentage;
    }

    public String getLiteracyRate() {
        return literacyRate;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public String getGender() {
        return gender;
    }

    public String getCountry() {
        return country;
    }

    public int getYear() {
        return year;
    }

    public double getLiteraryPercentage() {
        return literaryPercentage;
    }
}
