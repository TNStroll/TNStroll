package metier;


import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import metier.MetierImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Walid
 */
public class TestMetier {
    public static void main(String[] args) {
        MetierImpl metier=new MetierImpl();
        List<Produit> prods= metier.getProduitParMC("C") ;
     for(Produit p:prods){
         System.out.println(p.getNomProduit());
     }   
    }            
    
    
}
