package ejer4;

public class Ex08rlr4 {
  public static void main(String[] args) {
	Usuario pepe = new Usuario("Pepe", "pepe@yahoo.com", "555 123456");
	Usuario pablo = new Usuario("Pablo", "pablo@gmail.com", "555 112233");
	Empresa ofiMalaga = new Empresa("B123456", "Ofi Málaga", "555 654321");
	Comercial juan = new Comercial("Juan", "juan@hotmail.com", "jefe de ventas");
	Comercial luis = new Comercial("Luis", "luis@gmail.com", "coordinador de ventas");
	
	System.out.println("Juan");
	pepe.compra(juan, new Articulo("Impresora Láser", 1));
	ofiMalaga.compra(juan, new Articulo("Impresora Láser", 2));
	pepe.compra(juan, new Articulo("Paquete de folios", 10));
	System.out.println("Luis");
	pablo.compra(luis, new Articulo("Clasificador anillas", 12));
	pepe.compra(luis, new Articulo("Paquete de folios", 50));
	pablo.compra(luis, new Articulo("Mesa escritorio", 6));
	System.out.println("Juan");
	pepe.compra(juan, new Articulo("Paquete de folios", 5));
	
	
	System.out.println(juan);
	System.out.println(luis);
  }
}
