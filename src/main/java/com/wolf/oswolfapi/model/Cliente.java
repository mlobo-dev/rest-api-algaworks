package com.wolf.oswolfapi.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "TB_CLIENTE")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_CLIENTE")
    private Long id;

    @NotNull
    @NotBlank
    @Size(max = 255)
    @Column(name = "TX_NOME")
    private String nome;

    @NotNull
    @NotBlank
    @Size(max = 20)
    @Column(name = "TX_TELEFONE")
    private String telefone;


    @NotBlank
    @Size(max = 255)
    @Email
    @Column(name = "TX_EMAIL")
    private String email;
}
