package com.luv2code.pkg;

public class Employee {
  public int employeeId;
  public String employeeName;
  
  public int getEmployeeId(){
    return this.employeeId;
  }
  
  public String getEmployeeName(){
    return this.employeeName;
  }

public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}

public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
  

@Override
public String toString() {
	return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
}
  
  
}
