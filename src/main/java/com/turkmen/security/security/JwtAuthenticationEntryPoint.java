/**
 * 
 */
package com.turkmen.security.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/**
 * @author TTTDEMIRCI
 *
 */
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint{

	

	@Override
	public void commence(HttpServletRequest arg0, HttpServletResponse arg1, AuthenticationException arg2)
			throws IOException, ServletException {
		arg1.sendError(HttpServletResponse.SC_UNAUTHORIZED,"UNAUTHARIZED");
		
	}
}
