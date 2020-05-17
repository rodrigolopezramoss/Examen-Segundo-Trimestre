package gestion;

import java.util.Objects;

public class Empresa implements Cliente{
  private String CIF;
  private String nombre;
  private String telef;
  
  public Empresa(String cod, String nom, String tel) {
	this.CIF = cod;
    this.nombre = nom;
    this.telef = tel;
  }
  
  public String toString() {
    String cadena = "";
    cadena += "\nNombre: " + this.nombre;
    cadena += "\nCIF: " + this.CIF;
    cadena += "\nTeléfono: " + this.telef;
    cadena += "\n==============================";
    return cadena;
  }
  
  
  
  /**
 * @return the cIF
 */
public String getCIF() {
	return CIF;
}

/**
 * @param cIF the cIF to set
 */
public void setCIF(String cIF) {
	CIF = cIF;
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
 * @return the telef
 */
public String getTelef() {
	return telef;
}

/**
 * @param telef the telef to set
 */
public void setTelef(String telef) {
	this.telef = telef;
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
    final Empresa other = (Empresa) obj;
    if (!Objects.equals(this.nombre, other.nombre)) {
      return false;
    }
    return true;
  }
}
