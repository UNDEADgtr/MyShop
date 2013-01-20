package by.undead.web.command;

import by.undead.dao.BaseDao;
import by.undead.dao.DaoException;
import by.undead.entity.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 20.01.13
 * Time: 17:12
 * To change this template use File | Settings | File Templates.
 */
public class ShowProductsCommand implements Command {
    BaseDao productDao = new BaseDao(Product.class);
    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String url = "/WEB-INF/jsp/user/products.jsp";
        List<Product> list = null;
        try {
        list = productDao.readAll();
        } catch (Exception ex){
            System.out.println(ex);
        }
        RequestDispatcher disr = request.getRequestDispatcher(url);
        request.setAttribute("products", list);
        disr.forward(request, response);
    }
}
