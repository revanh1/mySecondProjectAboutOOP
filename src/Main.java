public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.id = 1;
        student1.firstname = "Revan";
        student1.lastname = "Haciyev";
        student1.email = "example123@gmail.com";
        student1.country = "azerbaijan";

        Instructor instructor1 = new Instructor();
        instructor1.id = 2;
        instructor1.firstname = "Kenan";
        instructor1.lastname = "Musayev";
        instructor1.password = "1234abcd";
        instructor1.lessonType = "Java";

        Instructor instructor2 = new Instructor(3, "Togrul", "Hesenov", "4321qwerty", "C#");
        User[] instructors = {instructor1, instructor2};
        for(User instructor: instructors){
            System.out.println(instructor.firstname);
            System.out.println(instructor.lastname);
        }

        UserManager userManager = new UserManager();
        userManager.addFullName(student1);
    }
}