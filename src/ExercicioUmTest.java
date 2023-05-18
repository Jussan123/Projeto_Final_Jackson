import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ExercicioUmTest {
    @Test
    public void mediaTest() {
        assertEquals(5.0f, ExercicioUm.media(4,5,6), 0.0003f);
    }
    @Test
    public void areaTest() {
        assertEquals(16.0f, ExercicioUm.area(4,4), 0.0003f);
    }
    @Test
    public void volumeTest() {
        assertEquals(64.0f, ExercicioUm.volume(4,4,4), 0.0003f);
    }
    @Test
    public void valorMaiorQueDobroTest() {
        assertEquals(true, ExercicioUm.valorMaiorQueDobro(9,4));
        assertEquals(false, ExercicioUm.valorMaiorQueDobro(7,4));
    }
    @Test
    public void bhaskaraTest() {
        double[] x = ExercicioUm.bhaskara(1, 4, 1);
        assertEquals(-0.27, x[0], 0.3f);
        assertEquals(-3.73, x[1], 0.3f);
    }
    @Test
    public void mediaViagemTest() {
        assertEquals(100, ExercicioUm.mediaViagem(100, 1), 0.0003f);
    }
    @Test
    public void percentualImpostoTest() {
        assertEquals(25, ExercicioUm.percentualImposto(20000, 5000), 0.0003f);
    }
    @Test
    public void imparTest() {
        assertEquals(true, ExercicioUm.parOuImpar(4));
        assertEquals(false,ExercicioUm.parOuImpar(5));
    }
    @Test
    public void stringDiferenteTest() {
        assertEquals(false, ExercicioUm.compareString("Ola Mundo", "Hello World"));
        assertEquals(true, ExercicioUm.compareString("Ola Mundo", "Ola Mundo"));
    }

    @Test
    public void stringConvertTest() {
        assertEquals(5, ExercicioUm.convertString("5.5"));
    }

    @Test
    public void salarioIsentoTest() {
        assertEquals(0, ExercicioUm.percentualImpostoSalario(1903.98), 0.0003f);
    }
    @Test
    public void salarioSeteTest() {
        assertEquals(7.5, ExercicioUm.percentualImpostoSalario(1903.99), 0.0003f);
    }
    @Test
    public void salarioQuinzeTest() {
        assertEquals(15, ExercicioUm.percentualImpostoSalario(2826.66), 0.0003f);
    }
    @Test
    public void salarioVinteDoisTest() {
        assertEquals(22.5, ExercicioUm.percentualImpostoSalario(3751.06), 0.0003f);
    }
    @Test
    public void salarioVinteSeteTest() {
        assertEquals(27.5, ExercicioUm.percentualImpostoSalario(4664.69), 0.0003f);
    }

    @Test
    public void testePrimoTest() {
        assertEquals(true, ExercicioUm.testePrimo(7));
        assertEquals(false, ExercicioUm.testePrimo(9));
    }
}
