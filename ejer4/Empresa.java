package ejer4;

public class Empresa implements Cliente{
  private String CIF;
  private String nombre;
  private String telef;
  
  public Empresa(String cod, String nom, String tel) {
	this.CIF = cod;
    this.nombre = nom;
    this.telef = tel;
  }

}
