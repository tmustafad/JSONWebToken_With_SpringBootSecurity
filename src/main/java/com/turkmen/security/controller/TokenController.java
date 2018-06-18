/**
 * 
 */
package com.turkmen.security.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkmen.security.model.User;
import com.turkmen.security.security.JwtGen;

/**
 * @author TTTDEMIRCI
 *
 */

@RestController
@RequestMapping("/token")
public class TokenController {

	private JwtGen generator;

	public TokenController(JwtGen generator) {

		this.generator = generator;
	}

	@PostMapping
	public String generate(@RequestBody final User user) {

		return generator.generate(user);
	}

}
