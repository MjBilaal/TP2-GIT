package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
        // Cette méthode permet d'analyser la requête reçue par le système hospitalier.
        // Dans cette méthode, nous pourrions ajouter des instructions pour analyser
        // les différentes informations contenues dans la requête.
		return "requête analysée";
	}
	
	private String comparerDonnes(){   
        // Cette méthode permet de comparer les données stockées dans le système
        // hospitalier afin de trouver des corrélations ou des clusters.
        // Dans cette méthode, nous pourrions ajouter des instructions pour comparer
        // les données stockées et retourner les résultats de la comparaison.
		return "Cluster trouvé";
	}

}
