package com.bdqn.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by lenovo on 2017/11/18.
 */
public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        String source = "mybatis-config.xml";
        try {
            InputStream inputStream = Resources.getResourceAsStream(source);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession createSqlSession(){
        return sqlSessionFactory.openSession(false);
    }
    public static void closeSqlSession(SqlSession sqlSession){
        if (null != sqlSession) {
            sqlSession.close();
        }
    }
}
