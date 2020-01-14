package com.atividade.baseDados;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

import com.atividade.model.Carne;

public class BaseDadosCarne {

	private List<Carne> listaCarne;

	public BaseDadosCarne() {
		
		listaCarne = new ArrayList<Carne>();
		
		listaCarne.add(new Carne(15, "porco", 3));
		
	}

	public List<Carne> getListaCarne() {
		return listaCarne;
	}

	public void setListaCarne(List<Carne> listaCarne) {
		this.listaCarne = listaCarne;
	}

}
