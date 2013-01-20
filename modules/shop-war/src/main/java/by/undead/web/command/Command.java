package by.undead.web.command;


import by.undead.dao.DaoException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 20.01.13
 * Time: 16:50
 * To change this template use File | Settings | File Templates.
 */
public interface Command {
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
