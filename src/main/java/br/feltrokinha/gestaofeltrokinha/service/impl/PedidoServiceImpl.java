/**
 * TODO arrumar o metodo salvar pedido.
 */
//package br.feltrokinha.gestaofeltrokinha.service.impl;
//
//import br.feltrokinha.gestaofeltrokinha.model.entity.Cliente;
//import br.feltrokinha.gestaofeltrokinha.model.entity.Endereco;
//import br.feltrokinha.gestaofeltrokinha.model.entity.Pedido;
//import br.feltrokinha.gestaofeltrokinha.model.repositories.ClienteRepository;
//import br.feltrokinha.gestaofeltrokinha.model.repositories.EnderecoRepository;
//import br.feltrokinha.gestaofeltrokinha.model.repositories.PedidoRepository;
//import br.feltrokinha.gestaofeltrokinha.service.PedidoService;
//import br.feltrokinha.gestaofeltrokinha.service.ViaCepService;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Optional;
//
//public class PedidoServiceImpl implements PedidoService {
//
//    @Autowired
//    private PedidoRepository pedidoRepository;
//
//    @Autowired
//    private EnderecoRepository enderecoRepository;
//
//    @Autowired
//    private ClienteRepository clienteRepository;
//
//    @Override
//    public Iterable<Pedido> buscarTodos(){
//        return pedidoRepository.findAll();
//    }
//
//    @Override
//    public Pedido buscarPorId(Long id){
//        Optional<Pedido> pedido = pedidoRepository.findById(id);
//        return pedido.get();
//    }
//
//    @Override
//    public void inserir(Pedido pedido){
//        salvarPedidoComCep(pedido);
//    }
//
//    @Override
//    public void atualizar(Long id, Pedido pedido){
//        Optional<Pedido> pedidoBd = pedidoRepository.findById(id);
//        if(pedidoBd.isPresent()){
//            salvarPedidoComCep(pedido);
//        }
//    }
//
//    @Override
//    public void deletar(Long id){
//        pedidoRepository.deleteById(id);
//    }
//
//    private void salvarPedidoComNota(Pedido pedido){
//        Long nota = pedido.getCliente().getId();
//        Cliente cliente = clienteRepository.findById(nota).orElseGet(() ->{
//            Pedido novoPedido = PedidoService.buscarPorId();
//            pedidoRepository.save(novoPedido);
//            return novoPedido;
//        });
//
//        pedido.setNfe(nota);
//
//        pedidoRepository.save(pedido);
//    }
//}
