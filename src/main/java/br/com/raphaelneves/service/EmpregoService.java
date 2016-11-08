package br.com.raphaelneves.service;

import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import br.com.raphaelneves.modelo.Emprego;
import br.com.raphaelneves.ws.EmpregoClient;

public class EmpregoService implements Serializable{
	
	private List<Emprego> empregos = new ArrayList<Emprego>();
	
	public List<Emprego> getEmpregos(){
		GsonBuilder gson = new GsonBuilder();
		Reader reader = new InputStreamReader(EmpregoClient.getEmpregos());
		return gson.create().fromJson(reader, new TypeToken<ArrayList<Emprego>>(){}.getType());
	}
	

}
