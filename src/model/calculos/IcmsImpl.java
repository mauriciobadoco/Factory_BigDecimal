package model.calculos;

import model.Orcamento;

import java.math.BigDecimal;

public class IcmsImpl implements  Imposto {
    public BigDecimal calcular(Orcamento orcamento){
        return orcamento.getValorOrcamento().multiply(new BigDecimal("0,1"));
    }
}
