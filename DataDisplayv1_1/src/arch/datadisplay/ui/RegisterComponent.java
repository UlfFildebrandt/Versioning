package arch.datadisplay.ui;

import java.util.Properties;

import org.osgi.service.component.ComponentContext;
import org.osgi.service.http.HttpContext;
import org.osgi.service.http.HttpService;

public class RegisterComponent {
	private HttpService httpService = null;
	private DisplayServlet servlet = null;
	
    protected void setHttpService(HttpService httpService) {
    	this.httpService = httpService;
    }

    protected void unsetHttpService(HttpService httpService) {
//        httpService.unregister("/");
        httpService.unregister("/display11");
    }
    
    public void setServlet(DisplayServlet servlet) {
    	this.servlet = servlet;
    }
    
    public void unsetServlet(DisplayServlet servlet) {
    }
    
    protected void activate(ComponentContext context) {
		if ( httpService != null ) {
			HttpContext httpcontext = httpService.createDefaultHttpContext();
	        try {
	            httpService.registerServlet("/display11", servlet, new Properties(), httpcontext);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }   	
		}
    }
}
