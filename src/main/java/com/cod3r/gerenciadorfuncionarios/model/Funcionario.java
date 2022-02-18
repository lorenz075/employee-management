package com.cod3r.gerenciadorfuncionarios.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String email;
    private String cargo;
    private BigDecimal salario;
    private LocalDateTime dataContratacao = LocalDateTime.now();

    @Enumerated(EnumType.STRING)
    private FuncionarioSetor setor;

    
    public void setSetor(FuncionarioSetor setor) {
        this.setor = setor;
    }
   
}
