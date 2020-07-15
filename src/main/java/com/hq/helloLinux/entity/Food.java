package com.hq.helloLinux.entity;

public class Food {
	private Long id;

    private String name;

    private String quantity;

    private String enjoy;

    private String remark;

    private Long dailyid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getEnjoy() {
        return enjoy;
    }

    public void setEnjoy(String enjoy) {
        this.enjoy = enjoy;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getDailyid() {
        return dailyid;
    }

    public void setDailyid(Long dailyid) {
        this.dailyid = dailyid;
    }
}
