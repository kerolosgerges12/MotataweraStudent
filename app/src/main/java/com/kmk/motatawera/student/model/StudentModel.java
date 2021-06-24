package com.kmk.motatawera.student.model;


public class StudentModel {

    private String id;
    private int branch;
    private int department;
    private int grad;
    private String name;
    private String phone;
    private String photo;
    private String email;
    private int gender;
    private String password;
    private boolean isDeleted;
    private boolean isDisabled;


    public StudentModel() {
    }

    public StudentModel(String id, int branch, int department, int grad, String name, String phone, String photo, String email, int gender, String password, boolean isDeleted, boolean isDisabled) {
        this.id = id;
        this.branch = branch;
        this.department = department;
        this.grad = grad;
        this.name = name;
        this.phone = phone;
        this.photo = photo;
        this.email = email;
        this.gender = gender;
        this.password = password;
        this.isDeleted = isDeleted;
        this.isDisabled = isDisabled;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getGrad() {
        return grad;
    }

    public void setGrad(int grad) {
        this.grad = grad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public boolean isDisabled() {
        return isDisabled;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }
}
