/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.nac01.java.SendMensagem;

import br.com.fiap.nac01.java.mensageiro.abstrato.AbstractMensagemImpl;
import br.com.fiap.nac01.java.mensageiro.abstrato.AbstractUsuarioImpl;
import java.util.Calendar;

/**
 *
 * @author wagner
 */
public class Mensagem extends AbstractMensagemImpl{
    
    public Mensagem(String texto, AbstractUsuarioImpl usuario, Calendar calendar) {
        super(texto, usuario, calendar);
    }
    
}
