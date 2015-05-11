package projet;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.io.*;

public class Selection {
	
	public  static void selectionner(TreeMap<String,movie> movies){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> selection = new ArrayList<String>();
		String str="";
		
		do {
			System.out.println("Veuillez saisir un film déjà vu (ou \"EXIT\" si vous n'avez rien à ajouter  :");
			str = sc.nextLine();				
			selection.add(str);
			System.out.print(movies.get(str));
			
		} while(str != "EXIT");
		

	
		
		
		
	}
}