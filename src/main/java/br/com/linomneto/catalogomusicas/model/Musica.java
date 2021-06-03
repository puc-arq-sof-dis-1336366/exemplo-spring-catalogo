package br.com.linomneto.catalogomusicas.model;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TB_MUSICA")
public class Musica {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
    
    @NotBlank
    private String nome;
    
    @NotBlank
    private String autor;
    
    @NotBlank
    @Lob
    private String letra;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy HH:mm:ss", locale = "UTC-03")
    private Date data;

}
