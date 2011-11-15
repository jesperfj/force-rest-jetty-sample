import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.example.entity.Account;

import com.force.api.ApiConfig;
import com.force.api.DataApi;
import com.force.api.SObjectResource;

public class HelloWorld {

    public static void main(String[] args) throws Exception{

    	Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");
        server.setHandler(context);

        String url = System.getenv("FORCE_DEV_URL");
        if(url==null) {
        	System.out.println("You must set FORCE_DEV_URL environment variable to a valid URL of the form: force://loginEndpoint?params");
        	System.exit(1);
        }
               
        final DataApi api = new DataApi(new ApiConfig().setForceURL(url));
        
        
        context.addServlet(new ServletHolder(new HttpServlet() {
        	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        		throws ServletException, IOException {
        		
        		Account a = api.get(new SObjectResource()
        			.setType("Account")
        			.setId("001A000000h6kkbIAA")).as(Account.class);
        		
                resp.getWriter().print("Hello from Java!\nHere's an account:\nid="+a.getId()+"\nname="+a.getName());
        	}
        }),"/*");
        server.start();
        server.join();   
    }
}
