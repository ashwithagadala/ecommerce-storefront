package com.ecom.productcatlog.config;

import com.ecom.productcatlog.model.Category;
import com.ecom.productcatlog.model.Product;
import com.ecom.productcatlog.repository.CategoryRepository;
import com.ecom.productcatlog.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
      // clear all exisitng data
        productRepository.deleteAll();
        categoryRepository.deleteAll();
        //Create Categories
        Category electronics=new Category();
        electronics.setName("Electronics");
        Category clothing=new Category();
        clothing.setName("Clothing");
        Category home=new Category();
        home.setName("Home and Kitchen");
        categoryRepository.saveAll(Arrays.asList(electronics,home,clothing));
        //create Products
        Product phone=new Product();
        phone.setName("SmartPhone");
        phone.setDescription("Latest mode smartphone with amazing features");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(699.99);
        phone.setCategory(electronics);

        Product laptop=new Product();
        laptop.setName("Laptop");
        laptop.setDescription("High Performance Laptop");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(999.99);
        laptop.setCategory(electronics);

        Product jacket=new Product();
        jacket.setName("Winter Jacket");
        jacket.setDescription("Warm and cozy jacket");
        jacket.setImageUrl("https://placehold.co/600x400");
        jacket.setPrice(123.99);
        jacket.setCategory(clothing);

        Product blender=new Product();
        blender.setName("Blender");
        blender.setDescription("High speed blender");
        blender.setImageUrl("https://placehold.co/600x400");
        blender.setPrice(99.99);
        blender.setCategory(home);
        productRepository.saveAll(Arrays.asList(phone,laptop,jacket,blender));

    }
}
