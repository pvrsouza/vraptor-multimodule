package br.com.sestren.vraptormultimodule.web.view;

import javax.inject.Named;

import br.com.sestren.vraptormultimodule.comum.VRaptorMultiModule;

@Named("versao")
public class VersaoView {

	public VersaoView() {
	}
	
	public String getVersao() {
		return VRaptorMultiModule.VERSION;
	}
}
