public class Test{
    public static void main(String[] args) {
        Student student = new Student();       //  Declare student
        student.setName("Hridhwesh");
        student.setId("1");
        student.setGrade("A");

        StudentView view = new StudentView();  //  Declare view

        StudentController controller = new StudentController(student, view);
        controller.updateView();               // Display initial data
    }
}
//test class