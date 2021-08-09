package classes;

public class Usuario 
{
    private String login;
    private String password;
    private boolean logado;

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
        logado=false;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLogado() {
        
        if (!logado)
        {   // password válido quando é o inverso do login
            if (password.equals(new StringBuffer(login).reverse().toString()))
                logado=true;
        }
        return logado;
    }
    public boolean isValido() {
        
        if (!logado)
        {   // password válido quando é o inverso do login
            if (password.equals(new StringBuffer(login).reverse().toString()))
                logado=true;
        }
        return logado;
    }

    public void logar() {
        this.logado = true;
    }
}
