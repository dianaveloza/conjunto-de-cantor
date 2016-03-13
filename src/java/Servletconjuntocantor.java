/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SALA6
 */
@WebServlet(urlPatterns = {"/Servlet"})
public class Servletconjuntocantor extends HttpServlet {

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
            double b=0.333333333;
            double c=0.666666666;
            double d=0.111111111;
            double e=0.222222222;
            double f=0.777777777;
            double g=0.888888888;
            String numero1=request.getParameter("numero");
            double numero2=Double.parseDouble(numero1);
            if(numero2>b &numero2<c)
                out.println("<h1>el numero salio en la primera iteracion "  + "</h1>");
            else

//             
                if(numero2>e &numero2<b)
                    out.println("<h1>el numero salio en la segunda iteracion "  + "</h1>");
            else

//       
                if(numero2>d &numero2<e)
                    out.println("<h1>el numero salio en la tercera iteracion "  + "</h1>");
            else

//                
                if(numero2>=0 &numero2<d)
                    out.println("<h1>el numero salio en la cuarta iteracion "  + "</h1>");
            else

//             
                if(numero2>c &numero2<f)
                    out.println("<h1>el numero salio en la quinta iteracion "  + "</h1>");
            else

//                
                if(numero2>f &numero2<g)
                    out.println("<h1>el numero salio en la sexta iteracion "  + "</h1>");
            else

//               
                if(numero2>g &numero2<=1)
                    out.println("<h1>el numero salio en la septima iteracion iteracion "  + "</h1>");
            /* TODO output your page here. You may use following sample code. */
          
            
           
                   
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ejemplo</title>");            
            out.println("</head>");
            out.println("<body>");
            
                    
            out.println("<h1>El numero ingresado es : " + request.getParameter("numero") + "</h1>");
            
            
          
            out.println("</body>");
            out.println("</html>");
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