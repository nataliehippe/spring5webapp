package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.domein.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
