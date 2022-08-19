package model.calculos;

import model.Orcamento;
import model.enuns.TipoImposto;

import java.math.BigDecimal;

import static model.enuns.TipoImposto.ICMS;

//vai tomar conta dos impostos e toda vez que acionar esta classe tem que usar os itens do enum

public class CalculadoraDeImpostos {

    //Este método chama tanto o INSS quanto o ICMS atraves da interface
    public BigDecimal calcularImpostos(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
