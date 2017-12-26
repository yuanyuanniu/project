import mybatis.dao.GradeMapper;
import mybatis.dao.StudentMapper;
import mybatis.dao.TUserMapper;
import mybatis.entity.Grade;
import mybatis.entity.Student;
import mybatis.entity.TUser;
import mybatis.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserTest {

    @Test
    public void testGetUserListByUserName() {
        SqlSession sqlSession=null;
        List<TUser> list=null;
        try {
            sqlSession=MyBatisUtil.createSqlSession();
            list=sqlSession.getMapper(TUserMapper.class).getUserListByUserName("a");
        } catch (Exception e) {
        e.printStackTrace();
        }finally {
         MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (null != list) {
            for (TUser tUser : list) {
                System.out.println(tUser);
            }
        }
    }

    @Test
    public void testGetUserByUserListByUserNameAndNickName() {
        SqlSession sqlSession=null;
        List<TUser> list=null;
        TUser tUser=new TUser();
        tUser.setNickName("1");
        tUser.setUserName("a");
        try{
            sqlSession=MyBatisUtil.createSqlSession();
            list=sqlSession.getMapper(TUserMapper.class).getUserListByUserNameAndNickName(tUser);
        }catch (Exception e){

        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (null != list) {
            for (TUser user : list) {
                System.out.println(user);
            }
        }
    }

    @Test
    public void testGetUserListByMap() {
        SqlSession sqlSession=null;
        Map<String, String> map = new HashMap();
        map.put("userName", "a");
        map.put("nickName", "明");
        List<TUser> list=null;
        try {
            sqlSession=MyBatisUtil.createSqlSession();
            list = sqlSession.getMapper(TUserMapper.class).getUserListByMap(map);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (null != list) {
            for (TUser tUser : list) {
                System.out.println(tUser);
            }
        }
    }
    @Test
    public void testAddTUser() {
        SqlSession sqlSession=null;
        TUser tUser=new TUser();
        tUser.setUserName("admin7");
        tUser.setNickName("管理员7");
        tUser.setPassword("123");
        int rows=0;
        try {
            sqlSession=MyBatisUtil.createSqlSession();
            rows = sqlSession.getMapper(TUserMapper.class).addTUser(tUser);
            sqlSession.commit();
        } catch (Exception e) {

            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(rows);
    }

    @Test
    public void testUpdateTUser() {
        TUser tUser=new TUser();
        tUser.setPassword("aaa");
        tUser.setNickName("修改昵称");
        tUser.setUserName("修改用户名");
        tUser.setId(3);
        SqlSession sqlSession=null;
        int rows=0;
        try{
            sqlSession=MyBatisUtil.createSqlSession();
            rows = sqlSession.getMapper(TUserMapper.class).updateTUser(tUser);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(rows);
    }

    @Test
    public void testUpdatePassword() {
        SqlSession sqlSession=null;
        int rows=0;
        try {
            sqlSession=MyBatisUtil.createSqlSession();
            rows=sqlSession.getMapper(TUserMapper.class).updatePassword(3,"cc");
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(rows);
    }

    @Test
    public void testDeletTUserById() {
        SqlSession sqlSession=null;
        int rows=0;
        try {
            sqlSession=MyBatisUtil.createSqlSession();
            rows=sqlSession.getMapper(TUserMapper.class).deleteTUserById(4);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(rows);
    }

    @Test
    public void queryStudentByGradeId() {
        SqlSession sqlSession=null;
        List<Student> list=null;
        try {
            sqlSession=MyBatisUtil.createSqlSession();
            list=sqlSession.getMapper(StudentMapper.class).queryStudent();
        } catch (Exception e) {
            e.printStackTrace();

        }finally {
           MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (null != list) {
            for (Student student : list) {
                System.out.println(student);
            }
        }
    }
    @Test
    public void queryGradeById(){
        SqlSession sqlSession=null;
    Grade grade=null;
        try{
        sqlSession=MyBatisUtil.createSqlSession();
        grade=sqlSession.getMapper(GradeMapper.class).queryGradeById(1);
    }catch (Exception e){
        e.printStackTrace();
    }finally {
        MyBatisUtil.closeSqlSession(sqlSession);
    }
        System.out.println(grade);
}
    @Test
    public void testGetUserByUserListByUserNameAndNickName_if() {
        SqlSession sqlSession=null;
        List<TUser> list=null;
        TUser tUser=new TUser();
        //tUser.setNickName("1");
        tUser.setUserName("修");
        try{
            sqlSession=MyBatisUtil.createSqlSession();
            list=sqlSession.getMapper(TUserMapper.class).getUserListByUserNameAndNickName_if(tUser);
        }catch (Exception e){

        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (null != list) {
            for (TUser user : list) {
                System.out.println(user);
            }
        }
    }
    @Test
    public void testGetUserByUserListByUserNameAndNickName_where() {
        SqlSession sqlSession=null;
        List<TUser> list=null;
        TUser tUser=new TUser();
        tUser.setNickName("1");
        tUser.setUserName("修");
        try{
            sqlSession=MyBatisUtil.createSqlSession();
            list=sqlSession.getMapper(TUserMapper.class).getUserListByUserNameAndNickName_where(tUser);
        }catch (Exception e){

        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (null != list) {
            for (TUser user : list) {
                System.out.println(user);
            }
        }
    }
                    //todo
    @Test
    public void testQueryStudentByGradeId_array() {

        SqlSession sqlSession=null;
        Integer[] gradeId={1,3};
        List<Student> list=new ArrayList<Student>();
        sqlSession=MyBatisUtil.createSqlSession();
        list=sqlSession.getMapper(StudentMapper.class).queryStudentByGradeId_array(gradeId);
        MyBatisUtil.closeSqlSession(sqlSession);
        if (list != null) {
            for (Student student : list) {
                System.out.println(student);
            }
        }
    }
    @Test
    public void testQueryStudentByGradeId_list() {

        SqlSession sqlSession=null;
        List<Integer> gradeId=new ArrayList<Integer>();

        gradeId.add(1);
        gradeId.add(2);
        List<Student> list=new ArrayList<Student>();
        sqlSession=MyBatisUtil.createSqlSession();
        list=sqlSession.getMapper(StudentMapper.class).queryStudentByGradeId_list(gradeId);
        MyBatisUtil.closeSqlSession(sqlSession);
        if (list != null) {
            for (Student student : list) {
                System.out.println(student);
            }
        }
    }
//todo
    @Test
    public void testQueryStudentByGradeId_map() {
        SqlSession sqlSession=null;
        List<Integer> gradeIds=new ArrayList<Integer>();
        gradeIds.add(1);
        gradeIds.add(2);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("gradeIds",gradeIds);
        map.put("gender","1");
        List<Student> list=new ArrayList<Student>();
        try {
            sqlSession=MyBatisUtil.createSqlSession();
            list=sqlSession.getMapper(StudentMapper.class).queryStudentByGradeId_map(map);
        } catch (Exception e) {
            e.printStackTrace();
        }
        MyBatisUtil.closeSqlSession(sqlSession);
        if (list != null) {
            for (Student student : list) {
                System.out.println(student);
            }
        }
    }

    @Test
    public void testQueryStudent_choose() {
        SqlSession sqlSession=null;
        List<Student> list=null;
        sqlSession=MyBatisUtil.createSqlSession();
        list=sqlSession.getMapper(StudentMapper.class).queryStudent_choose("","",1);
        MyBatisUtil.closeSqlSession(sqlSession);
        if (list != null) {
            for (Student student : list) {
                System.out.println(student);
            }
        }
    }
}
