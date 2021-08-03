/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrew
 */
public class Calculadora extends javax.swing.JFrame {
    private String cadenaNum = "", cadenaNum2 = "";
    private double numero1, numero2,resultado;
    private String cadenaNumResultado = "";
    private String operacion = "nula";
    private boolean comprobacion = false, comprobacionDoblefuncion = false;
    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        setTitle("Calculadora BPV");
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(308, 436);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        botonUno = new javax.swing.JButton();
        botonDos = new javax.swing.JButton();
        botonTres = new javax.swing.JButton();
        botonCuatro = new javax.swing.JButton();
        botonCinco = new javax.swing.JButton();
        botonSeis = new javax.swing.JButton();
        botonSiete = new javax.swing.JButton();
        botonOcho = new javax.swing.JButton();
        botonComa = new javax.swing.JButton();
        botonCero = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonMultiplicar = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        botonRaiz = new javax.swing.JButton();
        botonClean = new javax.swing.JButton();
        botonPotenciacion = new javax.swing.JButton();
        botonDividir = new javax.swing.JButton();
        botonRestar = new javax.swing.JButton();
        botonSumar = new javax.swing.JButton();
        botonMasoMenos = new javax.swing.JButton();
        botonNueve1 = new javax.swing.JButton();
        EtiquetaNumResultado = new javax.swing.JLabel();
        EtiquetaNum = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuMenu = new javax.swing.JMenu();
        Calculadora = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        Divisas = new javax.swing.JMenuItem();
        JMenuAyuda = new javax.swing.JMenu();
        Creador = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        Contacto = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(300, 422));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(300, 422));
        jPanel1.setPreferredSize(new java.awt.Dimension(305, 422));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 125, 270, 0));

        botonUno.setBackground(new java.awt.Color(102, 102, 102));
        botonUno.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        botonUno.setText("1");
        botonUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnoActionPerformed(evt);
            }
        });
        jPanel1.add(botonUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 180, 55, 38));

        botonDos.setBackground(new java.awt.Color(102, 102, 102));
        botonDos.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        botonDos.setText("2");
        botonDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDosActionPerformed(evt);
            }
        });
        jPanel1.add(botonDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 180, 55, 38));

        botonTres.setBackground(new java.awt.Color(102, 102, 102));
        botonTres.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        botonTres.setText("3");
        botonTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTresActionPerformed(evt);
            }
        });
        jPanel1.add(botonTres, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 180, 55, 38));

        botonCuatro.setBackground(new java.awt.Color(102, 102, 102));
        botonCuatro.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        botonCuatro.setText("4");
        botonCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuatroActionPerformed(evt);
            }
        });
        jPanel1.add(botonCuatro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 55, 38));

        botonCinco.setBackground(new java.awt.Color(102, 102, 102));
        botonCinco.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        botonCinco.setText("5");
        botonCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCincoActionPerformed(evt);
            }
        });
        jPanel1.add(botonCinco, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 55, 38));

        botonSeis.setBackground(new java.awt.Color(102, 102, 102));
        botonSeis.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        botonSeis.setText("6");
        botonSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeisActionPerformed(evt);
            }
        });
        jPanel1.add(botonSeis, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 55, 38));

        botonSiete.setBackground(new java.awt.Color(102, 102, 102));
        botonSiete.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        botonSiete.setText("7");
        botonSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSieteActionPerformed(evt);
            }
        });
        jPanel1.add(botonSiete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 55, 38));

        botonOcho.setBackground(new java.awt.Color(102, 102, 102));
        botonOcho.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        botonOcho.setText("8");
        botonOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOchoActionPerformed(evt);
            }
        });
        jPanel1.add(botonOcho, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 55, 38));

        botonComa.setBackground(new java.awt.Color(102, 102, 102));
        botonComa.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        botonComa.setText(",");
        botonComa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonComaActionPerformed(evt);
            }
        });
        jPanel1.add(botonComa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 55, 38));

        botonCero.setBackground(new java.awt.Color(102, 102, 102));
        botonCero.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        botonCero.setText("0");
        botonCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCeroActionPerformed(evt);
            }
        });
        jPanel1.add(botonCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 55, 38));

        botonBorrar.setBackground(new java.awt.Color(102, 102, 102));
        ImageIcon imgBorrar = new ImageIcon(getClass().getResource("/Imagenes/104815.png"));
        Image imgEscaladaBorrar = imgBorrar.getImage().getScaledInstance(35, 23, Image.SCALE_SMOOTH);
        Icon iconoBorrar = new ImageIcon(imgEscaladaBorrar);
        botonBorrar.setIcon(iconoBorrar);
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });
        jPanel1.add(botonBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 143, 80, 30));

        botonMultiplicar.setBackground(new java.awt.Color(102, 102, 102));
        ImageIcon imgMultiplicar = new ImageIcon(getClass().getResource("/Imagenes/43823.png"));
        Image imgEscaladaMultiplicar = imgMultiplicar.getImage().getScaledInstance(18, 18, Image.SCALE_SMOOTH);
        Icon iconoMultiplicar = new ImageIcon(imgEscaladaMultiplicar);
        botonMultiplicar.setIcon(iconoMultiplicar);
        botonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicarActionPerformed(evt);
            }
        });
        jPanel1.add(botonMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 178, 40, 40));

        botonIgual.setBackground(new java.awt.Color(102, 102, 102));
        ImageIcon imgIgualdad = new ImageIcon(getClass().getResource("/Imagenes/simbolo-de-igual-png-2-300x200.png"));
        Image imgEscaladaIgualdad = imgIgualdad.getImage().getScaledInstance(26,26,Image.SCALE_SMOOTH);
        Icon iconoEscaladoIgualdad = new ImageIcon(imgEscaladaIgualdad);
        botonIgual.setIcon(iconoEscaladoIgualdad);
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });
        jPanel1.add(botonIgual, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 80, 90));

        botonRaiz.setBackground(new java.awt.Color(102, 102, 102));
        ImageIcon imgRaiz = new ImageIcon(getClass().getResource("/Imagenes/43743.png"));
        Image imgEscaladaRaiz = imgRaiz.getImage().getScaledInstance(31, 18, Image.SCALE_SMOOTH);
        Icon iconoEscaladoRaiz = new ImageIcon(imgEscaladaRaiz);
        botonRaiz.setIcon(iconoEscaladoRaiz);
        botonRaiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizActionPerformed(evt);
            }
        });
        jPanel1.add(botonRaiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 143, 55, 30));

        botonClean.setBackground(new java.awt.Color(102, 102, 102));
        botonClean.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        botonClean.setText("C");
        botonClean.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonClean.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonClean.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonClean.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCleanActionPerformed(evt);
            }
        });
        jPanel1.add(botonClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 143, 55, 30));

        botonPotenciacion.setBackground(new java.awt.Color(102, 102, 102));
        ImageIcon imgPotenciacion = new ImageIcon(getClass().getResource("/Imagenes/1200px-OCR-A_char_Circumflex_Accent.svg.png"));
        Image imgEscaladaPotenciacion = imgPotenciacion.getImage().getScaledInstance(25, 20, Image.SCALE_SMOOTH);
        Icon iconoEscaladoPotenciacion = new ImageIcon(imgEscaladaPotenciacion);
        botonPotenciacion.setIcon(iconoEscaladoPotenciacion);
        botonPotenciacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botonPotenciacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botonPotenciacion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        botonPotenciacion.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        botonPotenciacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPotenciacionActionPerformed(evt);
            }
        });
        jPanel1.add(botonPotenciacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 143, 55, 30));

        botonDividir.setBackground(new java.awt.Color(102, 102, 102));
        ImageIcon imgDividir = new ImageIcon(getClass().getResource("/Imagenes/43097.png"));
        Image imgEscaladaDividir = imgDividir.getImage().getScaledInstance(22, 15, Image.SCALE_SMOOTH);
        Icon iconoEscaladoDividir = new ImageIcon(imgEscaladaDividir);
        botonDividir.setIcon(iconoEscaladoDividir);
        botonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDividirActionPerformed(evt);
            }
        });
        jPanel1.add(botonDividir, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 228, 40, 40));

        botonRestar.setBackground(new java.awt.Color(102, 102, 102));
        ImageIcon imgRestar = new ImageIcon(getClass().getResource("/Imagenes/17940.png"));
        Image imgEscaladaRestar = imgRestar.getImage().getScaledInstance(24, 28, Image.SCALE_SMOOTH);
        Icon iconoRestar = new ImageIcon(imgEscaladaRestar);
        botonRestar.setIcon(iconoRestar);
        botonRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestarActionPerformed(evt);
            }
        });
        jPanel1.add(botonRestar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 178, 40, 40));

        botonSumar.setBackground(new java.awt.Color(102, 102, 102));
        ImageIcon imgSuma = new ImageIcon(getClass().getResource("/Imagenes/109784.png"));
        Image imgEscaladaSuma = imgSuma.getImage().getScaledInstance(26, 18, Image.SCALE_SMOOTH);
        Icon iconoEscaladoSuma = new ImageIcon(imgEscaladaSuma);
        botonSumar.setIcon(iconoEscaladoSuma);
        botonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumarActionPerformed(evt);
            }
        });
        jPanel1.add(botonSumar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 228, 40, 40));

        ImageIcon imgMasoMenos = new ImageIcon(getClass().getResource("/Imagenes/43472.png"));
        Image imgEscaladaMasoMenos = imgMasoMenos.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        Icon iconoEscaladoMasoMenos = new ImageIcon(imgEscaladaMasoMenos);
        botonMasoMenos.setBackground(new java.awt.Color(102, 102, 102));
        botonMasoMenos.setIcon(iconoEscaladoMasoMenos);
        botonMasoMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMasoMenosActionPerformed(evt);
            }
        });
        jPanel1.add(botonMasoMenos, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 55, 38));

        botonNueve1.setBackground(new java.awt.Color(102, 102, 102));
        botonNueve1.setFont(new java.awt.Font("Cambria Math", 1, 16)); // NOI18N
        botonNueve1.setText("9");
        botonNueve1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNueve1ActionPerformed(evt);
            }
        });
        jPanel1.add(botonNueve1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 55, 38));

        EtiquetaNumResultado.setBackground(new java.awt.Color(0, 0, 0));
        EtiquetaNumResultado.setFont(new java.awt.Font("Cambria Math", 1, 24)); // NOI18N
        EtiquetaNumResultado.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaNumResultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiquetaNumResultado.setText("0");
        EtiquetaNumResultado.setEnabled(false);
        jPanel1.add(EtiquetaNumResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 19, 260, 30));

        EtiquetaNum.setBackground(new java.awt.Color(0, 0, 0));
        EtiquetaNum.setFont(new java.awt.Font("Cambria Math", 1, 36)); // NOI18N
        EtiquetaNum.setForeground(new java.awt.Color(255, 255, 255));
        EtiquetaNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        EtiquetaNum.setText("0");
        EtiquetaNum.setEnabled(false);
        jPanel1.add(EtiquetaNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 83, 260, 40));

        JMenuMenu.setText("Menu");
        JMenuMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuMenuActionPerformed(evt);
            }
        });

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

        Creador.setText("Creador");
        Creador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreadorActionPerformed(evt);
            }
        });
        JMenuAyuda.add(Creador);
        JMenuAyuda.add(jSeparator3);

        Contacto.setText("Contacto");
        Contacto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContactoActionPerformed(evt);
            }
        });
        JMenuAyuda.add(Contacto);

        jMenuBar1.add(JMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNueve1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNueve1ActionPerformed
        cadenaNum = cadenaNum + "9";
        EtiquetaNum.setText(cadenaNum);
    }//GEN-LAST:event_botonNueve1ActionPerformed

    private void botonMasoMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMasoMenosActionPerformed
        if(cadenaNum.contains("-")){
            cadenaNum = cadenaNum.replaceFirst("-", "");
            EtiquetaNum.setText(cadenaNum);
        }
        else{
            cadenaNum = "-" + cadenaNum;
            EtiquetaNum.setText(cadenaNum);
        }
    }//GEN-LAST:event_botonMasoMenosActionPerformed

    private void botonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumarActionPerformed
        if(cadenaNum.equals("")){
            cadenaNum = "0";
        }
        if(comprobacionDoblefuncion==true){
            if(cadenaNum.equals("")){
                cadenaNum = "0";
            }
            numero2 = Double.parseDouble(cadenaNum);
            resultado = numero1 + numero2;
            numero1 = resultado;
            EtiquetaNumResultado.setText(String.format("%.2f", resultado)+" + ");
            EtiquetaNum.setText("0");
            cadenaNum = "";
        }
        else{
            numero1 = Double.parseDouble(cadenaNum);
            EtiquetaNumResultado.setText(String.format("%.2f", numero1)+" + ");
            cadenaNum2 = EtiquetaNumResultado.getText();
            EtiquetaNum.setText("0");
            cadenaNum = "";
            operacion = "suma";
            comprobacion = false;
            botonComa.setEnabled(true);
        }
        comprobacionDoblefuncion = true;
    }//GEN-LAST:event_botonSumarActionPerformed

    private void botonRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestarActionPerformed
        if(cadenaNum.equals("")){
            cadenaNum = "0";
        }
        if(comprobacionDoblefuncion==true){
            if(cadenaNum.equals("")){
                cadenaNum = "0";
            }
            numero2 = Double.parseDouble(cadenaNum);
            resultado = numero1 - numero2;
            numero1 = resultado;
            EtiquetaNumResultado.setText(String.format("%.2f", resultado)+" - ");
            EtiquetaNum.setText("0");
            cadenaNum = "";

        }
        else{
            numero1 = Double.parseDouble(cadenaNum);
            EtiquetaNumResultado.setText(String.format("%.2f", numero1)+" - ");
            cadenaNum2 = EtiquetaNumResultado.getText();
            EtiquetaNum.setText("0");
            cadenaNum = "";
            operacion = "resta";
            comprobacion = false;
            botonComa.setEnabled(true);
        }
        comprobacionDoblefuncion = true;
    }//GEN-LAST:event_botonRestarActionPerformed

    private void botonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDividirActionPerformed
        try{
            if(comprobacionDoblefuncion==true){
                if(cadenaNum.equals("")){
                    cadenaNum = "0";
                }
                numero2 = Double.parseDouble(cadenaNum);
                resultado = numero1 / numero2;
                numero1 = resultado;
                EtiquetaNumResultado.setText(String.format("%.2f", resultado)+" / ");
                EtiquetaNum.setText("0");
                cadenaNum = "";
            }
            else{
                numero1 = Double.parseDouble(cadenaNum);
                EtiquetaNumResultado.setText(String.format("%.2f", numero1)+" / ");
                cadenaNum2 = EtiquetaNumResultado.getText();
                EtiquetaNum.setText("0");
                cadenaNum = "";
                operacion = "dividir";
                comprobacion = false;
                botonComa.setEnabled(true);
            }
        }catch(NumberFormatException error){
            JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
            cleanEveryThing();
        }
        comprobacionDoblefuncion = true;
    }//GEN-LAST:event_botonDividirActionPerformed

    private void botonPotenciacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPotenciacionActionPerformed
        if(cadenaNum.equals("")){
            cadenaNum = "0";
        }
        if(comprobacionDoblefuncion==true){
            if(cadenaNum.equals("")){
                cadenaNum = "0";
            }
            numero2 = Double.parseDouble(cadenaNum);
            resultado = Math.pow(numero1, numero2);
            numero1 = resultado;
            EtiquetaNumResultado.setText(String.format("%.2f", resultado)+" ^ ");
            EtiquetaNum.setText("0");
            cadenaNum = "";
        }
        else{
            numero1 = Double.parseDouble(cadenaNum);
            EtiquetaNumResultado.setText(String.format("%.2f", numero1)+" ^ ");
            cadenaNum2 = EtiquetaNumResultado.getText();
            EtiquetaNum.setText("0");
            cadenaNum = "";
            operacion = "potenciacion";
            comprobacion = false;
            botonComa.setEnabled(true);
        }
        comprobacionDoblefuncion = true;
    }//GEN-LAST:event_botonPotenciacionActionPerformed

    private void botonCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCleanActionPerformed
        cleanEveryThing();
    }//GEN-LAST:event_botonCleanActionPerformed

    private void botonRaizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizActionPerformed
        if(cadenaNum.equals("")){
            cadenaNum = "0";
        }
        if(cadenaNum.charAt(0) == '-'){
            JOptionPane.showMessageDialog(null, "Esta calculadora aun no es capaz de hacer numeros imaginarios, sorry :p");
            cadenaNum = cadenaNum2 = "";
            numero1 = numero2 = 0;
            EtiquetaNum.setText("0");
            EtiquetaNumResultado.setText("");
            comprobacion = false;
            botonComa.setEnabled(true);
        }
        else{
            numero1 = Math.sqrt(Double.parseDouble(cadenaNum));
            EtiquetaNumResultado.setText("sqrt("+String.format("%.2f", numero1)+")");
            cadenaNum2 = EtiquetaNumResultado.getText();
            EtiquetaNum.setText(String.format("%.2f", numero1));
            cadenaNum = String.format("%.2f", numero1);
            comprobacion = false;
            botonComa.setEnabled(true);
        }

    }//GEN-LAST:event_botonRaizActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed

        if(operacion.equals("nula")){
            if(cadenaNum.equals("")){
                cadenaNum = "0";
            }
            EtiquetaNumResultado.setText(cadenaNum);
            EtiquetaNum.setText(cadenaNum);
        }
        else if(operacion.equals("suma")){
            if(cadenaNum.equals("")){
                cadenaNum = "0";
            }
            numero2 = Double.parseDouble(cadenaNum);
            resultado = numero1 + numero2;
            EtiquetaNumResultado.setText(String.format("%.2f", numero1) +" + "+String.format("%.2f", numero2));
            EtiquetaNum.setText(String.format("%.2f",resultado));
            cadenaNum = String.valueOf(resultado);
        }
        else if(operacion.equals("resta")){
            if(cadenaNum.equals("")){
                cadenaNum = "0";
            }
            numero2 = Double.parseDouble(cadenaNum);
            resultado = numero1 - numero2;
            EtiquetaNumResultado.setText(String.format("%.2f", numero1) +" - "+String.format("%.2f", numero2));
            EtiquetaNum.setText(String.format("%.2f",resultado));
            cadenaNum = String.valueOf(resultado);
        }
        else if(operacion.equals("multiplicar")){
            if(cadenaNum.equals("")){
                cadenaNum = "0";
            }
            numero2 = Double.parseDouble(cadenaNum);
            resultado = numero1 * numero2;
            EtiquetaNumResultado.setText(String.format("%.2f", numero1) +" * "+String.format("%.2f", numero2));
            EtiquetaNum.setText(String.format("%.2f",resultado));
            cadenaNum = String.valueOf(resultado);
        }
        else if(operacion.equals("dividir")){
            if(cadenaNum.equals("")){
                cadenaNum = "0";
            }
            if(cadenaNum == "0"){
                cleanEveryThing();
                JOptionPane.showMessageDialog(null, "No se puede dividir entre cero");
            }
            else{
                numero2 = Double.parseDouble(cadenaNum);
                resultado = numero1 / numero2;
                EtiquetaNumResultado.setText(String.format("%.2f", numero1) +" / "+String.format("%.2f", numero2));
                EtiquetaNum.setText(String.format("%.2f",resultado));
                cadenaNum = String.valueOf(resultado);
            }

        }
        else if(operacion.equals("potenciacion")){
            if(cadenaNum.equals("")){
                cadenaNum = "0";
            }
            numero2 = Double.parseDouble(cadenaNum);
            resultado = Math.pow(numero1, numero2);
            EtiquetaNumResultado.setText(String.format("%.2f", numero1) +" ^ "+String.format("%.2f", numero2));
            EtiquetaNum.setText(String.format("%.2f",resultado));
            cadenaNum = String.valueOf(resultado);
        }
        operacion = "null";
        comprobacionDoblefuncion = false;
        comprobacion = true;
        botonComa.setEnabled(false);
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicarActionPerformed
        if(cadenaNum.equals("")){
            cadenaNum = "0";
        }
        if(comprobacionDoblefuncion==true){
            if(cadenaNum.equals("")){
                cadenaNum = "0";
            }
            numero2 = Double.parseDouble(cadenaNum);
            resultado = numero1 * numero2;
            numero1 = resultado;
            EtiquetaNumResultado.setText(String.format("%.2f", resultado)+" * ");
            EtiquetaNum.setText("0");
            cadenaNum = "";

        }
        else{
            numero1 = Double.parseDouble(cadenaNum);
            EtiquetaNumResultado.setText(String.format("%.2f", numero1)+" * ");
            cadenaNum2 = EtiquetaNumResultado.getText();
            EtiquetaNum.setText("0");
            cadenaNum = "";
            operacion = "multiplicar";
            comprobacion = false;
            botonComa.setEnabled(true);
        }
        comprobacionDoblefuncion = true;
    }//GEN-LAST:event_botonMultiplicarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int tamaño = cadenaNum.length();
        if(tamaño <= 1){
            cleanEveryThing();
        }
        else if(cadenaNum.charAt(tamaño-1) == '.'){
            cadenaNum = cadenaNum.substring(0, cadenaNum.length()-1);
            EtiquetaNum.setText(cadenaNum);
            botonComa.setEnabled(true);
        }
        else{
            cadenaNum = cadenaNum.substring(0, cadenaNum.length()-1);
            EtiquetaNum.setText(cadenaNum);
        }
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCeroActionPerformed
        if(cadenaNum != ""){
            if(comprobacion == false){
                cadenaNum = cadenaNum + "0";
                EtiquetaNum.setText(cadenaNum);
            }
            else{
                cadenaNum = cadenaNum2 = "";
                numero1 = numero2 = 0;
                EtiquetaNum.setText("0");
                EtiquetaNumResultado.setText("");
                botonComa.setEnabled(true);
                cadenaNum = cadenaNum + "0";
                EtiquetaNum.setText(cadenaNum);
                comprobacion = false;
            }
        }
    }//GEN-LAST:event_botonCeroActionPerformed

    private void botonComaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonComaActionPerformed
        if(comprobacion == false){
            cadenaNum = cadenaNum + ".";
            EtiquetaNum.setText(cadenaNum);
        }
        else{
            cadenaNum = cadenaNum2 = "";
            numero1 = numero2 = 0;
            EtiquetaNum.setText("0");
            EtiquetaNumResultado.setText("");
            botonComa.setEnabled(true);
            cadenaNum = cadenaNum + ".";
            EtiquetaNum.setText(cadenaNum);
            comprobacion = false;
        }
        botonComa.setEnabled(false);
    }//GEN-LAST:event_botonComaActionPerformed

    private void botonOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOchoActionPerformed
        if(comprobacion == false){
            cadenaNum = cadenaNum + "8";
            EtiquetaNum.setText(cadenaNum);
        }
        else{
            cadenaNum = cadenaNum2 = "";
            numero1 = numero2 = 0;
            EtiquetaNum.setText("0");
            EtiquetaNumResultado.setText("");
            botonComa.setEnabled(true);
            cadenaNum = cadenaNum + "8";
            EtiquetaNum.setText(cadenaNum);
            comprobacion = false;
        }
    }//GEN-LAST:event_botonOchoActionPerformed

    private void botonSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSieteActionPerformed
        if(comprobacion == false){
            cadenaNum = cadenaNum + "7";
            EtiquetaNum.setText(cadenaNum);
        }
        else{
            cadenaNum = cadenaNum2 = "";
            numero1 = numero2 = 0;
            EtiquetaNum.setText("0");
            EtiquetaNumResultado.setText("");
            botonComa.setEnabled(true);
            cadenaNum = cadenaNum + "7";
            EtiquetaNum.setText(cadenaNum);
            comprobacion = false;
        }
    }//GEN-LAST:event_botonSieteActionPerformed

    private void botonSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeisActionPerformed
        if(comprobacion == false){
            cadenaNum = cadenaNum + "6";
            EtiquetaNum.setText(cadenaNum);
        }
        else{
            cadenaNum = cadenaNum2 = "";
            numero1 = numero2 = 0;
            EtiquetaNum.setText("0");
            EtiquetaNumResultado.setText("");
            botonComa.setEnabled(true);
            cadenaNum = cadenaNum + "6";
            EtiquetaNum.setText(cadenaNum);
            comprobacion = false;
        }
    }//GEN-LAST:event_botonSeisActionPerformed

    private void botonCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCincoActionPerformed
        if(comprobacion == false){
            cadenaNum = cadenaNum + "5";
            EtiquetaNum.setText(cadenaNum);
        }
        else{
            cadenaNum = cadenaNum2 = "";
            numero1 = numero2 = 0;
            EtiquetaNum.setText("0");
            EtiquetaNumResultado.setText("");
            botonComa.setEnabled(true);
            cadenaNum = cadenaNum + "5";
            EtiquetaNum.setText(cadenaNum);
            comprobacion = false;
        }
    }//GEN-LAST:event_botonCincoActionPerformed

    private void botonCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuatroActionPerformed
        if(comprobacion == false){
            cadenaNum = cadenaNum + "4";
            EtiquetaNum.setText(cadenaNum);
        }
        else{
            cadenaNum = cadenaNum2 = "";
            numero1 = numero2 = 0;
            EtiquetaNum.setText("0");
            EtiquetaNumResultado.setText("");
            botonComa.setEnabled(true);
            cadenaNum = cadenaNum + "4";
            EtiquetaNum.setText(cadenaNum);
            comprobacion = false;
        }
    }//GEN-LAST:event_botonCuatroActionPerformed

    private void botonTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTresActionPerformed
        if(comprobacion == false){
            cadenaNum = cadenaNum + "3";
            EtiquetaNum.setText(cadenaNum);
        }
        else{
            cadenaNum = cadenaNum2 = "";
            numero1 = numero2 = 0;
            EtiquetaNum.setText("0");
            EtiquetaNumResultado.setText("");
            botonComa.setEnabled(true);
            cadenaNum = cadenaNum + "3";
            EtiquetaNum.setText(cadenaNum);
            comprobacion = false;
        }
    }//GEN-LAST:event_botonTresActionPerformed

    private void botonDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDosActionPerformed
        if(comprobacion == false){
            cadenaNum = cadenaNum + "2";
            EtiquetaNum.setText(cadenaNum);
        }
        else{
            cadenaNum = cadenaNum2 = "";
            numero1 = numero2 = 0;
            EtiquetaNum.setText("0");
            EtiquetaNumResultado.setText("");
            botonComa.setEnabled(true);
            cadenaNum = cadenaNum + "2";
            EtiquetaNum.setText(cadenaNum);
            comprobacion = false;
        }
    }//GEN-LAST:event_botonDosActionPerformed

    private void botonUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnoActionPerformed
        if((comprobacion == false)){
            cadenaNum = cadenaNum + "1";
        }
        else{
            cadenaNum = cadenaNum2 = "";
            numero1 = numero2 = 0;
            EtiquetaNum.setText("0");
            EtiquetaNumResultado.setText("");
            botonComa.setEnabled(true);
            cadenaNum = cadenaNum + "1";
            comprobacion = false;
        }
        EtiquetaNum.setText(cadenaNum);
    }//GEN-LAST:event_botonUnoActionPerformed

    private void DivisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivisasActionPerformed
        Divisas d1 = new Divisas();
        d1.setVisible(true);
        dispose();
    }//GEN-LAST:event_DivisasActionPerformed

    private void CalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculadoraActionPerformed
        JOptionPane.showMessageDialog(null, "Ya estas en calculadora.");
    }//GEN-LAST:event_CalculadoraActionPerformed

    private void JMenuAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuAyudaActionPerformed
    }//GEN-LAST:event_JMenuAyudaActionPerformed

    private void JMenuMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuMenuActionPerformed
        
    }//GEN-LAST:event_JMenuMenuActionPerformed

    private void CreadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreadorActionPerformed
        JOptionPane.showMessageDialog(null, "Programa hecho por BPV.");
    }//GEN-LAST:event_CreadorActionPerformed

    private void ContactoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContactoActionPerformed
        JOptionPane.showMessageDialog(null, "Correo: andrewpabuence@gmail.com\nCelular: +57 304-3003002");
    }//GEN-LAST:event_ContactoActionPerformed

    private void cleanEveryThing(){
        cadenaNum = cadenaNum2 = "";
        numero1 = numero2 = 0;
        EtiquetaNum.setText("0");
        EtiquetaNumResultado.setText("");
        comprobacion = false;
        botonComa.setEnabled(true);
    }
    
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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Calculadora;
    private javax.swing.JMenuItem Contacto;
    private javax.swing.JMenuItem Creador;
    private javax.swing.JMenuItem Divisas;
    private javax.swing.JLabel EtiquetaNum;
    private javax.swing.JLabel EtiquetaNumResultado;
    private javax.swing.JMenu JMenuAyuda;
    private javax.swing.JMenu JMenuMenu;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonCero;
    private javax.swing.JButton botonCinco;
    private javax.swing.JButton botonClean;
    private javax.swing.JButton botonComa;
    private javax.swing.JButton botonCuatro;
    private javax.swing.JButton botonDividir;
    private javax.swing.JButton botonDos;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMasoMenos;
    private javax.swing.JButton botonMultiplicar;
    private javax.swing.JButton botonNueve1;
    private javax.swing.JButton botonOcho;
    private javax.swing.JButton botonPotenciacion;
    private javax.swing.JButton botonRaiz;
    private javax.swing.JButton botonRestar;
    private javax.swing.JButton botonSeis;
    private javax.swing.JButton botonSiete;
    private javax.swing.JButton botonSumar;
    private javax.swing.JButton botonTres;
    private javax.swing.JButton botonUno;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
