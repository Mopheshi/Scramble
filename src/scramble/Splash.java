package scramble;

import java.awt.Color;
import java.io.FileNotFoundException;

/**
 *
 * @author Ndachimya Edward
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
        pBar();
    }

    @SuppressWarnings("SleepWhileInLoop")
    private void pBar() {
        Thread thread = new Thread(() -> {
            int i = 0;
            while (i <= 100) {
                i++;
                pBar.setValue(i);
                switch (i) {
                    case 15 -> {
                        title.setForeground(new Color(255, 102, 0));
                        pBar.setForeground(new Color(255, 102, 0));
                    }
                    case 25 -> {
                        title.setForeground(new Color(255, 153, 0));
                        pBar.setForeground(new Color(255, 153, 0));
                    }
                    case 35 -> {
                        title.setForeground(new Color(153, 153, 0));
                        pBar.setForeground(new Color(153, 153, 0));
                    }
                    case 45 -> {
                        title.setForeground(Color.orange);
                        pBar.setForeground(Color.orange);
                    }
                    case 55 -> {
                        title.setForeground(Color.yellow);
                        pBar.setForeground(Color.yellow);
                    }
                    case 65 -> {
                        title.setForeground(new Color(204, 255, 0));
                        pBar.setForeground(new Color(204, 255, 0));
                    }
                    case 75 -> {
                        title.setForeground(new Color(102, 255, 102));
                        pBar.setForeground(new Color(102, 255, 102));
                    }
                    case 85 -> {
                        title.setForeground(new Color(0, 204, 51));
                        pBar.setForeground(new Color(0, 204, 51));
                    }
                    case 95 -> {
                        title.setForeground(Color.green);
                        pBar.setForeground(Color.green);
                    }
                    case 100 -> {
                        this.dispose();
                        try {
                            new Scramble().setVisible(true);
                        } catch (FileNotFoundException ex) {
                        }
                    }
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                }
            }
        });
        thread.start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        pBar = new javax.swing.JProgressBar();
        title = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(0, 0, 0));
        bg.setLayout(null);

        pBar.setBackground(new java.awt.Color(0, 0, 0));
        pBar.setForeground(new java.awt.Color(255, 0, 0));
        pBar.setBorder(null);
        pBar.setBorderPainted(false);
        pBar.setOpaque(false);
        bg.add(pBar);
        pBar.setBounds(0, 230, 480, 3);

        title.setBackground(new java.awt.Color(0, 0, 0));
        title.setFont(new java.awt.Font("Century Gothic", 2, 18)); // NOI18N
        title.setForeground(new java.awt.Color(255, 0, 0));
        title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        title.setText("MORPHEUS SCRAMBLE");
        bg.add(title);
        title.setBounds(240, 130, 220, 30);

        icon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/scramble/mophe.png"))); // NOI18N
        bg.add(icon);
        icon.setBounds(0, 0, 480, 210);

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 246));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Splash().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel icon;
    private javax.swing.JProgressBar pBar;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
