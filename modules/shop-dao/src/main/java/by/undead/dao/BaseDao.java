package by.undead.dao;

import by.undead.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 19.01.13
 * Time: 23:11
 * To change this template use File | Settings | File Templates.
 */
public class BaseDao<T> implements DAO<T> {

    private Class cl;

    private HibernateUtil util = HibernateUtil.getInstance();

    public BaseDao(Class<T> cl) {
        this.cl = cl;
    }

    @Override
    public T create(T t) throws DaoException {
        Session session = util.getSession();
        Transaction trans = session.beginTransaction();
        try {
            session.save(t);
            trans.commit();
        } catch (HibernateException ex) {
            trans.rollback();
            throw new DaoException(ex);
        }

        return t;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<T> readAll() throws DaoException {
        Session session = util.getSession();
        Transaction trans = session.beginTransaction();
        List<T> list = new ArrayList<T>();
        try {
            list = session.createCriteria(cl).list();
            trans.commit();
        } catch (HibernateException ex) {
            trans.rollback();
            throw new DaoException(ex);
        }
        return list;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<T> readAll(String query) throws DaoException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T read(Long id) throws DaoException {
        Session session = util.getSession();
        Transaction trans = session.beginTransaction();
        T t;
        try {
            t = (T) session.get(cl, id);
            trans.commit();
        } catch (HibernateException ex) {
            trans.rollback();
            throw new DaoException(ex);
        }
        return t;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T read(String query) throws DaoException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public T update(T t) throws DaoException {
        Session session = util.getSession();
        Transaction trans = session.beginTransaction();
        try {
            session.saveOrUpdate(t);
            trans.commit();
        } catch (HibernateException ex) {
            trans.rollback();
            throw new DaoException(ex);
        }
        return t;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void delete(Integer id) throws DaoException {
        Session session = util.getSession();
        Transaction trans = session.beginTransaction();
        try {
            session.delete(session.get(cl, id));
            trans.commit();
        } catch (HibernateException ex) {
            trans.rollback();
            throw new DaoException(ex);
        }
    }

    @Override
    public void delete(T t) throws DaoException {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
