/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.nac01.java.mensageiro.abstrato;

import br.com.fiap.nac01.java.mensageiro.estrutura.IUsuario;
import br.com.fiap.nac01.java.mensageiro.estrutura.Sexo;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class AbstractUsuarioImpl implements IUsuario {

    private long id;
    private String nome;
    private Sexo sexo;
    private Calendar dtnasc;
    private String celular;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public AbstractUsuarioImpl(String nome, Sexo sexo, Calendar dtnasc, String celular) {
        this.id = GeradorId.nextval();
        this.nome = nome;
        this.sexo = sexo;
        this.dtnasc = dtnasc;
        this.celular = celular;
    }

    @Override
    public long getId() {
        return this.id;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public Sexo getSexo() {
        return this.sexo;
    }

    @Override
    public void setDtNasc(Calendar dtnasc) {
        this.dtnasc = dtnasc;
    }

    @Override
    public Calendar getDtNasc() {
        return this.dtnasc;
    }

    @Override
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @Override
    public String getCelular() {
        return this.celular;
    }

    @Override
    public String toString() {
        return "Id: " + this.id 
                + ". Nome: " + this.nome 
                + ". Sexo:" + this.sexo 
                + ". DtNasc: " + sdf.format(this.dtnasc.getTime())
                + ". Celular:" + this.celular + ".";
    }
    
    public int Idade(){
        return 0;
    }
    
    //20A, 10M, 5D
    public String IdadeExtenso(){
        return "";
    }

}
