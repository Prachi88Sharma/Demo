
package objectCollab;

public class School {
  private String schoolName;
  private String street;
  private String city;
  private String state;
  private long pin;

    public School(String schoolName,String street, String city, String state, long pin) {
        this.schoolName = schoolName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.pin = pin;
    }

    public School() {
    }

     public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPin() {
        return pin;
    }

   public void setPin(long pin) {
        this.pin = pin;
   }

    @Override
    public String toString() {
        return "" +
                "School name :- " + schoolName + '\n' +
                "street :- " + street + '\n' +
                "city :- " + city + '\n' +
                "state :- " + state + '\n' +
               
                "";
    }
}


