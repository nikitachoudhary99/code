package com.ak.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Department {
    @Id
    private int id;
    private String name;

    @OneToOne
    @JoinColumn(name = "manager_id")
    private Employee manager;

    public Department() {}
    public Department(int id, String name, Employee manager) {
        this.id = id;
        this.name = name;
        this.manager = manager;
    }
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return id + "\t" + name + "\t" + manager ;
	}

    
}

