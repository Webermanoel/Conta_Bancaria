package src.br.contabancaria.banco;

import java.util.regex.*;

public class Utils {

    public static boolean validarEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validarSenha(String senha) {
        return senha.matches("^(?=.*[0-9])(?=.*[a-zA-Z]).{8,}$");
    }

}

