import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mixan on 30.05.2017.
 */
@SuppressWarnings("serial")
public class TestServlet extends HttpServlet {

    //private static final long serialVersionUID = 1L;


    public TestServlet() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        String userName = (String)req.getParameter("username");
        userName = userName.toUpperCase();
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<!DOCTYPE HTML>");
        resp.getWriter().println("<html><body><p>".concat(userName).concat("</p></body></html>"));
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        doGet(req, resp);
    }

}


