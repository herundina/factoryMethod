package com.br.herundina.dev.factoryMethod;

import com.br.herundina.dev.factoryMethod.domain.product.factoryMethod.CriaFichaAutomatizadaDoPaoCarioca;
import com.br.herundina.dev.factoryMethod.domain.product.factoryMethod.FactoryMethod;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Scanner;

@Slf4j
@SpringBootApplication
public class FactoryMethodApplication {

    public static void configuration(){

        FactoryMethod factory;
        Scanner input = new Scanner(System.in);

        log.info("Informe o nome Produto que deseja comprar 1 - (Pao Carioca)");
        int pedido = input.nextInt();

        if(pedido == 1){
            log.info("O produto escolhido foi: " + pedido);
            factory = new CriaFichaAutomatizadaDoPaoCarioca();
            factory.criarFichaTecnica();
        }else{
            log.warn("O produto escolhido foi: " + pedido);
            throw new IllegalArgumentException("Não vendemos este produto, escolha algum na lista");
        }

    }

	@Bean
    public CommandLineRunner run(){
        return args ->{

            boolean pedidoValido = false;

            while(!pedidoValido){
                try {
                    configuration();
                    pedidoValido = true;
                }catch(IllegalArgumentException e){
                    log.warn("Atenção! {} " , e.getMessage());
                }
            }
            log.warn("Finalizamos seu pedido, Obrigado por comprar conosco!");
            log.info("Volte Sempre!");


        };
    }

    public static void main(String[] args) {
        SpringApplication.run(FactoryMethodApplication.class, args);
    }

}
