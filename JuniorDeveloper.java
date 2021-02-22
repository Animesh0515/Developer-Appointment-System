//Starting of SubClass of Class Developer 
public class JuniorDeveloper extends Developer
{
  //Attributes of Class
  private int salary;
  private String appointedDate;
  private String evaluationPeriod;
  private String terminationDate;
  private String specialization;
  private String appointedBy;
  private boolean joined;
  //constructor for initializing attributes of class and calls constructor of superclass Developer
  public JuniorDeveloper(String platform, String interviewername, int workinghours,int salary,String appointedBy, String terminationDate)
  {
      super(platform,interviewername,workinghours);
      this.salary=salary;
      this.appointedBy=appointedBy;
      this.terminationDate=terminationDate;
      this.appointedDate="";
      this.evaluationPeriod="";
      this.specialization="";
      this.joined=false;
    }
    //Accessor Method for Salary
    public int getsalary()
    {
        return salary;
    }
    //Accessor Method for Appointed Date
    public String getappointedDate ()
    {
        return appointedDate;
    }
    //Accessor Method for Evaluation period
     public String getevaluationPeriod ()
    {
        return evaluationPeriod;
    }
    //Accessor Method for Termination Date
     public String getterminationDate()
    {
        return terminationDate;
    }
    //Accessor Method for Specialization
    public String getspecialization ()
    {
        return specialization;
    }
    //Accessor Method for Appointed By
    public String getappointedBy ()
    {
        return appointedBy;
    }
    //Accessor Method for Joined
    public boolean getjoined()
    {
        return joined;
    }
    //setter method for Salary
    //the new value is assigned to salary attribute if the developer has not joined
    //else a suitable message is displayed
    public void setsalary(int salary)
    {
        if(joined==false)
        {
        this.salary=salary;
        }
        else
        {
            System.out.println("Not possible to change salary as developer is already appointed");
            System.out.println("Previous salary:"+getsalary());
        }
    }
    /** 
     * method to appoint developer for a particular Plateform
     * If the developer has not joined then superclass method is called and appointed is set to true 
     * else the details of developer is displayed
     */
    public void appoint(String developername, String appointedDate, String terminationDate, String specialization)
    {
        if(joined==false)
        {
            super.setdevelopername(developername);
            joined=true;
            this.appointedDate=appointedDate;
            this.terminationDate=terminationDate;
            this.specialization=specialization;
        }
        else
        {
            System.out.println("Developer is already appointed");
            System.out.println("Appointed Date="+getappointedDate());
            display();
        }
    }
    //method to display attributes of superclass
    //displays information like Appointed Date, Evaluation Period, termination Date, Developer Salary, Developer Specialization, Developer Appointed if the developer is already joined
    public void display()
    {
        super.display();
        if(joined==true)
        {
            System.out.println("Appointed Date="+getappointedDate());            
            System.out.println("Evaluation Period="+getevaluationPeriod());
            System.out.println("Termination Date="+getterminationDate());
            System.out.println("Developer Salary="+getsalary());
            System.out.println("Developer Specialization="+getspecialization());
            System.out.println("Developer Appointed By="+getappointedBy());
        }
        
    
}
}
