import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.Assert.assertArrayEquals;

import java.io.*;
import java.util.SortedSet;

import org.junit.*;

public class ExercicioQuatroTest {
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
    public void printArrayTest() {
        ExercicioQuatro.printArray(new String[]{ "Teste", "print", "foreach" });

        assertEquals(systemOutContent.toString(),"Teste\nprint\nforeach\n");
    }

    @Test
    public void dezValoresTest() {
        ExercicioQuatro.dezValores(new double[]{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });
        assertEquals(systemOutContent.toString(),"0.0\n1.0\n2.0\n3.0\n4.0\n5.0\n6.0\n7.0\n8.0\n9.0\n");
    }

    @Test
    public void dezValoresIntTest() {
        ExercicioQuatro.dezValoresInt(new int[]{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 });
        assertEquals(systemOutContent.toString(),"Par\nÍmpar\nPar\nÍmpar\nPar\nÍmpar\nPar\nÍmpar\nPar\nÍmpar\n");
    }

    @Test
    public void baralhoTest() {
        SortedSet<String> baralho = ExercicioQuatro.baralho();
        String[] nipes = new String[]{ "Paus", "Copas", "Espadas", "Ouros" };
        String[] numeros = new String[]{ "A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K" };

        for (String nipe : nipes) {
            for (String numero : numeros) {
                assertTrue(baralho.contains(nipe + " " + numero));
            }
        }
    }

    @Test
    public void mergeIntListTest() {
        Integer[] values = ExercicioQuatro.mergeIntList(new int[]{ 1, 2, 3 }, new int[]{ 4, 5, 6 });
        Integer[] expected = new Integer[]{ 1, 2, 3, 4, 5, 6 };

        assertArrayEquals(expected, values);
    }

    @Test
    public void temperaturasTest() {
        double media = ExercicioQuatro.temperaturaMedia(new double[]{ 35.0, 27.8, 16.7 });
        assertEquals(26.5, media, 0.0003F);
    }

    @Test
    public void alternarArrayTest() {
        int[] listaUm = new int[] { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
        int[] listaDois = new int[] { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int[] expected = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int[] valores = ExercicioQuatro.alternarArray(
            listaUm,
            listaDois
        );

        assertArrayEquals(expected, valores);
    }

    @Test
    public void mediaVinteTest() {
        int[] valores = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        ExercicioQuatro.mediaVinte(valores);

        assertEquals("1\n2\n3\n4\n5\n1\n2\n3\n4\n5\n", systemOutContent.toString());
    }
}
