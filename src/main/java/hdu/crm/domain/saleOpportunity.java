package hdu.crm.domain;

public class saleOpportunity {
    private long num; //机会号
    private long employeeNum; //员工号
    private String contactName; //联系人名称
    private String record; //记录

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public long getEmployeeNum() {
        return employeeNum;
    }

    public void setEmployeeNum(long employeeNum) {
        this.employeeNum = employeeNum;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }
}
