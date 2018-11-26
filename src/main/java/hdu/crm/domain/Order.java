package hdu.crm.domain;

import java.util.Date;

public class Order {

    private long num;//订单号
    private String status;//状态
    private Date date;//日期
    private Double value;//订单金额
    private Double paidValue; //已支付金额
    private String variety; //产品种类
    private long employeeNum; //员工编号
    private long customerNum; //客户编号

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Double getPaidValue() {
        return paidValue;
    }

    public void setPaidValue(Double paidValue) {
        this.paidValue = paidValue;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public long getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(long employeeNum) {
        this.employeeNum = employeeNum;
    }

    public long getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(long customerNum) {
        this.customerNum = customerNum;
    }
}
