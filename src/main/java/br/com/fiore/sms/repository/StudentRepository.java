package br.com.fiore.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiore.sms.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
