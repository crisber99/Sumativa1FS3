package com.bbravo.foro.Categoria;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriasService {

private final CategoriasRepository CategoriaRepo;

    public Categorias creaCategoria(Categorias rol){
        return CategoriaRepo.save(rol);
    }

    public List<Categorias> getAllCategoria(){
        return CategoriaRepo.findAll();
    }

    public Optional<Categorias> getCategoria(Long id){
        return CategoriaRepo.findById(id);
    }

    public Categorias updCategoria(Long id, Categorias rol){
        if(CategoriaRepo.existsById(id)){
            rol.setIdCategoria(id);
            return CategoriaRepo.save(rol);
        }
        else return null;
    }

    public void delCategoria(long id){
        CategoriaRepo.deleteById(id);
    }
}
