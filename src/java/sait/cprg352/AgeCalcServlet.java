/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 684243
 */
@WebServlet(name = "AgeCalcServlet", urlPatterns = {"/AgeCalcServlet"})
public class AgeCalcServlet extends HttpServlet {

 
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       getServletContext().getRequestDispatcher("/WEB-INF/ageCalc.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try{
            int number = Integer.parseInt(request.getParameter("age"));
            number = number + 1;
            request.setAttribute("a","You will be " + number + " next year!");
        }catch(NumberFormatException e){
            request.setAttribute("a", "You should enter a valid age");
        }finally{
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalc.jsp").forward(request,response);
        }
       
    }

}
