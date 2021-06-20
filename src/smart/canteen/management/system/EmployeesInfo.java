/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.canteen.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.html.parser.DTDConstants;

/**
 *
 * @author DELL
 */
public class EmployeesInfo extends javax.swing.JFrame {

    /**
     * Creates new form EmployeesInfo
     */
    public EmployeesInfo() {
        initComponents();

    }

    public ArrayList<Waiter> waitersList() {

        ArrayList<Waiter> waitersList = new ArrayList<>();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);

            String query = "SELECT * FROM Waiter";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            Waiter waiter;
            while (rs.next()) {
                waiter = new Waiter(rs.getString("W_Id"), rs.getString("W_Name"), rs.getString("W_Address"), rs.getInt("W_Phone_Number"), rs.getString("W_Joining_Date"));
                waitersList.add(waiter);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return waitersList;
    }

    public void show_Waiter_Information() {
        ArrayList<Waiter> list = waitersList();
        DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
        Object[] row = new Object[5];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getAddress();
            row[3] = list.get(i).getPhoneNumber();
            row[4] = list.get(i).getDate();
            model.addRow(row);
        }
    }

    public ArrayList<Chef> chefList() {
        ArrayList<Chef> chefsList = new ArrayList<>();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);

            String query = "SELECT * FROM Chef";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            Chef chef;
            while (rs.next()) {
                chef = new Chef(rs.getString("Chef_Id"), rs.getString("Chef_Name"), rs.getString("Chef_Address"), rs.getInt("Chef_Phone_Number"), rs.getString("Chef_Joining_Date"));
                chefsList.add(chef);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return chefsList;
    }

    public void show_Chef_Information() {
        ArrayList<Chef> list = chefList();
        DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
        Object[] row = new Object[5];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getAddress();
            row[3] = list.get(i).getPhoneNumber();
            row[4] = list.get(i).getDate();
            model.addRow(row);
        }
    }

    public ArrayList<Cashier> cashierList() {
        ArrayList<Cashier> cashiersList = new ArrayList<>();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);

            String query = "SELECT Cas_Id,Cas_Name,Cas_Address,Cas_Phone_Number,Cas_Joining_Date FROM Cashier";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            Cashier cashier;
            while (rs.next()) {
                cashier = new Cashier(rs.getString("Cas_Id"), rs.getString("Cas_Name"), rs.getString("Cas_Address"), rs.getInt("Cas_Phone_Number"), rs.getString("Cas_Joining_Date"));
                cashiersList.add(cashier);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return cashiersList;
    }

    public void show_Cashier_Information() {
        ArrayList<Cashier> list = cashierList();
        DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
        Object[] row = new Object[5];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getAddress();
            row[3] = list.get(i).getPhoneNumber();
            row[4] = list.get(i).getDate();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayTable = new javax.swing.JTable();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        waitersListRadioBtn = new javax.swing.JRadioButton();
        chefsListRadioBtn = new javax.swing.JRadioButton();
        cashiersListRadioBtn = new javax.swing.JRadioButton();
        infoTableLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        updateIdTextField = new javax.swing.JTextField();
        updateNameTextField = new javax.swing.JTextField();
        updateAddressTextField = new javax.swing.JTextField();
        updatePhoneNumberTextField = new javax.swing.JTextField();
        updateDateField = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        employeeIdField = new javax.swing.JTextField();
        employeeNameField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        employeeJoinningDate = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        employeeAddressField = new javax.swing.JTextField();
        employeePhoneNumberField = new javax.swing.JTextField();

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(52, 73, 94));

        jPanel1.setBackground(new java.awt.Color(178, 190, 195));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Smart Canteen Management");

        backBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-24.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(222, 222, 222))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Employees Information");

        displayTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "Phone Number", "Joining Date"
            }
        ));
        displayTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(displayTable);

        deleteBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-bin-24.png"))); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.setMaximumSize(new java.awt.Dimension(117, 33));
        deleteBtn.setMinimumSize(new java.awt.Dimension(117, 33));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-update-24.png"))); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(waitersListRadioBtn);
        waitersListRadioBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        waitersListRadioBtn.setText("Show Information of Waiters");
        waitersListRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                waitersListRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(chefsListRadioBtn);
        chefsListRadioBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        chefsListRadioBtn.setText("Show Information of Chefs");
        chefsListRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chefsListRadioBtnActionPerformed(evt);
            }
        });

        buttonGroup1.add(cashiersListRadioBtn);
        cashiersListRadioBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cashiersListRadioBtn.setText("Show Infromation of Cashiers");
        cashiersListRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cashiersListRadioBtnActionPerformed(evt);
            }
        });

        infoTableLabel.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        infoTableLabel.setText("Information Table");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel4.setText("Search");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel5.setText("Update Info");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel3.setText("Id:");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setText("Name:");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setText("Address:");

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Phone Number:");

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel9.setText("Joining Date:");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel10.setText("Search Using Parametres");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setText("ID:");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setText("Name:");

        employeeIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeIdFieldActionPerformed(evt);
            }
        });
        employeeIdField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeeIdFieldKeyReleased(evt);
            }
        });

        employeeNameField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeeNameFieldKeyReleased(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel15.setText("Joining Date:");

        employeeJoinningDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeJoinningDateActionPerformed(evt);
            }
        });
        employeeJoinningDate.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeeJoinningDateKeyReleased(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setText("Address:");

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setText("Phone Number:");

        employeeAddressField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeeAddressFieldKeyReleased(evt);
            }
        });

        employeePhoneNumberField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                employeePhoneNumberFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(updateNameTextField)
                                    .addComponent(updateAddressTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(updateDateField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(updatePhoneNumberTextField)
                                    .addComponent(updateIdTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cashiersListRadioBtn)
                                    .addComponent(jLabel5)
                                    .addComponent(chefsListRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(waitersListRadioBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(updateBtn)
                        .addGap(92, 92, 92)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(employeeIdField)
                                        .addComponent(employeeJoinningDate)
                                        .addComponent(employeeNameField)
                                        .addComponent(employeeAddressField)
                                        .addComponent(employeePhoneNumberField))))
                            .addGap(461, 461, 461))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(infoTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 793, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(379, 379, 379))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(infoTableLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(employeeIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(employeeJoinningDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(employeeNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(employeeAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(employeePhoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(waitersListRadioBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(chefsListRadioBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cashiersListRadioBtn)
                            .addGap(18, 18, 18)
                            .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(updateIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(updateNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel7)
                                .addComponent(updateAddressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(updatePhoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(updateDateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(39, 39, 39)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        Menu m = new Menu();
        m.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void waitersListRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_waitersListRadioBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
        model.setRowCount(0);
        waitersList();
        show_Waiter_Information();
        infoTableLabel.setText("Waiter Information");
    }//GEN-LAST:event_waitersListRadioBtnActionPerformed

    private void chefsListRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chefsListRadioBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
        model.setRowCount(0);
        chefList();
        show_Chef_Information();
        infoTableLabel.setText("Chef Information");
    }//GEN-LAST:event_chefsListRadioBtnActionPerformed

    private void cashiersListRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cashiersListRadioBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
        model.setRowCount(0);
        cashierList();
        show_Cashier_Information();
        infoTableLabel.setText("Cashier Information");
    }//GEN-LAST:event_cashiersListRadioBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed

        int opt = JOptionPane.showConfirmDialog(null, "Are you sure want to delete?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
                Connection con = DriverManager.getConnection(url);

                int row = displayTable.getSelectedRow();
                String value = (displayTable.getModel().getValueAt(row, 0).toString());
                String query = "";
                if (waitersListRadioBtn.isSelected()) {
                    query = " DELETE FROM Waiter where W_Id ='" + value + "' ";
                } else if (chefsListRadioBtn.isSelected()) {
                    query = " DELETE FROM Chef where Chef_Id ='" + value + "' ";
                } else if (cashiersListRadioBtn.isSelected()) {
                    query = " DELETE FROM Cashier where Cas_Id ='" + value + "' ";
                }

                PreparedStatement pst = con.prepareStatement(query);
                pst.executeUpdate();

                if (waitersListRadioBtn.isSelected()) {
                    DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
                    model.setRowCount(0);
                    waitersList();
                    show_Waiter_Information();
                    JOptionPane.showMessageDialog(null, "Records Deleted.");

                }
                if (chefsListRadioBtn.isSelected()) {
                    DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
                    model.setRowCount(0);
                    chefList();
                    show_Chef_Information();
                    JOptionPane.showMessageDialog(null, "Records Deleted.");

                }
                if (cashiersListRadioBtn.isSelected()) {
                    DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
                    model.setRowCount(0);
                    cashierList();
                    show_Cashier_Information();
                    JOptionPane.showMessageDialog(null, "Records Deleted.");
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void displayTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayTableMouseClicked

        int i = displayTable.getSelectedRow();
        TableModel model = displayTable.getModel();
        updateIdTextField.setText(model.getValueAt(i, 0).toString());
        updateNameTextField.setText(model.getValueAt(i, 1).toString());
        updateAddressTextField.setText(model.getValueAt(i, 2).toString());
        updatePhoneNumberTextField.setText(model.getValueAt(i, 3).toString());
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse((String) model.getValueAt(i, 4));
            updateDateField.setDate(date);
        } catch (ParseException ex) {
            Logger.getLogger(EmployeesInfo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_displayTableMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        int opt = JOptionPane.showConfirmDialog(null, "Are you sure want to Update this data?", "Confirm", JOptionPane.YES_NO_OPTION);
        if (opt == 0) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
                Connection con = DriverManager.getConnection(url);

                int row = displayTable.getSelectedRow();
                String value = (displayTable.getValueAt(row, 0).toString());
                String query = "";
                if (waitersListRadioBtn.isSelected()) {
                    query = "UPDATE Waiter SET W_Name = '" + updateNameTextField.getText() + "', W_Address = '" + updateAddressTextField.getText() + "', W_Phone_Number = '" + Integer.parseInt(updatePhoneNumberTextField.getText()) + "', W_Joining_Date = '" + ((JTextField) updateDateField.getDateEditor().getUiComponent()).getText() + "' where W_Id = '" + updateIdTextField.getText() + "'";
                }
                if (chefsListRadioBtn.isSelected()) {
                    query = "UPDATE Chef SET Chef_Name = '" + updateNameTextField.getText() + "', Chef_Address = '" + updateAddressTextField.getText() + "', Chef_Phone_Number = '" + Integer.parseInt(updatePhoneNumberTextField.getText()) + "', Chef_Joining_Date = '" + ((JTextField) updateDateField.getDateEditor().getUiComponent()).getText() + "' where Chef_Id = '" + updateIdTextField.getText() + "'";
                }
                if (cashiersListRadioBtn.isSelected()) {
                    query = "UPDATE Cashier SET Cas_Name = '" + updateNameTextField.getText() + "', Cas_Address = '" + updateAddressTextField.getText() + "', Cas_Phone_Number = '" + Integer.parseInt(updatePhoneNumberTextField.getText()) + "', Cas_Joining_Date = '" + ((JTextField) updateDateField.getDateEditor().getUiComponent()).getText() + "' where Cas_Id = '" + updateIdTextField.getText() + "'";
                }
                PreparedStatement pst = con.prepareStatement(query);

                pst.executeUpdate();

                DefaultTableModel model = (DefaultTableModel) displayTable.getModel();
                model.setRowCount(0);
                if (waitersListRadioBtn.isSelected()) {
                    show_Waiter_Information();
                    JOptionPane.showMessageDialog(null, "Record Updated !");
                }
                if (chefsListRadioBtn.isSelected()) {
                    show_Chef_Information();
                    JOptionPane.showMessageDialog(null, "Record Updated !");
                }
                if (cashiersListRadioBtn.isSelected()) {
                    show_Cashier_Information();
                    JOptionPane.showMessageDialog(null, "Record Updated !");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void employeeIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeIdFieldActionPerformed

    private void employeeIdFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeIdFieldKeyReleased
        // TODO add your handling code here:
        
         DefaultTableModel model = (DefaultTableModel)displayTable.getModel();
        String search = employeeIdField.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        displayTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(employeeIdField.getText().trim()));
    }//GEN-LAST:event_employeeIdFieldKeyReleased

    private void employeeJoinningDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeJoinningDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_employeeJoinningDateActionPerformed

    private void employeeJoinningDateKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeJoinningDateKeyReleased
        // TODO add your handling code here:
         DefaultTableModel table = (DefaultTableModel)displayTable.getModel();
        String search = employeeJoinningDate.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        displayTable.setRowSorter(tr);
       
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_employeeJoinningDateKeyReleased

    private void employeeNameFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeNameFieldKeyReleased
        // TODO add your handling code here:
        
         DefaultTableModel model = (DefaultTableModel)displayTable.getModel();
        String search = employeeNameField.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        displayTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(employeeNameField.getText().trim()));
    }//GEN-LAST:event_employeeNameFieldKeyReleased

    private void employeeAddressFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeeAddressFieldKeyReleased
        // TODO add your handling code here:
         DefaultTableModel model = (DefaultTableModel)displayTable.getModel();
        String search = employeeAddressField.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        displayTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(employeeAddressField.getText().trim()));
    }//GEN-LAST:event_employeeAddressFieldKeyReleased

    private void employeePhoneNumberFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_employeePhoneNumberFieldKeyReleased
        // TODO add your handling code here:
        
         DefaultTableModel table = (DefaultTableModel)displayTable.getModel();
        String search = employeePhoneNumberField.getText().toLowerCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
        displayTable.setRowSorter(tr);
       
        tr.setRowFilter(RowFilter.regexFilter(employeePhoneNumberField.getText().trim()));
        
    }//GEN-LAST:event_employeePhoneNumberFieldKeyReleased

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
            java.util.logging.Logger.getLogger(EmployeesInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeesInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeesInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeesInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeesInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cashiersListRadioBtn;
    private javax.swing.JRadioButton chefsListRadioBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTable displayTable;
    private javax.swing.JTextField employeeAddressField;
    private javax.swing.JTextField employeeIdField;
    private javax.swing.JTextField employeeJoinningDate;
    private javax.swing.JTextField employeeNameField;
    private javax.swing.JTextField employeePhoneNumberField;
    private javax.swing.JLabel infoTableLabel;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField updateAddressTextField;
    private javax.swing.JButton updateBtn;
    private com.toedter.calendar.JDateChooser updateDateField;
    private javax.swing.JTextField updateIdTextField;
    private javax.swing.JTextField updateNameTextField;
    private javax.swing.JTextField updatePhoneNumberTextField;
    private javax.swing.JRadioButton waitersListRadioBtn;
    // End of variables declaration//GEN-END:variables
}
