public class SeniorDeveloper extends Developer{
    //defining class level variables
private int Salary;
private String Joining_date;
private String Staff_room_number;
private String Contract_period;
private double advanced_salary;
private boolean appointed;
private boolean terminated;
//initializing constructor
public SeniorDeveloper(String Platform, String Interviewer_name, double Working_hour, int Salary, String Conact_period){
    super(Platform, Interviewer_name, Working_hour); //calling constructor from super class
    this.Salary = Salary;
    this.Joining_date = "";
    this.Staff_room_number = "";
    this.Contract_period = Contract_period;
    this.advanced_salary = 0.0;
    this.appointed = false;
    this.terminated = false; 
}
//this method sets new salary to the developer
public void setSalary(int Salary){
    this.Salary = Salary;
}
//this method sets new contract period to the senior developer
public void setContract_period(String Contract_period){
    this.Contract_period = Contract_period;
}
//defining accessor methods
public int getSalary(){
    return Salary;
}
public String getJoining_date(){
    return Joining_date;
}
public String getStaff_room_number(){
    return Staff_room_number;
}
public String getContract_period(){
    return Contract_period;
}
public double getadvanced_salary(){
    return advanced_salary;
}
public boolean isappointed(){
    return appointed;
}
public boolean isterminated(){
    return terminated;
}
//this method is used to hire a new senior developer
public void hireDeveloper(String Developer_name,String Joining_date, double advanced_salary, String Staff_room_number){
    if(isappointed()){//checks if developer is already appointed
        System.out.println("Developer "+Developer_name+" is already hired.");
        System.out.println("You can find "+Developer_name+" in"+this.Staff_room_number+" Room");
    }
    else{
        super.setDeveloper_name(Developer_name);
        this.Joining_date = Joining_date;
        this.advanced_salary = advanced_salary;
        this.Staff_room_number = Staff_room_number;
        this.appointed = true;
        this.terminated = false;
        System.out.println(Developer_name+" is appointed at room "+Staff_room_number);
    }
}
//this method is used to terminate the developer
public void terminateDeveloper(){
    if(isterminated()){//checks if developer is already terminated
        System.out.println("Developer is already terminated.");
    }
    else{
        System.out.println("Sorry developer "+getDeveloper_name()+" is terminated.");
        super.setDeveloper_name("");
        this.Joining_date = "";
        this.appointed = false;
        this.terminated = true;
    }
    }
    //displays basic information of the senior developer
public void displaySenior(){
    System.out.println("Interviewer's Name:"+super.getInterviewer_name());
    System.out.println("Developer's Salary: "+getSalary());
    System.out.println("Developing Platform: "+getPlatform());
}
//displays all information of the senior developer
public void display(){
    super.display();
    if(isappointed()){
        System.out.println("Termination: "+isterminated());
        System.out.println("Joining Date: "+getJoining_date());
        System.out.println("Advanced Salary: "+getadvanced_salary());
    }
    else{
        System.out.println("Developer is not appointed.");
    }
}
}