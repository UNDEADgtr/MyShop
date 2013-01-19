package by.undead.util;

import org.hibernate.cfg.DefaultNamingStrategy;

/**
 * Created with IntelliJ IDEA.
 * User: Dzmitry
 * Date: 19.01.13
 * Time: 22:35
 * To change this template use File | Settings | File Templates.
 */
public class MyNamingStrategy extends DefaultNamingStrategy {
    @Override
    public String classToTableName(String className) {
        return super.classToTableName(className);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public String propertyToColumnName(String propertyName) {
        return super.propertyToColumnName(propertyName);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public String tableName(String tableName) {
        return super.tableName(tableName);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public String columnName(String columnName) {
        return super.columnName(columnName);    //To change body of overridden methods use File | Settings | File Templates.
    }
}
