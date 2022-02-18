package com.cod3r.gerenciadorfuncionarios.model.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cod3r.gerenciadorfuncionarios.model.Funcionario;
import com.cod3r.gerenciadorfuncionarios.model.FuncionarioSetor;


public interface FuncionarioRepository extends JpaRepository<Funcionario, Integer> {

    List<Funcionario> findBySetor(FuncionarioSetor funcionarioSetor);
}
