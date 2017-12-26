import com.bdqn.dao.ProductMapper;
import com.bdqn.PoJo.Product;
import com.bdqn.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by sony on 2017/11/27.
 */
public class queryAllProduct {
    @Test
    public void quaryAllProduct(){
        List<Product> list=null;
        SqlSession sqlSession=null;
        try {
            sqlSession= MyBatisUtil.createSqlSession();
            list=sqlSession.getMapper(ProductMapper.class).quseryAllProduct();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        if (list != null) {
            for (Product product : list) {
                System.out.println(product);
            }
        }
    }
}
