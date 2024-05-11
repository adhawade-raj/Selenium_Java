package RA_06_com.gorest.in.api;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)  //You can igonre the null values with this
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class F1_UserPojo {

	@JsonProperty("id")
	private Integer id;
	
//	@JsonProperty("name")
	private String name;
	
//	@JsonProperty("email")
	private String email;
	
//	@JsonProperty("gender")
	private String gender;
	
//	@JsonProperty("status")
	private String status;
	
	
	public F1_UserPojo(String name, String email, String gender, String status) {
		this.name = name;
		this.email = email;
		this.gender = gender;
		this.status = status;
	}
	
	
	
	
}
