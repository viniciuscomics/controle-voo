package com.atech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Entity
@Data
@Table(name = "tbl_airplane")
public class Airplane {

	@Id
	@SequenceGenerator(name= "seq_airplane_id", sequenceName = "seq_airplane_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_airplane_id")
	private Long id;
	
	@NotNull
	@Size(min=3,max=30)
	private String model;
	
	@Column(name = "manufacturing_year")
	@NotNull
	private Integer manufacturingYear;
	
	@NotNull
	@Size(min=3,max=20)
	private String manufactur;
	
}
