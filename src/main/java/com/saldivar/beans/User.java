package com.saldivar.beans;

import lombok.Data;

/**
 * To start using lambok, install using the following commnad: <br/>
 * java -jar lambok-1.16.16.jar
 * 
 * (Note: After installing, restart eclipse)
 * 
 * @see <a href="https://projectlombok.org/setup/eclipse">Installation</a>
 * 
 * @author saldivar
 *
 */
@Data
public class User {

	private String name;
	private String username;
	private String email;

}
