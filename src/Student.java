public class Student extends User{
    String email;
    String country;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegisteredCourse() {
        return registeredCourse;
    }

    public void setRegisteredCourse(String registeredCourse) {
        this.registeredCourse = registeredCourse;
    }

    String registeredCourse;

}
