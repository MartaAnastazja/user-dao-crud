package users;

import entity.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/users/delete")
public class UserDelete extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        userDao.remove(Integer.parseInt(request.getParameter("id")));
        response.sendRedirect(request.getContextPath() + "/users/list");
    }
}