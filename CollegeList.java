import java.util.Scanner;
public class CollegeList {                 

    public static void main(String[] args){

        Person prs = new Person();
        Student std = new Student();
        Faculty fct = new Faculty();
        Employee emp = new Employee();

        Scanner sc = new Scanner(System.in);
        String pick;
        String name; 
        String department;
        int number;
        double salary;
        
        System.out.print("Press E for Employee, F for Faculty, or S for Student: ");
        pick = sc.nextLine();

        if (pick.equalsIgnoreCase("E")){
        System.out.println("Type employee's name, contact number, salary, and department.");
        System.out.println("Press Enter after every input");
        name = sc.next();
        prs.setName(name);
        
        number = sc.nextInt();
        prs.setContactNum(number); 
        
        salary = sc.nextDouble();
        emp.setSalary(salary);
        
        department = sc.next();
        emp.setDepartment(department);
        
        System.out.println("------------------------------"); 
        System.out.println("Name: " + prs.getName());
        System.out.println("Contact Number: " + prs.getContactNum());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Department: " + emp.getDepartment());           
        }
        
        else{
            System.out.println("Invalid Input");
        }
    }
}