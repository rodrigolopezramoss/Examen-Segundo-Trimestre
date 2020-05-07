package ejer2;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex08rlr2 {
  public static void main(String[] args) {
	ArrayList<Integer> lista1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
	ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(77, 88, 99));
    ArrayList<Integer> lista3 = new ArrayList<>();

	System.out.println(mezclaListas(lista1, lista2));
    System.out.println(mezclaListas(lista2, lista1));
    System.out.println(mezclaListas(lista1, lista3));
    System.out.println(mezclaListas(lista2, lista3));
  }
	    
  public static ArrayList<Integer> mezclaListas(ArrayList<Integer> a1, ArrayList<Integer> a2) {	 
	ArrayList<Integer> a3 = new ArrayList<>(10);
	a3.addAll(a1);
	
	if(a2.isEmpty()) {
	  return a1;
	  
	}else {
	  int j = 1;
	  for(int i = 0; i < a2.size();i++) {
		if(j > a1.size()) {
		  a3.add(a2.get(i));
		}else {
		a3.add(j,a2.get(i));
	    j+=2;
		}
	  } 
	  
	  return a3;
	}
  }
}