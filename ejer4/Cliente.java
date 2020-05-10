package ejer4;

public interface Cliente {
   public default void compra(Comercial com, Articulo art) {
	   com.vende(art);
   }
}
