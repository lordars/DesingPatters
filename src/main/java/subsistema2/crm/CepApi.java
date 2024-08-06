package subsistema2.crm;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Caçapava";
    }
    public String recuperarEstado(String cep){
        return "São Paulo";
    }

}