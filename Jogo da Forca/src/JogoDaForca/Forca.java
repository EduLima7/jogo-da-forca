/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JogoDaForca;

/**
 *
 * @author Notebook
 */
public class Forca extends javax.swing.JFrame {

    /**
     * Creates new form Forca
     */
    public Forca(jogar j,String dica,String palavra,char[] vet,String p) {
        initComponents();
        this.jogo=j;
        hint.setText(String.valueOf(dica));
        word.setText(p);
        this.vet=vet;
    }
    jogar jogo;
    char[] vet;
    String dica,palavra;
    char letra;
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Palavra = new javax.swing.JTextField();
        A = new javax.swing.JRadioButton();
        B = new javax.swing.JRadioButton();
        C = new javax.swing.JRadioButton();
        D = new javax.swing.JRadioButton();
        E = new javax.swing.JRadioButton();
        F = new javax.swing.JRadioButton();
        G = new javax.swing.JRadioButton();
        H = new javax.swing.JRadioButton();
        I = new javax.swing.JRadioButton();
        J = new javax.swing.JRadioButton();
        K = new javax.swing.JRadioButton();
        L = new javax.swing.JRadioButton();
        W = new javax.swing.JRadioButton();
        M = new javax.swing.JRadioButton();
        N = new javax.swing.JRadioButton();
        O = new javax.swing.JRadioButton();
        P = new javax.swing.JRadioButton();
        Q = new javax.swing.JRadioButton();
        R = new javax.swing.JRadioButton();
        S = new javax.swing.JRadioButton();
        T = new javax.swing.JRadioButton();
        U = new javax.swing.JRadioButton();
        V = new javax.swing.JRadioButton();
        X = new javax.swing.JRadioButton();
        nove = new javax.swing.JRadioButton();
        Y = new javax.swing.JRadioButton();
        Z = new javax.swing.JRadioButton();
        zero = new javax.swing.JRadioButton();
        um = new javax.swing.JRadioButton();
        dois = new javax.swing.JRadioButton();
        tres = new javax.swing.JRadioButton();
        quatro = new javax.swing.JRadioButton();
        cinco = new javax.swing.JRadioButton();
        seis = new javax.swing.JRadioButton();
        sete = new javax.swing.JRadioButton();
        oito = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        hint = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        yes = new javax.swing.JButton();
        word = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Palavra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PalavraActionPerformed(evt);
            }
        });

        buttonGroup1.add(A);
        A.setText("A");
        A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AActionPerformed(evt);
            }
        });

        buttonGroup1.add(B);
        B.setText("B");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        buttonGroup1.add(C);
        C.setText("C");
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });

        buttonGroup1.add(D);
        D.setText("D");
        D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DActionPerformed(evt);
            }
        });

        buttonGroup1.add(E);
        E.setText("E");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        buttonGroup1.add(F);
        F.setText("F");
        F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FActionPerformed(evt);
            }
        });

        buttonGroup1.add(G);
        G.setText("G");
        G.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GActionPerformed(evt);
            }
        });

        buttonGroup1.add(H);
        H.setText("H");
        H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HActionPerformed(evt);
            }
        });

        buttonGroup1.add(I);
        I.setText("I");
        I.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IActionPerformed(evt);
            }
        });

        buttonGroup1.add(J);
        J.setText("J");
        J.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JActionPerformed(evt);
            }
        });

        buttonGroup1.add(K);
        K.setText("K");
        K.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KActionPerformed(evt);
            }
        });

        buttonGroup1.add(L);
        L.setText("L");
        L.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LActionPerformed(evt);
            }
        });

        buttonGroup1.add(W);
        W.setText("W");
        W.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WActionPerformed(evt);
            }
        });

        buttonGroup1.add(M);
        M.setText("M");
        M.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MActionPerformed(evt);
            }
        });

        buttonGroup1.add(N);
        N.setText("N");
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });

        buttonGroup1.add(O);
        O.setText("O");
        O.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OActionPerformed(evt);
            }
        });

        buttonGroup1.add(P);
        P.setText("P");
        P.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PActionPerformed(evt);
            }
        });

        buttonGroup1.add(Q);
        Q.setText("Q");
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });

        buttonGroup1.add(R);
        R.setText("R");
        R.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RActionPerformed(evt);
            }
        });

        buttonGroup1.add(S);
        S.setText("S");
        S.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SActionPerformed(evt);
            }
        });

        buttonGroup1.add(T);
        T.setText("T");
        T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TActionPerformed(evt);
            }
        });

        buttonGroup1.add(U);
        U.setText("U");
        U.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UActionPerformed(evt);
            }
        });

        buttonGroup1.add(V);
        V.setText("V");
        V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VActionPerformed(evt);
            }
        });

        buttonGroup1.add(X);
        X.setText("X");
        X.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                XActionPerformed(evt);
            }
        });

        buttonGroup1.add(nove);
        nove.setText("9");
        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveActionPerformed(evt);
            }
        });

        buttonGroup1.add(Y);
        Y.setText("Y");
        Y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YActionPerformed(evt);
            }
        });

        buttonGroup1.add(Z);
        Z.setText("Z");
        Z.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ZActionPerformed(evt);
            }
        });

        buttonGroup1.add(zero);
        zero.setText("0");
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        buttonGroup1.add(um);
        um.setText("1");
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });

        buttonGroup1.add(dois);
        dois.setText("2");
        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisActionPerformed(evt);
            }
        });

        buttonGroup1.add(tres);
        tres.setText("3");
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        buttonGroup1.add(quatro);
        quatro.setText("4");
        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroActionPerformed(evt);
            }
        });

        buttonGroup1.add(cinco);
        cinco.setText("5");
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        buttonGroup1.add(seis);
        seis.setText("6");
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        buttonGroup1.add(sete);
        sete.setText("7");
        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteActionPerformed(evt);
            }
        });

        buttonGroup1.add(oito);
        oito.setText("8");
        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoActionPerformed(evt);
            }
        });

        jLabel1.setText("Dica:");

        hint.setEditable(false);
        hint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hintActionPerformed(evt);
            }
        });

        jLabel2.setText("Já Sabe? Pode arriscar aqui ->");

        yes.setText("Confima a letra?");
        yes.setEnabled(false);
        yes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesActionPerformed(evt);
            }
        });

        word.setEditable(false);
        word.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wordActionPerformed(evt);
            }
        });

        jLabel3.setText("Palavra:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(yes)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(hint)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(A)
                                .addGap(18, 18, 18)
                                .addComponent(B)
                                .addGap(18, 18, 18)
                                .addComponent(C)
                                .addGap(18, 18, 18)
                                .addComponent(D)
                                .addGap(18, 18, 18)
                                .addComponent(E))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(M)
                                        .addGap(18, 18, 18)
                                        .addComponent(N)
                                        .addGap(18, 18, 18)
                                        .addComponent(O)
                                        .addGap(18, 18, 18)
                                        .addComponent(P))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Y)
                                        .addGap(18, 18, 18)
                                        .addComponent(Z)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(zero)
                                        .addGap(18, 18, 18)
                                        .addComponent(um)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dois)
                                    .addComponent(Q))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(F)
                                .addGap(24, 24, 24)
                                .addComponent(G)
                                .addGap(18, 18, 18)
                                .addComponent(H)
                                .addGap(18, 18, 18)
                                .addComponent(I)
                                .addGap(18, 18, 18)
                                .addComponent(J)
                                .addGap(18, 18, 18)
                                .addComponent(K)
                                .addGap(18, 18, 18)
                                .addComponent(L))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tres)
                                .addGap(26, 26, 26)
                                .addComponent(quatro)
                                .addGap(18, 18, 18)
                                .addComponent(cinco)
                                .addGap(18, 18, 18)
                                .addComponent(seis)
                                .addGap(18, 18, 18)
                                .addComponent(sete)
                                .addGap(18, 18, 18)
                                .addComponent(oito)
                                .addGap(18, 18, 18)
                                .addComponent(nove))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(R)
                                .addGap(18, 18, 18)
                                .addComponent(S)
                                .addGap(18, 18, 18)
                                .addComponent(T)
                                .addGap(18, 18, 18)
                                .addComponent(U)
                                .addGap(18, 18, 18)
                                .addComponent(V)
                                .addGap(18, 18, 18)
                                .addComponent(X)
                                .addGap(18, 18, 18)
                                .addComponent(W))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(Palavra, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(word)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(word, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A)
                    .addComponent(B)
                    .addComponent(C)
                    .addComponent(D)
                    .addComponent(I)
                    .addComponent(J)
                    .addComponent(K)
                    .addComponent(L)
                    .addComponent(H)
                    .addComponent(G)
                    .addComponent(F)
                    .addComponent(E))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(M)
                    .addComponent(N)
                    .addComponent(O)
                    .addComponent(P)
                    .addComponent(U)
                    .addComponent(V)
                    .addComponent(X)
                    .addComponent(W)
                    .addComponent(T)
                    .addComponent(S)
                    .addComponent(R)
                    .addComponent(Q))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Y)
                    .addComponent(Z)
                    .addComponent(zero)
                    .addComponent(um)
                    .addComponent(seis)
                    .addComponent(sete)
                    .addComponent(oito)
                    .addComponent(nove)
                    .addComponent(cinco)
                    .addComponent(quatro)
                    .addComponent(tres)
                    .addComponent(dois))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yes)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Palavra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PalavraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PalavraActionPerformed
        // TODO add your handling code here:
        if (palavra==Palavra.getText()){
            word.setText(palavra);
        }
        else{
            jogo.lifes--;
        }
    }//GEN-LAST:event_PalavraActionPerformed

    private void IActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IActionPerformed
        // TODO add your handling code here:
        letra='i';
        yes.setEnabled(true);
    }//GEN-LAST:event_IActionPerformed

    private void LActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LActionPerformed
        // TODO add your handling code here:
        letra='l';
        yes.setEnabled(true);
    }//GEN-LAST:event_LActionPerformed

    private void KActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KActionPerformed
        // TODO add your handling code here:
        letra='k';
        yes.setEnabled(true);
    }//GEN-LAST:event_KActionPerformed

    private void JActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JActionPerformed
        // TODO add your handling code here:
        letra='j';
        yes.setEnabled(true);
    }//GEN-LAST:event_JActionPerformed

    private void WActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WActionPerformed
        // TODO add your handling code here:
        letra='w';
        yes.setEnabled(true);
    }//GEN-LAST:event_WActionPerformed

    private void UActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UActionPerformed
        // TODO add your handling code here:
        letra='u';
        yes.setEnabled(true);
    }//GEN-LAST:event_UActionPerformed

    private void VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VActionPerformed
        // TODO add your handling code here:
        letra='v';
        yes.setEnabled(true);
    }//GEN-LAST:event_VActionPerformed

    private void XActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_XActionPerformed
        // TODO add your handling code here:
        letra='x';
        yes.setEnabled(true);
    }//GEN-LAST:event_XActionPerformed

    private void noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveActionPerformed
        // TODO add your handling code here:
        letra='9';
        yes.setEnabled(true);
    }//GEN-LAST:event_noveActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        // TODO add your handling code here:
        letra='6';
        yes.setEnabled(true);
    }//GEN-LAST:event_seisActionPerformed

    private void seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteActionPerformed
        // TODO add your handling code here:
        letra='7';
        yes.setEnabled(true);
    }//GEN-LAST:event_seteActionPerformed

    private void oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoActionPerformed
        // TODO add your handling code here:
        letra='8';
        yes.setEnabled(true);
    }//GEN-LAST:event_oitoActionPerformed

    private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed
        // TODO add your handling code here:
        letra='e';
        yes.setEnabled(true);
    }//GEN-LAST:event_EActionPerformed

    private void FActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FActionPerformed
        // TODO add your handling code here:
        letra='f';
        yes.setEnabled(true);
    }//GEN-LAST:event_FActionPerformed

    private void ZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ZActionPerformed
        // TODO add your handling code here:
        letra='z';
        yes.setEnabled(true);
    }//GEN-LAST:event_ZActionPerformed

    private void hintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hintActionPerformed
        // TODO add your handling code here:
        hint.setText(String.valueOf(dica));
    }//GEN-LAST:event_hintActionPerformed

    private void AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AActionPerformed
        // TODO add your handling code here:
        letra='a';
        yes.setEnabled(true);
    }//GEN-LAST:event_AActionPerformed

    private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed
        // TODO add your handling code here:
        letra='b';
        yes.setEnabled(true);
    }//GEN-LAST:event_BActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
        // TODO add your handling code here:
        letra='c';
        yes.setEnabled(true);
    }//GEN-LAST:event_CActionPerformed

    private void DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DActionPerformed
        // TODO add your handling code here:
        letra='d';
        yes.setEnabled(true);
    }//GEN-LAST:event_DActionPerformed

    private void GActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GActionPerformed
        // TODO add your handling code here:
        letra='g';
        yes.setEnabled(true);
    }//GEN-LAST:event_GActionPerformed

    private void HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HActionPerformed
        // TODO add your handling code here:
        letra='h';
        yes.setEnabled(true);
    }//GEN-LAST:event_HActionPerformed

    private void MActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MActionPerformed
        // TODO add your handling code here:
        letra='m';
        yes.setEnabled(true);
    }//GEN-LAST:event_MActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        // TODO add your handling code here:
        letra='n';
        yes.setEnabled(true);
    }//GEN-LAST:event_NActionPerformed

    private void OActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OActionPerformed
        // TODO add your handling code here:
        letra='o';
        yes.setEnabled(true);
    }//GEN-LAST:event_OActionPerformed

    private void PActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PActionPerformed
        // TODO add your handling code here:
        letra='p';
        yes.setEnabled(true);
    }//GEN-LAST:event_PActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
        // TODO add your handling code here:
        letra='q';
        yes.setEnabled(true);
    }//GEN-LAST:event_QActionPerformed

    private void RActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RActionPerformed
        // TODO add your handling code here:
        letra='r';
        yes.setEnabled(true);
    }//GEN-LAST:event_RActionPerformed

    private void SActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SActionPerformed
        // TODO add your handling code here:
        letra='s';
        yes.setEnabled(true);
    }//GEN-LAST:event_SActionPerformed

    private void TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TActionPerformed
        // TODO add your handling code here:
        letra='t';
        yes.setEnabled(true);
    }//GEN-LAST:event_TActionPerformed

    private void YActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YActionPerformed
        // TODO add your handling code here:
        letra='y';
        yes.setEnabled(true);
    }//GEN-LAST:event_YActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:letra='a';
        letra='0';
        yes.setEnabled(true);
    }//GEN-LAST:event_zeroActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
        // TODO add your handling code here:
        letra='1';
        yes.setEnabled(true);
    }//GEN-LAST:event_umActionPerformed

    private void doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisActionPerformed
        // TODO add your handling code here:
        letra='2';
        yes.setEnabled(true);
    }//GEN-LAST:event_doisActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        // TODO add your handling code here:
        letra='3';
        yes.setEnabled(true);
    }//GEN-LAST:event_tresActionPerformed

    private void quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroActionPerformed
        // TODO add your handling code here:
        letra='4';
        yes.setEnabled(true);
    }//GEN-LAST:event_quatroActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        // TODO add your handling code here:
        letra='5';
        yes.setEnabled(true);
    }//GEN-LAST:event_cincoActionPerformed

    private void wordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wordActionPerformed

    private void yesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesActionPerformed
        // TODO add your handling code here:
        buttonGroup1.getSelection().setEnabled(false);
        word.setText(jogo.jogando(letra, vet));
        yes.setEnabled(false);
    }//GEN-LAST:event_yesActionPerformed

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
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Forca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Forca().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton A;
    private javax.swing.JRadioButton B;
    private javax.swing.JRadioButton C;
    private javax.swing.JRadioButton D;
    private javax.swing.JRadioButton E;
    private javax.swing.JRadioButton F;
    private javax.swing.JRadioButton G;
    private javax.swing.JRadioButton H;
    private javax.swing.JRadioButton I;
    private javax.swing.JRadioButton J;
    private javax.swing.JRadioButton K;
    private javax.swing.JRadioButton L;
    private javax.swing.JRadioButton M;
    private javax.swing.JRadioButton N;
    private javax.swing.JRadioButton O;
    private javax.swing.JRadioButton P;
    private javax.swing.JTextField Palavra;
    private javax.swing.JRadioButton Q;
    private javax.swing.JRadioButton R;
    private javax.swing.JRadioButton S;
    private javax.swing.JRadioButton T;
    private javax.swing.JRadioButton U;
    private javax.swing.JRadioButton V;
    private javax.swing.JRadioButton W;
    private javax.swing.JRadioButton X;
    private javax.swing.JRadioButton Y;
    private javax.swing.JRadioButton Z;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton cinco;
    private javax.swing.JRadioButton dois;
    private javax.swing.JTextField hint;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton nove;
    private javax.swing.JRadioButton oito;
    private javax.swing.JRadioButton quatro;
    private javax.swing.JRadioButton seis;
    private javax.swing.JRadioButton sete;
    private javax.swing.JRadioButton tres;
    private javax.swing.JRadioButton um;
    private javax.swing.JTextField word;
    private javax.swing.JButton yes;
    private javax.swing.JRadioButton zero;
    // End of variables declaration//GEN-END:variables
}
