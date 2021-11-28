import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "RegisterServlet")
public class RegisterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String city = request.getParameter("city");
        String country = request.getParameter("input_field select_option");


        String htmlRespone = "<html>";
        htmlRespone += "<h3> Your First Name is: "+ fname + "<h3> ";
        htmlRespone += "<h3> Your Last Name is: " + lname + "<h3>";
        htmlRespone += "<h3> Your City is: " + city + "<h3>";
        htmlRespone += "<h3> You are: " + country + "<h3>";


        htmlRespone += "</html>";


        writer.println(htmlRespone);



    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
