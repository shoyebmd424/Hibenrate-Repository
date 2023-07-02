package org.map.map1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;
@Entity
public class Emp {
    @Id
    private  int empId;
    private  String empName;
    @ManyToMany

    private List<Project>projects;

    public Emp(int empId, String empName, List<Project> projects) {
        this.empId = empId;
        this.empName = empName;
        this.projects = projects;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Emp() {
    }


}
