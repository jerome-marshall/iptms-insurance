package com.cognizant.insurance.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * model class for InsurerDetail
 * 
 * @Entity indicates Spring Data JPA that it is an entity class for the
 *         application
 * @Data is a convenient shortcut annotation that bundles the features
 *       of @ToString , @EqualsAndHashCode , @Getter / @Setter
 *       and @RequiredArgsConstructor together
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "insurer_detail")
public class InsurerDetail {

	/**
	 * instance variables
	 * 
	 * @Id helps in defining the primary key
	 */
	@Id
	private long id;
	private String insurerName;
	private String insurerPackageName;
	private double insuranceAmountLimit;
	private int disbursementDuration;
}
