package com.bbravo.foro.Categoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Categorias {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdCategoria;
    @Column(name = "nombre_categoria")
    @NotNull(message = "Campo en null, debe ingresar un nombre de categoria.")
    @NotEmpty(message = "Campo vacío, debe ingresar un nombre de categoria.")
    private String NombreCategoria;

    public Long getIdCategoria(){
        return IdCategoria;
    }

    public String getNombreCategoria(){
        return NombreCategoria;
    }

    //SET
    public void setIdCategoria(Long id){
        this.IdCategoria = id;
    }

    public void setNombreCategoria(String nombre){
        this.NombreCategoria = nombre;
    }
}
