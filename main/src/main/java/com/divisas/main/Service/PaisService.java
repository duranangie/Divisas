package com.divisas.main.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divisas.main.Class.Cliente;
import com.divisas.main.Class.Pais;
import com.divisas.main.Repository.ClienteRepository;
import com.divisas.main.Repository.PaisRepository;

import jakarta.transaction.Transactional;

@Service
public class PaisService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private PaisRepository paisRepository;

    @Transactional
    public Pais guardarPais(Pais pais) {
        return paisRepository.save(pais);
    }

    @Transactional
    public List<Pais> getAllPais() {
        return paisRepository.findAll();
    }

    @Transactional
    public List<Pais> getPaisPorNombre(String nombre) {

        return paisRepository.findByNombre(nombre);
    }

    @Transactional
    public Pais gePaisPorId(Long id) {
        return paisRepository.findById(id).orElse(null); // pendie

    }

    @Transactional
    public void eliminarPaisPorId(Long id) {
        paisRepository.deleteById(id);

    }
        @Transactional
public Pais actualizarPais(Pais pais) {
    // Verificar si el país existe en la base de datos
    Pais paisExistente = paisRepository.findById(pais.getId()).orElse(null);
    
    // Si el país existe, se actualiza
    if (paisExistente != null) {
        paisExistente.setNombre(pais.getNombre());
        paisExistente.setCodigo_ISO(pais.getCodigo_ISO());
        // Actualizar otros campos según sea necesario

        return paisRepository.save(paisExistente); // Guardar y devolver el país actualizado
    } else {
        // Si el país no existe, se podría lanzar una excepción o manejarlo según sea necesario
        // Aquí se devuelve null para indicar que el país no pudo ser actualizado
        return null;
    }


    }

}
