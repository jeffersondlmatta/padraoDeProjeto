package subSistemCep;


public class CepApi {
    private static CepApi instancia = new CepApi();


        private CepApi() {
        super();
    }


    public static CepApi getInstance() {
        return instancia;
    }

    public String getCity(String cep) {
            return "uberlandia";
    }
    public String getEstado(String cep) {
        return "MG";
    }
}
