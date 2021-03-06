package br.com.basis.sgt.web.rest;

import br.com.basis.sgt.service.TipoTarefaService;
import br.com.basis.sgt.service.dto.DropDownDTO;
import br.com.basis.sgt.service.dto.TipoTarefaDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

;

@CrossOrigin()
@RestController

@RequestMapping("/api/tipotarefas")
public class TipoTarefaResource {
    private final TipoTarefaService tipoTarefaService;

    public TipoTarefaResource(TipoTarefaService tipoTarefaService) {
        this.tipoTarefaService = tipoTarefaService;
    }


    @GetMapping
    public ResponseEntity<List<TipoTarefaDTO>> obterTodos(@RequestParam(value = "descricao", required = false) String descricao) {
        return new ResponseEntity<>(tipoTarefaService.obterTodos(descricao), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TipoTarefaDTO> criarTipoTarefa(@RequestBody TipoTarefaDTO tipoTarefa) {
        return ResponseEntity.ok(tipoTarefaService.salvar(tipoTarefa));
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<TipoTarefaDTO> update(@PathVariable ("id")Long id, @RequestBody TipoTarefaDTO dto){
        dto.setId(id);
        dto = tipoTarefaService.salvar(dto);
        return ResponseEntity.ok(dto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TipoTarefaDTO> obterPorId(@PathVariable("id") Long id) {
        return new ResponseEntity<>(tipoTarefaService.obterPorId(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarPorId(@PathVariable("id") Long id) {
        tipoTarefaService.deletarPorId(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/select")
    public  ResponseEntity<List<DropDownDTO>> findAllSelect(){
        List<DropDownDTO> dropResponsavel = tipoTarefaService.findAllSelect();
        return new ResponseEntity<>(dropResponsavel,HttpStatus.OK);
    }

}
