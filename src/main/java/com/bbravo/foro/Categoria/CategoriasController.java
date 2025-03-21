package com.bbravo.foro.Categoria;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbravo.foro.Exception.ForoNotFoundException;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/categoria")
@RequiredArgsConstructor
public class CategoriasController {

    private final CategoriasService CategoriaService;
    private static final Logger log = LoggerFactory.getLogger(CategoriasController.class);

    @PostMapping    
    public void addUser(@RequestBody Categorias user) {
        CategoriaService.creaCategoria(user);
    }
    
    @GetMapping("/{id}")
    public EntityModel<Categorias> getCategoriaByid(@PathVariable Long id) {
        log.info("getCategoriaByid");
        Optional<Categorias> categoria = CategoriaService.getCategoria(id);
        if(categoria.isPresent()){
            return EntityModel.of(categoria.get(),
            WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getCategoriaByid(id)).withSelfRel(),
            WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(this.getClass()).getAllCategoria()).withRel("all-categorias"));
        }
        else{
            throw new ForoNotFoundException("Categorias no funciona con el id: " + id);
        }  
    }
    
    @GetMapping
    public List<Categorias> getAllCategoria() {
        return CategoriaService.getAllCategoria();
    }

    @PutMapping("/{id}")
    public Categorias updCategorias(@PathVariable Long id, @RequestBody Categorias user) {
        return CategoriaService.updCategoria(id, user);
    }

    @DeleteMapping("/{id}")
    public void delCategoria(@PathVariable Long id){
        CategoriaService.delCategoria(id);
    }
}
