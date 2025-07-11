package com.example.samuraitravel.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Entity
@Table(name = "favorites")
@Data



public class Favorite {
	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Integer id;

	  @ManyToOne
	  @JoinColumn(name = "house_id")
	  @ToString.Exclude
	  private House house;

	  @ManyToOne
	  @JoinColumn(name = "user_id")
	  @ToString.Exclude
	  private User user;

	  @Column(name = "created_at", insertable = false, updatable = false)
	  private Timestamp createdAt;

	  @Column(name = "updated_at", insertable = false, updatable = false)
	  private Timestamp updatedAt;

}
