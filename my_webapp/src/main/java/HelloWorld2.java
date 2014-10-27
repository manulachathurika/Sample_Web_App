import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld2 extends HttpServlet {

    public void init() throws ServletException {
        System.out.println(HelloWorld2.class);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StringBuffer content = new StringBuffer();
        int d;
        while ((d = request.getInputStream().read()) != -1) {
            content.append((char) d);
        }
        System.out.println("----> " + request.getContentType() + " - " + content);

        // Set status code
        response.setStatus(202);
        System.out.println("Sending the response with status code -> 202");

// ---------------------------------------------------------------------------------------------------------------------
//        Set response content type
//        response.setContentType("text/html");

//        Actual logic goes here.
//        PrintWriter out = response.getWriter();
//        out.println("<h1>" + message + "</h1>");
// ---------------------------------------------------------------------------------------------------------------------
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        StringBuffer content = new StringBuffer();
        int d;
        while ((d = request.getInputStream().read()) != -1) {
            content.append((char) d);
        }
        System.out.println("----> " + request.getContentType() + " - " + content);

        // Set status code
        response.setStatus(202);
        System.out.println("Sending the response with status code -> 202");

// ---------------------------------------------------------------------------------------------------------------------
//        Set response content type
//        response.setContentType("text/html");

//        Actual logic goes here.
//        PrintWriter out = response.getWriter();
//        out.println("<h1>" + message + "</h1>");
// ---------------------------------------------------------------------------------------------------------------------
    }

    public void destroy() {
        // do nothing.
    }
}
