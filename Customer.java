/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainJava;

import com.sun.jdi.connect.Transport;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;  
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.PasswordAuthentication;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
public class Customer  extends JFrame{
       private  String IDE;
   private  String nameOfEvent;
    private String location;
    private String Description;
    private String IdCustomer;
   private String Username;
   private String Password;
     private String Mobile;
      private String Email;
    private final String customerFileName="Customer.txt";
    public static ArrayList<Customer>Customer=new ArrayList<Customer>();
      private final String projectMangerFileName="PM.txt";
     public static ArrayList<ProjectManger>ProjectManger=new ArrayList<ProjectManger>();
  
   private final String adminFileName="Admin.txt";
   public static ArrayList<Admin>Admin=new ArrayList<Admin>();
  
      JLabel l;
  
        String  Request;
         JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l22,l15,l16,l17;

    JTextField t1,t2,t55,t66,t88,t15,t16;

    JPasswordField t3,t4;

    JRadioButton male,female;

    JComboBox day,month,year;

    JTextArea ta1,t77,t17,t555;

    JCheckBox terms;

    JButton submit,bo1,bo2,b1,b2,boo1,boo2,boo3,bb1,bb2,bb3,bb5,b0,b01,b22;
   JTextArea  t5;
  
    JComboBox c1;
    JLabel msg;
    JTextField t11,t22,t33,t44,t111,t222,t333;
      
