package gestion;

public interface Cliente {
  public default void compra(Comercial com, Articulo art) {
    com.vende(art);
  }
  
  
  @Override
  String toString();
  
  String getNombre();

  String getCorreo();

  String getTelef();

  String getCif();
}
