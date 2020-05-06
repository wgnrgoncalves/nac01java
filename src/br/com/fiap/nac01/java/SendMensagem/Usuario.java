/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.nac01.java.SendMensagem;

import br.com.fiap.nac01.java.mensageiro.abstrato.AbstractUsuarioImpl;
import br.com.fiap.nac01.java.mensageiro.estrutura.Sexo;
import java.util.Calendar;

/**
 *
 * @author wagner
 */
public class Usuario extends AbstractUsuarioImpl{
    
    public Usuario(String nome, Sexo sexo, Calendar dtnasc, String celular) {
        super(nome, sexo, dtnasc, celular);
    }
    
}
