/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  MainJava;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;


/**
 *
 * @author donia
 */
public class Users extends JFrame   {


      JPanel p=new JPanel();
    JButton b1,b2,b3,b4;
    public  Users()
    {
         JPanel p=new JPanel();
 
     
         this.setTitle("Event Mangement System");
         this.setVisible(true);
         this.setResizable(false);
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setBounds(300,300,1000,768);
          //ImageIcon i1 = new ImageIcon("C:\\Users\\donia\\OneDrive\\Documents\\NetBeansProjects\\Main.java\\Event_System.jpeg");
        ImageIcon i1 = new ImageIcon("C:\\Users\\donia\\OneDrive\\Documents\\NetBeansProjects\\Main.java\\Event_System.jpeg");
           JLabel l1 = new JLabel(i1);
          l1.setBounds(0,0,1000,768);
          add(l1);
          b1=new JButton("Customer");
          b2=new JButton("Project Manager");
          b3=new JButton("Service Provider");
          b4=new JButton("Admin");
             b1.setBackground(Color.BLACK);
             b1.setForeground(Color.WHITE);
             b1.setBounds(800,50,150,50);
             l1.add(b1);
              b2.setBackground(Color.BLACK);
             b2.setForeground(Color.WHITE);
             b2.setBounds(800,150,150,50);
             l1.add(b2);
              b3.setBackground(Color.BLACK);
             b3.setForeground(Color.WHITE);
             b3.setBounds(800,250,150,50);
             l1.add(b3);
              b4.setBackground(Color.BLACK);
             b4.setForeground(Color.WHITE);
             b4.setBounds(800,350,150,50);
             l1.add(b4);
             b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    setVisible(false);
                    new Customer().setVisible(true);
                
                
                }catch(Exception e ){}
                
    }
        }
        );
	 b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    setVisible(false);
                    new ProjectManger().setVisible(true);
                
                
                }catch(Exception e ){}
                
    }
        }
        );
      	 b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    setVisible(false);
                    new ServiceProvider().setVisible(true);
                
                
                }catch(Exception e ){}
                
    }
        }
        );
          b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    setVisible(false);
                    new Admin().setVisible(true);
                
                
                }catch(Exception e ){}
                
    }
        }
        );
            
     }
    

    public boolean write(String Query,String FilePath,boolean appendType)
    {
        PrintWriter writter=null;
        try{
             System.out.println("\nwritting"+ FilePath);
             writter=new PrintWriter(new FileWriter(new File(FilePath)),appendType);
             writter.println(Query);
             System.out.println("Done");
             return true;
        } catch (IOException ex) {
           System.out.println(ex);
        }
        finally
        {
            writter.close();
        }
        return false;
       
    }
        public ArrayList<Object> read (String FilePath)
        {
            Scanner Reader=null;
            try
            {
                System.out.println("Reading! "+FilePath);
                Reader=new Scanner(new File(FilePath));
            } 
            
          catch (FileNotFoundException ex) {
           System.out.println(ex);
        }
          if(FilePath.equals("Customer.txt"))
          {
              ArrayList<Customer>Customer=new ArrayList<Customer>();
              Customer x;
              while(Reader.hasNext())
              {
                  x=new Customer();
                  String line=Reader.nextLine();
                  String seprated[]=line.split("0");
               
                  x.setUserName(seprated[0]);
                  x.setMobile(seprated[1]);
                  x.setEmail(seprated[2]);
                  x.setPassword(seprated[3]);
                   x.setCustomerID(seprated[4]);
                 
                  Customer.add(x);
                  
              }
                return  (ArrayList<Object>)(Object) Customer; 
                     
          }
          else if(FilePath.equals("PM.txt"))
          {
               ArrayList<ProjectManger>ProjectManger=new ArrayList<ProjectManger>();
               ProjectManger x ;
                while(Reader.hasNext())
                {
                     x=new ProjectManger();
                     String line=Reader.nextLine();
                     String seprated[]=line.split("0");
                     x.setidp(seprated[0]);
                    
                    ProjectManger.add(x);
                   
                }
                return  (ArrayList<Object>)(Object) ProjectManger;
               
          }
           else if(FilePath.equals("SP.txt"))
          {
               ArrayList<ServiceProvider>ServiceProvider=new ArrayList<ServiceProvider>();
               ServiceProvider x ;
                while(Reader.hasNext())
                {
                     x=new ServiceProvider();
                     String line=Reader.nextLine();
                    String seprated[]=line.split("0");
                    x.setidS(seprated[0]);
                    x.setPrice(seprated[1]);
                     x.setDate(seprated[2]);        
                    ServiceProvider.add(x);
                   
                }
                return  (ArrayList<Object>)(Object) ServiceProvider;
               
          }
           else if(FilePath.equals("Admin.txt"))
          {
               ArrayList<Admin>Admin=new ArrayList<Admin>();
               Admin x ;
                while(Reader.hasNext())
                {
                     x=new Admin();
                     String line=Reader.nextLine();
                    String seprated[]=line.split("0");
                    x.setidA(seprated[0]);
                    Admin.add(x);
                   
                }
                return  (ArrayList<Object>)(Object) Admin;
               
          }
         
           
            
          
          else
          {
              return null;
          }
       
  
           
        }    
        public boolean login (String user , String filename) {
        Scanner Reader = null;
      try {
    Reader= new Scanner(new File(filename));
 
 }catch (Exception e){
      System.out.println(e);
     
 }
     
     
      if (filename.equals("Customer.txt")) {
       
        while (Reader.hasNext()){
           
             String line =Reader.nextLine();
             String []s = line.split("&");
            String [] U =user.split("&");
            if (s[1].equals(U[0]) && s[2].equals(U[1])) {
                return true ;
            }

        }
        return false;
      }
    else  if (filename.equals("PM.txt")) {
       
        while (Reader.hasNext()){
           
             String line =Reader.nextLine();
             String []s = line.split("&");
            String [] U =user.split("&");
            if (s[1].equals(U[0]) && s[2].equals(U[1]) )
                return true ;
 

        }
        return false;
      }
      else  if (filename.equals("SP.txt")) {
       
        while (Reader.hasNext()){
           
             String line =Reader.nextLine();
             String []s = line.split("&");
            String [] U =user.split("&");
            if (s[1].equals(U[0]) && s[2].equals(U[1])) {
                return true;
        }
        }
        return false;
      }
         else  if (filename.equals("Admin.txt")) {
       
        while (Reader.hasNext()){
           
             String line =Reader.nextLine();
             String []s = line.split("&");
            String [] U =user.split("&");
            if (s[1].equals(U[0]) && s[2].equals(U[1])) {
                return true;
        }
        }
        return false;
      }
      return  false;
     
  }

}

       
 

