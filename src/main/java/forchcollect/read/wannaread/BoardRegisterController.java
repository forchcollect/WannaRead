package forchcollect.read.wannaread;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "boardRegisterController", urlPatterns = "/board/register")
public class BoardRegisterController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("입력 화면을 볼 수 있도록 구성");

        resp.sendRedirect("/board/list");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("입력을 처리하고 목록 페이지로 이동");

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/board/register.jsp");

        dispatcher.forward(req, resp);
        
    }
}
