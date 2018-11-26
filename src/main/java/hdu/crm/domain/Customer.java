package hdu.crm.domain;

public class Customer {
    private String name;   //名称
    private String tel;    //电话
    private String address;//地址
    private long num;    //编号
    private String notes;  //备注
    private int credit;    //积分

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long id) {
        this.num = num;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }


}
