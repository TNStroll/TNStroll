/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Walid
 */
public class MetierImpl implements IMetierCatalogue{

    @Override
    public List<Produit> getProduitParMC(String mc) {
List<Produit> prods=new ArrayList<Produit>();
        Connection conn=SingletonConnection.getConnection();
        try {
            PreparedStatement ps=conn.prepareStatement("SELECT * FROM PRODUITS WHERE NOM_PRODUIT LIKE ?");
            ps.setString(1,"%"+ mc+"%");
            ResultSet rs=ps.executeQuery();
            while (rs.next()) {
            
               
             Produit p=new Produit();
             p.setIdProduit(rs.getLong("ID_PRODUIT"));
             p.setNomProduit(rs.getString("NOM_PRODUIT"));
             p.setPrixProduit(rs.getDouble("PRIX"));
             prods.add(p);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MetierImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prods;
    }

    @Override
    public void addProduit(Produit p) {

    }
    
}
