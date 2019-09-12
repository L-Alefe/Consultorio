package controle;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.ModeloClinica;
import modelo.ModeloAdm;
import modelo.ModeloSecretaria;
public class ControleAdm {
    ModeloClinica clinica;
    ModeloAdm adm;
    public boolean logar(){
        boolean deuCerto = false;
        return deuCerto;
    }
    public boolean cadastrarInforClinica(ModeloClinica clinica){
        boolean deuCerto = false;
        try{
            Conexao conectar = new Conexao();
            PreparedStatement comando = conectar.getCon().prepareStatement("INSERT INTO clinica(nome,telefone,endereco,cnpj,cabecalho) VALUES(?,?,?,?,?);");
            comando.setString(1, clinica.getNome()); 
            comando.setString(2, clinica.getTelefone()); 
            comando.setString(3, clinica.getEndereco()); 
            comando.setString(4, clinica.getCnpj());
            comando.setString(5, clinica.getCabecalho());
            if(!comando.execute()){ 
		deuCerto = true;
            }
	}catch(SQLException e){
            System.out.println(e.getMessage());
	}
        return deuCerto;
    }
    
    public boolean cadastrarSecretarias(ModeloSecretaria secretaria){
        boolean deuCerto = false;
        try{
            Conexao conectar = new Conexao();
            PreparedStatement comando = conectar.getCon().prepareStatement("INSERT INTO secretaria(nome,senha,telefone,cpf,rg, endereco, sexo) VALUES(?,?,?,?,?,?,?);");
            comando.setString(1, secretaria.getNome()); 
            comando.setString(2, secretaria.getSenha()); 
            comando.setString(3, secretaria.getTelefone()); 
            comando.setString(4, secretaria.getCpf());
            comando.setString(5, secretaria.getRg());
            comando.setString(6, secretaria.getEndereco());
            comando.setString(7, secretaria.getSexo());
            if(!comando.execute()){ 
		deuCerto = true;
            }
	}catch(SQLException e){
            System.out.println(e.getMessage());
	}
        return deuCerto;
    }
}
