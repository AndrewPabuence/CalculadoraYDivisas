package Ventana;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Divisas extends javax.swing.JFrame {
    private String cadenaNum = "", cadenaNum2 = "", divisa1="", divisa2="";
    private boolean comprobacion = false;
    private double dinero=0, cambio=0;
    public Divisas() {
        
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(300, 422);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EtiquetaDivisa1 = new javax.swing.JLabel();
        EtiquetaDinero = new javax.swing.JLabel();
        cajaDivisa2 = new javax.swing.JComboBox<>();
        cajaDivisa1 = new javax.swing.JComboBox<>();
        botonSiete = new javax.swing.JButton();
        botonCuatro = new javax.swing.JButton();
        botonUno = new javax.swing.JButton();
        BotonOcho = new javax.swing.JButton();
        botonCinco = new javax.swing.JButton();
        botonDos = new javax.swing.JButton();
        botonCero = new javax.swing.JButton();
        botonNueve = new javax.swing.JButton();
        botonSeis = new javax.swing.JButton();
        botonTres = new javax.swing.JButton();
        botonComa = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        BotonClear = new javax.swing.JButton();
        EtiquetaDivisa2 = new javax.swing.JLabel();
        EtiquetaDineroResultado = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuMenu = new javax.swing.JMenu();
        Calculadora = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Divisas = new javax.swing.JMenuItem();
        JMenuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        EtiquetaDivisa1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        EtiquetaDivisa1.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaDivisa1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaDivisa1.setText("Bs");

        EtiquetaDinero.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        EtiquetaDinero.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaDinero.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EtiquetaDinero.setText("0");

        cajaDivisa2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        cajaDivisa2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Venezuela ( Bs )", "EEUU ( Dolar )", "Colombia ( Cop )" }));
        cajaDivisa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDivisa2ActionPerformed(evt);
            }
        });

        cajaDivisa1.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        cajaDivisa1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Venezuela ( Bs )", "EEUU ( Dolar )", "Colombia ( Cop )" }));
        cajaDivisa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDivisa1ActionPerformed(evt);
            }
        });

        botonSiete.setBackground(new java.awt.Color(0, 0, 0));
        botonSiete.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        botonSiete.setForeground(new java.awt.Color(255, 255, 255));
        botonSiete.setText("7");
        botonSiete.setBorderPainted(false);
        botonSiete.setContentAreaFilled(false);
        botonSiete.setFocusable(false);
        botonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSieteActionPerformed(evt);
            }
        });

        botonCuatro.setBackground(new java.awt.Color(0, 0, 0));
        botonCuatro.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        botonCuatro.setForeground(new java.awt.Color(255, 255, 255));
        botonCuatro.setText("4");
        botonCuatro.setBorderPainted(false);
        botonCuatro.setContentAreaFilled(false);
        botonCuatro.setFocusable(false);
        botonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuatroActionPerformed(evt);
            }
        });

        botonUno.setBackground(new java.awt.Color(0, 0, 0));
        botonUno.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        botonUno.setForeground(new java.awt.Color(255, 255, 255));
        botonUno.setText("1");
        botonUno.setBorderPainted(false);
        botonUno.setContentAreaFilled(false);
        botonUno.setFocusable(false);
        botonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnoActionPerformed(evt);
            }
        });

        BotonOcho.setBackground(new java.awt.Color(0, 0, 0));
        BotonOcho.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        BotonOcho.setForeground(new java.awt.Color(255, 255, 255));
        BotonOcho.setText("8");
        BotonOcho.setBorderPainted(false);
        BotonOcho.setContentAreaFilled(false);
        BotonOcho.setFocusable(false);
        BotonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonOchoActionPerformed(evt);
            }
        });

        botonCinco.setBackground(new java.awt.Color(0, 0, 0));
        botonCinco.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        botonCinco.setForeground(new java.awt.Color(255, 255, 255));
        botonCinco.setText("5");
        botonCinco.setBorderPainted(false);
        botonCinco.setContentAreaFilled(false);
        botonCinco.setFocusable(false);
        botonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCincoActionPerformed(evt);
            }
        });

        botonDos.setBackground(new java.awt.Color(0, 0, 0));
        botonDos.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        botonDos.setForeground(new java.awt.Color(255, 255, 255));
        botonDos.setText("2");
        botonDos.setBorderPainted(false);
        botonDos.setContentAreaFilled(false);
        botonDos.setFocusable(false);
        botonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDosActionPerformed(evt);
            }
        });

        botonCero.setBackground(new java.awt.Color(0, 0, 0));
        botonCero.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        botonCero.setForeground(new java.awt.Color(255, 255, 255));
        botonCero.setText("0");
        botonCero.setBorderPainted(false);
        botonCero.setContentAreaFilled(false);
        botonCero.setFocusable(false);
        botonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCeroActionPerformed(evt);
            }
        });

        botonNueve.setBackground(new java.awt.Color(0, 0, 0));
        botonNueve.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        botonNueve.setForeground(new java.awt.Color(255, 255, 255));
        botonNueve.setText("9");
        botonNueve.setBorderPainted(false);
        botonNueve.setContentAreaFilled(false);
        botonNueve.setFocusable(false);
        botonNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNueveActionPerformed(evt);
            }
        });

        botonSeis.setBackground(new java.awt.Color(0, 0, 0));
        botonSeis.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        botonSeis.setForeground(new java.awt.Color(255, 255, 255));
        botonSeis.setText("6");
        botonSeis.setBorderPainted(false);
        botonSeis.setContentAreaFilled(false);
        botonSeis.setFocusable(false);
        botonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeisActionPerformed(evt);
            }
        });

        botonTres.setBackground(new java.awt.Color(0, 0, 0));
        botonTres.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        botonTres.setForeground(new java.awt.Color(255, 255, 255));
        botonTres.setText("3");
        botonTres.setBorderPainted(false);
        botonTres.setContentAreaFilled(false);
        botonTres.setFocusable(false);
        botonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTresActionPerformed(evt);
            }
        });

        botonComa.setBackground(new java.awt.Color(0, 0, 0));
        botonComa.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        botonComa.setForeground(new java.awt.Color(255, 255, 255));
        botonComa.setText(".");
        botonComa.setBorderPainted(false);
        botonComa.setContentAreaFilled(false);
        botonComa.setFocusable(false);
        botonComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComaActionPerformed(evt);
            }
        });

        ImageIcon imgBorrar = new ImageIcon(getClass().getResource("/Imagenes/104815.png"));
        Image imgEscaladaBorrar = imgBorrar.getImage().getScaledInstance(30, 23, Image.SCALE_SMOOTH);
        Icon iconoBorrar = new ImageIcon(imgEscaladaBorrar);
        botonBorrar.setBackground(new java.awt.Color(102, 102, 102));
        botonBorrar.setForeground(new java.awt.Color(255, 255, 255));
        botonBorrar.setIcon(iconoBorrar);
        botonBorrar.setBorderPainted(false);
        botonBorrar.setFocusable(false);
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        BotonClear.setBackground(new java.awt.Color(0, 0, 0));
        BotonClear.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        BotonClear.setForeground(new java.awt.Color(255, 255, 255));
        BotonClear.setText("C");
        BotonClear.setBorderPainted(false);
        BotonClear.setContentAreaFilled(false);
        BotonClear.setFocusable(false);
        BotonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonClearActionPerformed(evt);
            }
        });

        EtiquetaDivisa2.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        EtiquetaDivisa2.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaDivisa2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EtiquetaDivisa2.setText("Bs");

        EtiquetaDineroResultado.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        EtiquetaDineroResultado.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaDineroResultado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        EtiquetaDineroResultado.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonUno, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonDos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botonComa, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCero, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(EtiquetaDivisa2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EtiquetaDineroResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(cajaDivisa2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cajaDivisa1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(EtiquetaDivisa1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EtiquetaDinero, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDivisa1)
                    .addComponent(EtiquetaDinero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaDivisa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaDivisa2)
                    .addComponent(EtiquetaDineroResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cajaDivisa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonUno, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonDos, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonComa, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonCero, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonTres, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonClear, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)))
                        .addGap(52, 52, 52)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        JMenuMenu.setText("Menu");

        ImageIcon imgCalculadora = new ImageIcon(getClass().getResource("/Imagenes/cbb25ff6f1471030763f0709c87e276a-icono-de-calculadora-by-vexels.png"));
        Image imgEscaladaCalculadora = imgCalculadora.getImage().getScaledInstance(10, 10, Image.SCALE_SMOOTH);
        Icon iconoEscalador = new ImageIcon(imgEscaladaCalculadora);
        Calculadora.setIcon(iconoEscalador);
        Calculadora.setText("Calculadora");
        Calculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculadoraActionPerformed(evt);
            }
        });
        JMenuMenu.add(Calculadora);
        JMenuMenu.add(jSeparator2);

        Divisas.setText("Divisas");
        Divisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivisasActionPerformed(evt);
            }
        });
        JMenuMenu.add(Divisas);

        jMenuBar1.add(JMenuMenu);

        JMenuAyuda.setText("Ayuda");
        JMenuAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuAyudaActionPerformed(evt);
            }
        });
        jMenuBar1.add(JMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculadoraActionPerformed
        Calculadora c1 = new Calculadora();
        c1.setVisible(true);
        dispose();
    }//GEN-LAST:event_CalculadoraActionPerformed

    private void DivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisasActionPerformed
        JOptionPane.showMessageDialog(null, "Ya estas en el convertidor de divisas, imbecil.");
    }//GEN-LAST:event_DivisasActionPerformed

    private void botonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCeroActionPerformed
        if(cadenaNum != ""){
            cadenaNum += "0";
            EtiquetaDinero.setText(cadenaNum);
            obtenerDinero();
        }
    }//GEN-LAST:event_botonCeroActionPerformed

    private void botonComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComaActionPerformed
        if(comprobacion == false){
            cadenaNum = cadenaNum + ".";
            EtiquetaDinero.setText(cadenaNum);
        }
        else{
            botonComa.setEnabled(true);
            cadenaNum = cadenaNum + ".";
            EtiquetaDinero.setText(cadenaNum);
            comprobacion = false;
        }
        obtenerDinero();
        botonComa.setEnabled(false);
    }//GEN-LAST:event_botonComaActionPerformed

    private void botonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnoActionPerformed
        cadenaNum += "1";
        EtiquetaDinero.setText(cadenaNum);
        obtenerDinero();
    }//GEN-LAST:event_botonUnoActionPerformed

    private void botonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDosActionPerformed
        cadenaNum += "2";
        EtiquetaDinero.setText(cadenaNum);
        obtenerDinero();
    }//GEN-LAST:event_botonDosActionPerformed

    private void botonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTresActionPerformed
        cadenaNum += "3";
        EtiquetaDinero.setText(cadenaNum);
        obtenerDinero();
    }//GEN-LAST:event_botonTresActionPerformed

    private void botonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuatroActionPerformed
        cadenaNum += "4";
        EtiquetaDinero.setText(cadenaNum);
        obtenerDinero();
    }//GEN-LAST:event_botonCuatroActionPerformed

    private void botonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCincoActionPerformed
        cadenaNum += "5";
        EtiquetaDinero.setText(cadenaNum);
        obtenerDinero();
    }//GEN-LAST:event_botonCincoActionPerformed

    private void botonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeisActionPerformed
        cadenaNum += "6";
        EtiquetaDinero.setText(cadenaNum);
        obtenerDinero();
    }//GEN-LAST:event_botonSeisActionPerformed

    private void botonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSieteActionPerformed
        cadenaNum += "7";
        EtiquetaDinero.setText(cadenaNum);
        obtenerDinero();
    }//GEN-LAST:event_botonSieteActionPerformed

    private void BotonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonOchoActionPerformed
        cadenaNum += "8";
        EtiquetaDinero.setText(cadenaNum);
        obtenerDinero();
    }//GEN-LAST:event_BotonOchoActionPerformed

    private void botonNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNueveActionPerformed
        cadenaNum += "9";
        EtiquetaDinero.setText(cadenaNum);
        obtenerDinero();
    }//GEN-LAST:event_botonNueveActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int tamaño = cadenaNum.length();
        if(tamaño <= 1){
            cleanEveryThing();
        }
        else if(cadenaNum.charAt(tamaño-1) == '.'){
            cadenaNum = cadenaNum.substring(0, cadenaNum.length()-1);
            EtiquetaDinero.setText(cadenaNum);
            botonComa.setEnabled(true);
        }
        else{
            cadenaNum = cadenaNum.substring(0, cadenaNum.length()-1);
            EtiquetaDinero.setText(cadenaNum);
        }
        obtenerDinero();
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void cleanEveryThing(){
        EtiquetaDinero.setText("0");
        cadenaNum="";
        EtiquetaDineroResultado.setText("0");
        dinero = 0;
        cambio = 0;
    }
    
    private void BotonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonClearActionPerformed
        cleanEveryThing();
    }//GEN-LAST:event_BotonClearActionPerformed

    private void cajaDivisa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDivisa1ActionPerformed
        divisa1 = (String) cajaDivisa1.getSelectedItem();
        
        if(divisa1.equals("Venezuela ( Bs )")){
            EtiquetaDivisa1.setText("Bs ");
        }
        else if(divisa1.equals("EEUU ( Dolar )")){
            EtiquetaDivisa1.setText("$ ");
        }
        else if(divisa1.equals("Colombia ( Cop )")){
            EtiquetaDivisa1.setText("Cop ");
        }
        obtenerDinero();
    }//GEN-LAST:event_cajaDivisa1ActionPerformed

    private void cajaDivisa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDivisa2ActionPerformed
        divisa2 = (String) cajaDivisa2.getSelectedItem();
        
        if(divisa2.equals("Venezuela ( Bs )")){
            EtiquetaDivisa2.setText("Bs ");
        }
        else if(divisa2.equals("EEUU ( Dolar )")){
            EtiquetaDivisa2.setText("$ ");
        }
        else if(divisa2.equals("Colombia ( Cop )")){
            EtiquetaDivisa2.setText("Cop ");
        }
        obtenerDinero();
    }//GEN-LAST:event_cajaDivisa2ActionPerformed

    private void JMenuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuAyudaActionPerformed
        JOptionPane.showMessageDialog(null, "Programa hecho por BPV");
    }//GEN-LAST:event_JMenuAyudaActionPerformed

    private void obtenerDinero(){
        cadenaNum2 = EtiquetaDinero.getText();
        dinero = Double.parseDouble(cadenaNum2);
        cambioDivisas();
        dinero *= cambio;
        EtiquetaDineroResultado.setText(String.format("%.2f", dinero));
    }
    
    private void cambioDivisas(){
        if(divisa1.equals(divisa2)){
            cambio = 1;
        }
        else if((divisa1.equals("Venezuela ( Bs )"))&&(divisa2.equals("EEUU ( Dolar )"))){
            cambio = 0.00000075;
        }
        else if((divisa1.equals("Venezuela ( Bs )"))&&(divisa2.equals("Colombia ( Cop )"))){
            cambio = 0.0023;
        }
        else if(divisa1.equals("Colombia ( Cop )")&&divisa2.equals("Venezuela ( Bs )")){
            cambio = 400;
        }
        else if(divisa1.equals("Colombia ( Cop )")&&divisa2.equals("EEUU ( Dolar )")){
            cambio = 0.0003125;
        }
        else if(divisa1.equals("EEUU ( Dolar )")&&divisa2.equals("Venezuela ( Bs )")){
            cambio = 1350000;
        }
        else if((divisa1.equals("EEUU ( Dolar )"))&&(divisa2.equals("Colombia ( Cop )"))){
            cambio = 3200;
        }
    }
    
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
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Divisas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Divisas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonClear;
    private javax.swing.JButton BotonOcho;
    private javax.swing.JMenuItem Calculadora;
    private javax.swing.JMenuItem Divisas;
    private javax.swing.JLabel EtiquetaDinero;
    private javax.swing.JLabel EtiquetaDineroResultado;
    private javax.swing.JLabel EtiquetaDivisa1;
    private javax.swing.JLabel EtiquetaDivisa2;
    private javax.swing.JMenu JMenuAyuda;
    private javax.swing.JMenu JMenuMenu;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCero;
    private javax.swing.JButton botonCinco;
    private javax.swing.JButton botonComa;
    private javax.swing.JButton botonCuatro;
    private javax.swing.JButton botonDos;
    private javax.swing.JButton botonNueve;
    private javax.swing.JButton botonSeis;
    private javax.swing.JButton botonSiete;
    private javax.swing.JButton botonTres;
    private javax.swing.JButton botonUno;
    private javax.swing.JComboBox<String> cajaDivisa1;
    private javax.swing.JComboBox<String> cajaDivisa2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
