package serviceImp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import model.Post;
import repository.BlogRepository;
import service.BlogService;

import java.util.List;

@Service
public class BlogServiceImp implements BlogService {

    @Autowired
    BlogRepository blogRepository;

    @Override
    public List<Post> findAll() {
        return blogRepository.findAll(sortByIdAsc());
    }

    @Override
    public Post findById(long id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Post save(Post post) {
        return blogRepository.save(post);
    }

    private Sort sortByIdAsc() {
        return new Sort(Sort.Direction.DESC, "id");
    }
}