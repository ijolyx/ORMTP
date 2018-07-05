package net.joastbg.sampleapp.entities;

import java.util.ArrayList;
import java.util.List;

public class AssuranceAuto extends Assurance {
    
   
    private int bonus;
    private String immatriculation;
    private PersonneMorale conducteurPrincipal;
    private List<PersonnePhysique> conducteurSecondaire = new ArrayList<>();

    /**
     * @return the bonus
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the immatriculation
     */
    public String getImmatriculation() {
        return immatriculation;
    }

    /**
     * @param immatriculation the immatriculation to set
     */
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    /**
     * @return the conducteurPrincipal
     */
    public PersonneMorale getConducteurPrincipal() {
        return conducteurPrincipal;
    }

    /**
     * @param conducteurPrincipal the conducteurPrincipal to set
     */
    public void setConducteurPrincipal(PersonneMorale conducteurPrincipal) {
        this.conducteurPrincipal = conducteurPrincipal;
    }

    /**
     * @return the conducteurSecondaire
     */
    public List<PersonnePhysique> getConducteurSecondaire() {
        return conducteurSecondaire;
    }

   
    
}
