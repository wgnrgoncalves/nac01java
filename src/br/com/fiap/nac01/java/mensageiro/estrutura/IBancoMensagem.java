/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.nac01.java.mensageiro.estrutura;

import java.util.List;

/**
 *
 * @author wagner
 */
public interface IBancoMensagem {
    
    void adicionaMenagem(IUsuario usuario, IMensagem mensagem);
    IUsuario recuperarUsuarioPorTelefone(String telefone);
    List<IMensagem> mensagensRecebidas(int id);
    
}
