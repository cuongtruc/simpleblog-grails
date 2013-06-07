package com.ryudo.simpleblog.model

class Article {

	Long articleID
	String title
	Date dateAdded
	String content
	static belongsTo = [user:User]
	
	static mapping = {
		version false
		id column: 'articleID' 
	}
	
    static constraints = {
    }
}
