package com.atech.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_pilot")
public class Pilot {

	@Id
	@SequenceGenerator(name= "seq_pilot_id", sequenceName = "seq_pilot_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pilot_id")
	private Long id;
	
	@NotNull
	@Size(min=3,max=50)
	private String name;
	
	@NotNull	
	private int age;
}
