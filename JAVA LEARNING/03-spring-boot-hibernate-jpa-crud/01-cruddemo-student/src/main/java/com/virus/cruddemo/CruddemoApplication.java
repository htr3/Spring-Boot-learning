package com.virus.cruddemo;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.virus.cruddemo.dao.StudentDAO;
import com.virus.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}



	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
//			createStudent(studentDAO);
			createMultipleStudent(studentDAO);
//			readStudent(studentDAO);
//			queryForStudents(studentDAO);
//			LastNameQuery(studentDAO);
//			updateStudent(studentDAO);
//			deleteStudent(studentDAO);
//			deleteAllStudent(studentDAO);
		};
	}

	private void deleteAllStudent(StudentDAO studentDAO) {
		System.out.println("Deleting all students ");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println(numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 2;
		System.out.println("Deleting student id: " + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {

		//retrive student based onthe id: primeyt key
		int studentId = 2;
		System.out.println("Getting sudent with id: " + studentId);

		Student myStudent = studentDAO.findById(studentId);

		System.out.println("Updating student .....");

		// change first name
		myStudent.setFirstName("Vishal");
		myStudent.setLastName("Thakur");
		myStudent.setEmail("v115@gmail.com");

		// Update the student
		studentDAO.update(myStudent);

		// display updated student
		System.out.println("Updated Student" + myStudent);


	}

	private void LastNameQuery(StudentDAO studentDAO) {
		// get list of students
		List<Student> lastNameStudents = studentDAO.findByLastName("thakur");

		// display list of sudents
		for(Student tempStudent : lastNameStudents) {
			System.out.println(tempStudent);
		}

	}
	private void queryForStudents(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.findAll();

		// display lost of students
		for(Student student : theStudents) {
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		// create a student object
		System.out.println("Creating new student object ....");
		Student theStudent = new Student("shikamaru", "singh", "s@113.com");
		// save the student
		System.out.println("Saving student ........");
		studentDAO.save(theStudent);

		// desplay id of the saved student
		int theId = theStudent.getId();
		System.out.println("Saved student. Generated id: " + theId);
		// retrieving student based on the id: primary key
		System.out.println("Retrieving student with id: " + theId);
		Student myStudent = studentDAO.findById(theId);
		// display student

		System.out.println("Found the student  " + myStudent);


	}


	private void createStudent(StudentDAO studentDAO) {
		// create student object
		System.out.println("Creating new Student Object ");
		Student tempStudent = new Student("Virus", "thakur", "vish@115.com");

		// save student object
		System.out.println("Saving the Student ....");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Genereted id: " + tempStudent.getId());
	}

	private void createMultipleStudent(StudentDAO studentDAO) {
		// create multiple students
		System.out.println("Creating 4 new Student Object ");
		Student tempStudent = new Student("shesow", "thakur", "v@115.com");
		Student tempStudent1 = new Student("naruto", "thakur", "n@115.com");
		Student tempStudent2 = new Student("choji", "thakur", "c@115.com");
		Student tempStudent3 = new Student("hinata", "thakur", "h@115.com");
		// save the student objects
		System.out.println("Saving the Student Object ");
		studentDAO.save(tempStudent);
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

}
