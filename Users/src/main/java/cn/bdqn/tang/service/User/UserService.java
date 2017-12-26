package cn.bdqn.tang.service.User;

import cn.bdqn.tang.pojo.Users;
import cn.bdqn.tang.util.PageUtils;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户业务类
 */
public interface UserService {
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
     * 模糊查询
     * @param userName
     * @param pageUtils
     * @return
     */
    List<Users> listUserByName(@Param("userName")String userName,
                               PageUtils pageUtils);

}
