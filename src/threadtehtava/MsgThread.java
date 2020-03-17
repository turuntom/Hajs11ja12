/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadtehtava;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Tomi
 */
public class MsgThread extends Thread{
    
    private int viive;
    private String msg;
    
    private static int k;
    
    public static AtomicInteger luku;
    
    public MsgThread(int viive, String msg, int k){
        this.viive = viive;
        this.msg = msg;
        if(luku == null){
            luku = new AtomicInteger();
            luku.set(0);
        }
        if(k > this.k){
            this.k = k;
        }
        
    }
    
    public void run(){
        
        while(true){
            try{
                Thread.sleep(viive * 1000);
            }catch(Exception e){
                System.out.println("ERROR: "+e);
            }
            int x = luku.incrementAndGet();
            //tehtävä 11 pysäytys
            if(x > 100){
                break;
            }
            //tehtävä 12 pysäytys
            if(x > k/2){
                break;
            }
            
            System.out.println("Kirjoitusvuoro "+x+". Viesti: "+msg);
        }
    }    
}
