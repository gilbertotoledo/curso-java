/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula2;

/**
 *
 * @author Gilberto Toledo
 */
public class Cadeira {
    private double altura;
    private double altura_assento;
    private String cor;
    
    public Cadeira(){
        cor = "Marrom";
        altura = 0.50;
        altura_assento = 1.20;
    }
    
    public void serrar(){
        System.out.println("Serrando a madeira...");
    }
    
    public void lixar(){
        System.out.println("Lixando a madeira...");
    }
    
    public void pintar(){
        System.out.println("Pintando a madeira...");
    }
    
    public String getCor(){
        return cor;
    }
    
    public void setCor(String c){
        if(c.equals("Verde") || c.equals("Vermelho"))
            cor = c;
        else
            System.out.println("Não há tinta na cor desejada!");
    }
}
