package mybatis.dao;

import mybatis.entity.TUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/11/18/018.
 */
public interface TUserMapper {

    Integer queryCount();

    List<TUser> queryAll();

    public List<TUser> getUserListByUserName(String userName);

    public List<TUser> getUserListByUserNameAndNickName(TUser user);

    public List<TUser> getUserListByMap(Map<String,String> mpa);

    public Integer addTUser(TUser tUser);

    public Integer updateTUser(TUser tUser);

    public Integer updatePassword(@Param("id") Integer id, @Param("password")String pwd);

    public Integer deleteTUserById(Integer id);
    public List<TUser> getUserListByUserNameAndNickName_if(TUser user);

    public List<TUser> getUserListByUserNameAndNickName_where(TUser user);

}
