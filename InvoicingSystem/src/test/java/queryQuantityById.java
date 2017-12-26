import com.bdqn.dao.ProductMapper;
import com.bdqn.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by sony on 2017/11/27.
 */
public class queryQuantityById {
    @Test
    public void queryQuantityById(){
        int row=0;
        SqlSession sqlSession=null;
        try {
            sqlSession= MyBatisUtil.createSqlSession();
            row=sqlSession.getMapper(ProductMapper.class).queryQuantityById(1);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println("库存量为：");
        System.out.println(row);

    }

}
