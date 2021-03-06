package hdu.crm.repository;

import hdu.crm.domain.Employee;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    public Employee findByNumberAndPw(long number,String pw);
}
