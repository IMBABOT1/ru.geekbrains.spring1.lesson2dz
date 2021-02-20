package ru.geekbrains.spring1.Repository;

import org.springframework.stereotype.Component;
import ru.geekbrains.spring1.Model.Product;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class ProductRepository {

    private List<Product> list;

    @PostConstruct
    public void init(){
        list = new ArrayList<>();
        list.add(new Product(1, "Bread", 1));
        list.add(new Product(2, "Milk", 2));
        list.add(new Product(3, "Water", 3));
        list.add(new Product(4, "Lemon", 4));
        list.add(new Product(5, "Book", 5));
    }

    public List<Product> getAll(){
        return Collections.unmodifiableList(list);
    }

    public Product getById(int id){
        return list.get(id);
    }

    public void save(Product product){
        list.add(product);
    }

    public void deleteById(Long id){
        list.removeIf(product -> product.getId() == id);
    }
}
