
package smart.canteen.management.system;


public class Welcome_page extends javax.swing.JFrame {


    public Welcome_page() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setMaximumSize(new java.awt.Dimension(1207, 608));
        setMinimumSize(new java.awt.Dimension(1207, 608));
        setPreferredSize(new java.awt.Dimension(1207, 608));
        setSize(new java.awt.Dimension(1207, 608));
        getContentPane().setLayout(null);

        jPanel1.setMaximumSize(new java.awt.Dimension(1207, 608));
        jPanel1.setMinimumSize(new java.awt.Dimension(1207, 608));
        jPanel1.setPreferredSize(new java.awt.Dimension(1207, 608));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(204, 255, 51));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 72)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 51));
        jLabel2.setText("SMART CANTEEN MANAGEMENT");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 100, 1010, 60);
        jLabel2.getAccessibleContext().setAccessibleName("");

        jProgressBar1.setBackground(new java.awt.Color(0, 14, 40));
        jProgressBar1.setForeground(new java.awt.Color(204, 255, 51));
        jPanel1.add(jProgressBar1);
        jProgressBar1.setBounds(320, 450, 590, 30);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 3, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 255, 51));
        jLabel3.setText("LOADING...");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(560, 410, 120, 28);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/photos/welcome_trial.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1210, 607);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1207, 608);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {
        
        final Welcome_page wp=new Welcome_page();

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                wp.setVisible(true);
            }
        });
        
        First_page Fp= new First_page();
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(25);
                wp.jProgressBar1.setValue(i);
                
            }
        wp.setVisible(false);
        }
        catch(Exception e){
            
        }
        
        new SignIn().setVisible(false);
        Fp.setVisible(true);
        wp.dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
