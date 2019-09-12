package modelo;
import modelo.ModeloAdm;
public class ModeloMedicos extends ModeloAdm{
    
    private String crm;

    public ModeloMedicos(String login, String senha, String nome, String telefone, String crm) {
        super(login = login, senha = senha, nome = nome, telefone = telefone);
        this.crm = crm;
    }
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
