package br.com.sestren.vraptormultimodule.admin.controller;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;

@Controller
@Path("/")
public class IndexController {
	
	/**
	 * @deprecated CDI eyes only.
	 */
	protected IndexController() {
	}

	@Path("/")
	public void index() {
		
	}
}
