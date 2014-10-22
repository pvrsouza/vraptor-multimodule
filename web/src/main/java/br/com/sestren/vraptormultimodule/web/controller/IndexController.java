package br.com.sestren.vraptormultimodule.web.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.routes.annotation.Routed;
import br.com.sestren.vraptormultimodule.comum.rest.Produto;
import br.com.sestren.vraptormultimodule.web.dao.ProdutoDAO;

@Controller
@Routed
public class IndexController {

	@Inject
	private Logger logger;
	
	private ProdutoDAO produtoDAO;

	/**
	 * @deprecated CDI eyes only
	 */
	protected IndexController() {
	}
	
	@Inject
	public IndexController(ProdutoDAO produtoDAO) {
		this.produtoDAO = produtoDAO;
	}

	public void index() {
		logger.debug(">>> IndexController.index");
		List<Produto> produtos = produtoDAO.getProdutos();
		
		for (Produto produto : produtos) {
			logger.debug(produto.toString());
		}
	}
}
