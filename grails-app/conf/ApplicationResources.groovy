modules = {
	bootstrap {
		resource url : 'css/bootstrap.min.css'
		resource url : 'css/bootstrap-responsive.min.css'
		resource url : 'js/bootstrap.js'
	}

	FlatUI {
		dependsOn 'jquery'
		resource url : 'css/flat-ui.css'
		resource url : 'js/jquery-ui-1.10.0.custom.min.js'
		resource url : 'js/jquery.dropkick-1.0.0.js'
		resource url : 'js/custom_checkbox_and_radio.js'
		resource url : 'js/custom_radio.js'
		resource url : 'js/jquery.tagsinput.js'
		resource url : 'js/bootstrap-tooltip.js'
		resource url : 'js/jquery.placeholder.js'
		resource url : 'http://vjs.zencdn.net/c/video.js'
		resource url : 'js/application.js'
		resource url : [dir:'js',file: 'icon-font-ie7.js'], wrapper: { s -> "<!--[if lt IE 8]>$s<![endif]-->"}
		resource url : [dir:'js',file: 'icon-font-ie7-24.js'], wrapper: { s -> "<!--[if lt IE 8]>$s<![endif]-->"}
	}
}