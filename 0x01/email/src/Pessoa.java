public class Pessoa {

    public static boolean emailValid(String email){
        boolean retorno = false;
        if(email != null && !email.isEmpty()){
            boolean contemArroba = email.contains("@");
            boolean contemMenos50Caracteres = email.length() <= 50;
            retorno = contemArroba && contemMenos50Caracteres;
        }
        return retorno;
    }
}