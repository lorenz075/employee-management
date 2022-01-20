package com.cod3r.gerenciadorfuncionarios.model.repository;

import java.util.List;

import com.cod3r.gerenciadorfuncionarios.model.Funcionario;
import com.cod3r.gerenciadorfuncionarios.model.FuncionarioSetor;

import org.springframework.data.jpa.repository.JpaRepository;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {
    List<Funcionario> findBySetor(FuncionarioSetor status);
}
