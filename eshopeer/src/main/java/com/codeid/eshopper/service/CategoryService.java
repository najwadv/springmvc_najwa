package com.codeid.eshopper.service;

import java.util.List;
import java.util.Optional;

import com.codeid.eshopper.entities.Category;

public interface CategoryService {
    
    List<Category> findAllCategory();

    Category addCategory(Category category);

    Optional<Category> findCategoryById(Long category_id);

    void deleteCategoryById(Long category_id);
}
