public class Main {
    /*
    Vérificateur de Somme Égale

Écrivez une méthode appelée hasEqualSum avec 3 paramètres de type int.

La méthode doit retourner un boolean et elle doit retourner true si la somme du premier et du deuxième paramètre est égale au troisième paramètre. Sinon, elle doit retourner false.

EXEMPLES D’ENTRÉE/SORTIE :

	•	hasEqualSum(1, 1, 1); → devrait retourner false car 1 + 1 n’est pas égal à 1.
	•	hasEqualSum(1, 1, 2); → devrait retourner true car 1 + 1 est égal à 2.
	•	hasEqualSum(1, -1, 0); → devrait retourner true car 1 + (-1) est égal à 0.

NOTE : La méthode hasEqualSum doit être définie comme public static, comme nous l’avons fait jusqu’à présent dans le cours.
NOTE : N’ajoutez pas de méthode main au code de la solution.
     */
    public static boolean hasEqualSum(int nombre1, int nombre2, int nombre3) {
        return (nombre1 + nombre2) == nombre3;
    }
}