   Users   u=new Users();
   public Customer()
   {
       setResizable(false);
        setBounds(300,300,1366,768);
        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
        JMenu jm1 = new JMenu("Reception");
        jm1.setForeground(Color.RED);
	menuBar.add(jm1);
        JMenuItem a1 = new JMenuItem("Create Account");
	jm1.add(a1);
        a1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                     
                    setTitle("Registration Form");
        setSize(700,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        l1=new JLabel("Name");
        l1.setBounds(20,50,100,20);
       Container c=getContentPane();
       c.setLayout(null);
        c.add(l1);
        t1=new JTextField();
        t1.setBounds(130,50,100,20);
        c.add(t1);
        l2=new JLabel("Mobile");
        l2.setBounds(20,100,100,20);
        c.add(l2);
        t2=new JTextField();
        t2.setBounds(130,100,100,20);
        c.add(t2);
        
        l3=new JLabel("Gender");
        l3.setBounds(20,150,100,20);
        c.add(l3);
        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        male.setBounds(130,150,80,20);
        female.setBounds(220,150,80,20);
        male.setSelected(true);
        c.add(male);
        c.add(female);

        ButtonGroup gen= new ButtonGroup();

        gen.add(male);

        gen.add(female);

        l4=new JLabel("DOB");

        l4.setBounds(20,200,100,20);

        c.add(l4);
  
        String days [] ={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31",};

        String monthes[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        String  years []={"2018", "2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000"};

        day=new JComboBox(days);

        month=new JComboBox(monthes);

        year=new JComboBox(years);

        day.setBounds(130,200,50,20);
        month.setBounds(190,200,50,20);
        year.setBounds(250,200,60,20);
        c.add(day);
        c.add(month);
        c.add(year);

        l5=new JLabel("Email");
        l5.setBounds(20,250,100,20);
        c.add(l5);
        ta1=new JTextArea();
        ta1.setBounds(130,240,200,50);
        c.add(ta1);

        terms=new JCheckBox("Please Accept terms ");
        terms.setBounds(50,300,200,20);
        c.add(terms);

        l6=new JLabel("Password");
        l6.setBounds(20,350,100,20);
        c.add(l6);
        t3=new JPasswordField();
        t3.setBounds(130,350,100,20);
        //submit.setFocusable(false);
        c.add(t3);
          l4=new JLabel("ID");

        l4.setBounds(20,400,100,20);

        c.add(l4);
        
        t88=new JTextField();
        t88.setBounds(130,400,100,20);
        c.add(t88);
     JButton bo=new JButton("BACK") ;

             bo.setBounds(400,415,100,20);
               bo.addActionListener(this);
             add(bo);
           
       
        submit=new JButton("Submit");
        submit.setBounds(250,415,100,20);
        submit.setFocusable(false);
        c.add(submit);
        submit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                   
               String text1=t1.getText();
                 
               String text2= t2.getText();
                
               String text3=ta1.getText();
                
               String text4=t3.getText();
               
               String text5=t88.getText();
               setCustomerID(text5);
            
             
                 t1.setText("");
               t2.setText(""); ta1.setText("");
                 t3.setText("");t88.setText("");
               if(text1.equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter Your Name ");

               }
               if(text2.equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter Your Mobile ");

               }
               if(text3.equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter Your Email ");

               }
               if(text4.equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter Your Password ");

               }
               if(text5.equals("")){
                   JOptionPane.showMessageDialog(null, "Please Enter Your ID ");

               }
               else{
                   JOptionPane.showMessageDialog(null, "Registraion is Successfuly ");

               }
                
                }catch(Exception e ){}
                
    }
        }
        );

bo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                     
                     setVisible(false);
                       new Customer().setVisible(true);
                
                }catch(Exception e ){}
            }
        });
        
                
                }catch(Exception e ){}
            }
        });
            
      
        JMenuItem a2 = new JMenuItem("Book event");
	jm1.add(a2);
          a2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                     
                        t11=new JTextField();
                  setLayout(null);
     
                setTitle("Book Event");
                setResizable(false);
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setBounds(400,200,700,500);
          JLabel name =new JLabel("Name");
            name.setBounds(60,30,120,30);
          name.setFont(new Font("Tahoma",Font.PLAIN,17));
          add(name);
           t11.setBounds(200,30,150,30);
          add(t11);
         t22=new JTextField();
         t33=new JTextField();
          JLabel id =new JLabel("ID");
           id.setBounds(60,80,120,30);
          id.setFont(new Font("Tahoma",Font.PLAIN,17));
          add(id);
          t22.setBounds(200,80,150,30);
          add(t22);
            JLabel Location =new JLabel("Location");
           Location.setBounds(60,130,120,30);
           Location.setFont(new Font("Tahoma",Font.PLAIN,17));
          add( Location);
         
          t33.setBounds(200,130,150,30);
          add(t33);
           JLabel Discription =new JLabel("Discription");
           Discription.setBounds(60,180,120,30);
          Discription.setFont(new Font("Tahoma",Font.PLAIN,17));
          add(Discription);
         
          t5=new JTextArea();
          t5.setBounds(200,230,200,100);
          add(t5);
           l22=new JLabel("BILL:");
           l22.setBounds(10,330,100,20);
           add(l22);
              l=new JLabel();
           l.setBounds(80,330,100,20);
           add(l);
          b1=new JButton("Book");
          b2=new JButton("Back");
              b1.setBackground(Color.BLACK);
             b1.setForeground(Color.WHITE);
             b1.setBounds(100,375,150,30);
            b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      String name=t11.getText();
                 String id=t22.getText();
                  String location=t33.getText();
               String Describtion=t5.getText();
              
                  
                  String c=name+"&"+id+"&"+location+"&"+Describtion+"&"+id;
                  BookEvent(c);
                
                  
                   t11.setText("");
               t22.setText(""); t33.setText("");
                 t5.setText(""); 
                
  
                
                
                }catch(Exception e ){}
            }
        });

                
        
        
          
             add(b1);
             
             b2.setBackground(Color.BLACK);
              b2.setForeground(Color.WHITE);
             b2.setBounds(290,375,150,30);
            b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      setVisible(false);
                       new Customer().setVisible(true);
                
                
                }catch(Exception e ){}
            }
        });
              add(b2); 
              JButton bb3=new JButton("Receive Bill");
             bb3.setBackground(Color.BLACK);
              bb3.setForeground(Color.WHITE);
             bb3.setBounds(480,375,150,30);
            bb3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                   
                     l.setText(Bill().toString());
                
                }catch(Exception e ){}
            }
        });
             add(bb3);
            
                
                }catch(Exception e ){}
            }
        });
          
		     JMenuItem a3 = new JMenuItem("Delete booking");
	jm1.add(a3);
         a3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                  
                          
                            setResizable(false);
                            setBounds(300,300,1366,768);
                            setLayout(null);
                            setVisible(true);
                                setResizable(false);
                            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                                   setSize(700,500);
                          setDefaultCloseOperation(EXIT_ON_CLOSE);
                        JLabel lf=new JLabel("ID");
                          lf.setBounds(300,50,100,20);
                             Container c=getContentPane();
                             c.setLayout(null);
                            c.add(lf);
                            JTextField tp=new JTextField();
                           tp.setBounds(400,50,100,20);
                           c.add(tp);
                            b01=new JButton("Delete");
                            b01.setBounds(100,300,100,20);
                            
                            c.add(b01);
                                
                        b2=new JButton("BACK") ;

             b2.setBounds(250,300,100,20);
               b2.addActionListener(this);
             add(b2);
            
            b01.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                     String idd=tp.getText();
                      JOptionPane.showMessageDialog(null, "Deleted Successfuly ");
                     deleteEvent(idd);
                
                
                }catch(Exception e ){}
            }
        });
                b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      
                     setVisible(false);
                       new Customer().setVisible(true);
                
                }catch(Exception e ){}
            }
        });
         
   
                  }catch(Exception e ){}
            }
        });  
                
          
            JMenuItem a30 = new JMenuItem("Update booking");
	jm1.add(a30);
         a30.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                  
                                          t11=new JTextField();
                  setLayout(null);
     
                setTitle("  Update Event");
                setResizable(false);
               setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              setBounds(400,200,700,500);
          JLabel name =new JLabel("Name");
            name.setBounds(60,30,120,30);
          name.setFont(new Font("Tahoma",Font.PLAIN,17));
          add(name);
           t11.setBounds(200,30,150,30);
          add(t11);
         t22=new JTextField();
         t33=new JTextField();
          JLabel id =new JLabel("ID");
           id.setBounds(60,80,120,30);
          id.setFont(new Font("Tahoma",Font.PLAIN,17));
          add(id);
          t22.setBounds(200,80,150,30);
          add(t22);
            JLabel Location =new JLabel("Location");
           Location.setBounds(60,130,120,30);
           Location.setFont(new Font("Tahoma",Font.PLAIN,17));
          add( Location);
         
          t33.setBounds(200,130,150,30);
          add(t33);
           JLabel Discription =new JLabel("Discription");
           Discription.setBounds(60,180,120,30);
          Discription.setFont(new Font("Tahoma",Font.PLAIN,17));
          add(Discription);
         
          t5=new JTextArea();
          t5.setBounds(200,230,200,100);
          add(t5);
           l22=new JLabel("BILL:");
           l22.setBounds(10,330,100,20);
           add(l22);
              l=new JLabel();
           l.setBounds(80,330,100,20);
           add(l);
       
        
             
            
                            b0=new JButton("Update");
                            b0.setBounds(100,400,100,20);
                           
                            add(b0);
                                
                 b2=new JButton("BACK") ;

             b2.setBounds(250,400,100,20);
               b2.addActionListener(this);
             add(b2);
            
            b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                       String name=t11.getText();
                  String id=t22.getText();
                  String location=t33.getText();
                String Describtion=t5.getText();
              
                  
                  String c=name+"&"+id+"&"+location+"&"+Describtion+"&"+id;
                      JOptionPane.showMessageDialog(null, " Updated Suceesfully ");
                      UpdateEvent(id,c);
                
                
                }catch(Exception e ){}
            }
        });
            
                    b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      
                     setVisible(false);
                       new Customer().setVisible(true);
                
                }catch(Exception e ){}
            }
        });
                }catch(Exception e ){}
            }
        });
          JMenuItem a4 = new JMenuItem("Contect PM");
	jm1.add(a4);
      
      a4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      boo1=new JButton("Contact");
 
                setTitle("Contact Us");
             setSize(550, 350);
             setDefaultCloseOperation(EXIT_ON_CLOSE);
            l8 = new JLabel("ID");
        l8.setBounds(20, 50, 100, 20);
        Container c = getContentPane();
        c.setLayout(null);
        c.add(l8);
        t55 = new JTextField();
        t55.setBounds(130, 50, 100, 20);
        c.add(t55);
        l9 = new JLabel("Email");
        l9.setBounds(20, 100, 100, 20);
        c.add(l9);
        t66 = new JTextField();
        t66.setBounds(130, 100, 100, 20);
        c.add(t66);
        l10=new JLabel("Request");
        l10.setBounds(20,150,100,20);
        c.add(l10);
        t77=new JTextArea();
        t77.setBounds(130,150,200,50);
        c.add(t77);
        //boo1=new JButton("Submit");
        boo1.setBounds(200,250,100,20);
        boo1.setFocusable(false);
        boo1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                   String text1=t55.getText();
                    String text2= t66.getText();
                    String text3=t77.getText();
                     
                       setREQ(text3);
                     
                        AddRequest();
                        
                    
                  
                    if(text1.equals("")){
                        JOptionPane.showMessageDialog(null, "Please Enter Your ID ");

                    }
                    if(text2.equals("")){
                        JOptionPane.showMessageDialog(null, "Please Enter Your Email ");

                    }
                    if(text3.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please Enter Your Request ");

                    }
                    else{
                        JOptionPane.showMessageDialog(null, " Thank You For Contact With Us ");

                    }
                
                     
                }catch(Exception e ){}
                
    }
        }
        );
	
        c.add(boo1);
       
  b2=new JButton("BACK") ;

             b2.setBounds(320,250,100,20);
               b2.addActionListener(this);
             add(b2);
               b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      
                     setVisible(false);
                       new Customer().setVisible(true);
                
                }catch(Exception e ){}
            }
        });
        setVisible(true);
                
                
                }catch(Exception e ){}
      }         
    
            } );
       
       JMenuItem a5 = new JMenuItem("Contact Admin");
          a5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                   
                        boo3=new JButton("Contact");
 
                setTitle("Contact Us");
             setSize(550, 350);
             setDefaultCloseOperation(EXIT_ON_CLOSE);
            l15 = new JLabel("ID");
        l15.setBounds(20, 50, 100, 20);
        Container c = getContentPane();
        c.setLayout(null);
        c.add(l15);
        t15 = new JTextField();
        t15.setBounds(130, 50, 100, 20);
        c.add(t15);
        l16 = new JLabel("Email");
        l16.setBounds(20, 100, 100, 20);
        c.add(l16);
        t16 = new JTextField();
        t16.setBounds(130, 100, 100, 20);
        c.add(t16);
        l17=new JLabel("Request");
        l17.setBounds(20,150,100,20);
        c.add(l17);
        t17=new JTextArea();
        t17.setBounds(130,150,200,50);
        c.add(t17);
        //boo1=new JButton("Submit");
        boo3.setBounds(200,250,100,20);
        boo3.setFocusable(false);
        boo3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                   String text1=t15.getText();
                    String text2= t16.getText();
                    String text3=t17.getText();
                    setREQ(text3);
                     sendToAdmin();   
                    if(text1.equals("")){
                        JOptionPane.showMessageDialog(null, "Please Enter Your ID ");

                    }
                    if(text2.equals("")){
                        JOptionPane.showMessageDialog(null, "Please Enter Your Email ");

                    }
                    if(text3.equals("")) {
                        JOptionPane.showMessageDialog(null, "Please Enter Your Request ");

                    }
                    else{
                        JOptionPane.showMessageDialog(null, " Thank You For Contact With Us ");

                    }
                 
                     
                }catch(Exception e ){}
                
    }
        }
        );
	
        c.add(boo3);
       b2=new JButton("BACK") ;

             b2.setBounds(350,250,100,20);
               b2.addActionListener(this);
             add(b2);
                   b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      
                     setVisible(false);
                       new Customer().setVisible(true);
                
                }catch(Exception e ){}
            }
        });
                }catch(Exception e ){}
                
    }
        }
        );
	
	jm1.add(a5);
       
                JMenuItem a6 = new JMenuItem("Back");
	a6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                   
                       setVisible(false);
                       new Users().setVisible(true);
                
                }catch(Exception e ){}
                
    }
        }
        );
	
	jm1.add(a6);
        
        
        
        
   setLayout(null);
        
        
        setVisible(true);
        
  
}
       
   

   
  
	
		
	
	
   
    void setIDE(String IDE)
    {
        this.IDE=IDE;
    }
    String getIDE()
    {
        return this.IDE;
    }
    void   setCustomerID(String id)
    {
        this.IdCustomer=id;
    }
    String  getCustomerData()
    {
        return this.Username+" "+this.Password+" "+this.IdCustomer+" "+this.Email+" "+this.Mobile;
    }
  
    void setPassword(String password)
    {
        this.Password=password;
    }
    void setUserName(String username)
    {
        this.Username=username;
    }
    void setNameOfEvent(String nameOfEvent) {
       this.nameOfEvent=nameOfEvent;
        
    }

    void setLocation(String location) {
       this.location=location;
    }

    void setDescription(String Description) {
        this.Description=Description;
    }
    void setEmail(String Email)
    {
        this.Email=Email;
    }
          
    void setMobile(String Mobile)
    {
        this.Mobile=Mobile;
    }
   
    void  setREQ(String Req)
    {
        this.Request=Req;
    }
    String  getREQ()
    {
        return  this.Request;
    }
    
      
       
   
    String  getCustomerID()
    {
       return IdCustomer;
    }
    
    private String getEventData()
    {
        return this.IDE+"&"+this.nameOfEvent+"&"+this.Description+"&"+this.location;
    }
    public  String printEvent()
    {
        return this.IDE+"\n"+this.nameOfEvent+"\n"+this.Description+"\n"+this.location;
    }

    public boolean BookEvent(String s)
    {
       if(u.write( s,"Event.txt", true))
        {
            return true;
        }
        else
            return false;
    }
  
  
       
    
    
 public boolean AddRequest()
 {
     if( u.write( getREQ(),"Requests.txt", true))
     {
         return true;
     }
     else
         return false;
 }
  public boolean sendToAdmin()
 {
     if( u.write( getREQ(),"reqAdmin.txt", true))
     {
         return true;
     }
     else
         return false;
 }
    
    
    public void UpdateEvent(String id,String p)throws FileNotFoundException, IOException
    {
        ArrayList<String> Event =storage("Event.txt");
   
       Scanner Reader = null;
      try {
    Reader= new Scanner(new File("Event.txt"));
  
 }catch (Exception e){
      System.out.println(e);
     
 }
         String[] subdata;
      String []y = p.split("&");
      String Name = y[0];
      String  ido = y[1];
      String location = y[2] ;
     String Description = y[3] ;
      String id1 = y[4] ; // run
    for (int i = 0 ; i<Event.size();i++) {
      subdata = Event.get(i).split("&");
      if (subdata[1].equals(id))
          Event.set(i, Name+"&"+ido+"&"+ location +"&"+Description);
      
   
    writetofile ("Event.txt",Event) ;
    }

    }
    public static ArrayList <String> storage (String name) throws FileNotFoundException{
       Scanner Reader = null;
    ArrayList <String> alldata = new ArrayList<>();
 
     Reader= new Scanner(new File("Event.txt") );
      while(Reader.hasNext()){
           
             String data =Reader.nextLine();
           
                 alldata.add(data);
             
             
        }
      return alldata;
}
        public void writetofile (String name , ArrayList<String> n) throws IOException {
         
             FileWriter f = new FileWriter (new File (name));
             BufferedWriter w = new BufferedWriter (f);
              for (String x : n) {
                  w.write(x+"\r\n");
         
              }
              w.close();
         
     }
   public void deleteEvent(String id) throws FileNotFoundException, IOException
   {
           ArrayList <String> Event = storage("Event.txt");
       String[] subdata;
      for (int i = 0 ; i<Event.size();i++){
          subdata=Event.get(i).split("&");
          if (subdata[1].equals(id)) {
               Event.remove(i);
              writetofile("Event.txt",Event);
            }
      }
   }
  
   private ArrayList<String>  Bill (){
     
  
        
            Scanner Reader=null;
            try
            {
               
                Reader=new Scanner(new File("bill.txt"));
            } 
               catch (FileNotFoundException ex) {
           System.out.println(ex);
        }
              ArrayList<String >price=new ArrayList<String>();
           
              while(Reader.hasNext())
              {
                
                  String line=Reader.nextLine();
                   
                  
   
                  price.add(line);
                }
  
  
   return price;

}
 
  
   

    
  
      
         
    
             

  
              

}
  
    
     

    
       
   
         
   


 
   

  

 

    

   
  

  
    
 
    

  
   

   

    

