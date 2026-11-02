package com.br.herundina.dev.factoryMethod.domain.product.domainClass;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PaoCarioca implements FichaTecnica{

    public PaoCarioca(){
        log.info("Construtor classe PaoCarioca");
        this.fichaTecnica();
    }

    public FichaTecnica fichaTecnica() {
        log.info("Método fichaTecnica da classe PaoCarioca");
        return null;
    }
}
