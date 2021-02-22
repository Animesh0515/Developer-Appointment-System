import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;
/**
 * Write a description of class RigoTechnology here.
 *
 * @author Islington
 * @version 1.3
 */

    
public class RigoTechnology extends WindowAdapter implements ActionListener
{
    JFrame frm;
    JLabel lblttl,lblpf,lblin,lblsl,lblwh,lbldn,lbljd,lblas,lblpno,lblsno,lblttl2,lblpf2,lblin2,lblsl2,lblwh2,lblab,lbltd,lblpfno2,lbldn2,lblapd,lbltd2,lblsp,lblcp;
    JTextField txtpf,txtin,txtsl,txtwh,txtcp,txtdn,txtjd,txtas,txtpno,txtsno,txtpf2,txtin2,txtsl2,txtwh2,txtab,txttd,txtpfno2,txtdn2,txtapd,txttd2,txtsp;
    JButton btnadd,btnd,btnc,btnhire,btndis,btnclear,btnAdd;
    ArrayList<Developer> list= new ArrayList<Developer>();
    
    
    public static void main(String args[])
    {
        new RigoTechnology().GUI();
    }
    public void GUI(){
        frm= new JFrame("RigoTechnology");
        frm.setSize(700,950);
        frm.setVisible(true);
        frm.setResizable(true);
        frm.setLayout(null);
        JPanel pane= new JPanel();
        
        lblttl=new JLabel();
        lblttl.setBounds(20,0,200,30);
        frm.add(lblttl);
        lblttl.setText("Senior Developer");
        lblpf= new JLabel("Platform:");
        lblpf.setBounds(30,40,60,30);
        frm.add(lblpf);
        txtpf= new JTextField();
        txtpf.setBounds(150,40,500,30);
        frm.add(txtpf);
        lblin= new JLabel("Interviewer's Name:");
        lblin.setBounds(30,80,150,30);
        frm.add(lblin);
        txtin= new JTextField();
        txtin.setBounds(150,80,500,30);
        frm.add(txtin);
        lblsl= new JLabel("Salary:");
        lblsl.setBounds(30,120,60,30);
        frm.add(lblsl);
        txtsl= new JTextField();
        txtsl.setBounds(80,120,150,30);
        frm.add(txtsl);
        lblwh= new JLabel("Working Hours:");
        lblwh.setBounds(400,120,100,30);
        frm.add(lblwh);
        
        txtwh= new JTextField();
        txtwh.setBounds(500,120,150,30);
        frm.add(txtwh);
        lblcp= new JLabel("Contract period:");
        lblcp.setBounds(30,160,100,30);
        frm.add(lblcp);
        txtcp=new JTextField();
        txtcp.setBounds(130,160,150,30);
        frm.add(txtcp);
        btnadd= new JButton("ADD");
        btnadd.setBounds(550,200,100,30);
        frm.add(btnadd);
        btnadd.addActionListener(this);
        lbldn= new JLabel("Developer's Name:");
        lbldn.setBounds(30,240,150,30);
        frm.add(lbldn);
        txtdn= new JTextField();
        txtdn.setBounds(150,240,500,30);
        frm.add(txtdn);
        lbljd= new JLabel("Joining Date:");
        lbljd.setBounds(30,280,100,30);
        frm.add(lbljd);
        
        txtjd= new JTextField();
        txtjd.setBounds(120,280,150,30);
        frm.add(txtjd);
        lblas= new JLabel("Advance Salary:");
        lblas.setBounds(400,280,100,30);
        frm.add(lblas);
        txtas= new JTextField();
        txtas.setBounds(500,280,150,30);
        frm.add(txtas);
        lblpno = new JLabel ("Platform No:");
        lblpno.setBounds(400,320,100,30);
        frm.add(lblpno);
        txtpno= new JTextField();
        txtpno.setBounds(500,320,150,30);
        frm.add(txtpno);
        lblsno= new JLabel("Staff Room No:");
        lblsno.setBounds(30,320,100,30);
        frm.add(lblsno);
        txtsno= new JTextField();
        txtsno.setBounds(120,320,150,30);
        frm.add(txtsno);
        btnd= new JButton("Appoint");
        btnd.setBounds(400,360,100,30);
        frm.add(btnd);
        btnd.addActionListener(this);
        btnc= new JButton("Terminate");
        btnc.setBounds(550,360,100,30);
        frm.add(btnc);
        btnc.addActionListener(this);
        
        
        
        lblttl2= new JLabel("Junior Developer");
        lblttl2.setBounds(30,400,200,30);
        frm.add(lblttl2);
        lblpf2= new JLabel("Platform:");
        lblpf2.setBounds(30,440,60,30);
        frm.add(lblpf2);
        txtpf2= new JTextField();
        txtpf2.setBounds(150,440,500,30);
        frm.add(txtpf2);
        lblin2= new JLabel("Interviewer's Name:");
        lblin2.setBounds(30,480,150,30);
        frm.add(lblin2);
        txtin2= new JTextField();
        txtin2.setBounds(150,480,500,30);
        frm.add(txtin2);
        lblsl2= new JLabel("Salary:");
        lblsl2.setBounds(30,520,60,30);
        frm.add(lblsl2);
        txtsl2= new JTextField();
        txtsl2.setBounds(80,520,150,30);
        frm.add(txtsl2);
        lblwh2= new JLabel("Working Hours:");
        lblwh2.setBounds(400,520,100,30);
        frm.add(lblwh2);        
        txtwh2= new JTextField();
        txtwh2.setBounds(500,520,150,30);
        frm.add(txtwh2);
        lblab= new JLabel("Appointed By:");
        lblab.setBounds(30,560,100,30);
        frm.add(lblab);
        txtab= new JTextField();
        txtab.setBounds(110,560,150,30);
        frm.add(txtab);
        lbltd= new JLabel("Termination Date:");
        lbltd.setBounds(390,560,100,30);
        frm.add(lbltd);
        txttd= new JTextField();
        txttd.setBounds(500,560,150,30);
        frm.add(txttd);
        btnAdd= new JButton("ADD");
        btnAdd.setBounds(550,600,100,30);
        frm.add(btnAdd);
        btnAdd.addActionListener(this);
        lblpfno2= new JLabel("PlatForm No:");
        lblpfno2.setBounds(30,640,100,30);
        frm.add(lblpfno2);
        txtpfno2=new JTextField();
        txtpfno2.setBounds(110,640,500,30);
        frm.add(txtpfno2);
        lbldn2= new JLabel("Developer's Name:");
        lbldn2.setBounds(30,680,150,30);
        frm.add(lbldn2);
        txtdn2=new JTextField();
        txtdn2.setBounds(140,680,150,30);
        frm.add(txtdn2);
        lblapd= new JLabel("Appointed Date:");
        lblapd.setBounds(390,680,100,30);
        frm.add(lblapd);
        txtapd=new JTextField();
        txtapd.setBounds(485,680,145,30);
        frm.add(txtapd);
        lbltd2= new JLabel("Terminationm Date:");
        lbltd2.setBounds(30,720,150,30);
        frm.add(lbltd2);
        txttd2=new JTextField();
        txttd2.setBounds(145,720,150,30);
        frm.add(txttd2);
        lblsp= new JLabel("Specialization:");
        lblsp.setBounds(390,720,100,30);
        frm.add(lblsp);
        txtsp=new JTextField();
        txtsp.setBounds(475,720,150,30);
        frm.add(txtsp);
        btnhire= new JButton("Appoint");
        btnhire.setBounds(550,760,100,30);
        frm.add(btnhire);
        btnhire.addActionListener(this);
        btndis= new JButton("Display");
        btndis.setBounds(350,840,100,30);
        frm.add(btndis);
        btndis.addActionListener(this);
        btnclear= new JButton("Clear");
        btnclear.setBounds(550,840,100,30);
        frm.add(btnclear);
        btnclear.addActionListener(this);
        frm.addWindowListener(this);
        frm.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    public void windowClosing(WindowEvent e)
    {
        int a=JOptionPane.showConfirmDialog(frm, "Do you want to close?");
        if(a==JOptionPane.YES_OPTION){
            frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
        public void actionPerformed(ActionEvent e)
        {
            
            if(e.getSource()==btnadd)
           {
              
               String Platform= txtpf.getText();
               String InterviewerName=txtin.getText();
               String Salary=txtsl.getText();
               String Workinghour=txtwh.getText();
               String Contractperiod=txtcp.getText();
               if(Platform.isEmpty()||InterviewerName.isEmpty()||Salary.isEmpty()||Workinghour.isEmpty()||Contractperiod.isEmpty())
               {
                   JOptionPane.showMessageDialog(frm,"Empty Text Field.Please fill all the fields");
                }
               else{
                   try{
                       
               int WorkingHour=Integer.parseInt(Workinghour);
               int Salaryint=Integer.parseInt(Salary);
               int ContractPeriod=Integer.parseInt(Contractperiod);
               if(WorkingHour>=8 && WorkingHour<=12)
               {
               SeniorDeveloper detailSen= new SeniorDeveloper(Platform,InterviewerName,WorkingHour,Salaryint,ContractPeriod);
               list.add(detailSen);
               JOptionPane.showMessageDialog(frm,"Successfully Added"); 
               }
               else{
                   JOptionPane.showMessageDialog(frm,"Limit Reached of Working Hours. Limit 8-12");
                }
            }
            catch(NumberFormatException err)
            {
                JOptionPane.showMessageDialog(frm,"Please Enter valid input. Keep Integer values in Working Hours, Salary and Contact period.");
            }
            }
        }
            
            if(e.getSource()==btnd)
            {
                String DeveloperName=txtdn.getText();
                String Joiningdate=txtjd.getText();
                String Advancesalary=txtas.getText();
                String Roomno=txtsno.getText();
                String Platformno=txtpno.getText();
                if(DeveloperName.isEmpty()||Joiningdate.isEmpty()||Advancesalary.isEmpty()||Roomno.isEmpty()||Platformno.isEmpty())
                {
                    JOptionPane.showMessageDialog(frm,"Empty Text Field.Please fill all the fields");
                }
                else{
                    try{
                        
                 
                int AdvanceSalary=Integer.parseInt(Advancesalary);
                int PlatformNo=((Integer.parseInt(Platformno))-1);
                
                if(PlatformNo>=0 && PlatformNo<list.size())
                {
                    
                    if(list.get(PlatformNo) instanceof SeniorDeveloper)
                    {
                        
                SeniorDeveloper appSen=(SeniorDeveloper)list.get(PlatformNo);
                appSen.hire(DeveloperName,Joiningdate,AdvanceSalary,Roomno);
                JOptionPane.showMessageDialog(frm,"Senior Developer has been appointed.");
                     
                    }
                    else{
                        JOptionPane.showMessageDialog(frm,"Not a valid Platform  of SeniorDeveloper.Please enter a valid Platform No.");
                         }
                }
                else{
                    JOptionPane.showMessageDialog(frm,"Not a valid Platform .Please enter a valid Platform No.");
                    }
                         }
                catch(NumberFormatException a)
                {
                    JOptionPane.showMessageDialog(frm,"Please Enter valid input. Keep Integer values in Advance Salary and Platform No.");
                }
                       }
                }
                
            
            if(e.getSource()==btnc)
            {
                
                    String Platformno=txtpno.getText();
                    if(Platformno.isEmpty()){
                        JOptionPane.showMessageDialog(frm,"Empty Text Field.Please fill all the fields");
                    }
                    else{
                        try{
                        int PlatformNo=((Integer.parseInt(Platformno))-1);
                        if(list.get(PlatformNo) instanceof SeniorDeveloper)
                            {
                                SeniorDeveloper termDev=(SeniorDeveloper)list.get(PlatformNo);
                                if(termDev.getappointed()==false)
                                {
                                    JOptionPane.showMessageDialog(frm,"Developer not appointed yet");
                                }
                                else{
                                    termDev.termination();
                                    JOptionPane.showMessageDialog(frm,"Developer Terminated");
                                     }
                              }
                        else{
                                JOptionPane.showMessageDialog(frm,"Not a valid Platform No.Please enter a valid Platform No.");
                             }
                        }
                       catch(Exception b)
                        {
                            JOptionPane.showMessageDialog(frm,"Please Enter valid input. Keep Integer values in  Platform No.");
                }     
            }
                                
                        
                        

            }
            if(e.getSource()==btnAdd)
            {
                String JPlatform=txtpf2.getText();
                String JInterviewerName=txtin2.getText();
                String JWorkinghour=txtwh2.getText();
                String Jsalary=txtsl2.getText();
                String JAppoint=txtab.getText();
                String JTermination=txttd.getText();
                if(JPlatform.isEmpty()||JInterviewerName.isEmpty()||JWorkinghour.isEmpty()||Jsalary.isEmpty()||JAppoint.isEmpty()||JTermination.isEmpty())
                {
                    JOptionPane.showMessageDialog(frm,"Empty Text Field.Please fill all the fields");
                }
                else{
                    try{
                int JWorkingHour=Integer.parseInt(JWorkinghour);
                int JSalary=Integer.parseInt(Jsalary);
                JuniorDeveloper detailJun=new JuniorDeveloper(JPlatform,JInterviewerName,JWorkingHour,JSalary,JAppoint,JTermination);
                list.add(detailJun);
                JOptionPane.showMessageDialog(frm,"Successfully Added");
                         }
                     catch(Exception a)
                     {
                         JOptionPane.showMessageDialog(frm,"Please Enter valid input. Keep Integer values in Working Hours and Salary .");
            }
        }
    }
    if(e.getSource()==btnhire)
    {
        String JPlatformno=txtpfno2.getText();
        String JDeveloperName=txtdn2.getText();
        String JAppointedDate=txtapd.getText();
        String JTerminationDate=txttd2.getText();
        String JSpecialization=txtsp.getText();
        if(JPlatformno.isEmpty()||JDeveloperName.isEmpty()||JAppointedDate.isEmpty()||JTerminationDate.isEmpty()||JSpecialization.isEmpty())
                {
                    JOptionPane.showMessageDialog(frm,"Empty Text Field.Please fill all the fields");
                }
                else{
                    try{
                        int JPlatformNo=((Integer.parseInt(JPlatformno))-1);
                        if(JPlatformNo>=0 && JPlatformNo<list.size())
                        {
                             if(list.get(JPlatformNo) instanceof JuniorDeveloper)
                             { 
                            JuniorDeveloper hireJun=(JuniorDeveloper)list.get(JPlatformNo);
                            hireJun.appoint(JDeveloperName, JAppointedDate, JTerminationDate, JSpecialization); 
                            JOptionPane.showMessageDialog(frm,"Junior Developer has been appointed.");
                             }
                             else{
                                 JOptionPane.showMessageDialog(frm,"Not a valid Platform No of Junior Developer.Please enter a valid Platform No.");
                                }
                            }
                             
                                 
                        
                        else{
                            JOptionPane.showMessageDialog(frm,"Not a valid Platform No.Please enter a valid Platform No.");
                        }
                    
                    }
                    catch(NumberFormatException a)
                    {
                        JOptionPane.showMessageDialog(frm,"Please Enter valid input. Keep Integer values in Platform No.");
                    }
                }
            }
            if(e.getSource()==btndis)
            {
                
                if(list.isEmpty())
                {
                    JOptionPane.showMessageDialog(frm,"Please enter the data first.");
                }
                else
                {
                  for(Developer dev:list)
                  {
                      if(dev instanceof SeniorDeveloper)
                      {
                          
                          SeniorDeveloper Sdis=(SeniorDeveloper)dev;
                          Sdis.display();
                        }
                        if(dev instanceof JuniorDeveloper)
                        {
                            JuniorDeveloper Jdis=(JuniorDeveloper)dev;
                            Jdis.display();
                        }
                    }
                }
            }
                        
            if(e.getSource()==btnclear)
            {
                txtpf.setText("");
                txtin.setText("");
                txtsl.setText("");
                txtwh.setText("");
                txtcp.setText("");
                txtdn.setText("");
                txtjd.setText("");
                txtas.setText("");
                txtpno.setText("");
                txtsno.setText("");
                txtpf2.setText("");
                txtin2.setText("");
                txtsl2.setText("");
                txtwh2.setText("");
                txtab.setText("");
                txttd.setText("");
                txtpfno2.setText("");
                txtdn2.setText("");
                txtapd.setText("");
                txttd2.setText("");
                txtsp.setText("");
            }
        }
           
               
               
               
               
}
      
        


   