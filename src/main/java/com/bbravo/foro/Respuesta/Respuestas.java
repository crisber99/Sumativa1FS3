package com.bbravo.foro.Respuesta;

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
public class Respuestas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long IdRespuesta;
    @Column(name = "contenido")
    @NotNull(message = "Campo en null, debe ingresar un contenido.")
    @NotEmpty(message = "Campo vacío, debe ingresar un contenido.")
    private String contenido;
    @Column(name = "id_tema")
    @NotNull(message = "Campo en null, debe ingresar el id del tema.")
    @NotEmpty(message = "Campo vacío, debe ingresar el id del tema.")
    private Long idTema;
    @Column(name = "id_usuario")
    @NotNull(message = "Campo en null, debe ingresar el id del usuario.")
    @NotEmpty(message = "Campo vacío, debe ingresar el id del usuario.")
    private Long idUsuario;

    public Long getIdRespuesta(){
        return IdRespuesta;
    }

    public String getContenidoRespuesta(){
        return contenido;
    }

    public Long getIdTema(){
        return idTema;
    }

    public Long getIdUsuario(){
        return idUsuario;
    }

    //SET
    public void setIdRespuesta(Long id){
        this.IdRespuesta = id;
    }

    public void setContenidoRespuesta(String contenido){
        this.contenido = contenido;
    }

    public void setIdTema(Long id){
        this.idTema = id;
    }

    public void setIdUsuario(Long id){
        this.idUsuario = id;
    }
}
