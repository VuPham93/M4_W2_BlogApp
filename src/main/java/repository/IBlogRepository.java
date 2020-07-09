package repository;

import model.Blog;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.transaction.Transactional;
import java.util.List;

public interface IBlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Blog findById(Long id);

    List<Blog> findAll();

    Blog save(Blog blog);

    @Transactional
    void removeById(Long id);

    Blog findByName(String name);
}
