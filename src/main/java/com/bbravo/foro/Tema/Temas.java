package com.bbravo.foro.Tema;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Temas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdTema;
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "contenido")
    private String contenido;
    @Column(name = "id_categoria")
    private Long idCategoria;

    public Long getIdTema(){
        return IdTema;
    }

    public String getTituloTema(){
        return titulo;
    }

    public String getContenidoTema(){
        return contenido;
    }

    public Long getIdCategoria(){
        return idCategoria;
    }

    //SET
    public void setIdTema(Long id){
        this.IdTema = id;
    }

    public void setTituloTema(String titulo){
        this.titulo = titulo;
    }

    public void setContendoTema(String contenido){
        this.contenido = contenido;
    }

    public void setNombreTema(Long idCategoria){
        this.idCategoria = idCategoria;
    }
}
