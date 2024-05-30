package kalanso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/contacts")
public class ContactServlet extends HttpServlet {
    private List<Contact_App> contacts = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("contacts", contacts);
        req.getRequestDispatcher("/contacts.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");

        if ("add".equals(action)) {
            int id = contacts.size() + 1;
            String prenom = req.getParameter("prenom");
            String nom = req.getParameter("nom");
            String email = req.getParameter("email");
            String telephone = req.getParameter("telephone");
          //  String dateNaissance = req.getParameter("dateNaissance");
          //  String adresse = req.getParameter("adresse");
            String competenceFavorite = req.getParameter("competenceFavorite");
            Contact_App newcontact = new Contact_App();
            newcontact.setNom(nom);
            newcontact.setPrenom(prenom);
            newcontact.setEmail(email);
            newcontact.setTelephone(telephone);
         //   newcontact.setAdresse(adresse);
            newcontact.setCompetenceFavorite(competenceFavorite);
           // newcontact.setDateNaissance(dateNaissance);
            newcontact.setId(id);
            
            contacts.add(newcontact);
        } else if ("delete".equals(action)) {
            int id = Integer.parseInt(req.getParameter("id"));
            contacts.removeIf(contact -> contact.getId() == id);
        }
        
        req.setAttribute("contacts", contacts);
        req.getRequestDispatcher("/contacts.jsp").forward(req, resp);
    }
}
