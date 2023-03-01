package src.main.java.com.xworkz.vishala.dto;

import javax.validation.constraints.Size;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RiverDTO {
	
	private Integer id;
	
	@Size(min =3, max= 20, message = "Name cannot be less than 3 or greater than 20 chars")
    private String name;
	


	private Integer noOfSubRivers;
	
	@Size(min =3, max= 20, message = "birthplace cannot be less than 3 or greater than 20 chars")
    private String birthplace;
	
	@Size(min =3, max= 20, message = "location cannot be less than 3 or greater than 20 chars")
    private String location;
	
	

}
