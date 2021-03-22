package serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Post;
import repository.CodeblogRepository;
import service.CodeblogService;

@Service
public class CodeblogServiceImp implements CodeblogService  {

	@Autowired
	CodeblogRepository codeblogrepository;
	
	@Override
	public List<Post> findAll() {
		return codeblogrepository.findAll();
	}

	@Override
	public Post findById(Long id) {
		return codeblogrepository.findById(id).get();
	}

	@Override
	public Post save(Post post) {
		return codeblogrepository.save(post);
	}

}
