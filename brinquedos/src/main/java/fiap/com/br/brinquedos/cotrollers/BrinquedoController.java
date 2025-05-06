package fiap.com.br.brinquedos.cotrollers;

import fiap.com.br.brinquedos.entities.Brinquedo;
import fiap.com.br.brinquedos.services.BrinquedoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brinquedos")
public class BrinquedoController {

    @Autowired
    BrinquedoService service;

    @PostMapping()
    public Object getBrinquedo(@RequestBody Brinquedo brinquedo) {;
        Object retorno = service.salvar(brinquedo);

        if (retorno == null) return "Não foi possivel cadastrar brinquedo, objeto null";
        else return retorno;
    }

    @PutMapping()
    public Object postBrinquedo(@RequestBody Brinquedo brinquedo) {
        Brinquedo retorno = service.atualizar(brinquedo);

        if (retorno == null) return "Não foi possivel atualizar brinquedo, objeto null";
        else return retorno;
    }

    @GetMapping()
    public List<Brinquedo> getTodosBrinquedos() {
        return service.obterTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getBrinquedoPorId(@PathVariable Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().body("ID não pode ser nulo");
        }

        Brinquedo brinquedo = service.obterPorId(id);
        if (brinquedo == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(brinquedo);
    }

    @DeleteMapping("/{id}")
    public Object deleteBrinquedo(@PathVariable("id") Long id) {
        String retorno = service.deletar(id);
        return retorno;
    }
}
