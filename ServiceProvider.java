/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  MainJava;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.JLabel;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
/**
 *
 * @author donia
 */
public class  ServiceProvider extends JFrame{
    JLabel  l2,l3,l4;
    JButton b1,b2,b3;
    JTextField tt1,tt2;
    String price;
    String date;
    String idS;
      Users   u=new Users();
      private final String serviceProviderFileName="SP.txt";
      public static ArrayList<ServiceProvider>ServiceProvider=new ArrayList<ServiceProvider>();
      private final String projectMangerFileName="PM.txt";
      public static ArrayList<ProjectManger>ProjectManger=new ArrayList<ProjectManger>();
public  ServiceProvider()
{
     setLayout(null);
     setVisible(true);
     setBounds(400,200,700,500);
     setTitle("Service Provider");
       setResizable(false);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         JLabel Request =new JLabel("Request: ");
        Request.setBounds(60,30,120,30);
         Request.setFont(new Font("Tahoma",Font.PLAIN,20));
          add(Request);
           JLabel l2=new JLabel();
            l2.setBounds(180, 30, 120, 30);
             add(l2);
              JLabel l3=new JLabel("Price");
            l3.setBounds(60, 80, 120, 30);
             l3.setFont(new Font("Tahoma",Font.PLAIN,20));
             add(l3);
             tt1=new JTextField();
             tt1.setBounds(150,80,120,30);
             add(tt1);
             
             b1=new JButton("Receive");
               b1.setBounds(100,150,120,30);
                  
                      add(b1);  
                    b2=new JButton("Price");
                  
                    b2.setBounds(250,150,120,30);
                    add(b2);
                     b3=new JButton("Date");
                  
                    b3.setBounds(390,150,120,30);
                    add(b3);
                      b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                         
                       
         
                      l2.setText(receiveFromPM().toString());
                          
                
                   
                }catch(Exception e ){}
            }
        });
         b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                   
                        String price=tt1.getText();
                        setPrice(price);
                        u.write(getPrice(),  "price.txt", true);
                        
                
                }catch(Exception e ){}
                
    }
        }
        );     
     b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                   
                    
                    
                      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
                     LocalDateTime now = LocalDateTime.now(); 
                    
                
                        JOptionPane.showMessageDialog(null, dtf.format(now));

                    
                
                    
                
                }catch(Exception e ){}
                
    }
        }
        );
      b2=new JButton("BACK") ;

             b2.setBounds(550,150,120,30);
        
             add(b2);
            
 
     b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                      
                     setVisible(false);
                       new Users().setVisible(true);
                
                }catch(Exception e ){}
            }
        });

	
	
                      
                      
                      
                      
                      
                      
                      
                      
                      
                      
                    
}
  
    private ArrayList<String>  receiveFromPM (){
     
  
        
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
 

    void setidS(String ids) {
        this.idS=ids;
    }
   String getSPData()
   {
       return idS;
   }
    void setPrice(String price) {
       this.price=price;
    }

    void setDate(String date) {
        this.date=date;
    }
    String getPrice()
    {
        return this.price;
    }
   
}
