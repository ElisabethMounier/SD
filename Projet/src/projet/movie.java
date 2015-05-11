package projet;

import java.util.ArrayList;

public class movie {
	
	String titre;
	String annee;
	String resume;
	String realisateur;
	ArrayList acteurs;
	ArrayList genres;
	String duree;
	

	/**
	 * @param titre
	 * @param annee
	 * @param resume
	 * @param realisateur
	 * @param acteurs
	 * @param genres
	 * @param duree
	 */
	public movie(String titre, String annee, String resume, String realisateur,
			ArrayList acteurs, ArrayList genres, String duree) {
		super();
		this.titre = titre;
		this.annee = annee;
		this.resume = resume;
		this.realisateur = realisateur;
		this.acteurs = acteurs;
		this.genres = genres;
		this.duree = duree;
	}


	/**
	 * @return the titre
	 */
	public String getTitre() {
		return titre;
	}


	/**
	 * @param titre the titre to set
	 */
	public void setTitre(String titre) {
		this.titre = titre;
	}
	



	/**
	 * 
	 */
	public movie() {
		super();
		this.titre = "";
		this.annee = "";
		this.resume = "";
		this.realisateur = "";
		this.acteurs = new ArrayList<>();
		this.genres = new ArrayList<>();
		this.duree = "";
	}


	/**
	 * @return the annee
	 */
	public String getAnnee() {
		return annee;
	}


	/**
	 * @param annee the annee to set
	 */
	public void setAnnee(String annee) {
		this.annee = annee;
	}


	/**
	 * @return the resume
	 */
	public String getResume() {
		return resume;
	}


	/**
	 * @param resume the resume to set
	 */
	public void setResume(String resume) {
		this.resume = resume;
	}


	/**
	 * @return the realisateur
	 */
	public String getRealisateur() {
		return realisateur;
	}


	/**
	 * @param realisateur the realisateur to set
	 */
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}


	/**
	 * @return the acteurs
	 */
	public ArrayList getActeurs() {
		return acteurs;
	}


	/**
	 * @param acteurs the acteurs to set
	 */
	public void setActeurs(ArrayList acteurs) {
		this.acteurs = acteurs;
	}
	
	public void addActeurs(String acteur){
		acteurs.add(acteur);
	}


	/**
	 * @return the genres
	 */
	public ArrayList getGenres() {
		return genres;
	}


	/**
	 * @param genre the genre to set
	 */
	public void setGenre(ArrayList genres) {
		this.genres = genres;
	}
	
	public void addGenres(String genre){
		genres.add(genre);
	}


	/**
	 * @return the duree
	 */
	public String getDuree() {
		return duree;
	}


	/**
	 * @param duree the duree to set
	 */
	public void setDuree(String duree) {
		this.duree = duree;
	}
	
	public String toString(){
		 String s="";
		 s+= "Titre : "+titre+"\n";
		 s+= "Année :"+annee+"\n";
		 s+= "Résumé :"+resume+"\n";
		 s+= "Réalisateur :"+realisateur+"\n";
		 s+= "Acteurs :"+acteurs+"\n";
		 s+= "Genres :"+genres+"\n";
		 s+= "Durée :"+duree+"\n";
		return s;
	}
	
}
