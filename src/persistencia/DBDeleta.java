package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBDeleta {

	private Connection con;
	
	public DBDeleta(){
		try {
			con = DBConnection.faz_conexao();
					
		} catch (SQLException f) {
			// TODO Auto-generated catch block
			f.printStackTrace();
		}
	}
	public boolean deletaBem(int idBem) throws SQLException {
		String sql = "delete from bem where id_bem = ?";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setInt(1, idBem);

		stmt.execute();
		stmt.close();
		con.close();
		
		return true;
	}
	public boolean deletaDependente(int idDependente) throws SQLException {
		String sql = "delete from dependente where id_dependente = ?";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setInt(1, idDependente);

		stmt.execute();
		stmt.close();
		con.close();
		
		return true;
	}
	public boolean deletaContracheque(int idContracheque) throws SQLException {
		String sql = "delete from contracheque where id_contracheque = ?";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setInt(1, idContracheque);

		stmt.execute();
		stmt.close();
		con.close();
		
		return true;
	}
	public boolean deletaNotaFiscal(int idNotaFiscal) throws SQLException {
		String sql = "delete from nota_fiscal where id_notafiscal = ?";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setInt(1, idNotaFiscal);

		stmt.execute();
		stmt.close();
		con.close();
		
		return true;
	}
	public boolean deletaPJ(int idPJ) throws SQLException {
		if(deletaNotaFiscalEContracheque(idPJ)) {
			String sql = "delete from pessoa_juridica where id_pessoajuridica = ?";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setInt(1, idPJ);
	
			stmt.execute();
			stmt.close();
			con.close();
			
			return true;
		}
		return false;
	}
	public boolean deletaNotaFiscalEContracheque(int idPJ) throws SQLException {
		String sql = "delete from nota_fiscal where id_pessoajuridica = ?";
		
		PreparedStatement stmt = con.prepareStatement(sql);
		
		stmt.setInt(1, idPJ);

		stmt.execute();
		stmt.close();
		
		String sql2 = "delete from contracheque where id_pessoajuridica = ?";
		PreparedStatement stmt2 = con.prepareStatement(sql2);
		
		stmt2.setInt(1, idPJ);

		stmt2.execute();
		stmt2.close();
		
		return true;
	}
}
