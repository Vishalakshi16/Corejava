package com.xworkz.spring.dto;

import lombok.Data;

@Data

public class BakeryDTO {
	
 public BakeryDTO() {
	System.out.println("created"+this.getClass().getSimpleName());
}
 
 private String name;
 private String ownerName;
 private String ownerWifeName;
 private boolean ownerMarried;
 private String famous;
 private String since;
 

}
