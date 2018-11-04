package com.amit.Department_Dao;

public class Department {

    Integer departmentId;
    String departmentName;
    Integer managerId;
    Integer locationId;

    Department(Integer departmentId, String departmentName, Integer managerId, Integer locationId){

        this.departmentId=departmentId;
        this.departmentName=departmentName;
        this.managerId= managerId;
        this.locationId=locationId;

    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer deptId){
        this.departmentId = deptId;

    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departmentName='" + departmentName + '\'' +
                ", managerId=" + managerId +
                ", locationId=" + locationId +
                '}';
    }
}
