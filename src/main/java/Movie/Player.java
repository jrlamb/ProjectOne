/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Movie;

/**
 *
 * @author gabriel
 */
public class Player {
    String filme;
    
    public void play(){
        System.out.println("Iniciou o filme: "+ filme +);
    }
    
    public void stop(){
        System.out.println("Pausou o filme: "+ filme +);
    }
    
    public void insert(){
        System.out.println("Inseriu o filme: "+ filme +);
    }
    
    public void eject(){
        System.out.println("Ejetou o filme: "+ filme +);
    }
}

