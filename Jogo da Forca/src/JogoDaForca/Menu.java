/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDaForca;

import java.io.IOException;

/**
 *
 * @author Notebook
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup2.add(Todos);
        buttonGroup2.add(Paises);
        buttonGroup2.add(Carros);
        buttonGroup2.add(Marcas);
        
    }
    jogar jogo =new jogar();
    int c,d;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup1 = new javax.swing.ButtonGroup();
        Paises = new javax.swing.JRadioButton();
        Marcas = new javax.swing.JRadioButton();
        Todos = new javax.swing.JRadioButton();
        Carros = new javax.swing.JRadioButton();
        Times = new javax.swing.JRadioButton();
        criarpalavra = new javax.swing.JButton();
        Jogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Easy = new javax.swing.JRadioButton();
        Medio = new javax.swing.JRadioButton();
        Hard = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Paises.setText("Paises");
        Paises.setEnabled(false);
        Paises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PaisesActionPerformed(evt);
            }
        });

        Marcas.setText("Marcas Famosas");
        Marcas.setEnabled(false);
        Marcas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarcasActionPerformed(evt);
            }
        });

        Todos.setText("Todos");
        Todos.setEnabled(false);
        Todos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TodosActionPerformed(evt);
            }
        });

        Carros.setText("Carros");
        Carros.setEnabled(false);
        Carros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CarrosActionPerformed(evt);
            }
        });

        buttonGroup2.add(Times);
        Times.setText("Times de Futebol");
        Times.setEnabled(false);
        Times.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimesActionPerformed(evt);
            }
        });

        criarpalavra.setText("Adicionar Palavra");
        criarpalavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criarpalavraActionPerformed(evt);
            }
        });

        Jogar.setText("Jogar");
        Jogar.setEnabled(false);
        Jogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JogarActionPerformed(evt);
            }
        });

        jLabel1.setText("Classes das palavras");

        jLabel2.setText("Dificuldade");

        buttonGroup1.add(Easy);
        Easy.setText("Facil");
        Easy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EasyActionPerformed(evt);
            }
        });

        buttonGroup1.add(Medio);
        Medio.setText("Medio");
        Medio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MedioActionPerformed(evt);
            }
        });

        buttonGroup1.add(Hard);
        Hard.setText("Dificil");
        Hard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HardActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(Jogar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(Easy)
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Medio)
                                        .addGap(30, 30, 30)
                                        .addComponent(Hard))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Todos)
                                        .addGap(18, 18, 18)
                                        .addComponent(Paises)
                                        .addGap(18, 18, 18)
                                        .addComponent(Marcas)
                                        .addGap(18, 18, 18)
                                        .addComponent(Carros)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(Times)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(criarpalavra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(criarpalavra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Easy)
                    .addComponent(Medio)
                    .addComponent(Hard))
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Paises)
                    .addComponent(Marcas)
                    .addComponent(Carros)
                    .addComponent(Times)
                    .addComponent(Todos))
                .addGap(13, 13, 13)
                .addComponent(Jogar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TodosActionPerformed
        // TODO add your handling code here:
        Jogar.setEnabled(true);
        c=5;
    }//GEN-LAST:event_TodosActionPerformed

    private void CarrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CarrosActionPerformed
        // TODO add your handling code here:
        Jogar.setEnabled(true);
        c=2;
    }//GEN-LAST:event_CarrosActionPerformed

    private void criarpalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criarpalavraActionPerformed
        // TODO add your handling code here:
        try{
            jogo.gravarnovodado();
        }
        catch (IOException e){
            System.out.println("Erro");
        }
    }//GEN-LAST:event_criarpalavraActionPerformed

    private void JogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JogarActionPerformed
        // TODO add your handling code here:
        try{
            String [] a=jogo.jogo(c, d);
            String word="";
            char vet[]=jogo.tochar(a);
            jogo.acertos= new boolean [vet.length];
            for (int i = 0; i < vet.length; i++) {
                if (vet[i]=='-'|| vet[i]=='.'|| vet[i]==' '|| vet[i]==',') {
                    jogo.acertos[i]=true;
                }else{
                    jogo.acertos[i]=false;
                }
            }
            for (int i = 0; i < vet.length; i++) {
                if(jogo.acertos[i]){
                    word=word+vet[i]+" ";
                }else{
                    word=word+"_ ";
                }
            }
            Forca f = new Forca(jogo,a[1],a[0],vet,word);
            f.setVisible(true);
        }
        catch (IOException e){
            System.out.println("Erro");
        }
    }//GEN-LAST:event_JogarActionPerformed

    private void MarcasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarcasActionPerformed
        // TODO add your handling code here:
        Jogar.setEnabled(true);
        c=3;
    }//GEN-LAST:event_MarcasActionPerformed

    private void PaisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PaisesActionPerformed
        // TODO add your handling code here:
        Jogar.setEnabled(true);
        c=1;
    }//GEN-LAST:event_PaisesActionPerformed

    private void TimesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimesActionPerformed
        // TODO add your handling code here:
        Jogar.setEnabled(true);
        c=4;
    }//GEN-LAST:event_TimesActionPerformed

    private void HardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HardActionPerformed
        // TODO add your handling code here:
        Carros.setEnabled(true);
        Paises.setEnabled(true);
        Marcas.setEnabled(true);
        Todos.setEnabled(true);
        Times.setEnabled(true);
        d=3;
    }//GEN-LAST:event_HardActionPerformed

    private void MedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MedioActionPerformed
        // TODO add your handling code here:
        Carros.setEnabled(true);
        Paises.setEnabled(true);
        Marcas.setEnabled(true);
        Todos.setEnabled(true);
        Times.setEnabled(true);
        d=2;
    }//GEN-LAST:event_MedioActionPerformed

    private void EasyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EasyActionPerformed
        // TODO add your handling code here:
        Carros.setEnabled(true);
        Paises.setEnabled(true);
        Marcas.setEnabled(true);
        Todos.setEnabled(true);
        Times.setEnabled(true);
        d=1;
    }//GEN-LAST:event_EasyActionPerformed

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
    private javax.swing.JRadioButton Carros;
    private javax.swing.JRadioButton Easy;
    private javax.swing.JRadioButton Hard;
    private javax.swing.JButton Jogar;
    private javax.swing.JRadioButton Marcas;
    private javax.swing.JRadioButton Medio;
    private javax.swing.JRadioButton Paises;
    private javax.swing.JRadioButton Times;
    private javax.swing.JRadioButton Todos;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton criarpalavra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
