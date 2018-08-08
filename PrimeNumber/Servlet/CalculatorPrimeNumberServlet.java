/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.PrimeNumber.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sit.int303.PrimeNumber.Model.PrimeNumberModel;

/**
 *
 * @author user
 */
public class CalculatorPrimeNumberServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            try {
                String xStr = request.getParameter("input");

            int input = Integer.valueOf(xStr);

//            int count = 0;
//
//            for (int i = 1; i <= input; i++) {
//                double result = input % i;
//                if (result == 0.0) {
//                    count++;
//                }
//
//            }
//
//            System.out.println("Count = " + count);
//
//            String result2 = "";
//
//            if (count == 2) {
//                result2 = "This Number is Prime Number";
//            } else if (count != 2) {
//                result2 = "This Number isn't Prime Number";
//            }
            
            PrimeNumberModel prime = new PrimeNumberModel();
            
            prime.setInput(input);
            //prime.setResult2(result2);
            request.setAttribute("PrimeNumber", prime);
                getServletContext().getRequestDispatcher("/PrimeNumberView.jsp").forward(request, response);

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculatorPrimeNumber</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.println(prime.toString());
           
            out.println("</body>");
            out.println("</html>");
            } catch (Exception e) {
                out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalculatorPrimeNumber</title>");
            out.println("</head>");
            out.println("<body>");
            
            out.println("Error");
           
            out.println("</body>");
            out.println("</html>");
            }
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
