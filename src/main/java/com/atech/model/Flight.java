package com.atech.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_flight")
public class Flight {
	
	@Id
	@SequenceGenerator(name= "seq_flight_id", sequenceName = "seq_flight_id", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_flight_id")
	private Long id;
	
	@NotNull
	private LocalDate departure;
	
	@NotNull
	private LocalDate arrive;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_airplane")
	private Airplane airplane;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_pilot")
	private Pilot pilot;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_city_source")
	private City citySource;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name = "id_city_destiny")
	private City cityDestiny;
	
	@NotNull
	@Enumerated(EnumType.ORDINAL)
	private StatusFlight status;
	
}
