package br.com.raphaelneves.ws;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.management.RuntimeErrorException;

public class EmpregoClient {
	
	
	private static final String URL = "http://mobile-aceite.tcu.gov.br:80/mapa-da-saude/rest/emprego?quantidade=15";
	
	public static InputStream getEmpregos(){
		InputStream is = null;
		try{
			URL url = new URL(URL);
			HttpURLConnection con = (HttpURLConnection)url.openConnection();
			is = con.getInputStream();
		}catch (Exception e) {
			throw new RuntimeException("Não foi possível acessar o recurso.");
		}
		return is;
	}

}
