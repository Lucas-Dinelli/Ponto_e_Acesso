package com.pda.pontoDeAcesso.dtos;

import java.io.Serializable;

import com.pda.pontoDeAcesso.model.CategoriaUsuario;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CategoriaUsuarioDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long id;
    
    private String descricao;
    
    public CategoriaUsuarioDTO(CategoriaUsuario categoriaUsuario) {
    	setId(categoriaUsuario.getId());
    	setDescricao(categoriaUsuario.getDescricao());
    }

}