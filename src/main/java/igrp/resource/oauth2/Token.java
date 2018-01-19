package igrp.resource.oauth2;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Marcel Iekiny
 * Oct 9, 2017
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Token implements Serializable{ // For serialize and deserialize purpose
	
	private String access_token;
	private String token_type; // always "Bearer" !!!
	private int expires_in;
	private String refresh_token;
	
	public Token() {}
	
	public Token(String access_token, String token_type, int expires_in, String refresh_token) {
		super();
		this.access_token = access_token;
		this.token_type = token_type;
		this.expires_in = expires_in;
		this.refresh_token = refresh_token;
	}
	
	public String getAccess_token() {
		return access_token;
	}
	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}
	public String getToken_type() {
		return token_type;
	}
	public void setToken_type(String token_type) {
		this.token_type = token_type;
	}
	public int getExpires_in() {
		return expires_in;
	}
	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}
	public String getRefresh_token() {
		return refresh_token;
	}
	public void setRefresh_token(String refresh_token) {
		this.refresh_token = refresh_token;
	}
	
	@Override
	public String toString() {
		return "Token [access_token=" + access_token + ", token_type=" + token_type + ", expires_in=" + expires_in
				+ ", refresh_token=" + refresh_token + "]";
	}
}
