package com.saldivar;

import com.saldivar.beans.User;

/**
 * Simple main application using {@link User} bean
 * 
 * @author saldivar
 *
 */
public class MainApp {

	public static void main(String[] args) {

		User user = new User();
		user.setName("Jorge");
		user.setUsername("jorge.saldivar");
		user.setEmail("me@jorgesaldivar.com");

		System.out.println(user);

	}

}
