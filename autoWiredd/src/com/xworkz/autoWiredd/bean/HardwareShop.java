package com.xworkz.autoWiredd.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
	@Qualifier("hdId")
	private int hdId;
	
	@Autowired
	@Qualifier("hdName")
	private String hdName;
	
	@Autowired
	@Qualifier("hdGstNum")
	private int hdGstNum;
	
	@Autowired
	@Qualifier("hdOwnerNamee")
	private String hdOwnerNamee;
	
	@Autowired
	@Qualifier("hdAddresss")
	private String hdAddresss;

	@Override
	public String toString() {
		return "HardwareShop [hdId=" + hdId + ", hdName=" + hdName + ", hdGstNum=" + hdGstNum + ", hdOwnerNamee="
				+ hdOwnerNamee + ", hdAddresss=" + hdAddresss + "]";
	}

	
	
	
	
	

}
