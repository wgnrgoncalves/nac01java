/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.nac01.java.mensageiro.abstrato;

import br.com.fiap.nac01.java.SendMensagem.Usuario;
import br.com.fiap.nac01.java.mensageiro.estrutura.IBancoMensagem;
import br.com.fiap.nac01.java.mensageiro.estrutura.IMensagem;
import br.com.fiap.nac01.java.mensageiro.estrutura.IUsuario;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wagner
 */
public abstract class AbstractBancoMensagemImpl implements IBancoMensagem {

    Map<AbstractUsuarioImpl, List<AbstractMensagemImpl>> dicionario = new HashMap<AbstractUsuarioImpl, List<AbstractMensagemImpl>>();

    public AbstractBancoMensagemImpl() {
        dicionario = new HashMap<AbstractUsuarioImpl, List<AbstractMensagemImpl>>();

    }

    public void adicionaMenagem(AbstractUsuarioImpl usuario, AbstractMensagemImpl mensagem) {
        adicionaMenagem((IUsuario) usuario, (IMensagem) mensagem);
    }

    @Override
    public void adicionaMenagem(IUsuario usuario, IMensagem mensagem) {
        //ver deposi
        //if(lstUsuarios.contains())
        if (!dicionario.containsKey((AbstractUsuarioImpl) usuario)) {
            dicionario.put((AbstractUsuarioImpl) usuario, new ArrayList<AbstractMensagemImpl>());
        }
        mensagem.setRemetente(usuario.getNome());
        dicionario.get((AbstractUsuarioImpl) usuario).add((AbstractMensagemImpl) mensagem);

    }

    @Override
    public IUsuario recuperarUsuarioPorTelefone(String telefone) {
        IUsuario usu = null;
        Iterator entries = dicionario.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            if (((AbstractUsuarioImpl) entry.getKey()).getCelular().equals(telefone)) {
                usu = (AbstractUsuarioImpl) entry.getKey();
                break;
            }
        }

        return usu;
    }

    @Override
    public List<IMensagem> mensagensRecebidas(int id) {
        List<IMensagem> retorno = new ArrayList<IMensagem>();
        Iterator entries = dicionario.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            AbstractUsuarioImpl u = (AbstractUsuarioImpl)entry.getKey();
            List<AbstractMensagemImpl> msg = dicionario.get(u);
            //List<AbstractMensagemImpl> msg = (List<AbstractMensagemImpl>)entry.getValue();
            
            for (AbstractMensagemImpl abstractMensagemImpl : msg) {
                if(abstractMensagemImpl.getDestinatario().getId() == id){
                    retorno.add(abstractMensagemImpl);
                }
            }
           
        }

        return retorno;

    }

}
