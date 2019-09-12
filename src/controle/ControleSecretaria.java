package controle;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ModeloSecretaria;
import modelo.ModeloMedicos;
import modelo.ModeloPaciente;
import modelo.ModeloConvenio;
public class ControleSecretaria{
    ModeloSecretaria secretaria;
    ModeloMedicos medico;
    ModeloPaciente paciente;
    ModeloConvenio convenio;
    
    public boolean cadastrarMedicos(ModeloMedicos medico){
        boolean deuCerto = false;
        try{
            Conexao conectar = new Conexao();
            PreparedStatement comando = conectar.getCon().prepareStatement("INSERT INTO medicos(nome,senha, telefone,crm) VALUES(?,?,?,?);");
            comando.setString(1, medico.getNome()); 
            comando.setString(2, medico.getSenha()); 
            comando.setString(3, medico.getTelefone()); 
            comando.setString(4, medico.getCrm());
            if(!comando.execute()){ 
		deuCerto = true;
            }
	}catch(SQLException e){
            System.out.println(e.getMessage());
	}
        return deuCerto;
    }
    public boolean cadastrarConvenios(ModeloConvenio convenio){
        boolean deuCerto = false;
        try{
            Conexao conectar = new Conexao();
            PreparedStatement comando = conectar.getCon().prepareStatement("INSERT INTO convenio(nome, telefone,endereco, cnpj, planos) VALUES(?,?,?,?,?);");
            comando.setString(1, convenio.getNome()); 
            comando.setString(2, convenio.getTelefone());
            comando.setString(3, convenio.getEndereco());
            comando.setString(4, convenio.getCnpj());
            comando.setString(5, convenio.getPlanos());
            if(!comando.execute()){ 
		deuCerto = true;
            }
	}catch(SQLException e){
            System.out.println(e.getMessage());
	}
        return deuCerto;
    }
    public boolean cadastrarPacientes(ModeloPaciente paciente){
        boolean deuCerto = false;
        try{
            Conexao conectar = new Conexao();
            PreparedStatement comando = conectar.getCon().prepareStatement("INSERT INTO paciente(nome,telefone,cpf,rg,endereco,sexo) VALUES(?,?,?,?,?,?);");
            comando.setString(1, paciente.getNome()); 
            comando.setString(2, paciente.getTelefone()); 
            comando.setString(3, paciente.getCpf()); 
            comando.setString(4, paciente.getRg());
            comando.setString(5, paciente.getEndereco());
            comando.setString(6, paciente.getSexo());
            if(!comando.execute()){ 
		deuCerto = true;
            }
	}catch(SQLException e){
            System.out.println(e.getMessage());
	}
        return deuCerto;
    }
    public boolean marcarConsultas(){
        boolean deuCerto = false;
        return deuCerto;
    }
    public boolean emitirRelatorio(){
        boolean deuCerto = false;
        return deuCerto;
    }
    public boolean alterarDadosMedicos(ModeloMedicos medico){
        boolean deuCerto = false;
        return deuCerto;
    }
    public ArrayList buscarPaciente(){
        ArrayList lista = new ArrayList<>();
        try{
            Conexao conectar = new Conexao();
            PreparedStatement ps = conectar.getCon().prepareStatement("SELECT * FROM paciente;");
            ResultSet rs = ps.executeQuery();
            if(rs != null){ 
			while(rs.next()){ 
                                ModeloPaciente paciente = new ModeloPaciente();
                    		
				paciente.setNome(rs.getString("nome")); 
                   		paciente.setTelefone(rs.getString("telefone"));
                                paciente.setCpf(rs.getString("cpf"));
                    		paciente.setRg(rs.getString("rg"));
                                paciente.setEndereco(rs.getString("endereco"));
                                paciente.setSexo(rs.getString("sexo"));
                                paciente.setId(Integer.parseInt(rs.getString("id")));
				lista.add(paciente);
                            }
			}else{
				lista = null;
			}
        }catch(SQLException e){
            lista = null;
        }
        return lista;
    }
    public boolean alterarDadosPacientes(ModeloPaciente pac){
        boolean deuCerto = false;
        try{
            Conexao conectar = new Conexao();
            PreparedStatement comando = conectar.getCon().prepareStatement("UPDATE paciente SET nome=?, telefone=?, cpf=?, rg=?, endereco=?, sexo=? WHERE id=?;");
            comando.setString(1, pac.getNome());
            comando.setString(2, pac.getTelefone());
            comando.setString(3, pac.getCpf());
            comando.setString(4, pac.getRg());
            comando.setString(5, pac.getEndereco());
            comando.setString(6, pac.getSexo());
            comando.setInt(7, pac.getId());
            if(!comando.execute()){ 
		deuCerto = true;
            }
            
        }catch(SQLException e){
            System.out.println(e.getMessage());
	}
        return deuCerto;
    }
    public boolean buscarCovenios(){
        boolean deuCerto = false;
        return deuCerto;
    }
    public boolean marcarConsulta(){
        boolean deuCerto = false;
        return deuCerto;
    }
    public boolean buscarConsulta(){
        boolean deuCerto = false;
        return deuCerto;
    }
    public boolean marcarCompromissoMedico(){
        boolean deuCerto = false;
        return deuCerto;
    }
    public boolean consultarAgendaMedica(){
        boolean deuCerto = false;
        return deuCerto;
    }
    public boolean emitirRelatorios(){
        boolean deuCerto = false;
        return deuCerto;
    }
}