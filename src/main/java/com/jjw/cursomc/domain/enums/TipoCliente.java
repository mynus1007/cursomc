package com.jjw.cursomc.domain.enums;

public enum TipoCliente {
	
	PESSOAFISICA(0, "Pessoa física"),
	PESSOAJURIDICA(1, "Pessoa jurídica");
	
	private int cod;
	private String desc;
	
	private TipoCliente(int cod, String desc) {
		this.cod = cod;
		this.desc = desc;
	}

	public int getCod() {
		return cod;
	}

	public String getDesc() {
		return desc;
	}	
	
	public static TipoCliente toEnum(Integer cod) {
		if(cod==null) {
			return null;
		}
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
