package com.example.demo.controllers;

@RestController
@RequestMapping(path = "/estudantes")
public class EstudanteController {

    @Autowired
    private EstudanteService estudanteService;

    @PostMapping
    public EstudanteModel criarAluno(@RequestBody EstudanteModel estudanteModel){
        return estudanteService.criarEstudante(estudanteModel);
    }

    @GetMapping
    public List<EstudanteModel> buscarTodosEstudantes(){
        return estudanteService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id){
        estudanteService.deletarAluno(id);
    }

    @GetMapping
    public EstudanteModel buscarPorId(@PathVariable Long id){
        return estudanteService.buscarPorID(id);
    }

    @PostMapping
    public EstudanteModel atualizar(@PathVariable Long id,@RequestBody EstudanteModel estudanteModel){
        EstudanteModel model = estudanteService.buscarPorID(id);
        model.setNome(estudanteModel.getNome());

        return estudanteService.criarEstudante(estudanteModel);
    }
}
