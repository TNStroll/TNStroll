/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import java.util.ArrayList;
import java.util.List;
import metier.Produit;

/**
 *
 * @author Walid
 */
public class ProduitModele {
    private String motCle;
    private List<Produit> produits=new ArrayList<Produit>();

    public String getMotCle() {
        return motCle;
    }

    public void setMotCle(String motCle) {
        this.motCle = motCle;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
    
}
