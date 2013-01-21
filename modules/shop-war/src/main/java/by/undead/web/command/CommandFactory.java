package by.undead.web.command;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 20.01.13
 * Time: 17:09
 * To change this template use File | Settings | File Templates.
 */
public class CommandFactory {

    public static Command getProducts(HttpServletRequest request, HttpServletResponse response) {
        Command command = new ShowProductsCommand();
        String id = request.getParameter("id");

        if (id != null) {
            if (id.matches("[0-9]+")) {
                command = new ShowProductCommand(Long.parseLong(id));
            }
        }
        return command;
    }

}
