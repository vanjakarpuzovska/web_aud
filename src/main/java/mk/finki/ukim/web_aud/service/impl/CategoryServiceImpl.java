package mk.finki.ukim.web_aud.service.impl;

import mk.finki.ukim.web_aud.model.Category;
import mk.finki.ukim.web_aud.repository.InMemoryCategoryRepository;
import mk.finki.ukim.web_aud.service.CategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    private final InMemoryCategoryRepository categoryRepository;

    public CategoryServiceImpl(InMemoryCategoryRepository categoryRepository){
        this.categoryRepository=categoryRepository;
    }

    @Override
    public Category create(String name, String desc) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        Category c = new Category(name,desc);
        categoryRepository.save(c);
        return c;
    }

    @Override
    public Category update(String name, String desc) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        Category c = new Category(name,desc);
        categoryRepository.save(c);
        return c;
    }

    @Override
    public void delete(String name) {
        if(name == null || name.isEmpty()){
            throw new IllegalArgumentException();
        }
        categoryRepository.delete(name);
    }

    @Override
    public List<Category> listCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> searchCategories(String searchText) {
        return categoryRepository.search(searchText);
    }
}
