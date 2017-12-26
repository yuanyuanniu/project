package com.bdqn.dao;

import com.bdqn.PoJo.Product;
import com.bdqn.PoJo.Sale;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by sony on 2017/11/27.
 */
public interface ProductMapper {
    //查询全部商品信息
    public List<Product> quseryAllProduct();
    //通过商品id查产品库存
    public Integer queryQuantityById(Integer id);
    //修改库存
    public Integer updateQuantityById(Product product);
    //添加销售记录
    public Integer addSale(Sale sale);
    List<Sale> queryPageSale(@Param("from") Integer form,
                             @Param("pageSize") Integer pageSize);


    public Integer queryCountSale();
}


