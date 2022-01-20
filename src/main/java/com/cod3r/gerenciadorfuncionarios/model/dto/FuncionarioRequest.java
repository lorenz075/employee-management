package com.cod3r.gerenciadorfuncionarios.model.dto;

import javax.validation.constraints.NotBlank;

import com.cod3r.gerenciadorfuncionarios.model.Funcionario;

public class FuncionarioRequest {
    
    @NotBlank
    private String nome;

    @NotBlank
    private String email;

    @NotBlank
    private String cargo;

    private Double salario;

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

    public Funcionario addFuncionario() {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(nome);
        funcionario.setCargo(cargo);
        funcionario.setEmail(email);
        funcionario.setSalario(salario);
        return funcionario;
    }


}
