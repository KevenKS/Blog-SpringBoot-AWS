package repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Post;

@Repository
public interface BlogRepository extends JpaRepository<Post, Long> {
}
