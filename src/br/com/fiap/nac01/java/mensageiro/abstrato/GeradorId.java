/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fiap.nac01.java.mensageiro.abstrato;

/**
 *
 * @author wagner
 */
public class GeradorId {
    private static long id = 1;
    public static long nextval(){
        return id++;
    }
    
}
