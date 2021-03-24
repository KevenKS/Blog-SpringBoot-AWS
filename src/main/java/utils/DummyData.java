package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import model.Post;
import repository.BlogRepository;


@Component
public class DummyData {

    @Autowired
    BlogRepository blogRepository;

    //@PostConstruct
    public void savePosts(){

        List<Post> postList = new ArrayList<>();
        Post post1 = new Post();
        post1.setAutor("Kleyton");
        post1.setData(LocalDate.now());
        post1.setTitulo("Docker");
        post1.setTexto("Teste");

        Post post2 = new Post();
        post2.setAutor("Keven");
        post2.setData(LocalDate.now());
        post2.setTitulo("API REST");
        post2.setTexto("Teste");

        postList.add(post1);
        postList.add(post2);

        for(Post post: postList){
            Post postSaved = blogRepository.save(post);
            System.out.println(postSaved.getId());
        }
    }
}