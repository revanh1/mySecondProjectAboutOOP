public class Instructor extends User{
    String password;
    String lessonType;
    public Instructor(){

    }

    public Instructor(int id, String firstname, String lastname, String password, String lessonType){

        this.id = id;
        this.firstname  = firstname;
        this.lastname = lastname;
        this.password = password;
        this.lessonType = lessonType;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }
}
