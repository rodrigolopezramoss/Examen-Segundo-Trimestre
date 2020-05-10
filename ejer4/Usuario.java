package ejer4;

public class Usuario extends Persona implements Cliente{
  private String telef;
  
  public Usuario(String nom, String corr, String tel) {
    super(nom, corr);
    this.telef = tel;
  }

}
