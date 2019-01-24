
public class Main {

	public static void main(String[] args) {
		String chaine = "test";
		// String chaine = new String ("test");
		new String("test");

		Voiture boumbo = new Voiture();
		// type Voiture et classe Voiture
		boumbo.nom = "Boumbo";

		System.out.println(boumbo.nom);

		boumbo.couleur = "jaune";
		boumbo.nombreDePortes = 3;
		boumbo.nombreDePlaces = 3;
		boumbo.moteur = "BX4000";

		Voiture flash = new Voiture();
		// nouvelle variable qui contient un nouvel objet
		flash.nom = "Flash MCQuenn";
		flash.nombreDePortes = 2;
		flash.nombreDePlaces = 2;
		flash.moteur = "Z456";
		flash.couleur = "rouge";
		System.out.println(flash.moteur);

		System.out.println(boumbo.nom + " possède " + boumbo.nombreDePortes + " portes.");
		System.out.println(flash.nom + " possède " + flash.nombreDePortes + " portes.");

		Voiture martin = new Voiture();
	}

}
