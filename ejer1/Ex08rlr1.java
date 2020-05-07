package ejer1;

import java.util.HashMap;
import java.util.Scanner;

public class Ex08rlr1 {
  public static void main (String[]args) {
	Scanner s = new Scanner (System.in);

	HashMap<String, String> palabras = new HashMap<>();

	palabras.put("frambuesa", "raspberry");
	palabras.put("coche", "car");
	palabras.put("manzana", "apple");
	palabras.put("armario", "wardrove");
	palabras.put("hola", "hello");
	palabras.put("ordenador", "computer");
	palabras.put("raton", "mouse");
	palabras.put("teclado", "keyboard");
	
	int aciertos = 0;
	int fallos = 0;
	
	String ingles = "";
	String español = "";
	
	String[] n = new String [5];
	
	for(int i = 1; i <= 5;i++) {
	
	  int num =((int)(Math.random()*8) + 1);
	  int num2 =((int)(Math.random()*8) + 1);
	
	
	
	  switch (num){
	  case 1:
		ingles = "raspberry";
	    break;
	  case 2:
		  ingles = "car";
	    break;
	  case 3:
		  ingles = "apple";
	    break;
	  case 4:
		  ingles = "wardrove";
	    break;
	  case 5:
		  ingles = "hello";
	    break;
	  case 6:
		  ingles = "computer";
	    break;
	  case 7:
		  ingles = "mouse";
	    break;
	  case 8:
		  ingles = "keyboard";
	    break;
	  }
	
	  switch (num2){
	  case 1:
		  español = "frambuesa";
	    break;
	  case 2:
		  español = "coche";
	    break;
	  case 3:
		  español = "manzana";
	    break;
	  case 4:
		  español = "armario";
	    break;
	  case 5:
		  español = "hola";
	    break;
	  case 6:
		  español = "ordenador";
	    break;
	  case 7:
		  español = "raton";
	    break;
	  case 8:
		  español = "teclado";
	    break;
	  }

	  System.out.println(ingles +" is " + español + "?(y/n)");
	  String respuesta = (s.nextLine());
	  
	  
	  
	  if((respuesta.equals("y"))&(palabras.get(español).equals(ingles))) {
		aciertos++;
	  }else if ((respuesta.equals("n"))&(palabras.get(español).equals(ingles) == false)){
		aciertos++;
	  }else {
		n[fallos] = español;
		fallos++;
	  }
	  
    }
	
	System.out.println("Correct answers: " + aciertos);
	System.out.println();
	
	int j = 0;
	
	if (aciertos < 5) {
	  System.out.println("You have to study the following words:");
	  do {
		if(n[j] == null) {
		  break;
		}
		System.out.println(n[j] + " is " + palabras.get(n[j]));
		j++;
	  } while (j <= fallos);
	}
	
  }
}