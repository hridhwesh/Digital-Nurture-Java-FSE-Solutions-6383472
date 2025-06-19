public class StudentController{
    private Student student;
    private StudentView view;

    public StudentController(Student model, StudentView view){
        this.student = model;
        this.view = view;
    }

    public void setStudentName(String name){
        student.setName(name);
    }
    public String getStudentName(){
        return student.getName();
    }
    public void setStudentId(String id){
        student.setId(id);
    }
    public String getStudentId(){
        return student.getId();
    }
    public void setStudentGrade(String grade){
        student.setGrade(grade);
    }
    public String getStudentGrade(){
        return student.getGrade();
    }
    public void updateView(){
        view.displayStudentDetails(student.getName(), student.getId(), student.getGrade());
    }
}

//Controller class handling interaction between model and view