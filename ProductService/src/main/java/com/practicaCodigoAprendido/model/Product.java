package com.practicaCodigoAprendido.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@Table(name = "product")
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_product")
	private Long idProduct;
	
	@NotEmpty(message = "The value could not Emptey!!!")
	private String name;
	
	@NotEmpty(message = "The value could not Emptey!!!")
	private Double price;
	
	@Column(name = "date_at")
	@Temporal(TemporalType.DATE)
	private Date date;
	
	@Transient
	private String status;

}
