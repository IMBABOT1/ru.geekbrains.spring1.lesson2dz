package ru.geekbrains.spring1.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.geekbrains.spring1.Model.Product;
import ru.geekbrains.spring1.Repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public Product getById(int id){
        return productRepository.getById(id);
    }

    public void addProduct(Product product){
        productRepository.save(product);
    }
}
