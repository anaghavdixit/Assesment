package com.lulu.springemp.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="helpdesk")
public class HelpDesk {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String name;
	String compDesc;
	LocalDate ordersDate;
	public HelpDesk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HelpDesk(int id, String name, String compDesc, LocalDate ordersDate) {
		super();
		this.id = id;
		this.name = name;
		this.compDesc = compDesc;
		this.ordersDate = ordersDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompDesc() {
		return compDesc;
	}
	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}
	public LocalDate getOrdersDate() {
		return ordersDate;
	}
	public void setOrdersDate(LocalDate ordersDate) {
		this.ordersDate = ordersDate;
	}
	@Override
	public String toString() {
		return "HelpDesk [id=" + id + ", name=" + name + ", compDesc=" + compDesc + ", ordersDate=" + ordersDate + "]";
	}
	
}
