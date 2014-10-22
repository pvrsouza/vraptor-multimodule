package br.com.sestren.vraptormultimodule.admin.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.view.Results;
import br.com.sestren.vraptormultimodule.comum.rest.Produto;

@Controller
@Path("/produto")
public class ProdutoController {

	private Result result;

	/**
	 * @deprecated CDI eyes only.
	 */
	protected ProdutoController() {
	}

	@Inject
	public ProdutoController(Result result) {
		this.result = result;
	}

	@Path("/produto/{produto.handle}")
	public void produto(Produto produto) {
		result.use(Results.json()).withoutRoot().from(produto).serialize();
	}
	
	@Path("/")
	public void produtos() {
		List<Produto> produtos = new ArrayList<Produto>();
		Produto produto = new Produto();
		produto.setNome("Produto 1");
		produto.setPreco(new BigDecimal("1.11"));
		produtos.add(produto);
		
		produto = new Produto();
		produto.setNome("Produto 2");
		produto.setPreco(new BigDecimal("1.12"));
		produtos.add(produto);

		produto = new Produto();
		produto.setNome("Produto 3");
		produto.setPreco(new BigDecimal("1.13"));
		produtos.add(produto);

		result.use(Results.json()).withoutRoot().from(produtos).serialize();
	}
}
