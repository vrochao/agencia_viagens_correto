package br.com.world_of_agencies.entidades;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


public class UserDetailsImpl implements UserDetails {

    private Funcionario funcionario;

    public UserDetailsImpl(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

	/*
	 * @Override public Collection<? extends GrantedAuthority> getAuthorities() {
	 * Perfil perfil = funcionario.getCargo().getNome().equals("Gerente") ?
	 * Perfil.ADMIN : Perfil.USER;
	 * 
	 * return AuthorityUtils.createAuthorityList(perfil.toString()); }
	 */

    @Override
    public String getPassword() {
        return funcionario.getSenha();
    }

    @Override
    public String getUsername() {
        return funcionario.getEmail();
    }

    @Override
    public boolean isAccountNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return funcionario.getDataDemissao() == null;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isEnabled() {
        // TODO Auto-generated method stub
        return true;
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
