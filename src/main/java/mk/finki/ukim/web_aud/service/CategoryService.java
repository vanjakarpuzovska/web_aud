package mk.finki.ukim.web_aud.service;

import mk.finki.ukim.web_aud.model.Category;

import java.util.List;

public interface CategoryService {
    Category create(String name, String desc);

    Category update(String name, String desc);

    void delete(String name);

    List<Category> listCategories();

    List<Category>  searchCategories(String searchText);
}
