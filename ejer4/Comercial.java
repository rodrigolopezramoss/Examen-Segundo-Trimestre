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
  

//  public void vende(Articulo art) {
//	  articulos.add(new Articulo(art.getNombre(), art.getCantidad())); 
//  }
  
  public void añadir(Articulo art) {
	articulos.add(new Articulo(art.getNombre(), art.getCantidad()));
  }
  
//  public void vende(Articulo art) {
//	int contador = 0;
//	int can = 0;
//	
//	for (Articulo aux : articulos) {
//	   contador++;
//	}
//	
//	if (contador==0) {
////		articulos.add(new Articulo(art.getNombre(), art.getCantidad()));
//		añadir(art);
//		System.out.println("1");
//	} else if (contador != 0){
//	  for (Articulo aux : articulos) {
//	    can = aux.getCantidad();
//	    if(art.equals(aux)){
//	      aux.setCantidad(can += art.getCantidad());
//	      System.out.println("2.1");
//	    } else {
//// 	      articulos.add(new Articulo(art.getNombre(), art.getCantidad()));
//	   	  System.out.println("2.2");
//	    }
//	  }
//	  
//	} else {
////		articulos.add(new Articulo(art.getNombre(), art.getCantidad()));
//		añadir(art);
//		System.out.println("3");
//	}
//  }
  public void vende(Articulo art) {
	int estado = 0;
	int can = 0;
	int contador = 0;
	
	for (Articulo aux : articulos) {
	  contador++;
	}
	
	if(contador == 0) {
	  estado = 1;
	}
	for (Articulo aux : articulos) {
	  if(art.equals(aux)){
	    estado = 2;    
	  }else {
	    estado = 1;
	  }
	}
	
	switch(estado) {
	  case 1:
	    añadir(art);
	    break;
	  case 2:
	    for (Articulo aux : articulos) {
	      can = aux.getCantidad();
	      if(art.equals(aux)){
	        aux.setCantidad(can += art.getCantidad());
	      }   
	    }
	    break;
	}
	  
	  
	  
	  
	  
  }
}
