package shop.mtcoding.buyer.controller.model;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductRepository {
    // Create
    public int insert(String name, int price, int qty);

    // Read
    public List<Product> firnAll();

    public Product findById();

    // Update
    public int updateById(int id, String name, int price, int qty);

    // Delete
    public int deleteById(int id);
}