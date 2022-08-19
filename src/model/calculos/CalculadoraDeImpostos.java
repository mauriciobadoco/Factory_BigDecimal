package model.calculos;

import model.Orcamento;
import model.enuns.TipoImposto;

import java.math.BigDecimal;

import static model.enuns.TipoImposto.ICMS;

//vai tomar conta dos impostos e toda vez que acionar esta classe tem que usar os itens do enum

public class CalculadoraDeImpostos {

    public BigDecimal calcularImpostos(Orcamento orcamento, TipoImposto tipoImposto){

        switch(tipoImposto){
            case ICMS:
                return orcamento.getValorOrcamento().multiply(new BigDecimal(0.1));

            case INSS:
                return orcamento.getValorOrcamento().multiply((new BigDecimal(0.06)));

            default:
                return BigDecimal.ZERO;
        }
    }
}
