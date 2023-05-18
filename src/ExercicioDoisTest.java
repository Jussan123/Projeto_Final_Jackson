import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExercicioDoisTest {
    @Test
    public void calculaMediaTest() {
        assertEquals(5.3333,ExercicioDois.calculaMedia(5, 5, 6), 0.0003f);
    }
    @Test
    public void qualMesTest() {
        assertEquals("Janeiro", ExercicioDois.qualMes(1));
        assertEquals("Fevereiro", ExercicioDois.qualMes(2));
        assertEquals("Março", ExercicioDois.qualMes(3));
        assertEquals("Abril", ExercicioDois.qualMes(4));
        assertEquals("Maio", ExercicioDois.qualMes(5));
        assertEquals("Junho", ExercicioDois.qualMes(6));
        assertEquals("Julho", ExercicioDois.qualMes(7));
        assertEquals("Agosto", ExercicioDois.qualMes(8));
        assertEquals("Setembro", ExercicioDois.qualMes(9));
        assertEquals("Outubro", ExercicioDois.qualMes(10));
        assertEquals("Novembro", ExercicioDois.qualMes(11));
        assertEquals("Dezembro", ExercicioDois.qualMes(12));
    }
    @Test
    public void tabuadaTest() {
        int[] tabuada = new int[]{ 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 };
        int[] tabuadaCalculada = ExercicioDois.tabuada(5);
        assertEquals(tabuada[0], tabuadaCalculada[0]);
        assertEquals(tabuada[1], tabuadaCalculada[1]);
        assertEquals(tabuada[2], tabuadaCalculada[2]);
        assertEquals(tabuada[3], tabuadaCalculada[3]);
        assertEquals(tabuada[4], tabuadaCalculada[4]);
        assertEquals(tabuada[5], tabuadaCalculada[5]);
        assertEquals(tabuada[6], tabuadaCalculada[6]);
        assertEquals(tabuada[7], tabuadaCalculada[7]);
        assertEquals(tabuada[8], tabuadaCalculada[8]);
        assertEquals(tabuada[9], tabuadaCalculada[9]);
    }
    @Test
    public void letraALetraTest() {
        char[] letras = ExercicioDois.letraALetra("Jackson");
        assertEquals(letras[0], 'J');
        assertEquals(letras[1], 'a');
        assertEquals(letras[2], 'c');
        assertEquals(letras[3], 'k');
        assertEquals(letras[4], 's');
        assertEquals(letras[5], 'o');
        assertEquals(letras[6], 'n');
    }
    @Test
    public void numerosImparesTest() {
        assertEquals(9072, ExercicioDois.numerosImpares(), 0.0f);
    }
    @Test
    public void calculaMediaInformadaTest() {
        double[] notas = new double[]{ 5,5,6};
        
        assertEquals(5.3333,ExercicioDois.calculaMedia(notas), 0.0003f);
    }
    @Test
    public void fatorialTest() {
        assertEquals(6, ExercicioDois.fatorial(3));
        assertEquals(120, ExercicioDois.fatorial(5));
        assertEquals(362880, ExercicioDois.fatorial(9));
    }
    @Test
    public void imcTest() {
        assertEquals(13.88888, ExercicioDois.imc(1.8, 50), 0.0003f);
        assertEquals(19.44444, ExercicioDois.imc(1.8, 70), 0.0003f);
        assertEquals(25.00000, ExercicioDois.imc(1.8, 90), 0.0003f);
        assertEquals(30.55555, ExercicioDois.imc(1.8, 110), 0.0003f);
        assertEquals(36.11111, ExercicioDois.imc(1.8, 130), 0.0003f);
        assertEquals(41.66666, ExercicioDois.imc(1.8, 150), 0.0003f);
    }
    @Test
    public void operadorTest() {
        assertEquals(4, ExercicioDois.operador(2, 2, '+'), 0.0003f);
        assertEquals(0, ExercicioDois.operador(2, 2, '-'), 0.0003f);
        assertEquals(4, ExercicioDois.operador(2, 2, '*'), 0.0003f);
        assertEquals(1, ExercicioDois.operador(2, 2, '/'), 0.0003f);
    }
    @Test
    public void notasNecessariasTest() {
        int[] notas = new int[]{ 3, 1, 1, 2, 1, 2 };
        int[] notasCalculadas = ExercicioDois.notasNecessarias(777);
        assertEquals(notas[0], notasCalculadas[0]);
        assertEquals(notas[1], notasCalculadas[1]);
        assertEquals(notas[2], notasCalculadas[2]);
        assertEquals(notas[3], notasCalculadas[3]);
        assertEquals(notas[4], notasCalculadas[4]);
        assertEquals(notas[5], notasCalculadas[5]);
    }
}
