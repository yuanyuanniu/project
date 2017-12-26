import com.bdqn.dao.ProductMapper;
import com.bdqn.PoJo.Product;
import com.bdqn.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by sony on 2017/11/27.
 */
public class updateProductById {
    @Test
    public void updateProductById(){
        SqlSession sqlSession=null;
        int row=0;
        Product product=new Product();
        product.setQuantity(200);
        product.setId(2);
        try {
            sqlSession= MyBatisUtil.createSqlSession();
            row=sqlSession.getMapper(ProductMapper.class).updateQuantityById(product);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
            row=0;
        }
        System.out.println(row);
    }
}
