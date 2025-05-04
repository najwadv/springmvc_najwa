package com.codeid.eshopper.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.codeid.eshopper.entities.Category;
import com.codeid.eshopper.repository.CategoryRepository;
import com.codeid.eshopper.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category addCategory(Category category) {
        // TODO Auto-generated method stub
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategoryById(Long category_id) {
        // TODO Auto-generated method stub
        Category category = categoryRepository.findById(category_id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        categoryRepository.delete(category);
    }

    @Override
    public List<Category> findAllCategory() {
        // TODO Auto-generated method stub
        return categoryRepository.findAll();
    }

    @Override
    public Optional<Category> findCategoryById(Long category_id) {
        // TODO Auto-generated method stub
        return categoryRepository.findById(category_id);
    }

    
}
