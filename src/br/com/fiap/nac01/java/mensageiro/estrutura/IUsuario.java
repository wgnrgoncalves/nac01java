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
public interface IUsuario {
    long getId();
    void setNome(String nome);
    String getNome();
    void setSexo(Sexo sexo);
    Sexo getSexo();
    void setDtNasc(Calendar dtnasc);
    Calendar getDtNasc();
    void setCelular(String celunar);
    String getCelular();
    
    
}
