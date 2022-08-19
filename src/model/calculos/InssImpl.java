package model.calculos;

import model.Orcamento;

import java.math.BigDecimal;

public class InssImpl implements  Imposto{
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0.06"));
    }
}
