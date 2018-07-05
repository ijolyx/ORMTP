package net.joastbg.sampleapp.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table
public class Client  {

    @Id
    private int id_client;
    
    @Column(name="nom")
    private String nom;
    
    @OneToMany
    private List<CompteBancaire> accounts = new ArrayList<>();

    private Contact contact;
    
    
    public int getId_client() {
        return id_client;
    }

   

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the accounts
     */
    public List<CompteBancaire> getAccounts() {
        return accounts;
    }

    /**
     * @param accounts the accounts to set
     */
    public void setAccounts(CompteBancaire b) {
        this.accounts.add(b);
        
    }

    /**
     * @return the contact
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * @param contact the contact to set
     */
    public void setContact(Contact contact) {
        this.contact = contact;
    }
    
   
}



