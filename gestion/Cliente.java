package gestion;

public interface Cliente {
   public default void compra(Comercial com, Articulo art) {
	   com.vende(art);
   }
   public default void compra(Comercial com, Articulo art,Cliente cli) {
	   com.vende(art,cli);
   }
   @Override
	String toString();
}
