package com.smb.demo.angularspringbe.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="Car")
public class Car implements java.io.Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id ;
		
		@NotNull
		private String name;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
}
