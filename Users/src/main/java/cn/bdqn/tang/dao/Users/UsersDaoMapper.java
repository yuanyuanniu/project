package cn.bdqn.tang.dao.Users;

import cn.bdqn.tang.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by main on 2017/12/4.
 */
public interface UsersDaoMapper {
    /**
     * 根据用户Id查询用户名和密码
     * @param id
     * @return
     */
    Users queryUserById(Integer id);

    /**
     * 修改指定id的用户密码
     * @param id
     * @param password
     * @return >0成功
     */
    int updataPassword(@Param("id") Integer id, @Param("password") String password);

    /**
     * 输入用户名模糊查询用户信息，不输入或为空查询所有
     * @param userName
     * @param form
     * @param pageSize
     * @return
     */
    List<Users> listUserByName(@Param("userName")String userName,
                               @Param("form")Integer form,
                               @Param("pageSize")Integer pageSize);


    /**
     * 按照模糊查询统计总记录数
     * @param userName
     * @return
     */
    Integer count(String userName);

}
