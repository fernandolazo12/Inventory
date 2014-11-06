/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.inventario.controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import pe.edu.upeu.inventario.dao.ComponenteDAO;
import pe.edu.upeu.inventario.interfaces.InterfaceComponente;
import pe.edu.upeu.inventario.modelo.Componente;

/**
 *
 * @author Fer
 */
public class ComponenteControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ComponenteControl</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ComponenteControl at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        InterfaceComponente aO = new ComponenteDAO();
        Componente us = new Componente();
        HttpSession session = request.getSession(true);
        RequestDispatcher dispatcher; String pagina;
        String op = request.getParameter("op"); int id;
        switch(Integer.parseInt(op)){
            case 1: pagina = "/vista/componente/ListarComponente.jsp";
                    session.setAttribute("list1", aO.list());
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);
            case 2: pagina = "/vista/componente/IngresarComponente.jsp";
                    //session.setAttribute("list", aO.list());
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);
            case 3: pagina = "/vista/componente/ModificarComponente.jsp";
                    id = Integer.parseInt(request.getParameter("id"));
                    session.setAttribute("list2", aO.list(id));
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);
            case 4: pagina = "/usuar?op=1";
                    us.setIdcomp(Integer.parseInt(request.getParameter("id")));
                    us.setNombre(request.getParameter("componente"));
                    us.setEstado(Integer.parseInt(request.getParameter("estado")));
                    us.setIdcat(Integer.parseInt(request.getParameter("idCategoria")));
                    if(aO.edit(us)){
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);
                    }else{
                        out.println("<h3>Error al modificar registro..!!</h3>");
                    }
            case 5: pagina = "/usuar?op=1";
                   
                    us.setNombre(request.getParameter("nombre"));
                    us.setEstado(Integer.parseInt(request.getParameter("estado")));
                    us.setIdcat(Integer.parseInt(request.getParameter("idCategoria")));
                    if(aO.save(us)){
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);
                    }else{
                        out.println("<h3>Error AL guardar registro..!!</h3>");
                    }
            case 6: pagina = "/usuar?op=1";
                    id = Integer.parseInt(request.getParameter("id"));
                    if(aO.delete(id)){
                    dispatcher = getServletContext().getRequestDispatcher(pagina);
                    dispatcher.forward(request, response);
                    }else{
                        out.println("<h3>Error al eliminar registro..!!</h3>");
                    }    
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
