package com.pontoEAcesso.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pontoEAcesso.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	//CRUD is included
	
	/*@Query("SELECT u FROM Usuario u WHERE u.categoriaUsuario.id = :idCategoriaUsuario")
	List<Usuario> findAllByCategoriaUsuario(@Param(value = "idCategoriaUsuario") Long idCategoriaUsuario);*/

}
