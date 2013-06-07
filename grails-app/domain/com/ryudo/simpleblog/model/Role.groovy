package com.ryudo.simpleblog.model

class Role {

	Long roleID
	String roleName
	static hasOne = [user:User]
	
	static mapping = {
		version false
		id column: 'roleID' 
	}
	
    static constraints = {
    }
}
