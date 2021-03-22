package repository;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Post;

public interface CodeblogRepository extends JpaRepository<Post, Long>{

}
