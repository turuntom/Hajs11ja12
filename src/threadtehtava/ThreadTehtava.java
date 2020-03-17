/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtehtava;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Tomi
 */
public class ThreadTehtava {
    
    static Random rng = new Random();
    static ArrayList<Thread> lista = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int k = 6;
        luoSaikeet(k);
        
        //Tehtävä 12 säikeiden pysäytys
        while(true){
            if(MsgThread.luku.get() >= k/2){
                for(Thread lanka : lista){
                    lanka.interrupt();
                }
                break;
            }
        }
    }
    
    private static void luoSaikeet(int k){
        rng = new Random();
        for (int i = 0; i < k; i++) {
            MsgThread lanka = new MsgThread(rng.nextInt(10), "Tidii lanka " +(i+1)+"#*#" +(i+1)+"#*#" +(i+1)+"#*#" +(i+1)+"#*#" + " tässä terve",k);
            lista.add(lanka);
            lanka.start();
        }
    }
}
