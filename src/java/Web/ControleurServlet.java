/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import metier.IMetierCatalogue;
import metier.MetierImpl;
import metier.Produit;

/**
 *
 * @author Walid
 */
@WebServlet(name = "cs" ,urlPatterns =  {"/*.php"})
public class ControleurServlet extends HttpServlet{
private IMetierCatalogue metier;
    @Override
    public void init() throws ServletException {
        metier=new MetierImpl();
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String mc=req.getParameter("motCle");
        ProduitModele mod=new ProduitModele();
        mod.setMotCle(mc);
        List<Produit> prods=metier.getProduitParMC(mc);
        mod.setProduits(prods);
        req.setAttribute("modele", mod);
        req.getRequestDispatcher("ProduitsView.jsp").forward(req, resp);

    }
 
    
}
