public class Teacher extends Employee{
    private double salary;
    private String department;
    private String joinedDate;

    // Default Constructor

    public Teacher(){
        salary=0;
        department=null;
        joinedDate=null;
    }
    // Parametrize constrcutor

    public Teacher(int id,String name,int age , double height,double weight,// for Employee class constructor
    double salary,String department,String joinedDate){
        super(id, name, age, height, weight);
        this.salary = salary;
        this.department = department;
        this.joinedDate = joinedDate;
        
    }

    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setDepartment(String dept){
        this.department=dept;
    }
    public void setJoinedDate(String date){
        this.joinedDate = date;
    }

    public double getSalary(){
        return this.salary;
    }
    public String getDepartment(){
        return this.department;
    }
    public String getJoinedDate(){
       return this.joinedDate;
    }

    public void Display(){
        super.Display();
        System.out.println("Salary :" + this.salary );
        System.out.println("Department :" + this.department);
        System.out.println("Joined on :" + this.joinedDate );
    }

    
}
