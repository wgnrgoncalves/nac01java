/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.nac01.java.mensageiro.abstrato;

import br.com.fiap.nac01.java.mensageiro.estrutura.IMensagem;
import br.com.fiap.nac01.java.mensageiro.estrutura.IUsuario;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author wagner
 */
public class AbstractMensagemImpl implements IMensagem{
    
    private String texto;
    private AbstractUsuarioImpl usuario;
    private Calendar calendar;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private String remetente;
    
    public AbstractMensagemImpl(String texto, AbstractUsuarioImpl usuario, Calendar calendar){
        
        this.texto = texto;
        this.usuario = usuario;
        this.calendar = calendar;
    }

    

    @Override
    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String getTexto() {
        return this.texto;
    }

    @Override
    public void setDestinario(IUsuario usuario) {
        this.usuario = (AbstractUsuarioImpl)usuario;
    }
    public void setDestinario(AbstractUsuarioImpl usuario){
        this.usuario = usuario;
    }

    @Override
    public IUsuario getDestinatario() {
        return this.usuario;
    }

    @Override
    public Calendar getDataHora() {
        return this.calendar;
    }
    @Override
    public void setRemetente(String remetente){
        this.remetente = remetente;
    }
    @Override
    public String getRemetente(){
        return this.remetente;
    }
    
    @Override
    public String toString(){
        return sdf.format(this.calendar.getTime()) + " Mensagem: " + this.texto + "\r\nEnviado pelo usuário: " + this.remetente;
    }
}
