package service;

import java.util.List;

import model.Post;

public interface CodeblogService {

	List<Post> findAll();
	Post findById(Long id);
	Post save(Post post);
}
