package com.ryudo.simpleblog.model

class User {

	Long userID
	String username
	String password
	Role role

	static mapping = {
		version false
		id column: 'userID'
	}
	
	static constraints = {
		
		userID nullable: false
		username nullable: false
		password nullable: false
		role nullable: false
		 
	}
}
