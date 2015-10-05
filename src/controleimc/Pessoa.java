/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleimc;

/**
 *
 * @author Priscila
 */
public class Pessoa {
    
    private String nome;
    private int idade;
    private float altura,peso,imc;

    public Pessoa(String nome, int idade, float altura, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getImc() {
        return imc;
    }
    
    public void IMC(float peso, float  altura){
    imc= peso/(altura*altura);
    }
    
    
    public String faixaIMC(){
        String categoria=null;
        if (imc<18.5) {
            categoria =(" Abaixo do peso");
        }
        else if (imc>=18.5 &&imc<25){
            categoria =(" Peso ideal");
        }
        else if(imc >=25 && imc<30){
            categoria =(" sobrepeso");
        }
        else if (imc>=30&&imc<35){
            categoria =(" Obesidade grau I");
        }
        else if (imc>=35&&imc<40){
            categoria =(" Obesidade grau II");
        }
        else if (imc>=40){System.out.println(" Obesidade grau III");}
        return categoria;
}

    
}
