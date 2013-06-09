class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/"(view:"SimpleBlog/index")
		"500"(view:'/error')
	}
}
