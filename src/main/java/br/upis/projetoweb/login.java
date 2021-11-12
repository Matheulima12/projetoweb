package br.upis.projetoweb;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/Login")
public class login extends HttpServlet {
    private List<String> logins = new ArrayList<>();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session;
        String login = req.getParameter("login");
        String senha = req.getParameter("senha");

        if(login.equals("administrator") && senha.equals("administrator")){
            this.logins.add("Login feito com sucesso:".concat(login.concat(" - ").concat(senha)));
            session= req.getSession();
            session.setMaxInactiveInterval(15);

        }else{
            this.logins.add("Erro no login:".concat(login.concat(" - ").concat(senha)));

        } req.setAttribute("logins",logins);
        RequestDispatcher dispatcher= req.getRequestDispatcher("telalogin.jsp");
        dispatcher.forward(req,resp);

    }
}
