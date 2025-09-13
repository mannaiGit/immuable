/**
 * 
 */
package immuable;

import java.util.Arrays;
import java.util.List;

/**
 * @author admin
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> amis = Arrays.asList("Olivier", "Stéphane");
		
		Personne p1 = new Personne("Abdelkader", 30, amis);
		System.out.println(p1); 
		 // Affiche : Personne{nom='Abdelkader', age=30, amis=[Olivier, Stéphane]}
		
		// Tentative de modifier la liste d’origine
        amis.set(0, "Loïc"); // ⚠️ modifie la liste d'entrée
        System.out.println("Liste originale après modif: " + amis);
        // [Loïc, Stéphane]

        // L'objet immuable n'est pas impacté !
        System.out.println(p1);
        // Personne{nom='Abdelkader', age=30, amis=[Olivier, Stéphane]}
		
		// On ne peut pas modifier p1 directement, car pas de setters.
        // p1.nom = "Autre";  // ❌ interdit, champ privé et final
        
     // Tentative de modifier la liste via le getter
        List<String> amisP1 = p1.getAmis();
        // amisP1.add("Christophe"); // ❌ UnsupportedOperationException
		
		// Si on veut une "nouvelle" personne → on recrée un objet
        Personne p2 = new Personne("Abdelkader", 31);

        System.out.println(p2); 
        // Affiche : Personne{nom='Abdelkader', age=31}

	}

}
