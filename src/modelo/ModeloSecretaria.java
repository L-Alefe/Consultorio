package modelo;
import modelo.ModeloAdm;
public class ModeloSecretaria extends ModeloAdm{
    private String cpf;
    private String rg;
    private String endereco;
    private String sexo;

    public ModeloSecretaria(String cpf, String rg, String endereco, String sexo, String login, String senha, String nome, String telefone) {
        super(login = login, senha = senha, nome = nome, telefone = telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
        this.sexo = sexo;
    }

    public String getCpf(){
        return cpf;
    }  
    public void setCpf(String cpf){
        this.cpf=cpf;
    }
    public String getRg(){
        return rg;
    }
    public void setRg(String rg){
        this.rg=rg;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco=endereco;
    }
    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
}