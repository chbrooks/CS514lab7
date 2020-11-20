

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * This class uses Jetty & servlets to implement server serving hotel and review info
 */
public class TestServer {

    private static final int PORT = 8081;

    public TestServer() {

    }

    /**
     * Function that starts the server with correct servlets
     *
     * @throws Exception throws exception if access failed
     */
    public static void main(String[] args) throws Exception {
        Server server = new Server(PORT); // jetty server
        HandlerList hlist = new HandlerList();

        // static content will be served here.
        ResourceHandler rHandler = new ResourceHandler();
        rHandler.setDirectoriesListed(false);
        rHandler.setResourceBase("/Users/cbrooks/courses/Fall20/cs514/labs/lab7/content");

        ServletHandler sHandler = new ServletHandler();

        // FILL IN CODE:
        sHandler.addServletWithMapping(new ServletHolder(new TestServlet()), "/test");
        sHandler.addServletWithMapping(new ServletHolder(new Stage1()), "/stage1");
        sHandler.addServletWithMapping(new ServletHolder(new Stage2()), "/stage2");
        sHandler.addServletWithMapping(new ServletHolder(new Stage3()), "/stage3");
        sHandler.addServletWithMapping(new ServletHolder(new allSongsServlet()), "/allSongs");
        sHandler.addServletWithMapping(new ServletHolder(new loginServlet()), "/login");


        hlist.setHandlers(new Handler[] {rHandler, sHandler});
        server.setHandler(hlist);
        server.start();
        server.join();
    }

}
