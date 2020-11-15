public class Employee{
    protected int id;
    protected String name;
    protected int age;
    protected double height;
    protected double weight;

    // Default constructor
    public Employee(){
        id = 0 ;
        name = null ;
        age = 0 ;
        height = 0 ;
        weight = 0 ;
    }
    // Parameterize constructor
    /**
     * <p>This fuction takes arguemnt as:</p>
     * @param id in int 
     * @param name in String
     * @param age in int 
     * @param height in double 
     * @param weight in double
     * 
    */
    public Employee(int id,String name,int age , double height,double weight){
       
        this.id = id;
        this.name = name;
        this.age = age;
        this.height=height;
        this.weight = weight;
    }
    // Setter Function for class
    // set id
    public void setId(int id){
        this.id = id;
    }
    // set name
    public void setName(String name){
        this.name = name;
    }
    //set age
    public void setAge(int age){
        this.age = age;
    }
    // set wieght
    public void setWeight(double weight){
        this.weight = weight;
    }
    //set height
    public void setHeight(double height){
        this.height = height;
    }
    // getter functions for class
    // get id
    public int getId(){
        return this.id;
    }
    // get age
    public int getAge(){
        return this.age;
    }
    // get name
    public String getName(){
        return this.name;
    }
    // get height
    public double getHeight(){
        return this.height;
    }
    //get wieght
    public double getWeight(){
        return this.weight;
    }
    // Display function


    public void Display(){
        System.out.println("NAME :" + name + "\n" +
                            "AGE :" + age + "\n" +
                            "ID :" + id + "\n" +
                            "HEIGHT :" + height + "\n" +
                            "WEIGHT :" + weight );
    }// Display Function ended
}// class ended