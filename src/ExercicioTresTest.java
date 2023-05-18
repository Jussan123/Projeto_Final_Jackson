import static org.junit.Assert.assertEquals;

import java.io.*;
import java.math.BigInteger;
import java.net.URISyntaxException;

import org.junit.*;

public class ExercicioTresTest {
    private PrintStream originalSystemOut;
    private ByteArrayOutputStream systemOutContent;

    @Before
    public void redirectSystemOutStream() {

        originalSystemOut = System.out;

        // given
        systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
    }

    @After
    public void restoreSystemOutStream() {
        System.setOut(originalSystemOut);
    }

    @Test
    public void tabuadaTest() throws IOException {
        ExercicioTres.tabuada(7);
        String[] valores = new String[] {
            "7 x 1 = 7",
            "7 x 2 = 14",
            "7 x 3 = 21",
            "7 x 4 = 28",
            "7 x 5 = 35",
            "7 x 6 = 42",
            "7 x 7 = 49",
            "7 x 8 = 56",
            "7 x 9 = 63",
            "7 x 10 = 70",
            ""
        };
        int cnt = 0;

        try {
            BufferedReader buffer = new BufferedReader(new FileReader("exercicio_tres_tabuada.txt"));
            String temp = "";
            while((temp = buffer.readLine()) != null) {
                assertEquals(valores[cnt], temp);
                cnt++;
            }
            buffer.close();
        } catch (IOException exception) {
            throw exception;
        }
    }

    @Test
    public void lerArquivoTextoTest() throws URISyntaxException {
        try {
            File file = new File(getClass().getClassLoader().getResource("archives/arquivo_para_leitura.txt").toURI());
            ExercicioTres.lerArquivoTexto(file.toPath().toString());
            assertEquals(systemOutContent.toString(),"arquivo\npara\nleitura\n");
        } catch (URISyntaxException exception) {
            throw exception;
        }
        
    }

    @Test
    public void bigIntExpoTest() {
        BigInteger bigInt = new BigInteger("123456789123456789");
        BigInteger bigIntResp = new BigInteger("15241578780673678515622620750190521");
        BigInteger bigIntPow = ExercicioTres.bigIntExpo(bigInt, 2);
        assertEquals(bigIntResp, bigIntPow);
    }

    @Test
    public void aleatorizarPessoasTest() {
        String[] pessoas = new String[]{ "Foo", "Bar", "Buz", "Fizz", "Fuzz" };
        ExercicioTres.aleatorizarPessoas(pessoas);

        assertEquals(true, systemOutContent.toString().contains(pessoas[0]));
        assertEquals(true, systemOutContent.toString().contains(pessoas[1]));
        assertEquals(true, systemOutContent.toString().contains(pessoas[2]));
        assertEquals(true, systemOutContent.toString().contains(pessoas[3]));
        assertEquals(true, systemOutContent.toString().contains(pessoas[4]));
    }

    @Test
    public void areaECircunferenciaTest() {
        double[] valores = ExercicioTres.areaECircunferencia(15);
        
        assertEquals(94.247780, valores[0], 0.000003F);
        assertEquals(706.858347, valores[1], 0.000003F);
    }

    @Test
    public void hasJavaTest() throws URISyntaxException {
        try {
            File file = new File(getClass().getClassLoader().getResource("archives/have_java.txt").toURI());
            assertEquals(true, ExercicioTres.hasJava(file.toPath().toString()));

            file = new File(getClass().getClassLoader().getResource("archives/dont_have_java.txt").toURI());
            assertEquals(false, ExercicioTres.hasJava(file.toPath().toString()));
        } catch (URISyntaxException exception) {
            throw exception;
        }
    }

    @Test
    public void dezDigitosTest() throws URISyntaxException {
        try {
            File file = new File(getClass().getClassLoader().getResource("archives/arquivo_para_leitura.txt").toURI());
            ExercicioTres.dezDigitos(file.toPath().toString());
            assertEquals(systemOutContent.toString(),"arquivopa\n");
        } catch (URISyntaxException exception) {
            throw exception;
        }
    }

    @Test
    public void calculaAreaTest() {
        assertEquals(4, ExercicioTres.calculaArea(2, 2), 0.0003F);
    }

    @Test
    public void somaValoresArquivo() throws URISyntaxException{
        try {
            File file = new File(getClass().getClassLoader().getResource("archives/soma_valores.txt").toURI());
            assertEquals(10, ExercicioTres.somaValoresArquivo(file.toPath().toString()), 0.0003f);
        } catch (URISyntaxException exception) {
            throw exception;
        }
    }
}
