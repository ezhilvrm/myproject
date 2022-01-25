package in.onesofts.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {
	@Autowired
	BooksRepository booksrepo;
	
	@GetMapping("/")
	public String showMsg() {
		return "Welcome to BOOK WORLD";
	}
	
	@GetMapping("/ezhil/")
	public List<BooksEntity>allBook(){
		return booksrepo.findAll();
	}
	@GetMapping("/ezhil/{id}")
	public  BooksEntity getBookById(@PathVariable("id")Integer id){
		return booksrepo.findById(id).get();
	}
	@PostMapping("/post/")
	public String  saveBooks(@RequestBody BooksEntity b1) {
		return booksrepo.save(b1)+"Saved SucessFully";
	}
	@GetMapping("/ezhil/{fromprice}/{toprice}")
	public List<BooksEntity> getBooksByPriceFilter(@PathVariable("fromprice")Integer fromprice,@PathVariable("toprice")Integer toprice){
		return booksrepo.getBooksByPrice(fromprice, toprice);
	}
	@DeleteMapping("/post/{id}")
	public String DeleteId(@PathVariable("id")Integer Id) {
		return booksrepo.findById(Id)+"Deleted SucessFully";
	}

}