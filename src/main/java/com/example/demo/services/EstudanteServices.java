package com.example.demo.services;

import com.example.demo.Models.EstudanteModel;
import com.example.demo.repositories.estudanteRepository;

import java.util.List;
import java.util.Optional;

public class EstudanteServices {
    public EstudanteModel criarEstudante(EstudanteModel estudanteModel){
        return estudanteRepository.save(estudanteModel);
    }
    public List<EstudanteModel> findAll(){
        return estudanteRepository.findAll();
    }
    public void deletarAluno(Long id){
        return estudanteRepository.deleteById(id);
    }
    public Optional<EstudanteModel> buscarPorId(Long id){
        return estudanteRepository.findById(id);
    }
    public  EstudanteModel atualizar(Long id,EstudanteModel estudanteModel){
        EstudanteModel model = estudanteRepository.findById(id).get{};
        model.setNome(estudanteModel.getNome());

        return estudanteRepository.save(estudanteModel)
    }

}
