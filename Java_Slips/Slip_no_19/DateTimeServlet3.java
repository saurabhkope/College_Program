//Q2. Write a servlet program to display current date and time of server.
//not run program download serlet package

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DateTimeServlet")
public class DateTimeServlet3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        out.println("<html><head><title>Server Date and Time</title></head><body>");
        out.println("<h1>Server Date and Time:</h1>");
        out.println("<p>" + new Date() + "</p>");
        out.println("</body></html>");
    }
}
