/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author hp
 */
public class Peliculas implements Comparable<Peliculas>  {
    
  private String nombre; 
  private String director;
  private int  año; 
  private String reseña;
  private int valor;
//constructor de la clase producto

public Peliculas(String s,String t, String u, int v, int i) { 
nombre = s; 
director = t;
año = v; 
reseña = u;
valor = i;
}

@Override
    public int compareTo(Peliculas o )
    {
        if (año < o.año) {
                    return -1;
                }
                if (año > o.año) {
                    return 1;
                }

        return 0;
    }
   
  @Override 
  public String toString(){ 
return ("Nombre Pelicula: "+nombre+"\nReseña: "+reseña+ "\nDirector: "+director+"\nAño de estreno:"+año+"\nvalor de entrada: "+valor+ " USD"); 
} 

//métodos de encapsulamiento
public String getNombre() { 
return this.nombre; 
} 
public String getDirector() { 
return this.director; 
} 
public int getAño() { 
return this.año ;
} 
public String getReseña() { 
return this.reseña; 
} 
public int getValor() { 
return this.valor; 
} 

    
}
