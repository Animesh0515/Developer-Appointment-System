
//starting of SuperClass
public class Developer
{
    //Attributes of Class
    protected String platform;
    protected String interviewername;
    protected String developername;
    protected int workinghours;
    //constructor for initializing attributes of class
   public Developer(String platform, String interviewername, int workinghours)
   {
       this.platform=platform;
       this.interviewername=interviewername;
       this.workinghours=workinghours;
       this.developername="";
       
    
}
//Accessor Method for Plateform
public String getplatform()
{
    return platform;
}
//Accessor Method for Interviewer name
public String getinterviewername()
{
    return interviewername;
}
//Accessor Method for Working Hours
public int getworkinghours()
{
    return workinghours;
}
//Accessor Method for Developer Name
public String getdevelopername()
{
    return developername;
}
//setter method for Developer Name
public void setdevelopername(String developername)
{
    this.developername=developername;
}
//method to display attributes of Class
//Developer Name is displayed only when Develoepr Name is not empty
public void display()
{
    System.out.println("Platform="+getplatform());
    System.out.println("Interviewername="+getinterviewername());
    System.out.println("Working hours="+getworkinghours());
    if(!developername.equals(""))
    {
        System.out.println("Developername="+getdevelopername());
    }
}
}