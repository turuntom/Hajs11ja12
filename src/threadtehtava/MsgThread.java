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
    
    private static AtomicInteger luku;
    private static int count;
    
    public MsgThread(int viive, String msg){
        this.viive = viive;
        this.msg = msg;
        if(luku == null){
            luku = new AtomicInteger();
            luku.set(0);
        }
        
        
    }
    
    public void run(){
        
        while(luku.get() < 100){
            try{
                Thread.sleep(viive * 1000);
            }catch(Exception e){
                System.out.println("ERROR: "+e);
            }
            int x = luku.incrementAndGet();
            if(x > 100){
                break;
            }
            System.out.println("Kirjoitusvuoro "+x+". Viesti: "+msg);
        }
    }    
}
