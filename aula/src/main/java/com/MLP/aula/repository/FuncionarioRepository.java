package com.MLP.aula.repository;

import com.MLP.aula.model.FuncionarioModel;

import java.util.ArrayList;
import java.util.List;

public interface FuncionarioRepository {
    private List<FuncionarioModel> funcionarios = new ArrayList<>();

    public void salvar (FuncionarioModel funcionarioModel) {
        funcionarios.add(funcionarioModel)
    }
    public List <FuncionarioModel> listar (FuncionarioModel funcionarioModel);
}
