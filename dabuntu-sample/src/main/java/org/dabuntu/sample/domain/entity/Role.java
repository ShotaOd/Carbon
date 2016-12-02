package org.dabuntu.sample.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author ubuntu 2016/11/12.
 */
@Getter
@Setter
@Entity
public class Role {
	@Id
	@GeneratedValue
	private Long id;

	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_User_Role_Id"))
	private User user;

	private String name;
}