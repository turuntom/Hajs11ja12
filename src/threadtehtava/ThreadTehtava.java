/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtehtava;

import java.util.Random;

/**
 *
 * @author Tomi
 */
public class ThreadTehtava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random rng = new Random();
        
        
        
        MsgThread lanka1 = new MsgThread(rng.nextInt(10), "Tidii lanka1 tässä terve");
        MsgThread lanka2 = new MsgThread(rng.nextInt(10), "Haloo haloo lanka 2 täällä");
        MsgThread lanka3 = new MsgThread(rng.nextInt(10), "Jou jou yeah lanka 3 kuittaa");
        MsgThread lanka4 = new MsgThread(rng.nextInt(10), "Jee jee gg lanka 4 olen");
        MsgThread lanka5 = new MsgThread(rng.nextInt(10), "lanka 5 liittyy keskusteluun");
        MsgThread lanka6 = new MsgThread(rng.nextInt(10), "olen lanka 6 hey hey");
        
        lanka1.start();
        lanka2.start();
        lanka3.start();
        lanka4.start();
        lanka5.start();
        lanka6.start();
        
    }
    
}
