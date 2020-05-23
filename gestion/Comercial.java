package gestion;

import java.util.ArrayList;


public class Comercial extends Persona{
  ArrayList<Articulo> articulos = new ArrayList<>();
  ArrayList<Cliente> clientes = new ArrayList<>();
  private String cargo;

  public Comercial(String nom, String corr, String car) {
	super(nom, corr);
    this.cargo = car;
  }
  
  public String toString() {
    String cadena = "";
    cadena += "\nNombre: " + this.nombre;
    cadena += "\nCorreo: " + this.correo;
    cadena += "\nCargo: " + this.cargo;
    cadena += "\n==============================";
    return cadena;
  }
  
  public void vendido() {
    String cadena = "";
    cadena += "\nNombre: " + this.nombre;
    cadena += "\nCorreo: " + this.correo;
    cadena += "\nCargo: " + this.cargo;
    cadena += "\nVentas realizadas";
    cadena += "\n==============================";
    for (Articulo aux : articulos) {
      cadena += "\n" + aux;
    }
    System.out.println(cadena); ;
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
  
  
  
/**
 * @return the articulos
 */
  public ArrayList<Articulo> getArticulos() {
	return articulos;
  }

/**
 * @param articulos the articulos to set
 */
  public void setArticulos(ArrayList<Articulo> articulos) {
	this.articulos = articulos;
  }

/**
 * @return the cargo
 */
  public String getCargo() {
	return cargo;
  }

/**
 * @param cargo the cargo to set
 */
  public void setCargo(String cargo) {
 	this.cargo = cargo;
  }

 
  
}
