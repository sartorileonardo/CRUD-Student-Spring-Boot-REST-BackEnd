package br.com.devdojo.awesome.repository;

import br.com.devdojo.awesome.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author  Leonardo Sartori on 27/12/2018.
 */
public interface StudentRepository extends CrudRepository<Student, Long> {
    List<Student> findByNameIgnoreCaseContainingOrderByNameAsc(String name);
}
