/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.canteen.management.system;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author DELL
 */
public class CreateReceipt extends javax.swing.JFrame {

    /**
     * Creates new form CreateReceipt
     */
    public CreateReceipt() {
        initComponents();
        show_Meals_Information();
        select_Last_Added_Id();
        select_Last_Added_Customer();
    }

    public ArrayList<Meals> mealsList() {

        ArrayList<Meals> mealsList = new ArrayList<>();

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);

            String query = "SELECT * FROM Meal";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            Meals meals;
            while (rs.next()) {
                meals = new Meals(rs.getString("Meal_Id"), rs.getString("Meal_Name"), rs.getInt("Available_Items"), rs.getInt("Unit_Price"));
                mealsList.add(meals);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return mealsList;
    }

    public void show_Meals_Information() {

        ArrayList<Meals> list = mealsList();
        DefaultTableModel model = (DefaultTableModel) displayMealTable.getModel();
        Object[] row = new Object[4];

        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getAvailable();
            row[3] = list.get(i).getprice();
            model.addRow(row);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayMealTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        orderMealIdField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        orderInfoTable = new javax.swing.JTable();
        orderMealNameField = new javax.swing.JTextField();
        orderUnitPriceField = new javax.swing.JTextField();
        orderQuantityField = new javax.swing.JTextField();
        addOrderBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        customerNameField = new javax.swing.JTextField();
        customerIdField = new javax.swing.JTextField();
        customerAddressField = new javax.swing.JTextField();
        customerPhoneField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        orderDeleteBtn = new javax.swing.JButton();
        createReceiptBtn = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        totalPriceField = new javax.swing.JTextField();
        cashField = new javax.swing.JTextField();
        balanceField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        receiptNoField = new javax.swing.JTextField();
        payBtn = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane3 = new javax.swing.JScrollPane();
        printArea = new javax.swing.JTextArea();
        printBtn = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        lastReceiptField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        lastCustomerField = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        searchMealField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));

        jPanel2.setBackground(new java.awt.Color(178, 190, 195));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setText("Smart Canteen Management");

        backBtn.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-back-24.png"))); // NOI18N
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn)
                .addGap(601, 601, 601)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backBtn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Meal Info");

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Create Bill");

        displayMealTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Meal Id", "Meal Name", "Available Quantity", "Unit Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        displayMealTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                displayMealTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(displayMealTable);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Meal Id:");

        orderMealIdField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderMealIdFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Meal Name:");

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(240, 240, 240));
        jLabel6.setText("Unit Price:");

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(240, 240, 240));
        jLabel7.setText("Quantity:");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 51));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Order Info");

        orderInfoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Index No", "Meal Id", "Meal Name", "Unit Price", "No. of Items", "Subtotal"
            }
        ));
        jScrollPane2.setViewportView(orderInfoTable);

        addOrderBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        addOrderBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-plus-24.png"))); // NOI18N
        addOrderBtn.setText("Add");
        addOrderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 51));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Customer Info");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Customer Id:");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("Customer Name:");

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(240, 240, 240));
        jLabel12.setText("Address:");

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(240, 240, 240));
        jLabel13.setText("Phone Number:");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        orderDeleteBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        orderDeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-delete-bin-24.png"))); // NOI18N
        orderDeleteBtn.setText("Delete");
        orderDeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderDeleteBtnActionPerformed(evt);
            }
        });

        createReceiptBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        createReceiptBtn.setText("Create Receipt");
        createReceiptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createReceiptBtnActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(240, 240, 240));
        jLabel14.setText("Total:");

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(240, 240, 240));
        jLabel15.setText("Cash:");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(240, 240, 240));
        jLabel16.setText("Balance:");

        totalPriceField.setEditable(false);

        balanceField.setEditable(false);

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText("Receipt Id:");

        payBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        payBtn.setText("Pay");
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        printArea.setColumns(20);
        printArea.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        printArea.setRows(5);
        jScrollPane3.setViewportView(printArea);

        printBtn.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        printBtn.setText("Print");
        printBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printBtnActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(240, 240, 240));
        jLabel18.setText("Last Receipt Id:");

        lastReceiptField.setEditable(false);

        jLabel19.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(240, 240, 240));
        jLabel19.setText("Last Customer Id:");

        lastCustomerField.setEditable(false);

        jLabel20.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(240, 240, 240));
        jLabel20.setText("Search Meal By Name:");

        searchMealField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchMealFieldActionPerformed(evt);
            }
        });
        searchMealField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchMealFieldKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel20))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(customerNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(customerIdField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(customerAddressField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(customerPhoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(receiptNoField, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                            .addComponent(lastReceiptField)
                            .addComponent(lastCustomerField)
                            .addComponent(searchMealField))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderMealIdField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orderQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orderUnitPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(orderMealNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(addOrderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(orderDeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalPriceField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cashField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(balanceField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(payBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createReceiptBtn)))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(printBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1230, 1230, 1230))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(862, 862, 862)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel14)
                                    .addComponent(totalPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(cashField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel16)
                                    .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(payBtn)
                                    .addComponent(createReceiptBtn))
                                .addGap(43, 43, 43))
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(printBtn)
                                        .addGap(35, 35, 35))
                                    .addComponent(jSeparator3))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(customerIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel11)
                                    .addComponent(customerNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(customerAddressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(customerPhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(receiptNoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(orderMealIdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(17, 17, 17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(orderMealNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(orderUnitPriceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(orderQuantityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(orderDeleteBtn)
                                    .addComponent(addOrderBtn))
                                .addGap(44, 44, 44))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18)
                                    .addComponent(lastReceiptField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(lastCustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(79, 79, 79)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel20)
                                    .addComponent(searchMealField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1859, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void orderMealIdFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderMealIdFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orderMealIdFieldActionPerformed

    private void displayMealTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_displayMealTableMouseClicked
        int i = displayMealTable.getSelectedRow();
        TableModel model = displayMealTable.getModel();

        orderMealIdField.setText(model.getValueAt(i, 0).toString());
        orderMealNameField.setText(model.getValueAt(i, 1).toString());
        orderUnitPriceField.setText(model.getValueAt(i, 3).toString());
    }//GEN-LAST:event_displayMealTableMouseClicked

    public int index = 0;

    void show_Receipt_Info() {

        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");

        DefaultTableModel model = (DefaultTableModel) orderInfoTable.getModel();

        String receipt, c_name, c_address, c_phone, totalAmount, cash, balance;
        receipt = receiptNoField.getText();
        c_name = customerNameField.getText();
        c_address = customerAddressField.getText();
        c_phone = customerPhoneField.getText();
        totalAmount = totalPriceField.getText();
        cash = cashField.getText();
        balance = balanceField.getText();

        printArea.setText("--------------------------------------------------" + "\n");
        printArea.setText(printArea.getText() + "           Smart Canteen Management System        " + "\n");
        printArea.setText(printArea.getText() + "                     Address here                 " + "\n");
        printArea.setText(printArea.getText() + "                     Developed By                 " + "\n");
        printArea.setText(printArea.getText() + "--------------------------------------------------" + "\n");
        printArea.setText(printArea.getText() + "--------------------------------------------------" + "\n");
        printArea.setText(printArea.getText() + "Date            :   " + s.format(d) + "\n");
        printArea.setText(printArea.getText() + "Receipt No      :   " + receipt + "\n");
        printArea.setText(printArea.getText() + "Customer Name   :   " + c_name + "\n");
        printArea.setText(printArea.getText() + "Address         :   " + c_address + "\n");
        printArea.setText(printArea.getText() + "Phone Number    :   " + c_phone + "\n");
        printArea.setText(printArea.getText() + "--------------------------------------------------" + "\n");
        printArea.setText(printArea.getText() + "--------------------------------------------------" + "\n");
        printArea.setText(printArea.getText() + "Item Name    No of Items    Unit Price   Subtotal" + "\n");
        printArea.setText(printArea.getText() + "--------------------------------------------------" + "\n");

        for (int i = 0; i < model.getRowCount(); i++) {

            String itemName = model.getValueAt(i, 2).toString();
            String unitPrice = model.getValueAt(i, 3).toString();
            String noOfItems = model.getValueAt(i, 4).toString();
            String subtotal = model.getValueAt(i, 5).toString();
            printArea.setText(printArea.getText() + itemName + "\t\t" + noOfItems + "\t\t" + unitPrice + "\t   " + subtotal + "\n");

        }

        printArea.setText(printArea.getText() + "--------------------------------------------------" + "\n");
        printArea.setText(printArea.getText() + "Total Amount:                         " + totalAmount + "Tk\n");
        printArea.setText(printArea.getText() + "--------------------------------------------------" + "\n");
        printArea.setText(printArea.getText() + "Cash:                                 " + cash + "Tk\n");
        printArea.setText(printArea.getText() + "--------------------------------------------------" + "\n");
        printArea.setText(printArea.getText() + "Return:                               " + balance + "Tk\n");
        printArea.setText(printArea.getText() + "**************************************************" + "\n");
        printArea.setText(printArea.getText() + "THANK YOU COME AGAIN !                            " + "\n");
        printArea.setText(printArea.getText() + "**************************************************" + "\n");
        printArea.setText(printArea.getText() + "SOFTWARE BY:INZAMUM,FAHMEED & ISHITA              " + "\n");
        printArea.setText(printArea.getText() + "CONTACT: 01750414709,01711280778,01783369550      " + "\n");

        printArea.setEditable(false);
    }


    private void addOrderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderBtnActionPerformed

        int sum = 0;
        if (orderQuantityField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill out the Quantity Field !");
        }
        int subtotal;
        DefaultTableModel model = (DefaultTableModel) orderInfoTable.getModel();
        index = model.getRowCount() + 1;
        subtotal = Integer.parseInt(orderUnitPriceField.getText()) * Integer.parseInt(orderQuantityField.getText());
        model.addRow(new Object[]{index, orderMealIdField.getText(), orderMealNameField.getText(), orderUnitPriceField.getText(), orderQuantityField.getText(), subtotal});

        for (int i = 0; i < orderInfoTable.getRowCount(); i++) {
            sum = sum + Integer.parseInt(orderInfoTable.getValueAt(i, 5).toString());
        }

        totalPriceField.setText(Integer.toString(sum));
    }//GEN-LAST:event_addOrderBtnActionPerformed

    private void orderDeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderDeleteBtnActionPerformed

        int sum = 0;
        DefaultTableModel model = (DefaultTableModel) orderInfoTable.getModel();
        int row = orderInfoTable.getSelectedRows()[0];
        model.removeRow(row);

        for (int y = row; y < model.getRowCount(); y++) {
            model.setValueAt(y + 1, y, 0);
        }

        for (int i = 0; i < orderInfoTable.getRowCount(); i++) {
            sum = sum + Integer.parseInt(orderInfoTable.getValueAt(i, 5).toString());
        }

        totalPriceField.setText(Integer.toString(sum));
    }//GEN-LAST:event_orderDeleteBtnActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed

        if (cashField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Fill out the Cash Field !");
        } else {
            int balance;
            balance = Integer.parseInt(cashField.getText()) - Integer.parseInt(totalPriceField.getText());
            balanceField.setText(Integer.toString(balance));
        }
    }//GEN-LAST:event_payBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        setVisible(false);
        CashierMenu cm = new CashierMenu();
        cm.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

    private void createReceiptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createReceiptBtnActionPerformed

        if (customerIdField.getText().equals("") || receiptNoField.getText().equals("") || customerNameField.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill the Customer Id field or Bill No field or name field");
        } else {
            int opt = JOptionPane.showConfirmDialog(null, "Confirm Order?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (opt == 0) {
                show_Receipt_Info();
            }
        }
    }//GEN-LAST:event_createReceiptBtnActionPerformed

    void select_Last_Added_Id() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);

            String query = "select Receipt_Id from SalesPerDay where Receipt_Id = (select max(Receipt_Id) from SalesPerDay)";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                lastReceiptField.setText(rs.getString("Receipt_Id"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void select_Last_Added_Customer() {

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);

            String query = "select Cs_Id from Customer where Cs_Id = (select max(Cs_Id) from Customer)";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                lastCustomerField.setText(rs.getString("Cs_Id"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void insert_Sales_Table() {

        java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);

            String query = "insert into SalesPerDay(Receipt_Id, Order_Date, Total_Cash)values(?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);

            pst.setInt(1, Integer.parseInt(receiptNoField.getText()));
            pst.setDate(2, sqlDate);
            pst.setInt(3, Integer.parseInt(totalPriceField.getText()));

            pst.executeUpdate();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void insert_Customer_Table() {

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);

            if (!customerIdField.getText().equals("") && !customerNameField.getText().equals("") && !customerAddressField.getText().equals("") && !customerPhoneField.getText().equals("")) {
                String query = "insert into Customer(Cs_Id, Cs_Name, Cs_Address, Cs_Phone_Number, Receipt_Id)values(?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, Integer.parseInt(customerIdField.getText()));
                pst.setString(2, customerNameField.getText());
                pst.setString(3, customerAddressField.getText());
                pst.setInt(4, Integer.parseInt(customerPhoneField.getText()));
                pst.setInt(5, Integer.parseInt(receiptNoField.getText()));
                pst.executeUpdate();
            } else if (!customerAddressField.getText().equals("") && customerPhoneField.getText().equals("")) {
                String query = "insert into Customer(Cs_Id, Cs_Name, Cs_Address, Receipt_Id)values(?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, Integer.parseInt(customerIdField.getText()));
                pst.setString(2, customerNameField.getText());
                pst.setString(3, customerAddressField.getText());
                pst.setInt(4, Integer.parseInt(receiptNoField.getText()));
                pst.executeUpdate();
            } else if (customerAddressField.getText().equals("") && !customerPhoneField.getText().equals("")) {
                String query = "insert into Customer(Cs_Id, Cs_Name, Cs_Phone_Number, Receipt_Id)values(?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, Integer.parseInt(customerIdField.getText()));
                pst.setString(2, customerNameField.getText());
                pst.setString(3, customerPhoneField.getText());
                pst.setInt(4, Integer.parseInt(receiptNoField.getText()));
                pst.executeUpdate();
            } else if (customerAddressField.getText().equals("") && customerPhoneField.getText().equals("")) {
                String query = "insert into Customer(Cs_Id, Cs_Name,Receipt_Id)values(?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);
                pst.setInt(1, Integer.parseInt(customerIdField.getText()));
                pst.setString(2, customerNameField.getText());
                pst.setInt(3, Integer.parseInt(receiptNoField.getText()));
                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    void insert_Receipt_Table() {

        DefaultTableModel model = (DefaultTableModel) orderInfoTable.getModel();

        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);

            for (int i = 0; i < model.getRowCount(); i++) {

                String query = "insert into Receipt(Receipt_Id, Ordered_Meal_Name, Unit_Cost, No_of_items, Subtotal) values(?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(query);

                pst.setInt(1, Integer.parseInt(receiptNoField.getText()));
                pst.setString(2, model.getValueAt(i, 2).toString());
                pst.setInt(3, Integer.parseInt(model.getValueAt(i, 3).toString()));
                pst.setInt(4, Integer.parseInt(model.getValueAt(i, 4).toString()));
                pst.setInt(5, Integer.parseInt(model.getValueAt(i, 5).toString()));

                pst.executeUpdate();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    void update_Customer_Table() {

        DefaultTableModel model = (DefaultTableModel) orderInfoTable.getModel();
        int available_item = 0;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=Smart_Canteen_Management;user=sa;password=123456";
            Connection con = DriverManager.getConnection(url);

            for (int i = 0; i < orderInfoTable.getRowCount(); i++) {
                String query1 = "select Available_Items from Meal where Meal_Id = '" + model.getValueAt(i, 1).toString() + "'";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query1);

                while (rs.next()) {
                    available_item = rs.getInt("Available_Items");
                    available_item = available_item - Integer.parseInt(model.getValueAt(i, 4).toString());
                }

                String query2 = "Update Meal set Available_Items = '" + Integer.toString(available_item) + "' where Meal_Id = '" + model.getValueAt(i, 1).toString() + "'";
                PreparedStatement pst = con.prepareStatement(query2);

                pst.executeUpdate();
            }
            model = (DefaultTableModel) displayMealTable.getModel();
            model.setRowCount(0);
            show_Meals_Information();
            JOptionPane.showMessageDialog(null, "Meals Updated !");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void printBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printBtnActionPerformed

        try {
            boolean complete = printArea.print();
            if (complete) {
                JOptionPane.showMessageDialog(null, "Done printing", "Information", JOptionPane.INFORMATION_MESSAGE);

                insert_Sales_Table();
                insert_Customer_Table();
                insert_Receipt_Table();
                update_Customer_Table();

                select_Last_Added_Id();
                select_Last_Added_Customer();

                customerIdField.setText("");
                customerNameField.setText("");
                customerAddressField.setText("");
                customerPhoneField.setText("");
                receiptNoField.setText("");

                DefaultTableModel model2 = (DefaultTableModel) orderInfoTable.getModel();
                model2.setRowCount(0);

                orderMealIdField.setText("");
                orderMealNameField.setText("");
                orderQuantityField.setText("");
                orderUnitPriceField.setText("");

                totalPriceField.setText("");
                cashField.setText("");
                balanceField.setText("");

                printArea.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Printing!", "Printer", JOptionPane.ERROR_MESSAGE);
            }
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, e);
        }

        JOptionPane.showMessageDialog(null, "All records have been inserted");

    }//GEN-LAST:event_printBtnActionPerformed

    private void searchMealFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchMealFieldKeyReleased
        
        DefaultTableModel model = (DefaultTableModel) displayMealTable.getModel();
        String search = searchMealField.getText();
        TableRowSorter<DefaultTableModel> tr= new TableRowSorter<DefaultTableModel>(model);
        displayMealTable.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(searchMealField.getText().trim()));
    }//GEN-LAST:event_searchMealFieldKeyReleased

    private void searchMealFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchMealFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchMealFieldActionPerformed

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
            java.util.logging.Logger.getLogger(CreateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrderBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField balanceField;
    private javax.swing.JTextField cashField;
    private javax.swing.JButton createReceiptBtn;
    public javax.swing.JTextField customerAddressField;
    public javax.swing.JTextField customerIdField;
    public javax.swing.JTextField customerNameField;
    public javax.swing.JTextField customerPhoneField;
    private javax.swing.JTable displayMealTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField lastCustomerField;
    private javax.swing.JTextField lastReceiptField;
    private javax.swing.JButton orderDeleteBtn;
    public javax.swing.JTable orderInfoTable;
    private javax.swing.JTextField orderMealIdField;
    private javax.swing.JTextField orderMealNameField;
    private javax.swing.JTextField orderQuantityField;
    private javax.swing.JTextField orderUnitPriceField;
    private javax.swing.JButton payBtn;
    private javax.swing.JTextArea printArea;
    private javax.swing.JButton printBtn;
    public static javax.swing.JTextField receiptNoField;
    private javax.swing.JTextField searchMealField;
    private javax.swing.JTextField totalPriceField;
    // End of variables declaration//GEN-END:variables
}
