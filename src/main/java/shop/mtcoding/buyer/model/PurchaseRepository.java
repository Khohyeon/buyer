package shop.mtcoding.buyer.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PurchaseRepository {
    // Create
    public int insert(int qty);

    // Read
    public List<Purchase> firnAll();

    public Purchase findById();

    // Update
    public int updateById(int id, int userId, int productId);

    // Delete
    public int deleteById(int id);

    public List<Product> findAll();
}
