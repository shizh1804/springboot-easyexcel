package com.example.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Lenovo
 */
@Component
public class ReportId extends BaseRowModel implements Serializable {


    @ExcelProperty(value = "id",index = 0)
    private int reportId;
    @ExcelProperty(value = "姓名",index = 1)
    private  String reportName;
    @ExcelProperty(value = "性别",index = 2)
    private String sex;
    @ExcelProperty(value = "年龄",index = 3)
    private int age;
    @ExcelProperty(value = "部门",index = 4)
    private int department;
    @ExcelProperty(value = "医生",index = 5)
    private int doctor;
    @ExcelProperty(value = "类别",index = 6)
    private int reportType;
    @ExcelProperty(value = "价格",index = 7)
    private double price;
    @ExcelProperty(value = "时间",index = 8)
    private Date time;
    @ExcelProperty(value = "年龄",index = 9)
    private  String users;
    @ExcelProperty(value = "状态",index = 10)
    private int state;
    @ExcelProperty(value = "手机号码",index = 11)
    private String phone;
    @ExcelProperty(value = "身份证号码",index = 12)
    private String carid;
    @ExcelProperty(value = "专业",index = 13)
    private String zhuan;

    public ReportId() {
    }
    public int getReportId() {
        return reportId;
    }

    public void setReportId(int reportId) {
        this.reportId = reportId;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getDoctor() {
        return doctor;
    }

    public void setDoctor(int doctor) {
        this.doctor = doctor;
    }

    public int getReportType() {
        return reportType;
    }

    public void setReportType(int reportType) {
        this.reportType = reportType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCarid() {
        return carid;
    }

    public void setCarid(String carid) {
        this.carid = carid;
    }

    public String getZhuan() {
        return zhuan;
    }

    public void setZhuan(String zhuan) {
        this.zhuan = zhuan;
    }
}
