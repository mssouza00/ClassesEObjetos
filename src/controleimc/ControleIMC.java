/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleimc;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Priscila
 */
public class ControleIMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        Scanner tc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome=tc.next();
        
        System.out.println("Digite sua idade");
        int idade= tc.nextInt();
        System.out.println("Digite sua altura ");
        float altura= tc.nextFloat();
        
        
        System.out.println("Digite seu peso");
        float peso=tc.nextFloat(),imc,faixa;

        Pessoa ControleDeIMC = new Pessoa(nome, idade, altura, peso);
        
        
        ControleDeIMC.IMC(peso, altura);
        
        
        
        
        
        DecimalFormat df =new DecimalFormat("0.00");
        System.out.println("Nome: "+ControleDeIMC.getNome()+" Idade: "+ControleDeIMC.getIdade()+" Seu IMC é: "+df.format(ControleDeIMC.getImc()) +" Voce esta na categoria"+ControleDeIMC.faixaIMC());
        
        
        
    }
    
}
