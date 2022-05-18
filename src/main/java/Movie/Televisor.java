/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Movie;

/**
 *
 * @author gabriel
 */
public class Televisor {
    String marca;

    public Televisor(String marca) {
        this.marca = marca;
    }  
    
    
    public void ligar(){
        System.out.println("a tv " + marca + " foi ligada");
    }
    
    public void desligar(){
        System.out.println("a tv " + marca + " foi desligada");
    }
}

