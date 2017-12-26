import com.bdqn.dao.ProductMapper;
import com.bdqn.PoJo.Sale;
import com.bdqn.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * Created by sony on 2017/11/27.
 */
public class AddSale {
    @Test
    public void AddSale(){
        SqlSession sqlSession=null;
        Integer row=0;
        Sale sale=new Sale();
        sale.setPrice(5.00);
        sale.setQuantity(89);
        sale.setTotalPrice(445.00);
        sale.setUserId(2);
        sale.setProductId(1);
        try {
            sqlSession= MyBatisUtil.createSqlSession();
            row=sqlSession.getMapper(ProductMapper.class).addSale(sale);
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
            row=0;
        }finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println(row);

    }
}
