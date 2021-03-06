package com.pontoEAcesso.dtos;

import java.io.Serializable;

import com.pontoEAcesso.model.NivelAcesso;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class NivelAcessoDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long id;
    
    private String descricao;
    
    public NivelAcessoDTO(NivelAcesso nivelAcesso) {
    	setId(nivelAcesso.getId());
    	setDescricao(nivelAcesso.getDescricao());
    }

}
