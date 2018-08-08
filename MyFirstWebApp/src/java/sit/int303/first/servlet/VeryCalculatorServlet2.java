/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import sit.int303.first.model.SimpleCalculator;

/**
 *
 * @author INT303
 */
public class VeryCalculatorServlet2 extends HttpServlet {

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
                String xStr = request.getParameter("x");
                String yStr = request.getParameter("y");
                String operator = request.getParameter("operator");

                int x = Integer.valueOf(xStr);
                int y = Integer.valueOf(yStr);
                if (" ".equals(operator)){
                    operator="+";
                }
                
                SimpleCalculator sc = new SimpleCalculator();
                sc.setX(x);
                sc.setY(y);
                sc.setOperator(operator);
                request.setAttribute("calculator", sc);
                getServletContext().getRequestDispatcher("/SimpleCalculatorView.jsp").forward(request, response);
//                int result = 0;
//
//                switch (operator) {
//                    case "+":
//                        result = x + y;
//                        break;
//                    case "-":
//                        result = x - y;
//                        break;
//                    case "*":
//                        result = x * y;
//                        break;
//                    case "/":
//                        result = x / y;
//                        break;
//                }

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet VeryCalculatorServlet2</title>");
                out.println("</head>");
                out.println("<body>");
                
                out.println("<h1 style='color:red'>");
                out.println(sc.toString());
                out.println("</h1>");
                
                
                out.println("</body>");
                out.println("</html>");
            } catch (Exception e) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet VeryCalculatorServlet2</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>invalid input!!!</h1>");
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
