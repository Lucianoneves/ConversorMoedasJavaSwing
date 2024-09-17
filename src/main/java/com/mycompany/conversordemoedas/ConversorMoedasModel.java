/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversordemoedas;

import java.util.HashMap;

/**
 *
 * @author Administrador
 */
public class ConversorMoedasModel {
    
    private HashMap<String, Double> taxaDeCambio;
    
     public ConversorMoedasModel() {
        preencherTaxasDeCambio();
    }
     
     
    private void preencherTaxasDeCambio() {
        taxaDeCambio = new HashMap<>();
        // Taxas de câmbio fictícias
        taxaDeCambio.put("BRL-USD", 0.20);
        taxaDeCambio.put("BRL-EUR", 0.18);
        taxaDeCambio.put("USD-BRL", 5.0);
        taxaDeCambio.put("USD-EUR", 0.90);
        taxaDeCambio.put("EUR-BRL", 5.5);
        taxaDeCambio.put("EUR-USD", 1.1);
    
}
    
  public double converter(String moedaOrigem, String moedaDestino, double valor) {
        if (moedaOrigem.equals(moedaDestino)) {
            return valor;
        }
        

 String chaveConversao = moedaOrigem + "-" + moedaDestino;
        Double taxa = taxaDeCambio.get(chaveConversao);

        if (taxa != null) {
            return valor * taxa;
        } else {
            throw new IllegalArgumentException("Taxa de câmbio não encontrada");
        }
    }
}
