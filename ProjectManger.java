/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainJava;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

/**
 *
 * @author donia
 */
public class ProjectManger extends JFrame{
    JLabel  l2,l3,l8,l9,l10,l6,l7;
     JTextField t2,t55,t66;
     JTextArea t77;
     JButton b1,b2,boo1,boo2,b3,b4;
    String req;
     String idP;
     
       Users   u=new Users();
    private final String projectMangerFileName="PM.txt";
     public static ArrayList<ProjectManger>ProjectManger=new ArrayList<ProjectManger>();
        private final String serviceProviderFileName="SP.txt";
      public static ArrayList<ServiceProvider>ServiceProvider=new ArrayList<ServiceProvider>();
      
  
  
   void setidp(String idP)
   {
       this.idP=idP;
   }
   public String getIdp()
   {
       return this.idP;
   }
 
   public  ProjectManger( )
   {
     
                setResizable(false);
               setBounds(300,300,1366,768);
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
                       
                                  b1=new JButton("ReceiveFromCustomer");
                       b2=new JButton("Back");
                       boo2=new JButton("Send to SP");
                        b3 =new JButton("show bill");
                        b4=new JButton("ReceiveFromAdmin");
                      setLayout(null);
                       setBounds(400,200,700,500);
                        setTitle("Project Manger");
                        setResizable(false);
                      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                     JLabel Request =new JLabel("Request: ");
                       Request.setBounds(60,30,120,30);
                     Request.setFont(new Font("Tahoma",Font.PLAIN,17));
                    add(Request);
                     JLabel l2=new JLabel();
                   l2.setBounds(150, 30, 120, 30);
                     add(l2);
                     JLabel l7 =new JLabel("RequestFromAdmin: ");
                       l7.setBounds(60,80,200,30);
                     l7.setFont(new Font("Tahoma",Font.PLAIN,17));
                    add(l7);
                     JLabel l6=new JLabel();
                   l6.setBounds(230, 80, 120, 30);
                     add(l6);
                    b1.setBackground(Color.BLACK);
                      b1.setForeground(Color.WHITE);
                    b1.setBounds(70,370,100,30);
                    add(b1);
                     b2.setBackground(Color.BLACK);
                      b2.setForeground(Color.WHITE);
                    b2.setBounds(190,370,100,30);
                    add(b2);
                     boo2.setBackground(Color.BLACK);
                      boo2.setForeground(Color.WHITE);
                    boo2.setBounds(310,370,100,30);
                    add(boo2);
                     b3.setBackground(Color.BLACK);
                      b3.setForeground(Color.WHITE);
                    b3.setBounds(430,370,100,30);
                    add(b3);
                    b4.setBackground(Color.BLACK);
                      b4.setForeground(Color.WHITE);
                    b4.setBounds(200,300,150,30);
                    add(b4);
                   b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                       
                          l2.setText(requrst().toString());
                   
                }catch(Exception e ){}
            }
        });
           b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                       
                          setVisible(false);
                       new ProjectManger().setVisible(true);
                
                   
                }catch(Exception e ){}
            }
        });
            
           boo2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                         
                       
         
                        u.write( requrst ().toString(),"Requests.txt",true);
                          
                
                   
                }catch(Exception e ){}
            }
        });
              b3.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent ae){
                try{
                       
                          u.write(showBill().toString(), "bill.txt", true);
                   
                }catch(Exception e ){}
            }
        });
           b4.addActionListener(new ActionListener(){
              public void actionPerformed(ActionEvent ae){
                try{
                       
                          l6.setText(receiveFromAdmin().toString());
                   
                }catch(Exception e ){}
            }
        });
                   
                }catch(Exception e ){}
            }
        });
           
              JMenuItem a2 = new JMenuItem("Contact Customer");
	jm1.add(a2);
         a2.addActionListener(new ActionListener(){
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

             b2.setBounds(300,250,100,20);
               b2.addActionListener(this);
             c.add(b2);
               }catch(Exception e ){}
            }
        });
                 
  
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
                
             
                   
                     
           
                
 }
            
         
          
           
                     
      
                
  String getPmData()
  {
      return this.idP;
  }
  public boolean AddPM()
  {
       if(u.write(getPmData(), projectMangerFileName, true))
       {
           return true;
       }
       else
       {
           return   false;
       }
  }
  


 private ArrayList<String>  requrst (){
     
  
        
            Scanner Reader=null;
            try
            {
               
                Reader=new Scanner(new File("Requests.txt"));
            } 
               catch (FileNotFoundException ex) {
           System.out.println(ex);
        }
              ArrayList<String >requests=new ArrayList<String>();
           
              while(Reader.hasNext())
              {
                
                  String line=Reader.nextLine();
                   
                  
   
                  requests.add(line);
                }
  
  
   return requests;
    

 }
 private ArrayList<String>  receiveFromAdmin (){
     
  
        
            Scanner Reader=null;
            try
            {
               
                Reader=new Scanner(new File("reqAdmin.txt"));
            } 
               catch (FileNotFoundException ex) {
           System.out.println(ex);
        }
              ArrayList<String >request=new ArrayList<String>();
           
              while(Reader.hasNext())
              {
                
                  String line=Reader.nextLine();
                   
                  
   
                  request.add(line);
                }
  
  
   return request;
    

 }
private ArrayList<String>  showBill (){
     
  
        
            Scanner Reader=null;
            try
            {
               
                Reader=new Scanner(new File("price.txt"));
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
         
                 
               




                 
                
   
                        
   
  
   
 
    

