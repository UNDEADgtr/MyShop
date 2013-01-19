package by.undead.dao;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 19.01.13
 * Time: 22:56
 * To change this template use File | Settings | File Templates.
 */
public class DaoException extends Exception {
    public DaoException(Exception ex) {
        super(ex.getMessage());
    }

    public DaoException(String message) {
        super(message);
    }
}
