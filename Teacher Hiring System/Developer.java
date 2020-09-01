public class Developer{
    //defining class level variables
private String Platform;
private String Interviewer_name;
private String Developer_name;
private double Working_hour;
//initializing constructor
public Developer(String Platform, String Interviewer_name, double Working_hour){
    this.Platform = Platform;
    this.Interviewer_name = Interviewer_name;
    this.Developer_name = "";
    this.Working_hour = Working_hour;
}
//defining accessor methods
public String getPlatform(){
    return Platform;
}
public String getInterviewer_name(){
    return Interviewer_name;
}
public double getWorking_hour(){
    return Working_hour;
}   
public String getDeveloper_name(){
    return Developer_name;
}
//method to set the developer's name
public void setDeveloper_name(String Developer_name){
    this.Developer_name = Developer_name;
}
//this method displays all the information of the developer
public void display(){
    if(Developer_name !=""){
    System.out.println("Developer's Name: " +Developer_name);
    }
    System.out.println("Platform: " +Platform);
    System.out.println("Interviewer's name: " +Interviewer_name);
    System.out.println("Working hour: " +Working_hour+"hrs");
}
}