package com.example.desafiotech.service;

import com.example.desafiotech.model.Tarefa;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TarefaService {

    private final List<Tarefa> tarefas = new ArrayList<>();

    // Listar tarefas
    public List<Tarefa> listar() {
        return tarefas;
    }

    // Buscar tarefa pelo índice
    public Tarefa buscarPorIndice(Integer indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            return tarefas.get(indice);
        }

        return null;
    }

    // Criar nova tarefa
    public Tarefa salvar(Tarefa tarefa) {
        tarefas.add(tarefa);
        return tarefa;
    }

    // Atualizar tarefa pelo índice
    public Tarefa atualizar(Integer indice, Tarefa tarefa) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.set(indice, tarefa);
            return tarefa;
        }

        return null;
    }

    // Remover tarefa pelo índice
    public void deletar(Integer indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove((int) indice);
        }
    }
}
