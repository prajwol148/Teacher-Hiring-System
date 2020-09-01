import java.awt.Container;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
/** This is GUI class for Appointing Senior and Junior Developer and terminate Developer
 * @author Nabin Khanal
 * @date 19th April, 2019
 */

/**
 * Creating a class called RigoTechnology
 */

public class RigoTechnology implements ActionListener
{
    private ArrayList<Developer> developer;
    private JFrame myFrame;
    private JLabel lblHeading;
    private JLabel lblPlatform;
    private JLabel lblWorkingHours;
    private JLabel lblInterviewer;
    private JLabel lblContractperiod;
    private JLabel lblSalary;
    private JLabel lblName;
    private JLabel lblJoiningDate;
    private JLabel lblDev_No;
    private JLabel lblRoomNo;
    private JLabel lblAdvSalary;
    private JLabel lblHeading2;
    private JLabel lblNamee;
    private JLabel lblSpecialization;
    private JLabel lblDevNoo;
    private JLabel lblDevNo;
    private JLabel lblTerminationDate;
    private JLabel lblAppointedBy;
    private JLabel lblASalary;
    private JLabel lblEvaluationPeriod;
    private JLabel lblNameee;
    private JLabel lblAppointedDate;
    private JLabel lblSpecializationn;
    private JLabel lblTerminationDatee;
    
    private JTextField txtPlatform;
    private JTextField txtWorkingHours;
    private JTextField txtInterviewer;
    private JTextField txtContractperiod;
    private JTextField txtSalary;
    private JTextField txtName;
    private JTextField txtJoiningDate;
    private JTextField txtDev_No;
    private JTextField txtRoomNo;
    private JTextField txtAdvSalary;
    private JTextField txtHeading2;
    private JTextField txtNamee;
    private JTextField txtSpecialization;
    private JTextField txtDevNoo;
    private JTextField txtDevNo; 
    private JTextField txtTerminationDate;
    private JTextField txtAppointedBy;
    private JTextField txtASalary;
    private JTextField txtEvaluationPeriod;
    private JTextField txtNameee;
    private JTextField txtAppointedDate;
    private JTextField txtSpecializationn;
    private JTextField txtTerminationDatee;
    
    private JButton btnAddForSenior;
    private JButton btnAppoint;
    private JButton btnTerminate;
    private JButton btnAddForJunior;
    private JButton btnAppointJuniorDeveloper;
    private JButton btnDisplayAll;
    private JButton btnClear;
    
