//package com.wenkong.test;
//
//import com.wenkong.mapping.TemperatureMapping;
//import com.wenkong.pojo.QqcMct;
//import org.apache.ibatis.io.Resources;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.session.SqlSessionFactoryBuilder;
//
//import java.io.InputStream;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MybatisTest {
//    public static void main(String[] args) throws Exception{
//        InputStream inputStream= Resources.getResourceAsStream("mybatis/sqlMapConfig.xml");
//        SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory = builder.build(inputStream);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        TemperatureMapping mapper = sqlSession.getMapper(TemperatureMapping.class);
//        mapper.queryTemperature(1.0);
//        List<QqcMct> list=new ArrayList<>();
//        for (QqcMct a:list){
//            System.out.println(a);
//        }
//        sqlSession.close();
//    }
//}
