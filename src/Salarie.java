import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

public class Salarie {
    private String code;
    private String nom;
    private String prenom;
    private Date dateEmbauche;

    public Salarie(String code, String nom, String prenom, Date dateEmbauche) {
	super();
	this.code = code;
	this.nom = nom;
	this.prenom = prenom;
	this.dateEmbauche = dateEmbauche;
    }
    
    public Salarie()
    {
	
    }
    
    static ArrayList<Salarie> salaryList = new ArrayList<Salarie>();
    
    /////GETTER & SETTER/////
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    
}
