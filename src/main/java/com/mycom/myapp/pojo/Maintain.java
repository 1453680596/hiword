package com.mycom.myapp.pojo;

public class Maintain {
    private int id;
    private int customerId;
    private String times;
    private String carnumber;
    private String name;
    private String carcondition;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public String getCarnumber() {
        return carnumber;
    }

    public void setCarnumber(String carnumber) {
        this.carnumber = carnumber;
    }

    public String getCarcondition() {
        return carcondition;
    }

    public void setCarcondition(String carcondition) {
        this.carcondition = carcondition;
    }
}
