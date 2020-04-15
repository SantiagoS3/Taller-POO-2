/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author hp
 */
public class Inicio{

    /**
     * @param args the command line arguments
     */  
    public static void main(String[] args) {
        
        
       
        Peliculas Sonic  = new Peliculas("Sonic", "Jeff Fowler", "Sonic es una de las figuras más reconocidas del mundo de los videojuegos, "
                + "justo al lado de Mario con quien compartió una enemistad que terminó en cierta familiaridad amistosa que les aseguró encontrarse "
                + "cada 4 años a competir en deportes.\n" +"La llegada de un personaje así tendría a más de uno a la expectativa respecto a su"
                + " primera aparición en la pantalla grande y, a decir verdad, no fue decepcionante.", 2020, 5);
        
        Peliculas RyF = new Peliculas ("Rapidos y Furiosos 3 Reto Tokio","Justin Lin"," Esta nueva historia, nos cuentan como Sean Boswell (Lucas Black), el típico "
                + "chico estadounidense problemático, es detenido por haber participado en una carrera clandestina y para que no lo metan en la cárcel es "
                + "mandado a Tokio a vivir con su padre Mr. Boswell (Brian Goodman), ahí vuelve a juntarse con corredores clandestinos, metiéndose nuevamente"
                + " en problemas, pero ahora con la mafia japonesa ",2006, 6);
        
        Peliculas Elhoyo = new Peliculas ("El Hoyo","Galder Gaztelu-Urrutia"," En el futuro, los prisioneros se alojan en celdas verticales, observando cómo los "
                + "presos de las celdas superiores son alimentados mientras los de abajo mueren de hambre. Una jungla de supervivencia donde solo hay tres tipos "
                + "de personas: los que están arriba, los que están abajo y los que deciden saltar, incapaces de soportar esa agonía por más tiempo. ",2019, 6);
        
        Peliculas Lapurga = new Peliculas ("La Purga","James DeMonaco"," La purga solo tiene dos reglas: la primera es que durante esta, los funcionarios del gobierno "
                + "de \"rango 10\" o superior poseen total inmunidad. La segunda, es que el uso de las armas por encima de \"Clase 4\" (por ejemplo, armas de destrucción "
                + "masiva) están prohibidas, lo que significa que los dispositivos destructivos y materiales explosivos están excluidos de La Purga. Cualquier persona que"
                + " no siga las reglas de la purga será ejecutado. ",2013, 8);
        
        Peliculas Eltirador = new Peliculas ("El tirador","Antoine Fuqua"," El francotirador Bob Lee Swagger abandona el Ejército después de una misión fallida. Presionado a"
                + " regresar al servicio militar, lo traicionan de nuevo. Ahora, herido y convertido en el objetivo de una cacería masiva, Swagger planea vengarse de algunos "
                + "de los individuos más poderosos de la nación. ",2007, 5);
        
        
        ArrayList lista  = new ArrayList();
        
        lista.add(Sonic);
        lista.add(RyF);
        lista.add(Elhoyo);
        lista.add(Lapurga);
        lista.add(Eltirador);

        Collections.sort(lista);

        Iterator it = lista.iterator();
        //verifica si existe otro elemento con el método hasNext()
        while ( it.hasNext() ) { 
        Object objeto = it.next(); 
        Peliculas pelis = (Peliculas)objeto; 
        System.out.println(pelis); 
        } 
        
        Interface = new Interface();
        
    }

}  
