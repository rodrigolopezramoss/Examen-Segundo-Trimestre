package gestion;

import java.util.Objects;


public class Articulo {
  private String nombre;
  private int cantidad;
  
  public Articulo(String nom, int can) {
	this.nombre = nom;
	this.cantidad = can;
  }

  @Override
  public String toString() {
	return this.nombre + ", cantidad = " + this.cantidad;
  }

/**
 * @return the nombre
 */
  public String getNombre() {
	return nombre;
  }

/**
 * @param nombre the nombre to set
 */
  public void setNombre(String nombre) {
	this.nombre = nombre;
  }

/**
 * @return the cantidad
 */
  public int getCantidad() {
	return cantidad;
  }

/**
 * @param cantidad the cantidad to set
 */
  public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
  }
  
  @Override
  public int hashCode() {
    int hash = 3;
    hash = 59 * hash + Objects.hashCode(this.nombre);
    return hash;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    final Articulo other = (Articulo) obj;
    if (!Objects.equals(this.nombre, other.nombre)) {
      return false;
    }
    return true;
  }

}
