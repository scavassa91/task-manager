package com.example.twgerenciadortarefas.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.twgerenciadortarefas.modelos.Tarefa;

public interface RepositorioTarefa extends JpaRepository<Tarefa, Long> {

}
