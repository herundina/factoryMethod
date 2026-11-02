package com.br.herundina.dev.factoryMethod.domain.product.factoryMethod;

import com.br.herundina.dev.factoryMethod.domain.product.domainClass.FichaTecnica;
import com.br.herundina.dev.factoryMethod.domain.product.domainClass.PaoCarioca;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CriaFichaAutomatizadaDoPaoCarioca extends FactoryMethod{

    public FichaTecnica criarFichaTecnica() {
        log.info("Este método cria o Produto Pão Carioca");
        return new PaoCarioca();
    }
}
