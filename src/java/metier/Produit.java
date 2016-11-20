/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;

/**
 *
 * @author Walid
 */
public class Produit implements Serializable{
    private Long idProduit;
    private String nomProduit;
    private Double prixProduit;

    public Long getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }

    public Double getPrixProduit() {
        return prixProduit;
    }

    public void setPrixProduit(Double prixProduit) {
        this.prixProduit = prixProduit;
    }

    public Produit() {
    }

    public Produit(String nomProduit, Double prixProduit) {
        this.nomProduit = nomProduit;
        this.prixProduit = prixProduit;
    }
    
    
}
