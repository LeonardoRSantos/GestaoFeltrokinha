/**
 * TODO ativar após arrumar o metodo no service
 */
//package br.feltrokinha.gestaofeltrokinha.controller;
//
//
//import br.feltrokinha.gestaofeltrokinha.model.entity.Pedido;
//import br.feltrokinha.gestaofeltrokinha.model.repositories.PedidoRepository;
//import br.feltrokinha.gestaofeltrokinha.service.PedidoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//
//
//@RestController
//@RequestMapping("pedidos")
//public class PedidoRestController {
//
//    @Autowired
//    PedidoRepository pedidoRepository;
//
//    @Autowired
//    private PedidoService pedidoService;
//
//    @GetMapping
//    public ResponseEntity<Iterable<Pedido>> buscarTodos(){
//        return ResponseEntity.ok(pedidoService.buscarTodos());
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Pedido> buscarPorId(@PathVariable Long id){
//        return ResponseEntity.ok(pedidoService.buscarPorId(id));
//    }
//
//    @PostMapping
//    public ResponseEntity<Pedido> inserir(@RequestBody Pedido pedido) {
//        pedidoService.inserir(pedido);
//        return ResponseEntity.ok(pedido);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Pedido> atualizar(@PathVariable Long id, @RequestBody Pedido pedido) {
//        pedidoService.atualizar(id, pedido);
//        return ResponseEntity.ok(pedido);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deletar(@PathVariable Long id) {
//        pedidoService.deletar(id);
//        return ResponseEntity.ok().build();
//    }
//
//}
