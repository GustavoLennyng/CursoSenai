package com.gustavo;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gustavo.domain.Cidade;
import com.gustavo.domain.Cliente;
import com.gustavo.domain.Endereco;
import com.gustavo.domain.Estado;
import com.gustavo.domain.enuns.TipoCliente;
import com.gustavo.repositories.CidadeRepository;
import com.gustavo.repositories.ClienteRepository;
import com.gustavo.repositories.EnderecoRepository;
import com.gustavo.repositories.EstadoRepository;

@SpringBootApplication
public class CursoSenaiApplication implements CommandLineRunner{
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursoSenaiApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		estadoRepository.saveAll(Arrays.asList(est1,est2));
		
		Cidade c1 = new Cidade(null, "Uberlândia", est1);
		Cidade c2 = new Cidade(null, "São Paulo", est2);
		cidadeRepository.saveAll(Arrays.asList(c1, c2));
		
		Cliente cli1 = new Cliente(null, "Gustavo Lennyng", "12345678987", "gustavolennyng@sesisenai.com", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("34900000000", "09877890098"));
		clienteRepository.saveAll(Arrays.asList(cli1));
		
		Cliente cli2 = new Cliente(null, "Marco Martins", "12342378337", "marcomartins@sesisenai.com", TipoCliente.PESSOAFISICA);
		cli2.getTelefones().addAll(Arrays.asList("87658909876", "49847892298"));
		clienteRepository.saveAll(Arrays.asList(cli2));
		
		Cliente cli3 = new Cliente(null, "Igor Tulio", "56473278492", "igortulio@sesisenai.com", TipoCliente.PESSOAFISICA);
		cli3.getTelefones().addAll(Arrays.asList("0983743834", "09856321098"));
		clienteRepository.saveAll(Arrays.asList(cli3));
		
		Cliente cli4 = new Cliente(null, "Guilherme Lopes", "12345678987", "guilhermelopes@sesisenai.com", TipoCliente.PESSOAFISICA);
		cli4.getTelefones().addAll(Arrays.asList("37593774398", "12343456788"));
		clienteRepository.saveAll(Arrays.asList(cli4));
		
		Cliente cli5 = new Cliente(null, "Anglo Crispim", "78956438987", "anglocrispim@sesisenai.com", TipoCliente.PESSOAFISICA);
		cli5.getTelefones().addAll(Arrays.asList("89427078290", "43228890098"));
		clienteRepository.saveAll(Arrays.asList(cli5));
		
		Cliente cli6 = new Cliente(null, "Moto Motto", "45168465215", "motomotto@sesisenai.com", TipoCliente.PESSOAFISICA);
		cli6.getTelefones().addAll(Arrays.asList("33498503948", "37783494398"));
		clienteRepository.saveAll(Arrays.asList(cli6));
		
		Cliente cli7 = new Cliente(null, "Joao Afonso", "7320439879", "joaoafonso@sesisenai.com", TipoCliente.PESSOAFISICA);
		cli7.getTelefones().addAll(Arrays.asList("67526985214", "52489632515"));
		clienteRepository.saveAll(Arrays.asList(cli7));
		
		Cliente cli8 = new Cliente(null, "Victor Hugo", "52145236978", "victorhugomalandro@sesisenai.com", TipoCliente.PESSOAFISICA);
		cli8.getTelefones().addAll(Arrays.asList("4545454564", "44654654564"));
		clienteRepository.saveAll(Arrays.asList(cli8));
		
		Cliente cli9 = new Cliente(null, "Joao Lucas", "42563125426", "lucasjoaomalandrin@sesisenai.com", TipoCliente.PESSOAFISICA);
		cli9.getTelefones().addAll(Arrays.asList("78963214529", "45445145555"));
		clienteRepository.saveAll(Arrays.asList(cli9));
		
		Cliente cli10 = new Cliente(null, "Fernando de Noronha", "45213652155", "fernandodenoronha@sesisenai.com", TipoCliente.PESSOAFISICA);
		cli10.getTelefones().addAll(Arrays.asList("09876543217", "09809809099"));
		clienteRepository.saveAll(Arrays.asList(cli10));
		
		Endereco e1 = new Endereco(null, "Rua das Amoebas", "55b", "Ap 310", "Jardim", "38447587", cli1, c1);
		Endereco e2 = new Endereco(null, "Rua das Amoras", "34a", "Ap 322", "Maravilha", "54328765", cli2, c1);
		Endereco e3 = new Endereco(null, "Rua 21 de Abril", " ", " ", "Pacaembu", "93045733", cli3, c2);
		Endereco e4 = new Endereco(null, "Rua das Amoebas", "32b", "Ap 123", "Jardim", "89897676", cli4, c1);
		Endereco e5 = new Endereco(null, "Avenida Brasil", " ", " ", "Pururuca", "87834327", cli5, c2);
		Endereco e6 = new Endereco(null, "Rua das Amoebas", "53b", "Ap 10", "Jardim", "35445557", cli6, c1);
		Endereco e7 = new Endereco(null, "Rua das Amoebas", "55b", "Ap 311", "Jardim", "85236514", cli7, c1);
		Endereco e8 = new Endereco(null, "Andromeda", " ", " ", "London", "38447587", cli8, c2);
		Endereco e9 = new Endereco(null, "Rua das Amoebas", "5b", "Ap 30", "Jardim", "85236974", cli9, c1);
		Endereco e10 = new Endereco(null, "Amor", " ", " ", "Thrasher", "87942838", cli10, c2);
		
		cli1.getEnderecos().addAll(Arrays.asList(e1));
		cli2.getEnderecos().addAll(Arrays.asList(e2));
		cli3.getEnderecos().addAll(Arrays.asList(e3));
		cli4.getEnderecos().addAll(Arrays.asList(e4));
		cli5.getEnderecos().addAll(Arrays.asList(e5));
		cli6.getEnderecos().addAll(Arrays.asList(e6));
		cli7.getEnderecos().addAll(Arrays.asList(e7));
		cli8.getEnderecos().addAll(Arrays.asList(e8));
		cli9.getEnderecos().addAll(Arrays.asList(e9));
		cli10.getEnderecos().addAll(Arrays.asList(e10));
		
		enderecoRepository.saveAll(Arrays.asList(e1, e2));
	}
}