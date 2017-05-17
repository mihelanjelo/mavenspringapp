import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by mihelanjelo on 17.05.17.
 */
public class HelloController extends HttpServlet {

    public void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse){
        try {
            httpServletResponse.getWriter().print("Hello from servlet");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
