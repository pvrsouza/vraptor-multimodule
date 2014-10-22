package br.com.sestren.vraptormultimodule.web.template;

import javax.enterprise.inject.Specializes;
import javax.inject.Inject;

import br.com.caelum.vraptor.http.FormatResolver;
import br.com.caelum.vraptor.view.DefaultPathResolver;

@Specializes
public class TemplatePathResolver extends DefaultPathResolver {

	/**
	 * @deprecated CDI eyes only
	 */
	protected TemplatePathResolver() {
	}
	
	@Inject
	public TemplatePathResolver(FormatResolver resolver) {
		super(resolver);
	}
	
	@Override
	protected String getPrefix() {
		return "/WEB-INF/jsp/default/";
	}
}
