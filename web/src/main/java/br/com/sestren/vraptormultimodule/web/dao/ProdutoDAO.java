package br.com.sestren.vraptormultimodule.web.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;

import br.com.sestren.vraptormultimodule.comum.rest.Produto;

import com.google.gson.Gson;

public class ProdutoDAO {

	@Inject
	private Logger logger;

	public ProdutoDAO() {
	}

	public List<Produto> getProdutos() {
		try {
			URL url = new URL("http://localhost:8080/admin/produto/");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			BufferedReader rd = new BufferedReader(new InputStreamReader(
					conn.getInputStream()));
			StringBuffer sb = new StringBuffer();
			String line;
			
			while ((line = rd.readLine()) != null) {
				sb.append(line);
			}
			rd.close();

			logger.debug(sb.toString());

			Gson gson = new Gson();
			Produto[] produtos = gson.fromJson(sb.toString(), Produto[].class);
			return Arrays.asList(produtos);
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return null;
	}
}
