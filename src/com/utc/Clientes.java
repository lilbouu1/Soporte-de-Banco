package com.utc;

class Clientes {
	
	private String nombre;
	private int id;
	private String motivo;
		
	public Clientes (String nombre,int id,String motivo) {
		this.nombre = nombre;
		this.id = id;
		this.motivo = motivo;		
	}
		
	//getters y setters
	public String getNombre() {
    	return nombre; 
    	}
    public void setNombre(String nombre) { 
    	this.nombre = nombre; 
    	}
    
    public int getId() { 
    	return id;
    	}
    public void setId(int id) { 
    	this.id = id; 
    	}

    public String getMotivo() { 
    	return motivo;
    	}
    public void setMotivo(String motivo) { 
    	this.motivo = motivo; 
    	}
    
    @Override
    public String toString() {
        return "Cliente [ID=" + id + ", Nombre=" + nombre + ", Motivo=" + motivo + "]";
    
    }
}
