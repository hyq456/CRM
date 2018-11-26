package hdu.crm.domain;

import com.sun.javafx.beans.IDProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @Column(name = "e_num")
    private long number; //员工编号
    @Column(name = "e_name")
    private String name; //姓名
    @Column(name = "e_sex")
    private int sex;     //性别
    @Column(name = "e_tel")
    private String tel;  //电话
    @Column(name = "e_pw")
    private String pw;   //密码
    @Column(name = "e_empty")
    private boolean isEmpty; //是否空闲，true为空闲，false为非空闲
    @Column(name = "e_text")
    private String note; //备注

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
