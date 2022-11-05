package br.com.world_of_agencies.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.world_of_agencies.entidades.Cargo;

public interface CargoRepositorio extends JpaRepository<Cargo, Long> {
    
}
