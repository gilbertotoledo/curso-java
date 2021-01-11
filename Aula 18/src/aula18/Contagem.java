/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula18;

import java.awt.Cursor;

/**
 *
 * @author Gilberto Toledo
 */
public class Contagem extends Thread {
    private int inicio;
    private int fim;
    private principal frame;

    public Contagem(int inicio, int fim, principal frame) {
        this.inicio = inicio;
        this.fim = fim;
        this.frame = frame;
    }
    
    public void Contar(){
        this.start();
    }

    @Override
    public void run() {
        this.frame.setCursor(new Cursor(Cursor.HAND_CURSOR));
        String resultado = "";
        for(int i= this.inicio; i<= this.fim; i++){
            resultado = i + "\n" + resultado;
            this.frame.setResult(resultado);
        } 
        this.frame.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }
}
