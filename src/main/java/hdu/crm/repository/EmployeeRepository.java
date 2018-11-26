package hdu.crm.repository;
import hdu.crm.domain.Employee;


public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
    public Employee findByNumberAndPw(long number,String pw);
}
