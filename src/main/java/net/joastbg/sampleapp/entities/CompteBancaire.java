package net.joastbg.sampleapp.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table
public class CompteBancaire {
 @Column(name="iban")
    @Id
    private String iban;
    @Column(name="proprietaire")
    private String proprietaire;
    @Column(name="swift_code")
    private String swift_code;
    
    private boolean principale = false;

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    /**
     * @return the proprietaire
     */
    public String getProprietaire() {
        return proprietaire;
    }

    /**
     * @param proprietaire the proprietaire to set
     */
    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    /**
     * @return the swift_code
     */
    public String getSwift_code() {
        return swift_code;
    }

    /**
     * @param swift_code the swift_code to set
     */
    public void setSwift_code(String swift_code) {
        this.swift_code = swift_code;
    }

    /**
     * @return the principale
     */
    public boolean isPrincipale() {
        return principale;
    }

    /**
     * @param principale the principale to set
     */
    public void setPrincipale(boolean principale) {
        this.principale = principale;
    }
}
