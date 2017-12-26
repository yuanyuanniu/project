import com.bdqn.dao.ProductMapper;
import com.bdqn.PoJo.Sale;
import com.bdqn.util.MyBatisUtil;
import com.bdqn.util.PageUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by sony on 2017/11/27.
 */
public class QueryPageSale {
    @Test
    public void queryPageSale() throws Exception {
        SqlSession sqlSession = null;
        Integer count = null;
        Integer pageSize = 3;
        Integer currPage = 1;
        List<Sale> pageSaleList = null;
        PageUtil pageUtil=null;

        try {
            sqlSession = MyBatisUtil.createSqlSession();
            count = sqlSession.getMapper(ProductMapper.class).queryCountSale();
            pageUtil = new PageUtil(count, pageSize, currPage);
            pageSaleList = sqlSession.getMapper(ProductMapper.class).queryPageSale(pageUtil.getFrom() , pageSize);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            MyBatisUtil.closeSqlSession(sqlSession);
        }
        System.out.println("总页数：" + pageUtil.getTotolPage());
        System.out.println("当前是第" + currPage + "页");
        System.out.println("页面内容");
        for (Sale sale : pageSaleList) {
            System.out.println(sale);
        }
    }

}
