public class JuniorDeveloper extends Developer{
    //initializing class level variables
private int Salary;
private String Appointed_date;
private String Evaluation_period;
private String Termination_date;
private String Specialization;
private String Appointed_by;
private boolean Joined;
//defining constructor
public JuniorDeveloper(String Platform, String Interviewer_name, double Working_hour,int Salary, String Appointed_by, String Termination_date){
    super(Platform, Interviewer_name, Working_hour);//calling constructor from parent class
    this.Salary = Salary;
    this.Appointed_by = Appointed_by;
    this.Appointed_date ="";
    this.Evaluation_period = Evaluation_period;
    this.Termination_date = Termination_date;
    this.Specialization = "";
    this.Joined = false;
}
//defining accessor method
public int getSalary(){
    return Salary;
}
public String getAppointed_date(){
    return Appointed_date;
}
public String getEvaluation_period(){
    return Evaluation_period;
}
public String getTermination_date(){
    return Termination_date;
}
public String getSpecialization(){
    return Specialization;
}
public String getAppointed_by(){
    return Appointed_by;
}
public boolean isJoined(){
    return Joined;
}
//setting new salary to the developer
public void setSalary(int newSalary){
    if(!isJoined()){
        this.Salary = newSalary;
    }
    else{
        System.out.println("Sorry the developer "+super.getDeveloper_name()+"is already appointed and salary can't be changed.");
    }
}
//this method is used to appoint new dveloper
public void appointDeveloper(String Developer_name, String Appointed_date, String Termination_date, String Specialization, String Evaluation_period){
    if(!isJoined()){//checks if developer is already joined
        super.setDeveloper_name(Developer_name);
        this.Appointed_date = Appointed_date;
        this.Termination_date = Termination_date;
        this.Specialization = Specialization;
        this.Evaluation_period = Evaluation_period;
    }
    else{
    System.out.println("Developer was already appointed on "+Appointed_date);
    }
}
//this method is used to display all information of the junior developer
public void display(){
    super.display();//calling display method from parent class
    if (isJoined()){
        System.out.println("Appointed Date: "+Appointed_date);
        System.out.println("Evaluation Period: "+Evaluation_period);
        System.out.println("Termination Date: "+Termination_date);
        System.out.println("Developer's Salary : "+Salary);
        System.out.println("Developer's Specialization: "+Specialization);
        System.out.println("Appointed By: "+Appointed_by);
    }
}
}