package net.microservice.greeting.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotNull;

@Document(collection="users")
@JsonPropertyOrder({"userId", "name"})
@ApiModel("Modelo Usuario")
public class User implements Serializable{

	private static final long serialVersionUID = 3566643893757722656L;

	@Id
	private String _id;
	
	@NotNull
	@ApiModelProperty(value="Identificador del usuario.", required=true)
	private String userId;

	@NotNull
	@ApiModelProperty(value="Nombre del usuario.", required=true)
	private String name;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
