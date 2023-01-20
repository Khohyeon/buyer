package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import shop.mtcoding.buyer.dto.PurchaseAllDto;

@Mapper
public interface ProductRepository {
    // Create
    public int insert(String name, int price, int qty);

    // Read
    public List<Product> findAll();

    public Product findById(int id);

    public int findByQty(int qty);

    // Update
    public int updateById(@Param("id") int id, @Param("name") String name, @Param("price") int price,
            @Param("qty") int qty);

    // Delete
    public int deleteById(int id);

}
