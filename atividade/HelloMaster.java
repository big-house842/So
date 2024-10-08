package atividade;

import modelo.HelloFromThreads;

public class HelloMaster {
        
    public void letsGetSomeHelloes(){


        Thread[] threads = new Thread[4];

        for(int i = 0; i < 4; i++){
            threads[i] = new Thread(new HelloFromThreads(i));
        }

        for(int i = 0; i < 4; i++){
            threads[i].start();
        }
    
        
    }

}
