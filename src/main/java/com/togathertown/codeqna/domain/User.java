package com.togathertown.codeqna.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String userId;
	
	private String userPw;

	@Override
	public String toString() {
		return "User [id=" + id + ", userId=" + userId + ", userPw=" + userPw + "]";
	}
}
