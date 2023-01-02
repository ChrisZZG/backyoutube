
package com.prueba2.pruebaYT.Repository;

import com.prueba2.pruebaYT.Entity.Persona;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonaRepo extends JpaRepository<Persona, Integer> {
    
    public Optional<Persona> findByNombre(String nombre);
    
    public boolean existsByNombre(String nombre);
}
