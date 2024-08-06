package Facade;

import subsistema1.crm.CrmService;
import subsistema2.crm.CepApi;

public class Facade {



    public  void  migrarCLiente(String nome , String cep){

        String ciudade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep,ciudade, estado);
    }
}
