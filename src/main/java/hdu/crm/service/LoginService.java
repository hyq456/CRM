package hdu.crm.service;
import hdu.crm.domain.Employee;
import hdu.crm.repository.EmployeeRepository;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class LoginService {
    @Resource
    private EmployeeRepository employeeRepository;
    @Transactional
    public boolean verifyLogin(Employee employee){
        Employee emp = employeeRepository.findByNumberAndPw(employee.getNumber(),employee.getPw());
        if (emp==null)
            return  false;
        return true;
        /*
    public boolean verifyLogin(Employee emp){

        if (emp.getNumber() ==123)
            return true;
        return false;
    }
*/
        /*
        public boolean verifyLogin(User user){

            List<User> userList = loginDao.findByUsernameAndPassword(user.getUsername(), user.getPassword());
            return userList.size()>0;
        }
        */

}}
