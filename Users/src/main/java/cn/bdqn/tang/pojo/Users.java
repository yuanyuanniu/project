package cn.bdqn.tang.pojo;

import java.sql.Date;

/**
 * 用户
 */
public class Users {


    private Integer id;  //用户Id
    private String name;  //用户姓名
    private String password;  //用户密码
    private Integer status;     //用户状态 0为冻结 1为正常
    private Date lastModifyTimedata;  //最后修改时间
    private int typeId;  //用户类型
    private String typeName;



    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                ", lastModifyTimedata=" + lastModifyTimedata +
                ", typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", count=" + count +
                '}';
    }

    private Integer count;//总记录数

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getLastModifyTimedata() {
        return lastModifyTimedata;
    }

    public void setLastModifyTimedata(Date lastModifyTimedata) {
        this.lastModifyTimedata = lastModifyTimedata;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }
}
