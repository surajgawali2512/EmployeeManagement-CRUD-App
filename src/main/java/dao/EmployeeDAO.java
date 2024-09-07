package dao;

import java.util.List;
import java.util.Set;

import com.model.Employee;
import com.model.Manager;
import com.model.Supervisor;

public interface EmployeeDAO {
      void saveManager(Manager manager);
      void saveSupervisor(Supervisor supervisor);
      List<Manager>getAllManager();
      List<Supervisor>getAllSupervisor();
      List getAllEmployee();
      List<Employee>getEmployeeById(int id);
      
      
}
