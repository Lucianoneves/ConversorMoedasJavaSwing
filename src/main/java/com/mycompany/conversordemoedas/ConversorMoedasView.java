/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversordemoedas;

import javax.swing.*;
/**
 *
 * @author Administrador
 */
public class ConversorMoedasView extends JFrame {

    public JComboBox<String> cbMoedaOrigem;
    public JComboBox<String> cbMoedaDestino;
    public JTextField tfValor;
    public JLabel lbResultado;
    public JButton btnConverter;
    
       public ConversorMoedasView() {
        initComponents();
    

  

     

        setLayout(null);
                  
                  
        cbMoedaOrigem.setBounds(30, 30, 150, 25);
        cbMoedaDestino.setBounds(200, 30, 150, 25);
        tfValor.setBounds(30, 80, 150, 25);
        lbResultado.setBounds(30, 130, 200, 25);
        btnConverter.setBounds(200, 80, 150, 25);

        add(cbMoedaOrigem);
        add(cbMoedaDestino);
        add(tfValor);
        add(lbResultado);
        add(btnConverter);

        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
       
    }
}

    
    


