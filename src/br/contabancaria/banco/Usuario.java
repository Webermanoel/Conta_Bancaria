package src.br.contabancaria.banco;

public class Usuario {
    private String email;
    private static String senha;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public static String getSenha(){
        return senha;
    }

    public boolean validarSenha(String senha) {
        return this.senha.equals(senha);
    }
}


