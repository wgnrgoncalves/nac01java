/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.nac01.java.app;
import br.com.fiap.nac01.java.SendMensagem.BancoMensagem;
import br.com.fiap.nac01.java.SendMensagem.Mensagem;
import br.com.fiap.nac01.java.SendMensagem.Usuario;
import br.com.fiap.nac01.java.mensageiro.estrutura.IBancoMensagem;
import br.com.fiap.nac01.java.mensageiro.estrutura.IMensagem;
import br.com.fiap.nac01.java.mensageiro.estrutura.Sexo;
import java.util.Calendar;
import java.util.List;
/**
 *
 * @author wagner
 */
public class aplicativo {
    public static void main(String[] args){
        //depois verificar
        Calendar calendar = Calendar.getInstance();
        IBancoMensagem bancoMensagem = new BancoMensagem();
        
        calendar.set(1980, Calendar.OCTOBER, 23);        
        Usuario usuario1 = new Usuario("Fulando dos Santos", Sexo.F, calendar, "(11) 95233-2342");
        System.out.println("Adicinou um usuario. Inf: " + usuario1.toString());
        
        calendar.set(1985, Calendar.JANUARY, 5);
        Usuario usuario2 = new Usuario("Cicrano de Souza", Sexo.M, calendar, "(11) 94231-4231");
        System.out.println("Adicinou um usuario. Inf: " + usuario2.toString());
        
        calendar.set(1987, Calendar.FEBRUARY, 22);
        Usuario usuario3 = new Usuario("Teste da Silva", Sexo.M, calendar, "(11) 94990-4231");        
        System.out.println("Adicinou um usuario. Inf: " + usuario3.toString());
        
        //usuario3 da boa noite para o usuario 2, usuario 2 responde para o usuario 3, usuario 3 da tchau para usuario 2
        
        bancoMensagem.adicionaMenagem(usuario3, new Mensagem("Boa noite! Tudo Bem?", usuario2, Calendar.getInstance()));
        bancoMensagem.adicionaMenagem(usuario2, new Mensagem("Boa noite! Tudo bem", usuario3, Calendar.getInstance()));
        bancoMensagem.adicionaMenagem(usuario3, new Mensagem("Então tchau!", usuario1, Calendar.getInstance()));
        
        //Usuario3 chama o usuario1 
        bancoMensagem.adicionaMenagem(usuario3, new Mensagem("E ae blz?", usuario1, Calendar.getInstance()));
        bancoMensagem.adicionaMenagem(usuario1, new Mensagem("Jóia", usuario3, Calendar.getInstance()));
        bancoMensagem.adicionaMenagem(usuario3, new Mensagem("Então blz!", usuario1, Calendar.getInstance()));
        
        //Usuario 2 chama usuario1
        bancoMensagem.adicionaMenagem(usuario2, new Mensagem("Oi tudo bem?", usuario1, Calendar.getInstance()));
        bancoMensagem.adicionaMenagem(usuario1, new Mensagem("Tudo e vocẽ", usuario2, Calendar.getInstance()));
        bancoMensagem.adicionaMenagem(usuario2, new Mensagem("Acho que o Fulano esta carente!", usuario1, Calendar.getInstance()));
        
        
        System.out.println();
        System.out.println("Procurando o usuário por telefone: (11) 94231-4231");
        Usuario usuarioTmp = (Usuario)bancoMensagem.recuperarUsuarioPorTelefone("(11) 94231-4231");
        if(usuarioTmp != null){
            System.out.println("Achou o usuario: " + usuarioTmp);
        }else{
            System.out.println("Não achou o usuário");
        }
        System.out.println();
        
        System.out.println("Listando mensagens recebidas do usuario: 1");
        List<IMensagem> msg = bancoMensagem.mensagensRecebidas(1);
        
        for (IMensagem iMensagem : msg) {
            System.out.println(iMensagem);
            System.out.println();
        }
        
        
        
    }
    
}
