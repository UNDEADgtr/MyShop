package by.undead.dao;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 19.01.13
 * Time: 22:52
 * To change this template use File | Settings | File Templates.
 */
public interface DAO<T> {

    T create(T t) throws DaoException;

    List<T> readAll() throws DaoException;

    List<T> readAll(String query) throws DaoException;

    T read(Long id) throws DaoException;

    T read(String query) throws DaoException;

    T update(T t) throws DaoException;

    void delete(Integer id) throws DaoException;

    void delete(T t) throws DaoException;

}
