package com.hq.helloLinux.entity;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;
import com.hq.helloLinux.annotation.Lookup;
import com.hq.helloLinux.config.serializer.LookupSerializer;

public class Daily {
    private Long id;

    @JSONField(format="yyyy-MM-dd")
    private Date date;

    private Double weight;

    @Lookup(type="MOOD")
    private String mood;

    @Lookup(type="PERFORMANCE")
    private String performance;

    @Lookup(type="STATUS")
    private String status;
    
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}
}