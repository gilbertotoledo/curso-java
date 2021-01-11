/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula19;

import static java.lang.Thread.sleep;
import javax.swing.JProgressBar;

/**
 *
 * @author Gilberto Toledo
 */
public class minhaBarra extends Thread{
    private JProgressBar barra;

    public minhaBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public void load(){
        start();
    }

    @Override
    public void run() {
        for(int i=0;i<=100;i++){
            barra.setValue(i);

            try {
                sleep(200);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    
    
    
    
}
