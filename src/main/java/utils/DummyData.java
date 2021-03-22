package utils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import model.Post;
import repository.CodeblogRepository;

@Component
public class DummyData {
	
	@Autowired
	CodeblogRepository codeblogrepository;
	
	//@PostConstruct
	public void savePosts(){
		
		List<Post> postlista = new ArrayList<>();

		Post post1 = new Post();
		post1.setAutor("Keven Silva");
		post1.setData(LocalDate.now());
		post1.setTitulo("Doker");
		post1.setTexto("Exemplo texto sobre docker");
		
		Post post2 = new Post();
		post2.setAutor("Keven Silva");
		post2.setData(LocalDate.now());
		post2.setTitulo("API Rest");
		post2.setTexto("Exemplo texto sobre API Rest");
		
		postlista.add(post1);
		postlista.add(post2);
		
		for (Post post : postlista) {
			Post postSave = codeblogrepository.save(post);
			System.out.println(postSave.getId());
		}
	}
}