package br.com.sestren.vraptormultimodule.web.config;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.slf4j.Logger;

import br.com.caelum.vraptor.environment.Environment;

@ApplicationScoped
public class Config {

	@Inject
	private Logger logger;
	
	private Admin admin;
	private Environment environment;
	
	/**
	 * @deprecated CDI eyes only.
	 */
	protected Config() {
		this(null, null);
	}
	
	@Inject
	public Config(Admin admin, Environment environment) {
		this.admin = admin;
		this.environment = environment;
		carregaConfig();
	}
	
	public Admin getAdmin() {
		return this.admin;
	}
	
	private void carregaConfig() {
		admin.setUrl(environment.get("admin.url"));
		admin.setToken(environment.get("admin.token"));
		
		logger.info("Configurações da aplicação carregadas");
	}
}
