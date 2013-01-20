package by.undead.web.controller;

import by.undead.web.command.Command;
import by.undead.web.command.CommandFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 20.01.13
 * Time: 17:04
 * To change this template use File | Settings | File Templates.
 */
public class ProductController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        CommandFactory.getProducts(req, resp).execute(req, resp);
        //Command com = CommandFactory.getProducts(req, resp);
        //com.execute(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
