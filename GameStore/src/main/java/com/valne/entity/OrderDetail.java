package com.valne.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name ="OrderDetails")
public class OrderDetail implements Serializable{
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	private Double price;
	private Integer quantity;
	@ManyToOne @JoinColumn(name ="Productid")
	private Product product;
	@ManyToOne @JoinColumn(name = "Orderid")
	private Order order;
}
