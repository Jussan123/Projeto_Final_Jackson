import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.*;

public class ExercicioExtraTest {
    private PrintStream originalSystemOut;
    private ByteArrayOutputStream systemOutContent;

    @Before
    public void redirectSystemOutStream() {
        originalSystemOut = System.out;

        systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
    }

    @After
    public void restoreSystemOutStream() {
        System.setOut(originalSystemOut);
    }

    @Test
    public void palindromoTest() {
        assertEquals(true, ExercicioExtra.palindromo("socos"));
        assertEquals(true, ExercicioExtra.palindromo("A base do teto desaba"));
        assertEquals(false, ExercicioExtra.palindromo("palavra"));
        assertEquals(false, ExercicioExtra.palindromo("O rato roeu a roupa do rei de Roma"));
    }

    @Test
    public void jurosTest() {
        try {
            ArrayList<Double[]> prestacoes = ExercicioExtra.juros(1000, 200, 1.5);
            assertEquals(6, prestacoes.size());
            assertEquals(prestacoes.get(5)[2], 47.533078, 0.000003F);
            //47.533078
        } catch (Exception err) {

        }
    }

    @Test
    public void isFibonacciTest() {
        assertEquals(true, ExercicioExtra.isFibonacci(0));
        assertEquals(true, ExercicioExtra.isFibonacci(1));
        assertEquals(true, ExercicioExtra.isFibonacci(2));
        assertEquals(true, ExercicioExtra.isFibonacci(3));
        assertEquals(false, ExercicioExtra.isFibonacci(4));
        assertEquals(true, ExercicioExtra.isFibonacci(5));
        assertEquals(false, ExercicioExtra.isFibonacci(6));
        assertEquals(false, ExercicioExtra.isFibonacci(7));
        assertEquals(true, ExercicioExtra.isFibonacci(8));
        assertEquals(false, ExercicioExtra.isFibonacci(9));
        assertEquals(false, ExercicioExtra.isFibonacci(10));
        assertEquals(false, ExercicioExtra.isFibonacci(11));
        assertEquals(false, ExercicioExtra.isFibonacci(12));
        assertEquals(true, ExercicioExtra.isFibonacci(13));
        assertEquals(false, ExercicioExtra.isFibonacci(14));

        assertEquals(true, ExercicioExtra.isFibonacci(144));
        assertEquals(false, ExercicioExtra.isFibonacci(145));
    }

    @Test
    public void toBinaryTest() {
        assertEquals("1",ExercicioExtra.toBinary(1));
        assertEquals("10",ExercicioExtra.toBinary(2));
        assertEquals("11",ExercicioExtra.toBinary(3));
    }

    @Test
    public void tabuadaTest() {
        ExercicioExtra.tabuadaESequencia(3);
        String expected = "3 x 1 = 3\n3 x 2 = 6\n3 x 3 = 9\n3 x 4 = 12\n3 x 5 = 15\n3 x 6 = 18\n3 x 7 = 21\n3 x 8 = 24\n3 x 9 = 27\n3 x 10 = 30\n";
        assertEquals(expected, systemOutContent.toString());
    }

    @Test
    public void sequenceTest() {
        ExercicioExtra.tabuadaESequencia(1,10);
        String expected = "1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n";
        assertEquals(expected, systemOutContent.toString());
    }

    @Test
    public void datNascimentoTest() {
        try {

            String dataEmString = "31-03-1993";
            //Instantiating the SimpleDateFormat class
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
            //Parsing the given String to Date object
            Date dataNascimento = formatter.parse(dataEmString);   
            
            int[] data = ExercicioExtra.printDataDeNascimento(dataNascimento);
            assertTrue("Previous (" + data[2] + ") should be greater than current (" + 29 + ")", data[2] >= 29);
            assertTrue("Previous (" + data[1] + ") should be greater than current (" + 29 + ")", data[1] >= 352);
            assertTrue("Previous (" + data[0] + ") should be greater than current (" + 29 + ")", data[0] >= 10703);
        } catch (ParseException err) {

        }
    }

    @Test
    public void sortNumberTest() {
        int numberMin = ExercicioExtra.sortNumber(1, 3);
        assertTrue(numberMin >= 1 && numberMin <= 3);
        int numberMax = ExercicioExtra.sortNumber(1, 10);
        assertTrue(numberMax >= 1 && numberMax <= 10);
    }

    @Test
    public void piramidTest() {
        ExercicioExtra.piramid(11);
        String expected = "01\n"
        + "02 02\n"
        + "03 03 03\n"
        + "04 04 04 04\n"
        + "05 05 05 05 05\n"
        + "06 06 06 06 06 06\n"
        + "07 07 07 07 07 07 07\n"
        + "08 08 08 08 08 08 08 08\n"
        + "09 09 09 09 09 09 09 09 09\n"
        + "10 10 10 10 10 10 10 10 10 10\n"
        + "11 11 11 11 11 11 11 11 11 11 11\n";

        assertEquals(expected, systemOutContent.toString());
    }

    @Test
    public void pessoasTest() {
        PessoaExtra.pessoas.add(new PessoaExtra("F", 17));
        PessoaExtra.pessoas.add(new PessoaExtra("F", 17));
        PessoaExtra.pessoas.add(new PessoaExtra("F", 17));
        PessoaExtra.pessoas.add(new PessoaExtra("F", 21));
        PessoaExtra.pessoas.add(new PessoaExtra("M", 17));
        PessoaExtra.pessoas.add(new PessoaExtra("M", 28));
        PessoaExtra.pessoas.add(new PessoaExtra("M", 25));
        PessoaExtra.pessoas.add(new PessoaExtra("M", 21));

        int[] pessoas = PessoaExtra.countPessoa();

        assertEquals(3, pessoas[0]);
        assertEquals(1, pessoas[1]);
        assertEquals(1, pessoas[2]);
        assertEquals(3, pessoas[3]);
    }

    @Test
    public void sortedNumberTest() {
        int sortedNumber = SortNumber.getSortedNumber();
        int cntNumbers = 0;
        for(int cnt = 0; cnt <= 100; cnt++) {
            if (cnt == sortedNumber) {
                cntNumbers++;
                assertTrue(SortNumber.isNumber(cnt));
            } else {
                assertTrue(!SortNumber.isNumber(cnt));
            }
        }

        assertEquals(1, cntNumbers);
    }
}
