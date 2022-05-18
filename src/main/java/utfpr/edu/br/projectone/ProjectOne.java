/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package utfpr.edu.br.projectone;

import Movie.Televisor;
import utfpr.edu.br.projectone.facade.Facade;

/**
 *
 * @author lamb
 */
public class ProjectOne {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao Facade Pattern");
        
        Facade f = new Facade();
        f.assistirFilme();
        
        System.out.println("\n\nAlguns minutos depois");
        f.pararFilme();
        
    }
}
