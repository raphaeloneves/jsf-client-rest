package br.com.raphaelneves.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import br.com.raphaelneves.service.EmpregoService;

@ManagedBean
@ViewScoped
public class EmpregoBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<Emprego> empregos = new ArrayList<Emprego>();
	private EmpregoService service;
	
	@PostConstruct
	public void init(){
		if(service == null) 
			service = new EmpregoService();
	}

	public EmpregoService getService() {
		return service;
	}

	public void setService(EmpregoService service) {
		this.service = service;
	}

	public List<Emprego> getEmpregos(){
		empregos = service.getEmpregos();
		return empregos;
	}

}
