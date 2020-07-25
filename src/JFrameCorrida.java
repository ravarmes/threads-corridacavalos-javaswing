public class JFrameCorrida extends javax.swing.JFrame {

    public JFrameCorrida() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonCavalo1 = new javax.swing.JButton();
        jButtonCavalo2 = new javax.swing.JButton();
        jLabelLinhaChegada = new javax.swing.JLabel();
        jButtonIniciar = new javax.swing.JButton();
        jButtonCavalo3 = new javax.swing.JButton();
        jButtonCavalo4 = new javax.swing.JButton();
        jButtonCavalo5 = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonCavalo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cavalo1.png"))); // NOI18N

        jButtonCavalo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cavalo2.png"))); // NOI18N

        jLabelLinhaChegada.setBackground(new java.awt.Color(255, 255, 255));
        jLabelLinhaChegada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/linha_chegada.png"))); // NOI18N

        jButtonIniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bandeira.png"))); // NOI18N
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jButtonCavalo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cavalo3.png"))); // NOI18N

        jButtonCavalo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cavalo4.png"))); // NOI18N

        jButtonCavalo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cavalo5.png"))); // NOI18N

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelTitulo.setText("Corrida de Cavalos Utilizando Threads");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitulo)
                    .addComponent(jButtonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCavalo1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButtonCavalo5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCavalo4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCavalo3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonCavalo2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jLabelLinhaChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabelLinhaChegada, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTitulo)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonIniciar)
                        .addGap(33, 33, 33)
                        .addComponent(jButtonCavalo1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCavalo2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(jButtonCavalo3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCavalo4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonCavalo5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        
        //Instanciando as Runnables
        RunnableCavalo runnableCavalo1 =  new RunnableCavalo(jButtonCavalo1, "Cavalo 1");
        RunnableCavalo runnableCavalo2 =  new RunnableCavalo(jButtonCavalo2, "Cavalo 2");
        RunnableCavalo runnableCavalo3 =  new RunnableCavalo(jButtonCavalo3, "Cavalo 3");
        RunnableCavalo runnableCavalo4 =  new RunnableCavalo(jButtonCavalo4, "Cavalo 4");
        RunnableCavalo runnableCavalo5 =  new RunnableCavalo(jButtonCavalo5, "Cavalo 5");

        //Alterando as prioridades de algumas Threads (apenas para observar o resultado)
        runnableCavalo1.prioridade = 10; //Cavalo 1
        runnableCavalo2.prioridade = 7;  //Cavalo 2

        //Instanciando as Threads
        Thread threadCavalo1 = new Thread(runnableCavalo1, "Cavalo 1");
        Thread threadCavalo2 = new Thread(runnableCavalo2, "Cavalo 2");
        Thread threadCavalo3 = new Thread(runnableCavalo3, "Cavalo 3");
        Thread threadCavalo4 = new Thread(runnableCavalo4, "Cavalo 4");
        Thread threadCavalo5 = new Thread(runnableCavalo5, "Cavalo 5");
        
        threadCavalo1.start();
        threadCavalo2.start();
        threadCavalo3.start();
        threadCavalo4.start();
        threadCavalo5.start();

    }//GEN-LAST:event_jButtonIniciarActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameCorrida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameCorrida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameCorrida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameCorrida.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameCorrida().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCavalo1;
    private javax.swing.JButton jButtonCavalo2;
    private javax.swing.JButton jButtonCavalo3;
    private javax.swing.JButton jButtonCavalo4;
    private javax.swing.JButton jButtonCavalo5;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JLabel jLabelLinhaChegada;
    private javax.swing.JLabel jLabelTitulo;
    // End of variables declaration//GEN-END:variables
}
