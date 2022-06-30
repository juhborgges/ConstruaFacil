package unitTests;

import devcalc.Calc;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
//oo

public class TestaCalc {
    @Test
    public void testarSomarDoisNumeros() {
        //1- Prepara - Configurar - Given
        int num1 = 5;
        int num2 = 7;
        int resultadoEsperado = 12;

        //2- Executar - When
        int resultadoAtual = Calc.somarDoisNumeros(num1, num2);

        //3 - Validar - Then
        assertEquals(resultadoEsperado, resultadoAtual);
    }

}


//criar mais 3 funcoes de calculo subtrair, multiplicar e dividir diferente de 0 e dividir com divisor igual a zero
