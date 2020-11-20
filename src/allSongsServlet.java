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


public class allSongsServlet extends HttpServlet {

    Library myLibrary;


    public void init() throws ServletException {
        // Do required initialization
      myLibrary = new Library();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {



        // URL /songs?name=birthday

        // String value = request.getParameter("songName");
        //get all the songs.
        // StringBuffer to store reply.
        // For each song, toString() or toHTML
        // write reply back out.


    }

}
