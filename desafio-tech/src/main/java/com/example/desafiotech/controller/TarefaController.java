package com.example.desafiotech.controller;

import com.example.desafiotech.model.Tarefa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    private final List<Tarefa> tarefas = new ArrayList<>();

    // POST /tarefas
    @PostMapping
    public Tarefa salvar(@RequestBody Tarefa tarefa) {
        tarefas.add(tarefa);
        return tarefa;
    }

    // GET /tarefas
    @GetMapping
    public List<Tarefa> listar() {
        return tarefas;
    }

    // GET /tarefas/{indice}
    @GetMapping("/{indice}")
    public Tarefa buscarPorIndice(@PathVariable int indice) {
        return tarefas.get(indice);
    }

    // PUT /tarefas/{indice}
    @PutMapping("/{indice}")
    public Tarefa atualizar(
            @PathVariable int indice,
            @RequestBody Tarefa tarefa) {

        tarefas.set(indice, tarefa);
        return tarefa;
    }

    // DELETE /tarefas/{indice}
    @DeleteMapping("/{indice}")
    public void deletar(@PathVariable int indice) {
        tarefas.remove(indice);
    }
}
