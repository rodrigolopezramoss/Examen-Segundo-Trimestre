package ejer4;

import java.util.ArrayList;

public class Comercial extends Persona{
  ArrayList<Articulo> articulos = new ArrayList<>();
  private String cargo;

  public Comercial(String nom, String corr, String car) {
	super(nom, corr);
    this.cargo = car;
  }
  
  public String toString() {
    String cadena = "";
    cadena += "\nNombre: " + this.nombre;
    cadena += "\nDescripción: " + this.correo;
    cadena += "\nPrecio de compra: " + this.cargo;
    cadena += "\nVentas realizadas";
    cadena += "\n==============================";
    for (Articulo aux : articulos) {
      cadena += "\n" + aux;
    }
    return cadena;
  }
  
  public void vende(Articulo art) {
	if(articulos.contains(art)) {
	  int i = articulos.indexOf(art);
	  
	  Articulo viejo = articulos.get(i);
	  Articulo aux= new Articulo(viejo.getNombre(),viejo.getCantidad()+ art.getCantidad());
	  articulos.set(i,aux);
	}else {
	  articulos.add(art);
	}  

  }
}