    public RigoTechnology()
    {
        developer=new ArrayList<Developer>();
        myForm();
    }
    public static void main(String[]args)
    {
        new RigoTechnology();
    }
    /**
     * public void myFrom() is a public class which can be assessed by other class
     * public void myFrom() creates GUI
     */
    public void myForm()
    {
        //Creating JFrame Named RigoTechnology
        JFrame myFrame=new JFrame("RigoTechnology");
        myFrame.getContentPane().setBackground(new java.awt.Color(0, 250, 05));
        myFrame.setLayout(null);
        //Creating JLabel by setting bound (@param x-coordinate,@param y-coordinate, @param length, @param height) and font TimesRoman with font size 15
        lblHeading = new JLabel("For Senior Developer");
        lblHeading.setBounds(250,10,200,20);
        lblHeading.setFont(new java.awt.Font("TimesRoman", java.awt.Font.BOLD, 15));
        myFrame.add(lblHeading);
        
        lblPlatform=new JLabel("Platform:");
        lblPlatform.setBounds(10,40,60,30);
        myFrame.add(lblPlatform);
        
        txtPlatform= new JTextField();
        txtPlatform.setBounds(110,40,200,30);
        myFrame.add(txtPlatform);
        
        lblWorkingHours=new JLabel("Working Hours:");
        lblWorkingHours.setBounds(340,40,100,30);
        myFrame.add(lblWorkingHours);
        
        txtWorkingHours= new JTextField();
        txtWorkingHours.setBounds(450,40,200,30);
        myFrame.add(txtWorkingHours);
        
        lblInterviewer=new JLabel("Interviewer:");
        lblInterviewer.setBounds(10,75,100,30);
        myFrame.add(lblInterviewer);
        
        txtInterviewer= new JTextField();
        txtInterviewer.setBounds(110,75,200,30);
        myFrame.add(txtInterviewer);
        
        lblContractperiod=new JLabel("Contract Period:");
        lblContractperiod.setBounds(340,75,100,30);
        myFrame.add(lblContractperiod);
        
        txtContractperiod= new JTextField();
        txtContractperiod.setBounds(450,75,200,30);
        myFrame.add(txtContractperiod);
        
        lblSalary=new JLabel("Salary:");
        lblSalary.setBounds(10,115,100,30);
        myFrame.add(lblSalary);
        
        txtSalary= new JTextField();
        txtSalary.setBounds(110,115,200,30);
        myFrame.add(txtSalary);
        //creating button in GUI and setting size for button as above.
        btnAddForSenior=new JButton("Add for Senior");
        btnAddForSenior.setBounds(370,115,280,30);
        myFrame.add(btnAddForSenior);
        btnAddForSenior.addActionListener(this);//Register an instance of the event handler class as a listener
        
        lblName=new JLabel("Developer Name:");
        lblName.setBounds(10,170,100,30);
        myFrame.add(lblName);
        
        txtName= new JTextField();
        txtName.setBounds(110,170,200,30);
        myFrame.add(txtName);
        
        lblJoiningDate=new JLabel("Joining Date:");
        lblJoiningDate.setBounds(340,170,100,30);
        myFrame.add(lblJoiningDate);
        
        txtJoiningDate= new JTextField();
        txtJoiningDate.setBounds(450,170,200,30);
        myFrame.add(txtJoiningDate);
        
        lblDev_No=new JLabel("Developer No:");
        lblDev_No.setBounds(10,210,90,30);
        myFrame.add(lblDev_No);
        
        txtDev_No= new JTextField();
        txtDev_No.setBounds(110,210,50,30);
        myFrame.add(txtDev_No);
        
        lblRoomNo=new JLabel("Room No:");
        lblRoomNo.setBounds(170,210,70,30);
        myFrame.add(lblRoomNo);
        
        txtRoomNo= new JTextField();
        txtRoomNo.setBounds(240,210,70,30);
        myFrame.add(txtRoomNo);
        
        lblAdvSalary=new JLabel("Adv Salary:");
        lblAdvSalary.setBounds(340,210,100,30);
        myFrame.add(lblAdvSalary);
        
        txtAdvSalary= new JTextField();
        txtAdvSalary.setBounds(450,210,200,30);
        myFrame.add(txtAdvSalary);
        
        btnAppoint=new JButton("Appoint");
        btnAppoint.setBounds(370,250,120,30);
        myFrame.add(btnAppoint);
        btnAppoint.addActionListener(this);
        
        btnTerminate=new JButton("Terminate");
        btnTerminate.setBounds(510,250,140,30);
        myFrame.add(btnTerminate);
        btnTerminate.addActionListener(this);
        
        lblHeading2 = new JLabel("For Junior Developer");
        lblHeading2.setBounds(250,290,200,20);
        lblHeading2.setFont(new java.awt.Font("TimesRoman", java.awt.Font.BOLD, 15));
        myFrame.add(lblHeading2);
        
        lblNamee=new JLabel("Platform:");
        lblNamee.setBounds(10,320,60,30);
        myFrame.add(lblNamee);
        
        txtNamee= new JTextField();
        txtNamee.setBounds(110,320,200,30);
        myFrame.add(txtNamee);
        
        lblSpecialization=new JLabel("Interviewer Name:");
        lblSpecialization.setBounds(340,320,110,30);
        myFrame.add(lblSpecialization);
        
        txtSpecialization= new JTextField();
        txtSpecialization.setBounds(450,320,200,30);
        myFrame.add(txtSpecialization);
        
        lblDevNoo=new JLabel("Working Hour:");
        lblDevNoo.setBounds(10,360,85,30);
        myFrame.add(lblDevNoo);
        
        txtDevNoo= new JTextField();
        txtDevNoo.setBounds(110,360,200,30);
        myFrame.add(txtDevNoo);
                        
        lblTerminationDate=new JLabel("Termination Date:");
        lblTerminationDate.setBounds(340,360,100,30);
        myFrame.add(lblTerminationDate);
        
        txtTerminationDate= new JTextField();
        txtTerminationDate.setBounds(450,360,200,30);
        myFrame.add(txtTerminationDate);
        
        lblAppointedBy=new JLabel("Appointed By:");
        lblAppointedBy.setBounds(10,400,100,30);
        myFrame.add(lblAppointedBy);
        
        txtAppointedBy= new JTextField();
        txtAppointedBy.setBounds(110,400,200,30);
        myFrame.add(txtAppointedBy);
        
        lblASalary=new JLabel("Salary:");
        lblASalary.setBounds(340,400,100,30);
        myFrame.add(lblASalary);
        
        txtASalary= new JTextField();
        txtASalary.setBounds(450,400,200,30);
        myFrame.add(txtASalary);
        
        lblEvaluationPeriod=new JLabel("EvaluationPeriod:");
        lblEvaluationPeriod.setBounds(10,440,100,30);
        myFrame.add(lblEvaluationPeriod);
        
        txtEvaluationPeriod= new JTextField();
        txtEvaluationPeriod.setBounds(110,440,200,30);
        myFrame.add(txtEvaluationPeriod);
        
        btnAddForJunior=new JButton("Add for Junior");
        btnAddForJunior.setBounds(370,440,280,30);
        myFrame.add(btnAddForJunior);
        btnAddForJunior.addActionListener(this);
        
        lblNameee=new JLabel("Developer Name:");
        lblNameee.setBounds(10,490,100,30);
        myFrame.add(lblNameee);
        
        txtNameee= new JTextField();
        txtNameee.setBounds(110,490,200,30);
        myFrame.add(txtNameee);
        
        lblAppointedDate=new JLabel("Appointed Date:");
        lblAppointedDate.setBounds(340,490,100,30);
        myFrame.add(lblAppointedDate);
        
        txtAppointedDate= new JTextField();
        txtAppointedDate.setBounds(450,490,200,30);
        myFrame.add(txtAppointedDate);
        
        lblSpecializationn=new JLabel("Specialization:");
        lblSpecializationn.setBounds(10,530,85,30);
        myFrame.add(lblSpecializationn);
        
        txtSpecializationn= new JTextField();
        txtSpecializationn.setBounds(110,530,200,30);
        myFrame.add(txtSpecializationn);
                        
        lblTerminationDatee=new JLabel("Termination Date:");
        lblTerminationDatee.setBounds(340,530,100,30);
        myFrame.add(lblTerminationDatee);
        
        txtTerminationDatee= new JTextField();
        txtTerminationDatee.setBounds(450,530,200,30);
        myFrame.add(txtTerminationDatee);
        
        lblDevNo=new JLabel("Developer No:");
        lblDevNo.setBounds(10,570,85,30);
        myFrame.add(lblDevNo);
        
        txtDevNo= new JTextField();
        txtDevNo.setBounds(110,570,200,30);
        myFrame.add(txtDevNo);
        
        btnAppointJuniorDeveloper=new JButton("Appoint Junior Devloper");
        btnAppointJuniorDeveloper.setBounds(370,570,280,30);
        myFrame.add(btnAppointJuniorDeveloper);
        btnAppointJuniorDeveloper.addActionListener(this);
        
        btnDisplayAll=new JButton("DisplayAll");
        btnDisplayAll.setBounds(370,610,120,30);
        myFrame.add(btnDisplayAll);
        btnDisplayAll.addActionListener(this);
        
        btnClear=new JButton("Clear");
        btnClear.setBounds(510,610,140,30);
        myFrame.add(btnClear);
        btnClear.addActionListener(this);
        
        myFrame.setVisible(true);
        myFrame.setSize (700,700);
        myFrame.setResizable(false);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource().equals(btnAddForSenior))
        {
            addSeniorDeveloper();
        }
        if(ae.getSource().equals(btnAppoint))
        {
            appointSeniorDeveloper();
        }
        if(ae.getSource().equals(btnTerminate))
        {
            terminateSeniorDeveloper();
        }
        if(ae.getSource().equals(btnAddForJunior))
        {
            addJuniorDeveloper();
        }
        if(ae.getSource().equals(btnAppointJuniorDeveloper))
        {
            appointJuniorDeveloper();
        }
        if(ae.getSource().equals(btnDisplayAll))
        {
            Display();
        }
        if(ae.getSource().equals(btnClear))
        {
            Clear();
        }
    }
    public void addSeniorDeveloper()
    {
        try
        {
            String Platform = txtPlatform.getText();
            String Interviewer_name = txtInterviewer.getText();
            String Working_hour = txtWorkingHours.getText();
            String Salary = txtSalary.getText();
            String Contract_period = txtContractperiod.getText();
            double workinghour = 0.0f;
            int Slary = 0;
            try
            {
                workinghour = Double.parseDouble(Working_hour);
                Slary = Integer.parseInt(Salary);
                if(Platform.equals("") || Working_hour.equals("") || Interviewer_name.equals("") || Contract_period.equals("") || Salary.equals("")){
                JOptionPane.showMessageDialog(myFrame,"You should fill in all the fields. Please, fill all the fields!");
                int length = developer.size();
                length--;
                }
                else
                {
                SeniorDeveloper hire=new SeniorDeveloper(Platform, Interviewer_name, workinghour, Slary, Contract_period);
                developer.add(hire);
                JOptionPane.showMessageDialog(myFrame,"The interview is going to be taken by "+Interviewer_name+" for "+Platform+".");
                }
            }
        catch(NullPointerException np)
        {
            JOptionPane.showMessageDialog(myFrame, np, "MESSAGE",JOptionPane.ERROR_MESSAGE);
        }
        catch(NumberFormatException nf)
        {
            JOptionPane.showMessageDialog(myFrame, nf, "MESSAGE", JOptionPane.ERROR_MESSAGE);
            }
        }
            catch(NumberFormatException nfe)
            {
                JOptionPane.showMessageDialog(myFrame, "Error in parsing Stringat addSeniorDeveloper()!!"+"\n"+nfe,"MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
        txtPlatform.setText("");
        txtWorkingHours.setText("");
        txtInterviewer.setText("");
        txtContractperiod.setText("");
        txtSalary.setText("");
    }
    public void appointSeniorDeveloper()
    {
        try
        {
            String name =txtName.getText();
            String joiningDate = txtJoiningDate.getText();
            String staffRoomNo = txtRoomNo.getText();
            int advSalary = Integer.parseInt(txtAdvSalary.getText());
            int devNo = Integer.parseInt(txtDev_No.getText());

            if(developer.size() < devNo)
            {
                JOptionPane.showMessageDialog(myFrame,"Sorry,there are "+developer.size()+" developers available in developer.");
            }
            else
            {
                if(name.equals("")||joiningDate.equals("")||staffRoomNo.equals(""))
                {
                    JOptionPane.showMessageDialog(myFrame,"Please fill all fields.","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    if(developer.get(devNo-1) instanceof SeniorDeveloper)
                    {
                        //converting type to senior dev
                        SeniorDeveloper objS = (SeniorDeveloper)developer.get(devNo-1);
                        //checking if developer is already appointed
                        if(objS.isappointed() == false)
                        {
                            // calling hire senior dev method
                            objS.hireDeveloper(name, joiningDate, advSalary,staffRoomNo);
                            JOptionPane.showMessageDialog(myFrame,"Successfully hired "+name+" as Senior Developer.");
                            //clearing fields
                            txtName.setText("");
                            txtJoiningDate.setText("");
                            txtRoomNo.setText("");
                            txtAdvSalary.setText("");
                            txtDev_No.setText("");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(myFrame,"A developer has already been hired.");    
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(myFrame,"Sorry,Developer isn't Senior Developer.");   
                    }
                }
            }
        }
    
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(myFrame,"Please fill all field with relevent data type.\n [advSalary and DevNo in whole number]","Error",JOptionPane.ERROR_MESSAGE);   
        }
    }
     public void terminateSeniorDeveloper()   
    {
       try
       {
      int developerNo = Integer.parseInt(txtDev_No.getText());
      if(developer.size()<developerNo)
      {
        JOptionPane.showMessageDialog(myFrame,developer.size()+" developers available in developer.","Error",JOptionPane.ERROR_MESSAGE);
      }else{
        if(developer.get(developerNo-1) instanceof SeniorDeveloper)
        {
          SeniorDeveloper objS = (SeniorDeveloper)developer.get(developerNo-1);
          if(objS.isappointed() == true)
          {
              if(objS.isterminated() ==  false)
              {
                  objS.terminateDeveloper();
                  JOptionPane.showMessageDialog(myFrame,"Developer is successfully terminated.");
                  txtDevNo.setText("");
            }else
            {
                  JOptionPane.showMessageDialog(myFrame,"Developer has already been terminated.","Error",JOptionPane.ERROR_MESSAGE);
            }
          }else
          {
                  JOptionPane.showMessageDialog(myFrame,"Developer hasn't been appointed.","Error",JOptionPane.ERROR_MESSAGE);              
          }          
        }else
        {
          JOptionPane.showMessageDialog(myFrame,"Developer isn't Senior developer.","Error",JOptionPane.ERROR_MESSAGE);
        }
      }
    }
    catch(Exception Event){
      JOptionPane.showMessageDialog(myFrame,"Please fill Developer No.(in whole number)","Error",JOptionPane.ERROR_MESSAGE);
    }
  }
    public void addJuniorDeveloper()
   {
      
       try
       {
       //code for adding the platform for seniorDeveloper
       String PlatformJ= txtNamee.getText();
       String InterviewerJ =txtSpecialization.getText();
       String WorkingHoursJ =txtDevNoo.getText();
       String SalaryJ =txtASalary.getText();
       String AppointedBy =txtAppointedBy.getText();
       String terminationDate=txtTerminationDatee.getText();
       double WorkingHours=0.0;
       try
       {
       WorkingHours=Double.parseDouble(txtDevNoo.getText());
       int SalaryJe=Integer.parseInt(txtASalary.getText());
       
    
       if (PlatformJ.equals("") || InterviewerJ.equals("") || WorkingHoursJ.equals(" ") || SalaryJ.equals("") ||AppointedBy.equals("") )
    
       
       {
           JOptionPane.showMessageDialog(myFrame,"You should fill in all the fields. Please, fill all the fields!");
           int length =developer.size();
           
       }
       else
       {
           if ( SalaryJe<=0)
           {
               JOptionPane.showMessageDialog(myFrame,"Please! Enter the valid number","MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
           else{
               JuniorDeveloper hireJ= new JuniorDeveloper(PlatformJ,InterviewerJ,WorkingHours,SalaryJe,AppointedBy,terminationDate);
               developer.add(hireJ);
               JOptionPane.showMessageDialog(myFrame,"woho Developer Added!!"+"\n"+"Platform:"+" "+PlatformJ+"\n"+"Interviewer Name:"+" "+InterviewerJ+"\n"+"Working Hour:"+" "+WorkingHoursJ +"\n"+"Salary:"+" "+SalaryJ +"\n"+"Appointed By::"+" "+AppointedBy,"MESSAGE",JOptionPane.INFORMATION_MESSAGE);
           }
       }
       }
       catch(NullPointerException np)
       {
            JOptionPane.showMessageDialog(myFrame,np,"MESSAGE",JOptionPane.ERROR_MESSAGE);
       }

       catch(NumberFormatException nf)
       {
            JOptionPane.showMessageDialog(myFrame,nf,"MESSAGE",JOptionPane.ERROR_MESSAGE);
       }
            }
       catch(NumberFormatException nfe)
       {
              JOptionPane.showMessageDialog(myFrame,"Error in parsing string at addGenToRent()!!"+"\n"+nfe,"MESSAGE",JOptionPane.ERROR_MESSAGE);
            }
        
                txtNamee.setText("");
                txtSpecialization.setText("");
                txtDevNoo.setText("");
                txtASalary.setText("");
                txtAppointedBy.setText("");
   }
   public void appointJuniorDeveloper()
    {
        try
        {
            String name = txtNameee.getText();
            String appointedDate = txtAppointedDate.getText();
            String terminationDate = txtTerminationDatee.getText();
            String specialization = txtTerminationDatee.getText();
            String evalutation=txtEvaluationPeriod.getText();
            int devNo = Integer.parseInt(txtDevNo.getText());
            if(developer.size() < devNo)
            {
                JOptionPane.showMessageDialog(myFrame,"Sorry,there are "+developer.size()+" developers available in developer.");
            }
            else
            {
                if(name.equals("")||appointedDate.equals("")||terminationDate.equals("")||specialization.equals(""))
                {
                    JOptionPane.showMessageDialog(myFrame,"Please fill all fields.","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    if(developer.get(devNo-1) instanceof JuniorDeveloper)
                    {
                        //converting type to junior developer
                        JuniorDeveloper objJ = (JuniorDeveloper)developer.get(devNo-1);
                        // checking if developr is already got joined
                        if(objJ.isJoined() == false)
                        {
                            //calling appoint junior developer 
                            objJ.appointDeveloper(name,appointedDate, terminationDate,specialization,evalutation);
                            JOptionPane.showMessageDialog(myFrame,"Successfully appointed "+name+" as Junior Developer.");
                            //clearing fields
                            txtNameee.setText("");
                            txtAppointedDate.setText("");
                            txtTerminationDatee.setText("");
                            txtSpecialization.setText("");
                            txtDevNo.setText("");
                            txtEvaluationPeriod.setText("");
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(myFrame,"A developer has already Joined.");    
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(myFrame,"Sorry,Developer isn't Junior Developer.");   
                    }
                }
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(myFrame,"Please fill all field with relevent data type.\n [DevNo in whole number]","Error",JOptionPane.ERROR_MESSAGE);           
        }
    }
    public void Display() {
        for (Developer d: developer) 
        {
            if(d instanceof SeniorDeveloper) 
            {
                System.out.println("         Senior Developer     ");
                SeniorDeveloper dis = (SeniorDeveloper) d;
                dis.display();
                System.out.println("                                    ");
            } 
            if(d instanceof JuniorDeveloper) 
            {
                System.out.println("        Junior Developer      ");
                JuniorDeveloper dis1 = (JuniorDeveloper) d;
                dis1.display();
                System.out.println("                                    ");
            }
        }
    }
    public void Clear()
    {
    txtPlatform.setText("");
    txtWorkingHours.setText("");
    txtInterviewer.setText("");
    txtContractperiod.setText("");
    txtSalary.setText("");
    txtName.setText("");
    txtJoiningDate.setText("");
    txtDev_No.setText("");
    txtRoomNo.setText("");
    txtAdvSalary.setText("");
    txtNamee.setText("");
    txtSpecialization.setText("");
    txtDevNoo.setText("");
    txtDevNo.setText(""); 
    txtTerminationDate.setText("");
    txtAppointedBy.setText("");
    txtASalary.setText("");
    txtEvaluationPeriod.setText("");
    txtNameee.setText("");
    txtAppointedDate.setText("");
    txtSpecializationn.setText("");
    txtTerminationDatee.setText("");
    }
}       
       
