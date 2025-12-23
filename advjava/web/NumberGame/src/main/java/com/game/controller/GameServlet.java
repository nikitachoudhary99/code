package com.game.controller;

import com.game.model.GameModel;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet("/guess")
public class GameServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        GameModel model = (GameModel) session.getAttribute("GameModel");
        if (model == null) {
            model = new GameModel();
            session.setAttribute("GameModel", model);
        }

        int guess = Integer.parseInt(request.getParameter("guess"));
        boolean isCorrect = model.checkGuess(guess);

        request.setAttribute("message", model.getMessage());
        request.setAttribute("isCorrect", isCorrect);
        RequestDispatcher rd = request.getRequestDispatcher("Result.jsp");
        rd.forward(request, response);
    }
}
