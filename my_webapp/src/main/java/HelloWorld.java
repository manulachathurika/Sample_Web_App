import javax.servlet.*;
import java.io.IOException;

public class HelloWorld implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println(HelloWorld.class);
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

        StringBuffer content = new StringBuffer();
        int d;
        while ((d = servletRequest.getInputStream().read()) != -1) {
            content.append((char) d);
        }
        System.out.println("----> " + servletRequest.getContentType() + " - " + content);
    }

    @Override
    public String getServletInfo() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void destroy() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
