package com.ad.swagger.admire.model;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema // The @Schema annotation is used in the OpenAPI Specification to define the structure of a data model or an object in an API
public class Employee {

    @Schema(name = "Employee ID", description = "Employee Unique ID", required = true, minLength = 2,
            defaultValue = "3456")
    private int employeeId;

    @Schema(name = "Employee Name", description = "Employee Name", defaultValue = "Alpha")
    private String employeeName;

    @Schema(name = "Employee Department", description = "Employee working Department", defaultValue = "Development")
    private String employeeDepartment;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeDepartment() {
        return employeeDepartment;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setEmployeeDepartment(String employeeDepartment) {
        this.employeeDepartment = employeeDepartment;
    }
}
