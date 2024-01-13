package com.sumin.crud_ex.service;

import com.sumin.crud_ex.payload.CategoryDto;

import java.util.List;

public interface CategoryService {

    CategoryDto createCategroy(CategoryDto categoryDto);

    List<CategoryDto> getAllCategories();

    CategoryDto getCategoryById(long id);

    CategoryDto updateCategoryById(long id,CategoryDto categoryDto);

    String delateCategoryById(long id);
}
