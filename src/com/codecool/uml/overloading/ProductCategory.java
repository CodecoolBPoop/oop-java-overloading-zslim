package com.codecool.uml.overloading;

public class ProductCategory {

    protected int id;
    protected String name;
    protected String department;
    protected String description;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("id=").append(id);
        sb.append(",name=").append(name);
        sb.append(",department=").append(department);
        sb.append(",description=").append(description);
        return sb.toString();
    }
}
