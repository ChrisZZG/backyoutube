
package com.prueba2.pruebaYT.Service;

import com.prueba2.pruebaYT.Entity.Persona;
import com.prueba2.pruebaYT.Repository.IPersonaRepo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PersonaService {
    
    @Autowired
    IPersonaRepo iPersonaRepo;
    
    public List<Persona> list(){
       return iPersonaRepo.findAll();
    }
    public Optional<Persona> getOne(int id){
        return iPersonaRepo.findById(id);
    }
    public Optional<Persona> getByNombre(String nombre){
        return iPersonaRepo.findByNombre(nombre);
    }
    public void save(Persona persona){
        iPersonaRepo.save(persona);
    }
    public void delete(int id){
        iPersonaRepo.deleteById(id);
    }
    public boolean existsById(int id){
       return iPersonaRepo.existsById(id);
    }
    public boolean existsByNombre(String nombre){
        return iPersonaRepo.existsByNombre(nombre);
    }
}
