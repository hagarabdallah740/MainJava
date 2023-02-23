

 package MainJava;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Admin extends JFrame{
    String idA;
    JLabel l5,l1,l2,l3,l4,l7,l8,l9,l10,l11,l14,l15,l16,l17,l18,la,lo,lm,lp,lg;
    JTextField t2,t1,t3,t4,t5,t6,t8,t9,t10,t11,t12,t14,t15,t16,t17,ta,tp,to,tm,tg,t18;
        String reque;
    JButton b,b2,bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb0,b00;
      Users   u=new Users();
  private final String adminFileName="Admin.txt";
   public static ArrayList<Admin>Admin=new ArrayList<Admin>();
      private final String customerFileName="Customer.txt";
      public static ArrayList<Customer>Customer=new ArrayList<Customer>();
        private final String projectMangerFileName="PM.txt";
     public static ArrayList<ProjectManger>ProjectManger=new ArrayList<ProjectManger>();
      private final String serviceProviderFileName="SP.txt";
      public static ArrayList<ServiceProvider>ServiceProvider=new ArrayList<ServiceProvider>();
     
    public Admin()
    {
      
         setLayout(null);
               setVisible(true);
        setBounds(400,200,700,500);
       setTitle("Admin");
         setResizable(false);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);
        JMenu jm1 = new JMenu("Reception");
        jm1.setForeground(Color.RED);
	menuBar.add(jm1);
     
      
     
       JMenuItem a1 = new JMenuItem("Receive Requests");
	jm1.add(a1);
        
        a1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                         setLayout(null);
               setVisible(true);
        setBounds(400,200,700,500);
       setTitle("Receive   Requests");
         setResizable(false);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          JLabel Request =new JLabel("Request: ");
        Request.setBounds(60,30,120,30);
         Request.setFont(new Font("Tahoma",Font.PLAIN,20));
          add(Request);
           JLabel l5=new JLabel();
            l5.setBounds(180, 30, 120, 30);
             add(l5);
               b=new JButton("Receive");
               b.setBounds(100,150,100,20);
               
               add(b);
                   b2=new JButton("send to Pm");
               b2.setBounds(250,150,100,20);
               
               add(b2);
     
                b.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent ae){
                try{
                       
                      l5.setText(receiveFromCustomer().toString());  
                   
                }catch(Exception e ){}
            }
        });
            b2.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent ae){
                try{
                       
                   u.write(receiveFromCustomer().toString(),"reqAdmin.txt", true);
                   
                }catch(Exception e ){}
            }
        });
         
          
   JButton b01=new JButton("BACK") ;

             b01.setBounds(400,150,100,20);
               b01.addActionListener(this);
             add(b01);
            
 
     b01.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      
                     setVisible(false);
                       new Admin().setVisible(true);
                
                }catch(Exception e ){}
            }
        }); 

         
    }   catch(Exception e ){}
            }
        });
      JMenuItem a2 = new JMenuItem("Add Customer");
	jm1.add(a2);
         a2.addActionListener(new ActionListener(){
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
                         l1=new JLabel("Name");
                          l1.setBounds(300,50,100,20);
                             Container c=getContentPane();
                             c.setLayout(null);
                            c.add(l1);
                            t1=new JTextField();
                           t1.setBounds(400,50,100,20);
                           c.add(t1);
                          l2=new JLabel("Mobile");
                         l2.setBounds(300,100,100,20);
                           c.add(l2);
                           t2=new JTextField();
                          t2.setBounds(400,100,100,20);
                          c.add(t2);
                            l3=new JLabel("Password");
                         l3.setBounds(300,150,100,20);
                           c.add(l3);
                           t3=new JTextField();
                          t3.setBounds(400,150,100,20);
                          c.add(t3);
                              l4=new JLabel("ID");
                         l4.setBounds(300,200,100,20);
                           c.add(l4);
                           t4=new JTextField();
                          t4.setBounds(400,200,100,20);
                          c.add(t4);
                              l7=new JLabel("Email");
                         l7.setBounds(300,250,100,20);
                           c.add(l7);
                           t5=new JTextField();
                          t5.setBounds(400,250,100,20);
                          c.add(t5);
                            bb1=new JButton("ADD");
                            bb1.setBounds(100,300,100,20);
                         
                            c.add(bb1);
                            bb1.addActionListener(new ActionListener(){
                      public void actionPerformed(ActionEvent ae){
                      try{
                          
                             
                        
                        String userName=t1.getText();
                        String Mobile=t2.getText();
                     String password=t3.getText();
                         String id=t4.getText();
                           String Email=t5.getText();
                            String c=userName+"&"+Mobile+"&"+Email+"&"+password+"&"+id;
                         JOptionPane.showMessageDialog(null, " Added Succesfully ");
                         AddCustomer(c);
                         
                        
                     }catch(Exception e ){}
                   }
                 });
                            
                      JButton b01=new JButton("BACK") ;

             b01.setBounds(250,300,100,20);
               b01.addActionListener(this);
             add(b01);
            
 
     b01.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      
                     setVisible(false);
                       new Admin().setVisible(true);
                
                }catch(Exception e ){}
            }
        });    
                
                }catch(Exception e ){}
            }
        });
                 JMenuItem a5 = new JMenuItem("Add  SP");
	jm1.add(a5);
          a5.addActionListener(new ActionListener(){
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
                         l9=new JLabel("Name");
                          l9.setBounds(300,50,100,20);
                             Container c=getContentPane();
                             c.setLayout(null);
                            c.add(l9);
                            t9=new JTextField();
                           t9.setBounds(400,50,100,20);
                           c.add(t9);
                          l10=new JLabel("Mobile");
                         l10.setBounds(300,100,100,20);
                           c.add(l10);
                           t10=new JTextField();
                          t10.setBounds(400,100,100,20);
                          c.add(t10);
                            l3=new JLabel("Password");
                         l3.setBounds(300,150,100,20);
                           c.add(l3);
                           t12=new JTextField();
                          t12.setBounds(400,150,100,20);
                          c.add(t12);
                              l11=new JLabel("ID");
                         l11.setBounds(300,200,100,20);
                           c.add(l11);
                           t11=new JTextField();
                          t11.setBounds(400,200,100,20);
                          c.add(t11);
                              l8=new JLabel("Email");
                         l8.setBounds(300,250,100,20);
                           c.add(l8);
                           t8=new JTextField();
                          t8.setBounds(400,250,100,20);
                          c.add(t8);
                            bb8=new JButton("ADD");
                            bb8.setBounds(100,300,100,20);
                            
                            c.add(bb8);
                             bb8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                     
                      String userName=t9.getText();
                        String Mobile=t10.getText();
                     String password=t12.getText();
                         String id=t11.getText();
                           String Email=t8.getText();
                         String c=userName+"&"+Mobile+"&"+Email+"&"+password+"&"+id;
                         JOptionPane.showMessageDialog(null, " Added Succesfully ");
                         AddSP(c);
                
                }catch(Exception e ){}
            }
        });
                        JButton b01=new JButton("BACK") ;

             b01.setBounds(250,300,100,20);
               b01.addActionListener(this);
             add(b01);
            
 
     b01.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      
                     setVisible(false);
                       new Admin().setVisible(true);
                
                }catch(Exception e ){}
            }
        }); 
                
                }catch(Exception e ){}
            }
        });            
           JMenuItem a6 = new JMenuItem("AddPM");
	jm1.add(a6);
          a6.addActionListener(new ActionListener(){
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
                         l14=new JLabel("Name");
                          l14.setBounds(300,50,100,20);
                             Container c=getContentPane();
                             c.setLayout(null);
                            c.add(l14);
                            t14=new JTextField();
                           t14.setBounds(400,50,100,20);
                           c.add(t14);
                          l15=new JLabel("Mobile");
                         l15.setBounds(300,100,100,20);
                           c.add(l15);
                           t15=new JTextField();
                          t15.setBounds(400,100,100,20);
                          c.add(t15);
                            l16=new JLabel("Password");
                         l16.setBounds(300,150,100,20);
                           c.add(l16);
                           t16=new JTextField();
                          t16.setBounds(400,150,100,20);
                          c.add(t16);
                              l17=new JLabel("ID");
                         l17.setBounds(300,200,100,20);
                           c.add(l17);
                           t17=new JTextField();
                          t17.setBounds(400,200,100,20);
                          c.add(t17);
                              l18=new JLabel("Email");
                         l18.setBounds(300,250,100,20);
                           c.add(l18);
                           t18=new JTextField();
                          t18.setBounds(400,250,100,20);
                          c.add(t18);
                            bb9=new JButton("ADD");
                            bb9.setBounds(100,300,100,20);
                            bb9.setBackground(Color.BLACK);
                            bb9.setForeground(Color.WHITE);
                            c.add(bb9);
                             bb9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                     
                        String userName=t14.getText();
                        String Mobile=t15.getText();
                         String password=t16.getText();
                         String id=t17.getText();
                           String Email=t18.getText();
                         String c=userName+"&"+Mobile+"&"+Email+"&"+password+"&"+id;
                         JOptionPane.showMessageDialog(null, " Added Succesfully ");
                         AddPM(c);
                
                }catch(Exception e ){}
            }
        });
                              JButton b01=new JButton("BACK") ;

             b01.setBounds(400,150,100,20);
               b01.addActionListener(this);
             add(b01);
            
 
     b01.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      
                     setVisible(false);
                       new Admin().setVisible(true);
                
                }catch(Exception e ){}
            }
        }); 
                
                }catch(Exception e ){}
            }
        });
             
           JMenuItem a4 = new JMenuItem("Back");
	jm1.add(a4);
          a4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                     
                         setVisible(false);
                         new Users().setVisible(true);
                
                }catch(Exception e ){}
            }
        });
             JMenuItem a15 = new JMenuItem("DeleteSP");
	jm1.add(a15);
          a15.addActionListener(new ActionListener(){
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
                        JLabel lz=new JLabel("ID");
                          lz.setBounds(300,50,100,20);
                             Container c=getContentPane();
                             c.setLayout(null);
                            c.add(lz);
                            JTextField tz=new JTextField();
                           tz.setBounds(400,50,100,20);
                           c.add(tz);
                            bb7=new JButton("Delete");
                            bb7.setBounds(100,300,100,20);
                           
                            c.add(bb7);
                            bb7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                     
                        String id=tz.getText();
                        DeleteSP(id);
                 JOptionPane.showMessageDialog(null, "DeletedSuccesfully ");
                }catch(Exception e ){}
            }
        });
                
                }catch(Exception e ){}
            }
        });
            JMenuItem a11 = new JMenuItem("DeletePM");
	jm1.add(a11);
          a11.addActionListener(new ActionListener(){
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
                        JLabel lu=new JLabel("ID");
                          lu.setBounds(300,50,100,20);
                             Container c=getContentPane();
                             c.setLayout(null);
                            c.add(lu);
                            JTextField tu=new JTextField();
                           tu.setBounds(400,50,100,20);
                           c.add(tu);
                            bb6=new JButton("Delete");
                            bb6.setBounds(100,300,100,20);
                           
                            c.add(bb6);
                              bb6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      String id=tu.getText();
                       JOptionPane.showMessageDialog(null, "DeletedSuccesfully ");
                      DeletePM(id);
                             
                              
                             
                             
                        
                
                }catch(Exception e ){}
            }
        });      
                              
       
                
                }catch(Exception e ){}
            }
        });
      
                JMenuItem a10 = new JMenuItem("UpdateCustomer");
	jm1.add(a10);
         a10.addActionListener(new ActionListener(){
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
                         la=new JLabel("Name");
                          la.setBounds(300,50,100,20);
                             Container c=getContentPane();
                             c.setLayout(null);
                            c.add(la);
                            ta=new JTextField();
                           ta.setBounds(400,50,100,20);
                           c.add(ta);
                          lm=new JLabel("Mobile");
                         lm.setBounds(300,100,100,20);
                           c.add(lm);
                           tm=new JTextField();
                          tm.setBounds(400,100,100,20);
                          c.add(tm);
                            lg=new JLabel("Password");
                         lg.setBounds(300,150,100,20);
                           c.add(lg);
                           tg=new JTextField();
                          tg.setBounds(400,150,100,20);
                          c.add(tg);
                              lp=new JLabel("ID");
                         lp.setBounds(300,200,100,20);
                           c.add(lp);
                           tp=new JTextField();
                          tp.setBounds(400,200,100,20);
                          c.add(tp);
                              lo=new JLabel("Email");
                         lo.setBounds(300,250,100,20);
                           c.add(lo);
                           to=new JTextField();
                          to.setBounds(400,250,100,20);
                          c.add(to);
                            bb4=new JButton("Update");
                            bb4.setBounds(100,300,100,20);
                            bb4.setBackground(Color.BLACK);
                            bb4.setForeground(Color.WHITE);
                            c.add(bb4);
                               bb4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                           
                             
                                   
                        String name=ta.getText();
                        String Mobile=tm.getText();
                        String Password=tg.getText();
                        String id=tp.getText();
                        String Email=to.getText();
                        String p=name+"&"+Mobile+"&"+Email+"&"+Password+"&"+id;
                       JOptionPane.showMessageDialog(null, " Updated Succesfully ");
                        updateCustomer(id,p);
                             
                             
                        
                             
                
                }catch(Exception e ){}
            }
        });      
 
                
                }catch(Exception e ){}
            }
        });
                  JMenuItem a21 = new JMenuItem("UpdateSP");
	jm1.add(a21);
         a21.addActionListener(new ActionListener(){
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
                         la=new JLabel("Name");
                          la.setBounds(300,50,100,20);
                             Container c=getContentPane();
                             c.setLayout(null);
                            c.add(la);
                            ta=new JTextField();
                           ta.setBounds(400,50,100,20);
                           c.add(ta);
                          lm=new JLabel("Mobile");
                         lm.setBounds(300,100,100,20);
                           c.add(lm);
                           tm=new JTextField();
                          tm.setBounds(400,100,100,20);
                          c.add(tm);
                            lg=new JLabel("Password");
                         lg.setBounds(300,150,100,20);
                           c.add(lg);
                           tg=new JTextField();
                          tg.setBounds(400,150,100,20);
                          c.add(tg);
                              lp=new JLabel("ID");
                         lp.setBounds(300,200,100,20);
                           c.add(lp);
                           tp=new JTextField();
                          tp.setBounds(400,200,100,20);
                          c.add(tp);
                              lo=new JLabel("Email");
                         lo.setBounds(300,250,100,20);
                           c.add(lo);
                           to=new JTextField();
                          to.setBounds(400,250,100,20);
                          c.add(to);
                            b00=new JButton("Update");
                            b00.setBounds(100,300,100,20);
                            b00.setBackground(Color.BLACK);
                            b00.setForeground(Color.WHITE);
                            c.add(b00);
                               b00.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                           
                             
                                   
                        String name=ta.getText();
                        String Mobile=tm.getText();
                        String Password=tg.getText();
                        String id=tp.getText();
                        String Email=to.getText();
                        String p=name+"&"+Mobile+"&"+Email+"&"+Password+"&"+id;
                       JOptionPane.showMessageDialog(null, " Updated Succesfully ");
                        updateSp(id,p);
                             
                             
                        
                             
                
                }catch(Exception e ){}
            }
        });      
 
                
                }catch(Exception e ){}
            }
        });
                JMenuItem a20 = new JMenuItem("UpdatePM");
	jm1.add(a20);
         a20.addActionListener(new ActionListener(){
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
                         la=new JLabel("Name");
                          la.setBounds(300,50,100,20);
                             Container c=getContentPane();
                             c.setLayout(null);
                            c.add(la);
                            ta=new JTextField();
                           ta.setBounds(400,50,100,20);
                           c.add(ta);
                          lm=new JLabel("Mobile");
                         lm.setBounds(300,100,100,20);
                           c.add(lm);
                           tm=new JTextField();
                          tm.setBounds(400,100,100,20);
                          c.add(tm);
                            lg=new JLabel("Password");
                         lg.setBounds(300,150,100,20);
                           c.add(lg);
                           tg=new JTextField();
                          tg.setBounds(400,150,100,20);
                          c.add(tg);
                              lp=new JLabel("ID");
                         lp.setBounds(300,200,100,20);
                           c.add(lp);
                           tp=new JTextField();
                          tp.setBounds(400,200,100,20);
                          c.add(tp);
                              lo=new JLabel("Email");
                         lo.setBounds(300,250,100,20);
                           c.add(lo);
                           to=new JTextField();
                          to.setBounds(400,250,100,20);
                          c.add(to);
                            bb0=new JButton("Update");
                            bb0.setBounds(100,300,100,20);
                            bb0.setBackground(Color.BLACK);
                            bb0.setForeground(Color.WHITE);
                            c.add(bb0);
                               bb0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                           
                             
                                   
                        String name=ta.getText();
                        String Mobile=tm.getText();
                        String Password=tg.getText();
                        String id=tp.getText();
                        String Email=to.getText();
                        String p=name+"&"+Mobile+"&"+Email+"&"+Password+"&"+id;
                       JOptionPane.showMessageDialog(null, " Updated Succesfully ");
                        updatePM(id,p);
                             
                             
                        
                             
                
                }catch(Exception e ){}
            }
        });      
          }catch(Exception e ){}
            }
        });  
           JMenuItem a3 = new JMenuItem("DeleteCustomer");
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
                            bb2=new JButton("Delete");
                            bb2.setBounds(100,300,100,20);
                            bb2.setBackground(Color.black);
                            bb2.setForeground(Color.white);
                            c.add(bb2);
                              bb2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      String id=tp.getText();
                       JOptionPane.showMessageDialog(null, "Deleted Succesfully ");
                      DeleteCustomer(id);
                             
                              
                             
                             
                        
                
                }catch(Exception e ){}
            }
        });      
                              
 
        }catch(Exception e ){}
            }
        });
    }

     private ArrayList<String>  receiveFromCustomer()
    {
        
        
            
              Scanner Reader=null;
            try
            {
               
                Reader=new Scanner(new File("reqAdmin.txt"));
            } 
               catch (FileNotFoundException ex) {
           System.out.println(ex);
        }
              ArrayList<String >req=new ArrayList<String>();
           
              while(Reader.hasNext())
              {
                
                  String line=Reader.nextLine();
                   
                  
   
                  req.add(line);
                }
  
  
  
        
         return req;
    }

 
    public boolean AddCustomer(String s)
   {
        if(u.write( s,"customer.txt", true))
        {
            return true;
        }
        else
            return false;
   }
      public boolean AddSP(String s)
   {
        if(u.write( s,"SP.txt", true))
        {
            return true;
        }
        else
            return false;
   }
   public boolean AddPM(String s)
   {
        if(u.write( s,"PM.txt", true))
        {
            return true;
        }
        else
            return false;
   }
    void setidA(String idA) {
        this.idA=idA;
    }
    void  setReque(String req)
    {
        this.reque=req;
    }
    String getReque()
    {
        return this.reque;
    }
    String getidA()
    {
        return this.idA;
    }
   
    
       public static ArrayList <String> storage1 (String name) throws FileNotFoundException{
       Scanner Reader = null;
    ArrayList <String> alldata = new ArrayList<>();
 
     Reader= new Scanner(new File("Customer.txt") );
      while(Reader.hasNext()){
           
             String data =Reader.nextLine();
           
                 alldata.add(data);
             
             
        }
      return alldata;
}
           public static ArrayList <String> storage2 (String name) throws FileNotFoundException{
       Scanner Reader = null;
    ArrayList <String> alldata = new ArrayList<>();
 
     Reader= new Scanner(new File("PM.txt") );
      while(Reader.hasNext()){
           
             String data =Reader.nextLine();
           
                 alldata.add(data);
             
             
        }
      return alldata;
}
    public static ArrayList <String> storage3 (String name) throws FileNotFoundException{
       Scanner Reader = null;
    ArrayList <String> alldata = new ArrayList<>();
 
     Reader= new Scanner(new File("SP.txt") );
      while(Reader.hasNext()){
           
             String data =Reader.nextLine();
           
                 alldata.add(data);
             
             
        }
      return alldata;
}
   
       public void DeleteCustomer(String id)  throws FileNotFoundException, IOException
       {
            
       ArrayList <String> customers = storage1("Customer.txt");
       String[] subdata;
      for (int i = 0 ; i<customers.size();i++){
          subdata=customers.get(i).split("&");
          if (subdata[4].equals(id)) {
                customers.remove(i);
              writetofile1("Customer.txt",customers);
             
      }
     
      }
 

       }
        public void DeletePM(String id)throws FileNotFoundException, IOException
       {
          ArrayList <String> projectManger = storage2("PM.txt");
       String[] subdata;
      for (int i = 0 ; i<projectManger .size();i++){
          subdata=projectManger .get(i).split("&");
          if (subdata[4].equals(id)) {
               projectManger .remove(i);
              writetofile2("PM.txt",projectManger );
             
      }
       }
       }
         public void DeleteSP(String id)throws FileNotFoundException, IOException
       {
             ArrayList <String> sp = storage3("SP.txt");
          String[] subdata;
          for (int i = 0 ; i<sp.size();i++){
             subdata=sp.get(i).split("&");
            if (subdata[4].equals(id)) {
                sp.remove(i);
                writetofile3("SP.txt",sp);
       }
            } 
       }
          public void writetofile3 (String name , ArrayList<String> n) throws IOException {
         
             FileWriter f = new FileWriter (new File (name));
             BufferedWriter w = new BufferedWriter (f);
              for (String x : n) {
                  w.write(x+"\r\n");
         
              }
              w.close();
         
     }
          public void writetofile2 (String name , ArrayList<String> n) throws IOException {
         
             FileWriter f = new FileWriter (new File (name));
             BufferedWriter w = new BufferedWriter (f);
              for (String x : n) {
                  w.write(x+"\r\n");
         
              }
              w.close();
         
     }
         
       public void writetofile1 (String name , ArrayList<String> n) throws IOException {
         
             FileWriter f = new FileWriter (new File (name));
             BufferedWriter w = new BufferedWriter (f);
              for (String x : n) {
                  w.write(x+"\r\n");
         
              }
              w.close();
         
     }
            public void updateCustomer (String id,String p) throws FileNotFoundException, IOException{
   ArrayList<String> customer =storage1("Customer.txt");
   
       Scanner Reader = null;
      try {
    Reader= new Scanner(new File("Customer.txt"));
  
 }catch (Exception e){
      System.out.println(e);
     
 }
         String[] subdata;
      String []y = p.split("&");
      String UserName = y[0];
      String Mobile = y[1];
      String Email = y[2] ;
     String password = y[3] ;
      String id1 = y[4] ; // run
    for (int i = 0 ; i<customer.size();i++) {
      subdata = customer.get(i).split("&");
      if (subdata[4].equals(id)){
          customer.set(i, UserName+"&"+Mobile+"&"+ Email +"&"+password+"&"+id1);
      
   
       writetofile1 ("Customer.txt",customer) ;
    }
    }    
}
       public void updatePM (String id,String p) throws FileNotFoundException, IOException{
   ArrayList<String> customer =storage2("PM.txt");
   
       Scanner Reader = null;
      try {
    Reader= new Scanner(new File("PM.txt"));
  
 }catch (Exception e){
      System.out.println(e);
     
 }
         String[] subdata;
      String []y = p.split("&");
      String UserName = y[0];
      String Mobile = y[1];
      String Email = y[2] ;
     String password = y[3] ;
      String id1 = y[4] ; // run
    for (int i = 0 ; i<customer.size();i++) {
      subdata = customer.get(i).split("&");
      if (subdata[4].equals(id))
          customer.set(i, UserName+"&"+Mobile+"&"+ Email +"&"+password+"&"+id1);
      
   
    writetofile3 ("PM.txt",customer) ;
    }
    
}
    public void updateSp (String id,String p) throws FileNotFoundException, IOException{
   ArrayList<String> sp =storage3("SP.txt");
   
       Scanner Reader = null;
      try {
    Reader= new Scanner(new File("SP.txt"));
  
 }catch (Exception e){
      System.out.println(e);
     
 }
         String[] subdata;
      String []y = p.split("&");
      String UserName = y[0];
      String Mobile = y[1];
      String Email = y[2] ;
     String password = y[3] ;
      String id1 = y[4] ; // run
    for (int i = 0 ; i<sp.size();i++) {
      subdata = sp.get(i).split("&");
      if (subdata[4].equals(id))
          sp.set(i, UserName+"&"+Mobile+"&"+ Email +"&"+password+"&"+id1);
      
   
    writetofile2 ("SP.txt",sp) ;
    }
    
}

}
                
   
    

       