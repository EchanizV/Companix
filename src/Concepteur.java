import java.util.ArrayList;
import java.util.Date;
import java.util.ListIterator;

public class Concepteur extends Salarie {
    private int anneeDev;
    
    static ArrayList<Concepteur> conceptList = new ArrayList<Concepteur>();
    
    public Concepteur(String code, String nom, String prenom, Date dateEmbauche, int anneeDev) {
	super(code, nom, prenom, dateEmbauche);
	this.anneeDev = anneeDev;
    }
    
    public Concepteur()
    {
    }

    /////FONCTIONS & METHODES/////
    
    public void addConcepteur(Concepteur newConcepteur)
    {
	conceptList.add(newConcepteur);
    }
    
    public ArrayList<Concepteur> showConcepteur()
    {
	return conceptList;
	
    }
    
    public static void delConcepteur(String c)
    {
	for(int i = 0; i < conceptList.size(); i++)
        {
            String code = conceptList.get(i).getCode();
            if (c.equalsIgnoreCase(code))
            {
        	conceptList.remove(i);
        	System.out.println("Employé " + code + " supprimé");
            }
            else
            {
        	System.out.println("Employé introuvable!");
            }

        }
	
    }
    
    public static void affConcepteur()
    {
	for(int i = 0; i < conceptList.size(); i++)
        {
            String code = conceptList.get(i).getCode();
            String nom = conceptList.get(i).getNom();
            String prenom = conceptList.get(i).getPrenom();
            Date dateEmbauche = conceptList.get(i).getDateEmbauche();
            int nbAnneeDev = conceptList.get(i).getAnneeDev();

            System.out.println("Concepteur " + i + " : ");
            System.out.println("Code : " + code);
            System.out.println("Nom : " + nom);
            System.out.println("Prenom : " + prenom);
            System.out.println("Date d'embauche : " + dateEmbauche);
            System.out.println("nombre d'années de dev : " + nbAnneeDev);
            System.out.println("/==================/");
        }
    }
    
    public static boolean verifConcept(String c)
    {
	for(int i = 0; i < conceptList.size(); i++)
        {
            String code = conceptList.get(i).getCode();
            if (c.equalsIgnoreCase(code))
            {
        	return false;
            }
        }
	return true;
    }
    
    
    /////GETTER & SETTER/////
    
    public int getAnneeDev() {
        return anneeDev;
    }

    public void setAnneeDev(int anneeDev) {
        this.anneeDev = anneeDev;
    }

    public static ArrayList<Concepteur> getConceptList() {
        return conceptList;
    }

    public static void setConceptList(ArrayList<Concepteur> conceptList) {
        Concepteur.conceptList = conceptList;
    }
    
    
}
