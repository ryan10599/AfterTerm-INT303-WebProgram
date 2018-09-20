/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.UserTransaction;
import todo.model.Account;
import todo.model.Task;
import todo.model.controller.AccountJpaController;
import todo.model.controller.TaskJpaController;

/**
 *
 * @author user
 */
public class TaskServlet extends HttpServlet {
    
    @PersistenceUnit(unitName = "TodoWebApplicationPU")
    EntityManagerFactory emf;
    
    @Resource
    UserTransaction utx;

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
        String acc = request.getParameter("account");
        String newtask = request.getParameter("newtask");
        TaskJpaController taskJpaCtrl = new TaskJpaController(utx, emf);
        
        if (newtask != null && newtask.trim().length() > 0) {
            AccountJpaController accountJpa = new AccountJpaController(utx, emf);
            Account account = accountJpa.findAccount(acc);
            
            Task task = new Task(newtask, account);
            try {
                taskJpaCtrl.create(task);
            } catch (Exception ex) {
                Logger.getLogger(TaskServlet.class.getName()).log(Level.SEVERE, null, ex);
            }
            List<Task> taskList = taskJpaCtrl.findTaskEntities();
            
            request.setAttribute("alltask", taskList);
            //getServletContext().getRequestDispatcher("/Task.jsp").forward(request, response);
            response.sendRedirect("Task");
            return;
        }
        
        List<Task> taskList = taskJpaCtrl.findTaskEntities();
        
        request.setAttribute("alltask", taskList);

        getServletContext().getRequestDispatcher("/Task.jsp").forward(request, response);
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
        processRequest(request, response);
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
