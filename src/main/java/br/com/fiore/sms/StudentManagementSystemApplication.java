package br.com.fiore.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fiore.sms.entity.Student;
import br.com.fiore.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Jose", "Silva", "jose@gmail.com");
		studentRepository.save(student1);
		
		Student student2 = new Student("maria", "souza", "maria@gmail.com");
		studentRepository.save(student2);
		
		Student student3 = new Student("joão", "pedro", "jão@gmail.com");
		studentRepository.save(student3);
		
	}

}
