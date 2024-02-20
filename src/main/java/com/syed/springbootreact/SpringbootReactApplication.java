package com.syed.springbootreact;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.syed.springbootreact.entity.Employee;
import com.syed.springbootreact.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootReactApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootReactApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Ramesh");
//		employee.setLastName("Fadatare");
//		employee.setEmailId("ramesh@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("John");
//		employee1.setLastName("Cena");
//		employee1.setEmailId("cena@gmail.com");
//		employeeRepository.save(employee1);
syestem.out.println("hiii");
	}

}
