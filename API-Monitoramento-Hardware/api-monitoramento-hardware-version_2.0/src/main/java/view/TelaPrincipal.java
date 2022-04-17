/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.util.Timer;
import java.util.TimerTask;
import model.InfoMaquina;

/**
 *
 * @author mathe
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        InfoMaquina infoMaquina = new InfoMaquina();
        Timer timer = new Timer();
        Integer delay = 1000;
        Integer interval = 1000;

        respostaUsuario.setText(infoMaquina.getUsuario());
        respostaSisOperacional.setText(infoMaquina.getSisOperacional());
        respostaArquitetura.setText(infoMaquina.getArquitetura());

        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                respostaTempoAtividade.setText(infoMaquina.getTempoAtividade());
            }
        }, delay, interval);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        titleMonitoramento = new javax.swing.JLabel();
        buttonRam = new javax.swing.JButton();
        buttonCpu = new javax.swing.JButton();
        buttonDisco = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        titleInfoMaquina = new javax.swing.JLabel();
        titleUsuario = new javax.swing.JLabel();
        titleSisOperacional = new javax.swing.JLabel();
        titleArquitetura = new javax.swing.JLabel();
        titleTempoAtividade = new javax.swing.JLabel();
        labelImagem = new javax.swing.JLabel();
        respostaUsuario = new javax.swing.JLabel();
        respostaSisOperacional = new javax.swing.JLabel();
        respostaArquitetura = new javax.swing.JLabel();
        respostaTempoAtividade = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(8, 4, 37));

        titleMonitoramento.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleMonitoramento.setForeground(new java.awt.Color(255, 255, 255));
        titleMonitoramento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleMonitoramento.setText("Monitoramento");

        buttonRam.setBackground(new java.awt.Color(255, 255, 255));
        buttonRam.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonRam.setText("RAM");
        buttonRam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRamActionPerformed(evt);
            }
        });

        buttonCpu.setBackground(new java.awt.Color(255, 255, 255));
        buttonCpu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonCpu.setText("CPU");
        buttonCpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCpuActionPerformed(evt);
            }
        });

        buttonDisco.setBackground(new java.awt.Color(255, 255, 255));
        buttonDisco.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonDisco.setText("Disco");
        buttonDisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDiscoActionPerformed(evt);
            }
        });

        buttonSair.setBackground(new java.awt.Color(255, 255, 255));
        buttonSair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        buttonSair.setText("Sair");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(titleMonitoramento, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRam, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleMonitoramento, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(buttonCpu, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonRam, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonDisco, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titleInfoMaquina.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titleInfoMaquina.setForeground(new java.awt.Color(8, 4, 37));
        titleInfoMaquina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleInfoMaquina.setText("Informações Máquina");

        titleUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleUsuario.setText("Usuário:");

        titleSisOperacional.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleSisOperacional.setText("Sistema Operacional:");

        titleArquitetura.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleArquitetura.setText("Arquitetura:");

        titleTempoAtividade.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleTempoAtividade.setText("Tempo de atividade:");

        labelImagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo-onhome.png"))); // NOI18N

        respostaUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        respostaUsuario.setText("...");

        respostaSisOperacional.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        respostaSisOperacional.setText("...");

        respostaArquitetura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        respostaArquitetura.setText("...");

        respostaTempoAtividade.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        respostaTempoAtividade.setText("...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleInfoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titleUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(respostaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titleSisOperacional)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(respostaSisOperacional, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titleArquitetura)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(respostaArquitetura, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titleTempoAtividade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(respostaTempoAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(labelImagem)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleInfoMaquina, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleUsuario)
                    .addComponent(respostaUsuario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleSisOperacional)
                    .addComponent(respostaSisOperacional))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleArquitetura)
                    .addComponent(respostaArquitetura))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleTempoAtividade)
                    .addComponent(respostaTempoAtividade))
                .addGap(18, 18, 18)
                .addComponent(labelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(814, 417));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCpuActionPerformed
        // TODO add your handling code here:
        TelaCpu telaCpu = new TelaCpu();
        telaCpu.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonCpuActionPerformed

    private void buttonRamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRamActionPerformed
        // TODO add your handling code here:
        TelaRam telaRam = new TelaRam();
        telaRam.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonRamActionPerformed

    private void buttonDiscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDiscoActionPerformed
        // TODO add your handling code here:
        TelaDisco telaDisco = new TelaDisco();
        telaDisco.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonDiscoActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCpu;
    private javax.swing.JButton buttonDisco;
    private javax.swing.JButton buttonRam;
    private javax.swing.JButton buttonSair;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel respostaArquitetura;
    private javax.swing.JLabel respostaSisOperacional;
    private javax.swing.JLabel respostaTempoAtividade;
    private javax.swing.JLabel respostaUsuario;
    private javax.swing.JLabel titleArquitetura;
    private javax.swing.JLabel titleInfoMaquina;
    private javax.swing.JLabel titleMonitoramento;
    private javax.swing.JLabel titleSisOperacional;
    private javax.swing.JLabel titleTempoAtividade;
    private javax.swing.JLabel titleUsuario;
    // End of variables declaration//GEN-END:variables

    private TelaDisco TelaDisco() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
