package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PurchaseRepository {
    // Create
    public int insert(@Param("userId") int userId, @Param("productId") int productId, @Param("count") int count);

    // Read
    public List<Purchase> firnAll();

    public Purchase findById();

    // Update
    public int updateById(@Param("id") int id, @Param("userId") int userId, @Param("productId") int productId,
            @Param("count") int count);

    // Delete
    public int deleteById(int id);

}
