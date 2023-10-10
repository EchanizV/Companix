import java.util.ArrayList;
import java.util.Date;

public class Analyste extends Salarie{
    private int deplaClient;
    
    static ArrayList<Analyste> analystList = new ArrayList<Analyste>();

    public Analyste(String code, String nom, String prenom, Date dateEmbauche, int deplaClient) {
	super(code, nom, prenom, dateEmbauche);
	this.deplaClient = deplaClient;
    }
    
    public static void addAnalyst(Analyste newAnalyste)
    {
	analystList.add(newAnalyste);
    }
    
    public static void delAnalyste(String c)
    {
	for(int i = 0; i < analystList.size(); i++)
        {
            String code = analystList.get(i).getCode();
            if (c.equalsIgnoreCase(code))
            {
        	analystList.remove(i);
        	System.out.println("Employé " + code + " supprimé");
            }
            else
            {
        	System.out.println("Employé introuvable!");
            }

        }
    }
    
    public static void affAnalyste()
    {
	for(int i = 0; i < analystList.size(); i++)
        {
            String code = analystList.get(i).getCode();
            String nom = analystList.get(i).getNom();
            String prenom = analystList.get(i).getPrenom();
            Date dateEmbauche = analystList.get(i).getDateEmbauche();
            int nbClient = analystList.get(i).getDeplaClient();

            System.out.println("Analyste " + i + " : ");
            System.out.println("Code : " + code);
            System.out.println("Nom : " + nom);
            System.out.println("Prenom : " + prenom);
            System.out.println("Date d'embauche : " + dateEmbauche);
            System.out.println("nombre d'années de dev : " + nbClient);
            System.out.println("/==================/");
        }
    }
    
    public static boolean verifAnalyst(String c)
    {
	for(int i = 0; i < analystList.size(); i++)
        {
            String code = analystList.get(i).getCode();
            if (c.equalsIgnoreCase(code))
            {
        	return false;
            }
        }
	return true;
    }
    
    
    

    /////GETTER & SETTER/////
    
    public int getDeplaClient() {
        return deplaClient;
    }

    public void setDeplaClient(int deplaClient) {
        this.deplaClient = deplaClient;
    }

    public static ArrayList<Analyste> getAnalystList() {
        return analystList;
    }

    public static void setAnalystList(ArrayList<Analyste> analystList) {
        Analyste.analystList = analystList;
    }
    
    
    
    
}
