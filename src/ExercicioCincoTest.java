import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExercicioCincoTest {
    @Test
    public void PessoaTest() {
        Pessoa pessoa = new Pessoa(
            "João",
            110,
            1.79,
            "2000-01-01"
        );
        String pessoaToString = "{" +
            " nome='João'" +
            ", peso='110.0'" +
            ", altura='1.79'" +
            ", dataNascimento='2000-01-01'" +
            "}";

        assertEquals(pessoaToString, pessoa.toString());
    } 
    
    @Test
    public void PessoaImcTest() {
        Pessoa pessoa = new Pessoa(
            "João",
            110,
            1.79,
            "2000-01-01"
        );

        assertEquals(34.331013, pessoa.imc(), 0.000003F);
        assertEquals("Obesidade Grau I", pessoa.imcTexto());
    }

    @Test
    public void ContaCorrenteTest() {
        ContaCorrente conta = new ContaCorrente(
            "98876-2",
            "1234",
            0,
            "Fulano da Silva"
        );
        String contaToString = "{" +
            " numeroConta='98876-2'" +
            ", agencia='1234'" +
            ", saldo='0.0'" +
            ", nomeTitular='Fulano da Silva'" +
            "}";
        assertEquals(contaToString, conta.toString());
    }

    @Test
    public void OperacoesTest() {
        ContaCorrente conta = new ContaCorrente(
            "98876-2",
            "1234",
            0,
            "Fulano da Silva"
        );
        assertEquals(0, conta.getSaldo(), 0.00003F);
        conta.depositar(250);
        assertEquals(250, conta.getSaldo(), 0.00003F);
        conta.depositar(100);
        assertEquals(350, conta.getSaldo(), 0.00003F);
        conta.saque(110.50);
        assertEquals(239.5, conta.getSaldo(), 0.00003F);
    }

    @Test
    public void CircunferenciaTest() {
        Circunferencia circunferencia = new Circunferencia(15);

        assertEquals(94.247780, circunferencia.area(), 0.000003F);
        assertEquals(706.858347, circunferencia.circunferencia(), 0.000003F);
    }

    @Test
    public void CifraDeCesarTest() {
        CifraDeCesar cifraUm = new CifraDeCesar("ola", 1);
        assertEquals("pmb", cifraUm.mensagemCifrada());
        CifraDeCesar cifraDois = new CifraDeCesar("a", 27);
        assertEquals("b", cifraDois.mensagemCifrada());
    }
}
