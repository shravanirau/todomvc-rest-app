/*global app, $on */
(function () {
	'use strict';

	/**
	 * Sets up a brand new Todo list.
	 *
	 * @param {string} name The name of your new to do list.
	 */
	function Todo(name) {
		var that= this;
		this.storage = new app.Store(name, function(){
			console.log("fetched models")
			that.model = new app.Model(that.storage);
			that.template = new app.Template();
			that.view = new app.View(that.template);
			that.controller = new app.Controller(that.model, that.view);
			
			window.setView = function() {
				that.controller.setView(document.location.hash);
			}.bind(this);
			
			setView();
		}, "/rest/todos");

	}

	var todo = new Todo('todos-vanillajs');
	
	//$on(window, 'load', setView);
	$on(window, 'hashchange', setView);
})();
