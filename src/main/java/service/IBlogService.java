package service;

import model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    Blog findById(Long id);

    Blog findByName(String name);

    void remove(Long id);
}
