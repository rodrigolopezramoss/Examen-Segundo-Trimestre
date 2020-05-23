package gestion;

import java.util.ArrayList;
import java.util.Scanner;





public class Gestion {
	static ArrayList<Comercial> co = new ArrayList<Comercial>();
	static ArrayList<Cliente> cli = new ArrayList<Cliente>();
	
  public static void main(String[] args) {
	Usuario pepe = new Usuario("Pepe", "pepe@yahoo.com", "555 123456");
	Usuario pablo = new Usuario("Pablo", "pablo@gmail.com", "555 112233");
	Empresa ofiMalaga = new Empresa("B123456", "Ofi Málaga", "555 654321");
	Comercial juan = new Comercial("Juan", "juan@hotmail.com", "jefe de ventas");
	Comercial luis = new Comercial("Luis", "luis@gmail.com", "coordinador de ventas");
	
	pepe.compra(luis, new Articulo("Paquete de folios", 50));
	pablo.compra(luis, new Articulo("Mesa escritorio", 6));
	pepe.compra(juan, new Articulo("Paquete de folios", 5));
	
	co.add(juan);
	co.add(luis);
	cli.add(pepe);
	cli.add(pablo);
	cli.add(ofiMalaga);
	
    Scanner s = new Scanner(System.in);
    int opcion;
    int opcion2;
    int opcion3;
    
    String nombre;
    String correo;
    String cargo;
    String telef;
    String cif;
    int cantidad;
    
    String nombre2;
    String correo2;
    String cargo2;
    String telef2;
    String cif2;
    
    do {
      System.out.println("\n\nCOMERCIALES Y CLIENTES");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Ventas");
      System.out.println("6. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());
  
      switch (opcion) {
      case 1://------------------------------------------------Listado-----------------------------------------------------------------
    	System.out.println("1.Comerciales");
    	System.out.println("2.Clientes");
    	opcion2 = Integer.parseInt(s.nextLine());
    	
    	switch (opcion2) {
    	case 1:
    	  for (Comercial aux : co) {
			System.out.println(aux);
		  }
    	  break;
    	case 2:
    	  for (Cliente aux : cli) {
    		System.out.println(aux);
    	  }
    	  break;
    	}
    	
    	break;
      case 2://-------------------------------------------------Alta-----------------------------------------------------
    	System.out.println("1.Comerciales");
      	System.out.println("2.Clientes");
      	opcion2 = Integer.parseInt(s.nextLine());
      	
      	switch (opcion2) {
    	case 1://Comerciales
    	  System.out.println("Por favor, introduzca los datos del comercial");
    	  System.out.println("Nombre:");
      	  nombre = s.nextLine();
      	  System.out.println("Correo:");
      	  correo = s.nextLine();
      	  System.out.println("Cargo:");
    	  cargo = s.nextLine();
      	
      	  Comercial comaux = new Comercial(nombre,correo,cargo);
      	  if(co.contains(comaux)) {
      	    System.out.println("Este comercial ya está registrado");
      	  }else {
      	    co.add(comaux);
      	    System.out.println("Comercial añadido");
      	  } 
    	  break;
    	case 2://Usuario y empresa
    	  System.out.println("1.Usuario");
          System.out.println("2.Empresa");
          opcion3 = Integer.parseInt(s.nextLine());
          
          switch (opcion3) {
          case 1://Usuario
        	System.out.println("Por favor, introduzca los datos del usuario");
        	System.out.println("Nombre:");
        	nombre = s.nextLine();
        	System.out.println("Correo:");
        	correo = s.nextLine();
        	System.out.println("Telefóno:");
      	    telef = s.nextLine();
        	
        	Usuario usaux = new Usuario(nombre,correo,telef);
        	if(cli.contains(usaux)) {
        	  System.out.println("Este usuario ya está registrado");
        	}else {
        	  cli.add(usaux);
        	  System.out.println("Usuario añadido");
        	} 
        	
          	break;
          case 2://Empresa
        	System.out.println("Por favor, introduzca los datos de la empresa");
        	System.out.println("CIF:");
        	cif = s.nextLine();
        	System.out.println("Nombre:");
        	nombre = s.nextLine();
        	System.out.println("Telefóno:");
      	    telef = s.nextLine();
        	
        	Empresa emaux = new Empresa(cif,nombre,telef);
        	if(cli.contains(emaux)) {
        	  System.out.println("Esta empresa ya está registrada");
        	}else {
        	  cli.add(emaux);
        	  System.out.println("Empresa añadida");
        	}
        	break;
          }
    	  break;
    	}
      	break;
      case 3://---------------------------------------------------Baja--------------------------------------------------------------
    	System.out.println("1.Comerciales");
      	System.out.println("2.Clientes");
      	opcion2 = Integer.parseInt(s.nextLine());
      	
      	switch (opcion2) {
    	case 1://Comerciales
    	  System.out.println("Por favor, introduzca el correo del comercial");
          correo = s.nextLine();
        
          Comercial comaux = new Comercial("",correo,"");
    	  
    	  if(co.contains(comaux)) {
    		co.remove(comaux);
            System.out.println("Comercial dado de baja correctamente");
          }else {
            System.out.println("Ese comercial no está registrado");
          } 
    	  
    	  break;
    	case 2://Usuario y empresa
    	  System.out.println("1.Usuario");
          System.out.println("2.Empresa");
          opcion3 = Integer.parseInt(s.nextLine());
          
          switch (opcion3) {
          case 1://Usuario
        	System.out.println("Por favor, introduzca el correo del usuario");
            correo = s.nextLine();
            
            Usuario usaux = new Usuario("",correo,"");
        	  
        	if(cli.contains(usaux)) {
        	  cli.remove(usaux);
              System.out.println("Usuario dado de baja correctamente");
            }else {
              System.out.println("Ese usuario no está registrado");
            } 
          	break;
          case 2://Empresa
        	System.out.println("Por favor, introduzca el CIF de la empresa");;
            cif = s.nextLine();
              
            Empresa emaux = new Empresa(cif,"","");
          	  
          	if(cli.contains(emaux)) {
          	  cli.remove(emaux);
              System.out.println("Empresa dada de baja correctamente");
            }else {
              System.out.println("Ese empresa no está registrada");
            }
        	break;
          }
    	  break;
      	}
      	break;
      case 4://------------------------------------------------------Modificación---------------------------------------------------------------------------------
        System.out.println("1.Comerciales");
        System.out.println("2.Clientes");
        opcion2 = Integer.parseInt(s.nextLine());
        
        switch (opcion2) {
      	case 1://Comerciales
      	  System.out.println("Introduzca el correo del comercial a modificar");
          correo = s.nextLine();

          Comercial comaux = new Comercial("",correo,"");
       	  if(co.contains(comaux)) {
       		System.out.println("Introduzca los datos que quiera modificar");
        	System.out.print("Nombre:");
            nombre2 = s.nextLine();
            System.out.print("Correo:");
            correo2 = s.nextLine();
            System.out.print("Cargo:");
            cargo2 = s.nextLine();
            
            int i = co.indexOf(comaux);
      	    
            Comercial aux2 = co.get(i);
            
            if(nombre2.length() == 0) {
              nombre2= aux2.getNombre();
            }
            if(correo2.length() == 0) {
              correo2 = aux2.getCorreo();
            }
            if(cargo2.length() == 0) {
              cargo2 = aux2.getCargo();
            }
            
      	    Comercial aux= new Comercial(nombre2,correo2,cargo2);
      	    co.set(i,aux);
      	    System.out.println("Modificación realizada con éxito");
       	  }else {
       	    System.out.println("Ese comercial no está registrado");
       	  } 
    	  break;
      	case 2://Usuario y empresa
      	  System.out.println("1.Usuario");
          System.out.println("2.Empresa");
          opcion3 = Integer.parseInt(s.nextLine());
            
          switch (opcion3) {
          case 1://Usuario
        	System.out.println("Introduzca el correo del usuario a modificar");
            correo = s.nextLine();

            Usuario usaux = new Usuario("",correo,"");
            if(cli.contains(usaux)) {
              System.out.println("Introduzca los datos que quiera modificar");
              System.out.print("Nombre:");
              nombre2 = s.nextLine();
              System.out.print("Correo:");
              correo2 = s.nextLine();
              System.out.print("Teléfono:");
              telef2 = s.nextLine();
              
              int i = cli.indexOf(usaux);
          	  
              Cliente aux2 = cli.get(i);
              
              if(nombre2.length() == 0) {
                nombre2= aux2.getNombre();
              }
              if(correo2.length() == 0) {
                correo2 = aux2.getCorreo();
              }
              if(telef2.length() == 0) {
                telef2 = aux2.getTelef();
              }
              
              
              Usuario aux= new Usuario(nombre2,correo2,telef2);
          	  cli.set(i,aux);
          	  System.out.println("Modificación realizada con éxito");
           	}else {
           	  System.out.println("Ese usuario no está registrado");
           	} 
      	    break;
          case 2://Empresa
        	System.out.println("Introduzca el CIF de la empresa a modificar");
            cif = s.nextLine();
            
            Empresa emaux = new Empresa(cif,"","");
            if(cli.contains(emaux)) {
              System.out.println("Introduzca los datos que quiera modificar");
              System.out.print("CIF:");
              cif2 = s.nextLine();
              System.out.print("Nombre:");
              nombre2 = s.nextLine();
              System.out.print("Teléfono:");
              telef2 = s.nextLine();
                
              int i = cli.indexOf(emaux);
              
              Cliente aux2 = cli.get(i);
              
              if(cif2.length() == 0) {
                cif2= aux2.getCif();
              }
              if(nombre2.length() == 0) {
            	nombre2 = aux2.getCorreo();
              }
              if(telef2.length() == 0) {
                telef2 = aux2.getTelef();
              }
              
              
              Empresa aux= new Empresa(cif2,nombre2,telef2);
              cli.set(i,aux);
              System.out.println("Modificación realizada con éxito");
            }else {
              System.out.println("Esa empresa no está registrada");
            } 
        	break;
          }
          break;
        }
        break;
      case 5://-------------------------------------------------------------------Ventas----------------------------------------------------------------------------
    	System.out.println("1.Realizar venta");
    	System.out.println("2.Ver ventas");
        opcion2 = Integer.parseInt(s.nextLine());
          	
        switch (opcion2) {
       	case 1://--------------------------------------------------------------Realizar venta-----------------------------------------------------------------------
          System.out.println("1.Usuario");
          System.out.println("2.Empresa");
          opcion3 = Integer.parseInt(s.nextLine());
          
          switch (opcion3) {
         	case 1://Usuario
            System.out.println("Introduzca el correo del usuario");
            correo = s.nextLine();

            Usuario usaux = new Usuario("",correo,"");
            if (cli.contains(usaux)) {
              System.out.println("Introduzca el correo del comercial");
              correo = s.nextLine();
            
              Comercial comaux = new Comercial("",correo,"");
              if (co.contains(comaux)) {
            	System.out.println("¿Qué articulo desea vender?");
            	System.out.print("Nombre:");
                nombre = s.nextLine();
                System.out.print("Cantidad:");
                cantidad = Integer.parseInt(s.nextLine()) ;
                Articulo art = new Articulo(nombre,cantidad);
                
                
                int i = co.indexOf(comaux);
          	    
                Comercial aux2 = co.get(i);
                
                usaux.compra(aux2, art);
              }else {
             	  System.out.println("Ese comercial no está registrado");
              }
            }else {
           	  System.out.println("Ese usuario no está registrado");
           	}
            break;
          case 2://Empresa
        	System.out.println("Introduzca el CIF de la empresa");
            cif = s.nextLine();
            
            Empresa emaux = new Empresa(cif,"","");
            if (cli.contains(emaux)) {
              System.out.println("Introduzca el correo del comercial");
              correo = s.nextLine();

              Comercial comaux = new Comercial("",correo,"");
              if (co.contains(comaux)) {
            	System.out.println("¿Qué articulo desea vender?");
              	System.out.print("Nombre:");
                nombre = s.nextLine();
                System.out.print("Cantidad:");
                cantidad = Integer.parseInt(s.nextLine()) ;
                
                Articulo art = new Articulo(nombre,cantidad);
                
                int i = co.indexOf(comaux);
          	    
                Comercial aux2 = co.get(i);
                
                emaux.compra(aux2, art);
              }else {
                System.out.println("Ese comercial no está registrado");
              }
            }else {
              System.out.println("Esa empresa no está registrada");
            }
            break;
          }
          break;
        case 2://--------------------------------------------------------------Ver ventas-----------------------------------------------------------------------
          for (Comercial aux : co) {
    		aux.vendido();
    	  }
          break;
        }
    	break;
      }
    }while(opcion != 6); 
  }
}
