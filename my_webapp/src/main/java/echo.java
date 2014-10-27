import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class echo extends HttpServlet {

    public void init() throws ServletException {
        System.out.println(echo.class);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuffer content = new StringBuffer();
        int d;
        while ((d = request.getInputStream().read()) != -1) {
            content.append((char) d);
        }
        System.out.println("----> " + request.getContentType() + " - " + content);

        // Set status code
        response.setStatus(200);
        System.out.println("Sending the response with status code -> 200");

        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Set response content type
        response.setContentType(request.getContentType());

        // Actual logic goes here.
        PrintWriter out = response.getWriter();
        out.println("{\"Customer\":{\"name\":\"Jack\"}}");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuffer content = new StringBuffer();
        int d;
        while ((d = request.getInputStream().read()) != -1) {
            content.append((char) d);
        }
        System.out.println("----> " + request.getContentType() + " - " + content);

        // Set status code
        response.setStatus(201);
        System.out.println("Sending the response with status code -> 201");

        try {
            Thread.sleep(120000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Set response content type
        //response.setContentType(request.getContentType());

        // Actual logic goes here.
        //PrintWriter out = response.getWriter();
        //out.println(content);
    }

    public void destroy() {
        // do nothing.
    }
}
