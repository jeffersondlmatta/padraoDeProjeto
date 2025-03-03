package facade;

import subSistem.crm.CrmService;
import subSistemCep.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().getCity(cep);
        String estado = CepApi.getInstance().getEstado(cep);

        CrmService.gravarCliente(nome,cep,cidade,estado);

    }

}
