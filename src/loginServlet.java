import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class loginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("username");
        String pw = request.getParameter("password");
        // logic to check and see in the password is correct.

        response.setContentType("text/html");
       // get the home page. get content from a file.

        PrintWriter out = response.getWriter();

        out.println("");


    }


}