package api_practice.example.practicerestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import api_practice.example.practicerestapi.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
