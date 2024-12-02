package forchcollect.read.wannaread;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "boardListController", urlPatterns = "/board/list")
public class BoardListController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doGet");

        req.getRequestDispatcher("/WEB-INF/board/list.jsp")
                .forward(req, resp);
    }
}
