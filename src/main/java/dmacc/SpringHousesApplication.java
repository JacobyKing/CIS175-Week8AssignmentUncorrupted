package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.House;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.HouseRepository;

@SpringBootApplication
public class SpringHousesApplication implements CommandLineRunner{
	public static void main(String[] args) {
		SpringApplication.run(SpringHousesApplication.class, args);
	}
	@Autowired
	HouseRepository repo;
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);	
		House h = appContext.getBean("house", House.class);
		repo.save(h);
		List<House> allMyHouses = repo.findAll();
		for(House house: allMyHouses) {
			System.out.println(house.toString());
		}
		((AbstractApplicationContext) appContext).close();
	}
}
