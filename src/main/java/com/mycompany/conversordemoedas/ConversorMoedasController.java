/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversordemoedas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Administrador
 */
public class ConversorMoedasController {

    private final ConversorMoedasView view;
    private final ConversorMoedasModel model;

    ConversorMoedasController(ConversorMoedasView view, ConversorMoedasModel model) {
        this.view = view;
        this.model = model;

        this.view.btnConverter.addActionListener((ActionEvent e) -> {
            converterMoeda();
        });
    }

    private void converterMoeda() {
        try {
            String moedaOrigem = view.cbMoedaOrigem.getSelectedItem().toString().split(" ")[0];
            String moedaDestino = view.cbMoedaDestino.getSelectedItem().toString().split(" ")[0];
            double valor = Double.parseDouble(view.tfValor.getText());

            double resultado = model.converter(moedaOrigem, moedaDestino, valor);
            view.lbResultado.setText(String.format("Resultado: %.2f %s", resultado, moedaDestino));

        } catch (NumberFormatException ex) {
            view.lbResultado.setText("Valor inválido.");
        } catch (IllegalArgumentException ex) {
            view.lbResultado.setText(ex.getMessage());
        }

    }

}
