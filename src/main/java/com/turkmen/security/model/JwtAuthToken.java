/**
 * 
 */
package com.turkmen.security.model;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

/**
 * @author TTTDEMIRCI
 *
 */
public class JwtAuthToken extends UsernamePasswordAuthenticationToken {

	private String token;

	public JwtAuthToken(String token) {
		super(null, null);
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return null;
	}

}
