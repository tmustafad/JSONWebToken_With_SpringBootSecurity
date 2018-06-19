/**
 * 
 */
package com.turkmen.security.security;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;

import com.turkmen.security.model.JwtAuthToken;

/**
 * @author TTTDEMIRCI
 *
 */
public class JwtAuthFilter extends AbstractAuthenticationProcessingFilter {
	
	public JwtAuthFilter() {
		super("/index**");
	}



	
	
	
	@Override
    public Authentication attemptAuthentication(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws AuthenticationException, IOException, ServletException {

        String header = httpServletRequest.getHeader("Authorisation");


        if (header == null || !header.startsWith("Check ")) {
            throw new RuntimeException(" Token is missing");
        }

        String authenticationToken = header.substring(6);

        JwtAuthToken token = new JwtAuthToken(authenticationToken);
        return getAuthenticationManager().authenticate(token);
    }


    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain, Authentication authResult) throws IOException, ServletException {
        super.successfulAuthentication(request, response, chain, authResult);
        chain.doFilter(request, response);
    }

}
