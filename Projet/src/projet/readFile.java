package projet;
import java.io.*;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.*;

public class readFile {
	public static void main(String[] args){
		String fichier ="ListeFilms.txt";
		TreeMap<String,movie> tm = new TreeMap<>();
		
		
		//lecture du fichier texte	
		try{
			InputStream ips=new FileInputStream(fichier); 
			InputStreamReader ipsr=new InputStreamReader(ips);
			BufferedReader br=new BufferedReader(ipsr);
			String ligne;
			projet.movie m;
			m= new movie();
			
			
			while ((ligne=br.readLine())!=null){
				boolean b = ligne.matches("^\\d.*");
				//System.out.println(ligne);
				if (b==true) { // la ligne débute par un chiffre
					String ligne2="";
					String str[]= ligne.split("\\. *"); // on sépare à  chaque point rencontré dans la ligne
					//System.out.println(str[0]);
					ligne2=str[1]; // on ne prend que la deuxième case du tableau pour enlever le numéro
					str = ligne2.split("\\("); // on sépare à la parenthèse ouvrante
					tm.put(m.titre, m); // tree map
					Set set = tm.entrySet();
					m= new movie(); // création de l'objet movie
					m.setTitre(str[0]);
					if(str.length>1)
					m.setAnnee(str[1].split("\\)")[0]);
					String s="";
					
					
					ligne=br.readLine(); // on passe à la ligne suivante
						
					while (!(ligne.contains("Director") || ligne.contains("With"))){ 
						//System.out.println(ligne);
						s+=ligne;
							
							ligne=br.readLine();
					}
					m.setResume(s);
						
					if (ligne.contains("Director")){
						String str1[]= ligne.split(":");
						m.setRealisateur(str1[1]);
						ligne=br.readLine();
					}
					
					if (ligne.contains("With")){
						String str1[]= ligne.split(":");
						if(str1.length>1){
							ligne=str1[1];
							str1= ligne.split(",");
							for (int i=0; i<str1.length; i++){
								m.addActeurs(str1[i]);
							}
						}
						ligne=br.readLine();
					}
					
					
					
						String str2[]= ligne.split(" \\| ");
						for (int i=0; i<str2.length; i++){
							if(str2[i].contains("mins")){
								String[] str3=str2[i].split(" mins")[0].split(" ");
								m.setDuree(str3[str3.length-1] +" mins");
								m.addGenres(str3[0].split(" ")[0].split("\\d")[0]);
							}
							else
								m.addGenres(str2[i]);
						}
					
					
						ligne=br.readLine();

			}
				
			}
			br.close();
			/*for(String key: tm.keySet()){
				System.out.println(tm.get(key));
			}*/
			Selection.selectionner(tm);
		}		
		catch (IOException e){
			System.out.println(e.toString());
		}
	}
}
