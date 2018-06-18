/**
 * 
 */
package com.turkmen.security.security;

import org.springframework.stereotype.Component;

import com.turkmen.security.model.User;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

/**
 * @author TTTDEMIRCI
 *
 */


@Component
public class JwtGen {

	
	
	
	  public String generate(User jwtUser) {


	        Claims claims = Jwts.claims()
	                .setSubject(jwtUser.getUserName());
	        claims.put("userId", String.valueOf(jwtUser.getId()));
	        claims.put("role", jwtUser.getRole());


	        return Jwts.builder()
	                .setClaims(claims)
	                .signWith(SignatureAlgorithm.HS512, "fenerbahce")
	                .compact();
	    }
}
