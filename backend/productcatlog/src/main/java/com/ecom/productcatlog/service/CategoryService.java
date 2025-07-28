package com.ecom.productcatlog.service;

import org.springframework.stereotype.Service;
import com.ecom.productcatlog.repository.CategoryRepository;
import java.util.List;
import java.util.Locale;
import com.ecom.productcatlog.model.Category;

@Service
public class CategoryService {
    private  final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return  categoryRepository.findAll();
    }
}
