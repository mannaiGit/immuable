/**
 * 
 */
package immuable;

import java.util.Collections;
import java.util.List;

/**
 * @author admin
 *
 */
public final class Personne {

	private String nom;
	private int age;
	private final List<String> amis; // ⚠️ List est mutable !
	
	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
		this.amis = null;
	}

	public Personne(String nom, int age, List<String> amis) {
		super();
		this.nom = nom;
		this.age = age;
		// Copie défensive pour éviter les modifications externes
        this.amis = List.copyOf(amis); 
        // (Java 10+) ou Collections.unmodifiableList(new ArrayList<>(amis))
	}

	public String getNom() {
		return nom;
	}

	public int getAge() {
		return age;
	}
	
	// Retourne une copie immuable → pas de modification possible
    public List<String> getAmis() {
        return Collections.unmodifiableList(amis);
    }

	@Override
	public String toString() {
		return "Personne{nom='" + nom + "', age=" + age + ", amis=" + amis + "}";
	}

}
