public class CPF {
    private String numero;

    public CPF(String numero){
        if (numero.equals(null) || numero.matches("/(\\d{3})(\\d{3})(\\d{3})(\\d{2})/")){
            throw new IllegalArgumentException("Cpf invalido");
        }
        this.numero = numero;
    }
}
