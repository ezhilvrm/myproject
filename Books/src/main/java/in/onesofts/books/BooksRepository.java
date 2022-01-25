package in.onesofts.books;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BooksRepository extends JpaRepository<BooksEntity, Integer>{
	@Query(value="select * from book where price::1> and price ::<2",nativeQuery = true)
	public List <BooksEntity> getBooksByPrice(Integer fromprice,Integer toprice);

}
