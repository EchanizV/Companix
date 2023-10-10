import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;


public class Main {
    
    
    public static void main(String[] args) throws IOException
    {
	int menu = 92;
	    Scanner sc = new Scanner(System.in);
	    while (menu != 0)
	        {
	            System.out.println("==================MENU==================");
	            System.out.println();
	            System.out.println("1: Ajouter un concepteur");
	            
	            System.out.println("2: Supprimer un concepteur");
	            
	            System.out.println("3: Lister les concepteurs");
	            
	            System.out.println("4: Ajouter un analyste");
	            
	            System.out.println("5: Supprimer un analyste");
	            
	            System.out.println("6: Lister tous les employés");
	            
	            System.out.println("0: Fin du programme"); 
	            menu = sc.nextInt();
	            if (menu == 1)
	            {
	                System.out.println("Saisir le code, nom, prénom, date d’embauche et le nombre d’année de développement. Format : (XXX-NOM-PRENOM-JJ/MM/AAAA-A)");
	               // try {
	                    String concepteur = sc.next();
	                    String[] parts = concepteur.split("-");

	                    String dateEmbauche = parts[3];
	                    Date dateEmbaucheFormate = null;
	                    try {
	                        dateEmbaucheFormate = new SimpleDateFormat("dd/MM/yyyy").parse(dateEmbauche);
	                    } catch (ParseException e) {
	                        e.printStackTrace();
	                    }

	                    Concepteur ajoutConcepteur = new Concepteur(parts[0], parts[1], parts[2], dateEmbaucheFormate,
	                            Integer.parseInt(parts[4]));
	                    
	                    if (Concepteur.verifConcept(parts[0]))
	                    {
		                    ajoutConcepteur.addConcepteur(ajoutConcepteur);
	                    }
	                    else
	                    {
	                	System.out.println("Erreur, code déjà attribué!");
	                    }

	                /*} catch (IOException e) {
	                    e.printStackTrace();}*/
	            }
	            else
	                if (menu == 2)
	            {
	                    System.out.println("Saisir le code");
	                    String c = sc.next();
	                    Concepteur.delConcepteur(c);
	            }
	            else
	                if (menu == 3)
	            {
	                    Concepteur.affConcepteur();
	            }
	            else
	                if (menu == 4)
        	            	{
        	                    System.out.println("Saisir le code, nom, prénom, date d’embauche et le nombre de déplacement client. Format : (XXX-NOM-PRENOM-JJ/MM/AAAA-A)");
        		               // try {
        		                    String analyste = sc.next();
        		                    String[] parts = analyste.split("-");
        
        		                    String dateEmbauche = parts[3];
        		                    Date dateEmbaucheFormate = null;
        		                    try {
        		                        dateEmbaucheFormate = new SimpleDateFormat("dd/MM/yyyy").parse(dateEmbauche);
        		                    } catch (ParseException e) {
        		                        e.printStackTrace();
        		                    }
        
        		                    Analyste ajoutAnalyste = new Analyste(parts[0], parts[1], parts[2], dateEmbaucheFormate,
        		                            Integer.parseInt(parts[4]));
        		                    
        		                    if (Analyste.verifAnalyst(parts[0]))
        		                    {
        		                	ajoutAnalyste.addAnalyst(ajoutAnalyste);
        		                    }
        		                    else
        		                    {
        		                	System.out.println("Erreur, code déjà attribué!");
        		                    }
        	            	}
	            else
	                if (menu == 5)
	                	{
	                    		System.out.println("Saisir le code");
                	                String c = sc.next();
                	                Analyste.delAnalyste(c);
	                	}
	            else
	                if (menu == 6)
	            {
	                    HashMap<Object, Object> listeSalaries = new HashMap<>();
	                    listeSalaries.put("CONCEPTEUR", Concepteur.getConceptList());
	                    listeSalaries.put("ANALYSTE", Analyste.getAnalystList());

	                    for (Object key : listeSalaries.keySet()) {
	                        if (key.equals("CONCEPTEUR")) {
	                            System.out.println(key);
	                            Concepteur.affConcepteur();
	                            System.out.println();

	                        } else if (key.equals("ANALYSTE")) {
	                            System.out.println(key);
	                            Analyste.affAnalyste();
	                            System.out.println();

	                        }
	                    }
	            }
	            else
	                 if (menu != 0)
	                {
	                    System.out.println("Choix incohérent recommencez !");
	                }
	            else
	                 {
	                     System.out.println("Au revoir ! Passez une bonne journée.");
	                 }
	                    
	        }
	menu = sc.nextInt();
    }
}
