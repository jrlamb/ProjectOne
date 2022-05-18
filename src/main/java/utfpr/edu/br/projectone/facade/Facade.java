/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utfpr.edu.br.projectone.facade;

import Movie.Hometheater;
import Movie.Luz;
import Movie.Pipoca;
import Movie.Player;
import Movie.Televisor;

/**
 *
 * @author lamb
 */
public class Facade {
    private Televisor televisor;
    private Pipoca pipoca;
    private Player player;
    private Luz luz;
    private Hometheater hometheater;

    public Facade() {
        televisor = new Televisor("Samsung");
        pipoca = new Pipoca();
        player = new Player();
        luz = new Luz();
        hometheater = new Hometheater();
    }
    
    public void assistirFilme(){
        luz.diminuirIntensidade();
        pipoca.estourar();
        televisor.ligar();
        hometheater.aumentarVolume();
        player.insert();
        player.play();
    }
    
    public void pararFilme(){
        luz.aumentarIntensidade();        
        hometheater.diminuirVolume();
        player.stop();
        player.eject();
        televisor.desligar();
    }
    
    
}
