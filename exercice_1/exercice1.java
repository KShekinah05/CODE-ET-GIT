public class FactureManager {

    /**
     * Fonction qui calcule le total d'une  facture 
     * @param typeProduit
     * @param quantite
     * @param prixUnitaire
     */
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;
        return total;
    }
    

    //reduction selon la catégorie

    public double prixreduction(double Total,int pourcentage){
        switch(typeProduit)
        case"Alimentaire":
             double reduction=total * 0.05;
            case "Electronique":‍
            double reduction =total * 1;
            case "Luxe":‍
                double reduction =total * 0.15;
            
            default:‍
                return reduction;‍
        }

    /**
     * Calcul du prix total apres reduction
     */
    public double total_apresreduction(double total,double reduction){
        double totalapresreduc= total - reduction;
        return totalapresreduc;
    }

    /**
     * Calcul du total final et application d'une reduction si le total apres reduction superieur a 1000
     */

    public double totalfinal(double totalapresreduc){
        if(totalapresreduc<1000){
            return total_apresreduction();
        }
        else (totalapresreduc>1000){
            double facture =totalapresreduc -(totalapresreduc *0.05);
            return facture;
        }
    
        }
    }
    
    
