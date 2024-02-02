package com.eduardo2207.course.entities;

import java.io.Serializable;
<<<<<<< HEAD
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.springframework.data.annotation.Transient;
=======
import java.util.Objects;
>>>>>>> 35b5e1a1d4fa85125948e83eea966206dad9095f

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_category")
public class Category implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
<<<<<<< HEAD
	@jakarta.persistence.Transient
	private Set<Product> products = new HashSet<>();
	
=======
>>>>>>> 35b5e1a1d4fa85125948e83eea966206dad9095f
	public Category() {
	}

	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

<<<<<<< HEAD
	public Set<Product> getProducts() {
		return products;
	}

=======
>>>>>>> 35b5e1a1d4fa85125948e83eea966206dad9095f
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}
<<<<<<< HEAD

=======
>>>>>>> 35b5e1a1d4fa85125948e83eea966206dad9095f
	
}
