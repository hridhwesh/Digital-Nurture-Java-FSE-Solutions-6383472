public class Employee{
    private int employeeId;
    private String name;
    private String position;
    private int salary;

    public Employee(int employeeId, String name, String position, int salary){
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public int getId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public String getPosition(){
        return position;
    }
    public int getSalary(){
        return salary;
    }
    @Override
    public String toString(){
        return ("[Employee ID: "+employeeId+" Name: "+name+" Position: "+position+" Salary: "+salary+" ]");
    }

}