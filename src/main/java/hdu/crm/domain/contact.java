package hdu.crm.domain;

public class contact {

    private String name; //联系人姓名
    private long num;    //客户标号
    private String tel;  //联系人电话

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return num;
    }

    public void setId(long id) {
        this.num = num;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
