package dev.vaibhav.productservice;
import dev.vaibhav.productservice.Repositories.CategoryRepository;
import dev.vaibhav.productservice.Repositories.PriceRepository;
import dev.vaibhav.productservice.Repositories.ProductRepository;
import dev.vaibhav.productservice.inheritanceexample.joinedtable.Mentor;
import dev.vaibhav.productservice.inheritanceexample.joinedtable.MentorRepository;
import dev.vaibhav.productservice.inheritanceexample.joinedtable.Student;
import dev.vaibhav.productservice.inheritanceexample.joinedtable.StudentRepository ;
import dev.vaibhav.productservice.inheritanceexample.tableperclass.User;
import dev.vaibhav.productservice.inheritanceexample.tableperclass.UserRepository;
import dev.vaibhav.productservice.models.Category;
import dev.vaibhav.productservice.models.Price;
import dev.vaibhav.productservice.models.Product;
import jakarta.persistence.Cache;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class ProductserviceApplication implements CommandLineRunner {

	private MentorRepository mentorRepository ;
	private StudentRepository studentRepository ;

	private CategoryRepository categoryRepository ;
	private ProductRepository productRepository ;
	private PriceRepository priceRepository ;


	public ProductserviceApplication(MentorRepository mentorRepository,
									 StudentRepository studentRepository,
									 ProductRepository productRepository,
									 CategoryRepository categoryRepository,
									 PriceRepository priceRepository) {
		this.mentorRepository = mentorRepository ;
		this.studentRepository = studentRepository ;
		this.categoryRepository = categoryRepository ;
		this.productRepository = productRepository ;
		this.priceRepository = priceRepository ;
	}


	public static void main(String[] args) {

		SpringApplication.run(ProductserviceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		Mentor mentor = new Mentor() ;
//		mentor.setName("Vaibhav Srivastava");
//		mentor.setEmail("vbhvsri12@gmail.com");
//		mentor.setAvgRating(100.0);
//
//		mentorRepository.save(mentor) ;
//
//		User user = new User() ;
//		user.setName("Tushar");
//		user.setId(1);
//		user.setEmail("tushar10@gmail.com");
//
//		userRepository.save(user) ;
//
//		Student student = new Student() ;
//		student.setName("Swaroop");
//		student.setId(2);
//		student.setEmail("Swaroop7@gmail.com");
//		student.setBatch("Batch1");
//		student.setPsp(99.9);
//
//		studentRepository.save(student) ;
//
//		List<User> users = userRepository.findAll() ;
//		users.forEach(user2 -> {
//			System.out.println(user2.getName());
//		});
////		when you do findAll with tableperclass = they do a union and get all the data, in
////		 tableperclass you get the data in individual tables not in one table,. but as a result of
////		findALl they do a union of table and get us the details.

//		Student student = new Student();
//		student.setName("Utkarsh Chauhan");
//		student.setEmail("Chauhan10@gmail.com");
//		student.setBatch("Batch2");
//		student.setPsp(98.0);
//
//		studentRepository.save(student) ;
//
//		Category category = new Category();
//		category.setName("Electronics");
//
//		Category Category = categoryRepository.save(category) ;
//
//		Price price  = new Price("Rupee", 10.0) ;
//		Price savedPrice = priceRepository.save(price) ;
//
//		Product product = new Product() ;
//		product.setTitle("iphone");
//		product.setDescription("Best iphone ever");
//		product.setCategory(Category);
//		product.setImage("save image");
//		product.setPrice(savedPrice);
////
//		productRepository.save(product);

		//I want to add a price.


//		Optional<Category> categoryOptional = categoryRepository
//				.findById(UUID.fromString("de5b4681-db81-413f-bec1-bf93162c8655")) ;
//
//
//
//		if(!categoryOptional.isEmpty()){
//			Category foundcategory = categoryOptional.get() ;
//			System.out.println(category.getProduct());
//		}


		// 1:1
		// m:1 or 1:m
		// m:m - mappingtable-



	}
}
