package gestion;

public class Usuario extends Persona implements Cliente{
  private String telef;
  
  public Usuario(String nom, String corr, String tel) {
    super(nom, corr);
    this.telef = tel;
  }
  
  public String toString() {
    String cadena = "";
    cadena += "\nNombre: " + this.nombre;
    cadena += "\nCorreo: " + this.correo;
    cadena += "\nTeléfono: " + this.telef;
    cadena += "\n==============================";
    return cadena;
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

@Override
public String getCif() {
	// TODO Auto-generated method stub
	return null;
}
	  
}
