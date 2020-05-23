package gestion;

import java.util.Objects;

public abstract class Persona {
  String nombre;
  String correo;
  
  public Persona(String nom, String corr) {
	this.nombre = nom;
    this.correo = corr;
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
 * @return the correo
 */
  public String getCorreo() {
	return correo;
  }

/**
 * @param correo the correo to set
 */
  public void setCorreo(String correo) {
	this.correo = correo;
  }
  public int hashCode() {
    int hash = 3;
    hash = 59 * hash + Objects.hashCode(this.nombre);
    return hash;
  }
	  
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
    final Persona other = (Persona) obj;
    if (!Objects.equals(this.correo, other.correo)) {
      return false;
    }
    return true;
  }
}
