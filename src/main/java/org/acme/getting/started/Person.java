package org.acme.getting.started;

import java.time.LocalDate;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Person extends PanacheEntity {
	public String name;
	public LocalDate birth;
	public String status;
}