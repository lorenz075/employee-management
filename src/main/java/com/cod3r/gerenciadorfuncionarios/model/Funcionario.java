package com.cod3r.gerenciadorfuncionarios.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcionario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nome;
    private String email;
    private String cargo;
    private Double salario;

    @Enumerated(EnumType.STRING)
    private FuncionarioSetor setor;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }


    public FuncionarioSetor getSetor() {
        return setor;
    }

    public void setSetor(FuncionarioSetor setor) {
        this.setor = setor;
    }

    public Funcionario() {}

    public Funcionario(String nome, String email, String cargo, Double salario, FuncionarioSetor setor) {
        this.nome = nome;
        this.email = email;
        this.cargo = cargo;
        this.salario = salario;
        this.setor = setor;
    }
    
}
