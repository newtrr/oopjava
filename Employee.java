public class Employee extends Person{
    double salary;
    String department;
    
    void setSalary(double s){
        this.salary = s;
    }
    double getSalary(){
        return salary;
    }
    void setDepartment(String d){
        this.department = d;
    }
    String getDepartment(){
        return department;
    }
}