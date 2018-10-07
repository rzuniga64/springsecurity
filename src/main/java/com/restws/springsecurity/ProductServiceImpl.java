package com.restws.springsecurity;

import com.restws.springsecurity.model.Product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service // Spring annotation. Spring will scan through classes & determine this is a Service class.
public class ProductServiceImpl implements ProductService {

    private List<Product> products = new ArrayList<>();
    private long id = 123;

    ProductServiceImpl() {

        Product product = new Product();
        product.setId(++id);
        product.setDescription("Angular 6 Crash Course");
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public long addProduct(Product product) {

        product.setId(++id);
        products.add(product);
        return product.getId();
    }
}
