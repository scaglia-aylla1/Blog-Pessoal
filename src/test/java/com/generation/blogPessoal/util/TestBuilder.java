package com.generation.blogPessoal.util;

import com.generation.blogPessoal.model.Usuario;

public class TestBuilder {

	public static Usuario criarUsuario (Long id, String nome, String email, String senha) {
		Usuario usuario = new Usuario();
		usuario.setId(id);
		usuario.setNome(nome);
		usuario.setUsuario(email);
		usuario.setSenha(senha);
		usuario.setFoto("-");
		return usuario;
	}
	public static Usuario criarUsuarioRoot() {
		return criarUsuario(null, "Root", "root@email.com", "rootroot");
	}

}
