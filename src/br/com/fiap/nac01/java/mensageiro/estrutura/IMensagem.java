/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.nac01.java.mensageiro.estrutura;

import java.util.Calendar;

/**
 *
 * @author wagner
 */
public interface IMensagem {
    void setTexto(String texto);
    String getTexto();
    void setDestinario(IUsuario usuario);
    IUsuario getDestinatario();
    Calendar getDataHora();
    void setRemetente(String remetente);
    String getRemetente();
    
}
