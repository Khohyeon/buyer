package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProductRepository {
    // Create
    public int insert(String name, int price, int qty);

    // Read
    public List<Product> findAll();

    public Product findById(int id);

    public int findByQty(int qty);

    // Update
    public int updateById(int id, String name, int price, int qty);

    // Delete
    public int deleteById(int id);

    public int updateByQty(@Param("id") int id, @Param("qty") int qty);
}
