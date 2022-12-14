package vision;

import model.Orcamento;
import model.calculos.CalculadoraDeImpostos;
import model.calculos.IcmsImpl;
import model.calculos.InssImpl;
import model.enuns.TipoImposto;
import org.w3c.dom.ls.LSOutput;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
        System.out.println( calculadoraDeImpostos.calcularImpostos(orcamento, new IcmsImpl()));

        System.out.println( calculadoraDeImpostos.calcularImpostos(orcamento, new InssImpl()));

    }
}
