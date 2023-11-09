// Q2. Design a servlet to display message as “Welcome IP address of client” to visitor.
//not run program because not install sevlet tomcat sever
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet3 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // Get the client's IP address
        String ipAddress = request.getRemoteAddr();

        // Set the content type to HTML
        response.setContentType("text/html");

        // Get the PrintWriter to write the response
        PrintWriter out = response.getWriter();

        // Create an HTML response
        out.println("<html>");
        out.println("<head><title>Welcome</title></head>");
        out.println("<body>");
        out.println("<h1>Welcome " + ipAddress + "</h1>");
        out.println("</body>");
        out.println("</html>");
    }
}
