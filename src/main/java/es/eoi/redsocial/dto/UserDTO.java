package es.eoi.redsocial.dto;

import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class UserDTO {
	
	private Long id;
	
	private String name;

	private String surname;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
	private Date birthDate;
	
	@JsonProperty(access = Access.READ_ONLY)
	@JsonFormat(pattern = "dd-MM-yyyy")
	private LocalDate startDate = LocalDate.now();

	private String user;

	private String pass;

}
