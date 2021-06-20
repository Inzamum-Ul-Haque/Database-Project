/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.canteen.management.system;

import java.text.SimpleDateFormat;  
import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.Timer;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author DELL
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        showDate();
        showTime();
        /*order_recieved_today();*/
        chef_count();
        cashier_count();
        waiter_count();
        meal_count();
        order_rcv_today();
    }

    void showDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
        dateLabel.setText(s.format(d));
    }

    void showTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                timeLabel.setText(s.format(d));
            }
        }).start();

    }
    
    void chef_count(){
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            
            String query = "SELECT COUNT(Chef_Id) as total_chef from Chef" ;
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){
                
                String t_chef=rs.getString("total_chef");
                total_chef_field.setText(t_chef);
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    void waiter_count(){
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            
            String query = "SELECT COUNT(W_Id) as total_waiter from Waiter" ;
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){
                
                String t_waiter=rs.getString("total_waiter");
                total_waiter_field.setText(t_waiter);
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    void cashier_count(){
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            
            String query = "SELECT COUNT(Cas_Id) as total_cashier from Cashier" ;
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){
                
                String t_cashier=rs.getString("total_cashier");
                total_cashier_field.setText(t_cashier);
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    void meal_count(){
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            
            String query = "SELECT COUNT(Meal_Id) as total_meal from Meal" ;
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){
                
                String t_meal=rs.getString("total_meal");
                total_meal_field.setText(t_meal);
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    
    void order_rcv_today()
    {
        
        try {
            
            java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            
            String query = "SELECT COUNT(Receipt_Id) as Order_rcv from SalesPerDay where Order_Date = '" + sqlDate.toString() + "' " ;
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){
                
                String ordr_rcv=rs.getString("Order_rcv");
                order_rcv_today.setText(ordr_rcv);
            }
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }    
    /*void order_recieved_today(){
        
        try {
            
            
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);
            
            

            String query = "SELECT COUNT(Receipt_Id) as Avg_Order from SalesPerDay where Order_Date = '" + + "' " ;
            Statement st=con.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            if(rs.next()){
                
                String avg_order=rs.getString("Avg_Order");
                order_rcv_today.setText(avg_order);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }*/

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        managerInfoBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        addEmployeeBtn = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        addMealBtn = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        salesInfoBtn = new javax.swing.JButton();
        jSeparator6 = new javax.swing.JSeparator();
        employeesInfoBtn = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JSeparator();
        mealInfoBtn = new javax.swing.JButton();
        jSeparator8 = new javax.swing.JSeparator();
        customerInfoBtn = new javax.swing.JButton();
        jSeparator9 = new javax.swing.JSeparator();
        logoutBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        total_chef_field = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        total_cashier_field = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        total_waiter_field = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        total_meal_field = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        order_rcv_today = new javax.swing.JTextField();
        manager_uname = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 14, 40));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(178, 190, 195));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 14, 40));
        jLabel1.setText("Smart Canteen Management");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Date:");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setText("Time:");

        dateLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        dateLabel.setText("Date");

        timeLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        timeLabel.setText("Time");

        managerInfoBtn.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        managerInfoBtn.setForeground(new java.awt.Color(0, 14, 40));
        managerInfoBtn.setText("Account Information");
        managerInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managerInfoBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(492, 492, 492)
                        .addComponent(managerInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(74, 74, 74)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(timeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(1, 1, 1)
                        .addComponent(managerInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(dateLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(timeLabel))))
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 1159, 108);

        jPanel3.setBackground(new java.awt.Color(241, 196, 15));
        jPanel3.setToolTipText("");

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Menu");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        addEmployeeBtn.setBackground(new java.awt.Color(0, 0, 0));
        addEmployeeBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        addEmployeeBtn.setForeground(new java.awt.Color(255, 255, 255));
        addEmployeeBtn.setText("Add Employee");
        addEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeBtnActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        addMealBtn.setBackground(new java.awt.Color(0, 0, 0));
        addMealBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        addMealBtn.setForeground(new java.awt.Color(255, 255, 255));
        addMealBtn.setText("Add Meal Items");
        addMealBtn.setPreferredSize(new java.awt.Dimension(93, 39));
        addMealBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMealBtnActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        salesInfoBtn.setBackground(new java.awt.Color(0, 0, 0));
        salesInfoBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        salesInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        salesInfoBtn.setText("Sales Info");
        salesInfoBtn.setPreferredSize(new java.awt.Dimension(93, 39));
        salesInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesInfoBtnActionPerformed(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));

        employeesInfoBtn.setBackground(new java.awt.Color(0, 0, 0));
        employeesInfoBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        employeesInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        employeesInfoBtn.setText("Employees Info");
        employeesInfoBtn.setPreferredSize(new java.awt.Dimension(93, 39));
        employeesInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeesInfoBtnActionPerformed(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));

        mealInfoBtn.setBackground(new java.awt.Color(0, 0, 0));
        mealInfoBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        mealInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        mealInfoBtn.setText("Meal Info");
        mealInfoBtn.setPreferredSize(new java.awt.Dimension(93, 39));
        mealInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mealInfoBtnActionPerformed(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));

        customerInfoBtn.setBackground(new java.awt.Color(0, 0, 0));
        customerInfoBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        customerInfoBtn.setForeground(new java.awt.Color(255, 255, 255));
        customerInfoBtn.setText("Customer Info");
        customerInfoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerInfoBtnActionPerformed(evt);
            }
        });

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));

        logoutBtn.setBackground(new java.awt.Color(0, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.setPreferredSize(new java.awt.Dimension(93, 39));
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator9)
                    .addComponent(mealInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addEmployeeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                    .addComponent(addMealBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(salesInfoBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logoutBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(customerInfoBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(employeesInfoBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator6))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addEmployeeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(addMealBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(salesInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(employeesInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mealInfoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(customerInfoBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(145, 145, 145))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(15, 106, 256, 519);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Total Chef");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(320, 450, 144, 37);

        total_chef_field.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        total_chef_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_chef_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_chef_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(total_chef_field);
        total_chef_field.setBounds(329, 496, 123, 41);

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total Cashier");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(530, 450, 162, 37);

        total_cashier_field.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        total_cashier_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_cashier_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_cashier_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(total_cashier_field);
        total_cashier_field.setBounds(549, 496, 124, 41);

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 51));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Total Waiter");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(750, 450, 155, 37);

        total_waiter_field.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        total_waiter_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(total_waiter_field);
        total_waiter_field.setBounds(768, 496, 124, 41);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Meal");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(980, 450, 133, 37);

        total_meal_field.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        total_meal_field.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_meal_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_meal_fieldActionPerformed(evt);
            }
        });
        jPanel1.add(total_meal_field);
        total_meal_field.setBounds(983, 496, 124, 41);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("WELCOME");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(491, 160, 400, 42);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 51));
        jLabel10.setText("Total Orders Received Today:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(624, 565, 341, 60);

        order_rcv_today.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        order_rcv_today.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        order_rcv_today.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                order_rcv_todayActionPerformed(evt);
            }
        });
        jPanel1.add(order_rcv_today);
        order_rcv_today.setBounds(983, 572, 124, 41);

        manager_uname.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        manager_uname.setForeground(new java.awt.Color(255, 255, 255));
        manager_uname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(manager_uname);
        manager_uname.setBounds(461, 203, 400, 71);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/menu.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(280, 110, 870, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1159, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void employeesInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeesInfoBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        EmployeesInfo ei = new EmployeesInfo();
        ei.setVisible(true);
        //new Menu().setVisible(false);
    }//GEN-LAST:event_employeesInfoBtnActionPerformed

    private void customerInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerInfoBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        CustomerInfo ci = new CustomerInfo();
        ci.setVisible(true);
    }//GEN-LAST:event_customerInfoBtnActionPerformed

    private void mealInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mealInfoBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        MealsInfo mi = new MealsInfo();
        mi.setVisible(true);
    }//GEN-LAST:event_mealInfoBtnActionPerformed

    private void salesInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesInfoBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        SalesInfo si = new SalesInfo();
        si.setVisible(true);
    }//GEN-LAST:event_salesInfoBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        setVisible(false);
        First_page Fp = new First_page();
        Fp.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void addMealBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMealBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AddMeals am = new AddMeals();
        am.setVisible(true);
    }//GEN-LAST:event_addMealBtnActionPerformed

    private void addEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        AddEmployee ae = new AddEmployee();
        ae.setVisible(true);
        
    }//GEN-LAST:event_addEmployeeBtnActionPerformed

    private void managerInfoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managerInfoBtnActionPerformed
        
        Manager_AccountInfo mi = new Manager_AccountInfo();
        mi.setVisible(true);
    }//GEN-LAST:event_managerInfoBtnActionPerformed

    private void total_meal_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_meal_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_meal_fieldActionPerformed

    private void order_rcv_todayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_order_rcv_todayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_order_rcv_todayActionPerformed

    private void total_chef_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_chef_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_chef_fieldActionPerformed

    private void total_cashier_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_cashier_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_cashier_fieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeBtn;
    private javax.swing.JButton addMealBtn;
    private javax.swing.JButton customerInfoBtn;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton employeesInfoBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton managerInfoBtn;
    public static javax.swing.JLabel manager_uname;
    private javax.swing.JButton mealInfoBtn;
    private javax.swing.JTextField order_rcv_today;
    private javax.swing.JButton salesInfoBtn;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JTextField total_cashier_field;
    private javax.swing.JTextField total_chef_field;
    private javax.swing.JTextField total_meal_field;
    private javax.swing.JTextField total_waiter_field;
    // End of variables declaration//GEN-END:variables
}
