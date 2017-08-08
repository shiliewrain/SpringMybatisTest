package com.shiliew.test;

import com.shiliew.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

public class Test {

    private static SqlSessionFactory sqlSessionFactory;

    private static Reader reader;

    static {
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static SqlSessionFactory getSqlSessionFactory(){
        return sqlSessionFactory;
    }

    public static void main(String [] args){
        SqlSession session = sqlSessionFactory.openSession();
        try {
            User user = session.selectOne("com.shiliew.dao.UserDao.selectUserById",1);
            System.out.println(user.getName());
            System.out.println(user.getPassword());
        }finally {
            session.close();
        }
    }
}
