//Starting of SubClass of Class Developer 
public class SeniorDeveloper extends Developer
{
    //Attributes of Class
    private int salary;
    private String joiningDate;
    private String staffRoomNumber;
    private int contractPeriod;
    private int advanceSalary;
    private boolean appointed;
    private boolean terminated;
    //constructor for initializing attributes of class and calls constructor of superclass Developer
    public SeniorDeveloper(String platform, String interviewername, int workinghours,int salary,int contractPeriod)
    {
        super(platform,interviewername,workinghours);
        this.salary=salary;
        this.contractPeriod=contractPeriod;
        this.joiningDate="";
        this.staffRoomNumber="";
        this.advanceSalary=0;
        this.appointed=false;
        this.terminated=false;
    }
    //Accessor Method for Salary
    public int getsalary()
    {
        return salary;
    }
    //Accessor Method for Contract Period
    public int getcontractPeriod()
    {
        return contractPeriod;
    }
    //Accessor Method for Joining Date
    public String getjoiningDate()
    {
        return joiningDate;
    }
    //Accessor Method for Staff Room Number
    public String getstaffRoomNumber()        
   {
       return staffRoomNumber;
    }
    //Accessor Method for Advance Salary
    public int getadvanceSalary()
    {
        return advanceSalary;
    }
    //Accessor Method for Appointed
    public boolean getappointed()
    {
        return appointed;
    }
    //Accessor Method for Terminated
    public boolean getterminated()
    {
        return terminated;
    }
    //setter method for Salary
    public void setsalary(int salary)
    {
        this.salary=salary;
    }
    //setter method for Contract Period
    public void setcontractPeriod(int contractPeriod)
    {
        this.contractPeriod=contractPeriod;
    }
    /**
     * method to hire developer for the particular Plateform.
     * if the developer is already appointed then developer's details is diplayed. 
     * else method from superclass is called to set developername and the attributes are updated to hire a new developer.
     */
    public void hire(String developername,String joiningDate, int advanceSalary,String staffRoomNumber)
    {
        if(getappointed()==true)
        {
            System.out.println("A developer has already been appointed.Following are the details.");
            System.out.println("Developer Name="+getdevelopername());
            System.out.println("RoomNo="+getstaffRoomNumber());
        }
        else
        {
            super.setdevelopername(developername);
            this.joiningDate=joiningDate;
            this.advanceSalary=advanceSalary;
            this.staffRoomNumber=staffRoomNumber;
            this.appointed=true;
            this.terminated=false;
    }
            
}
//method to check the contract termination period.
public void termination()
{
    if (terminated==true)
    {
        System.out.println("The contract is terminated");
    }
        else
        {
            super.setdevelopername("");
            this.joiningDate="";
            this.advanceSalary=0;
            this.appointed=false;
            this.terminated=true;
        }
    }
//method to display Plateform, Interviewer Name and Salary
public void print()
{
    System.out.println("Platform="+getplatform());
    System.out.println("Interviewer Name="+getinterviewername());
    System.out.println("Developer Salary="+getsalary());
}
//method to display attributes of superclass
//displays information like Termination Status, Joining Date and Advance Salary if the developer is appointed
public void display()
{
  super.display();
    if(getappointed()==true)
    {
    System.out.println("Termination Status="+getterminated());
    System.out.println("Joining Date="+getjoiningDate());
    System.out.println("Advance Salary="+getadvanceSalary());
    
}        
        
}
}
