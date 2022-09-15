package dao;

import model.Pessoa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PessoaDAO extends BaseDAO{

    public static List<Pessoa> selectPessoas() {
        final String sql = "SELECT * FROM pessoa";
        try
            (
                 Connection conn = getConnection();
                 PreparedStatement pstmt = conn.prepareStatement(sql);
                 ResultSet rs = pstmt.executeQuery()
            )
        {
            List<Pessoa> pessoas = new ArrayList<>();
            while (rs.next()) {
                pessoas.add(resultsetToPessoa(rs));
            }
            return pessoas;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Pessoa> selectPessoasByName(String nome) {
        final String sql = "SELECT * FROM pessoa WHERE nome LIKE ? ORDER BY nome";
        try
           (
                   Connection conn = getConnection();
                   PreparedStatement pstmt = conn.prepareStatement(sql)
           )
        {
            pstmt.setString(1, nome.toLowerCase() + "%");
            ResultSet rs = pstmt.executeQuery();
            List<Pessoa> pessoas = new ArrayList<>();
            while (rs.next()) {
                pessoas.add(resultsetToPessoa(rs));
            }
            return pessoas;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Pessoa> selectPessoasBySituacao(Boolean situacao) {
        final String sql = "SELECT * FROM pessoa WHERE situacao = ?";
        try
           (
                   Connection conn = getConnection();
                   PreparedStatement pstmt = conn.prepareStatement(sql)
           )
        {
            pstmt.setBoolean(1, situacao);
            ResultSet rs = pstmt.executeQuery();
            List<Pessoa> pessoas = new ArrayList<>();
            while (rs.next()) {
                pessoas.add(resultsetToPessoa(rs));
            }
            return pessoas;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Pessoa selectPessoaById(Long id) {
        final String sql = "SELECT * FROM pessoa WHERE id=?";
        try
           (
                   Connection conn = getConnection();
                   PreparedStatement pstmt = conn.prepareStatement(sql)
           )
        {
            pstmt.setLong(1, id);
            ResultSet rs = pstmt.executeQuery();
            Pessoa pessoa = null;
            if(rs.next()) {
                pessoa = resultsetToPessoa(rs);
            }
            rs.close();
            return pessoa;

        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static boolean insertPessoa(Pessoa pessoa) {
        final String sql = "INSERT INTO pessoa (nome, cpf, email, senha, status, curso, situacao) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try
           (
                   Connection conn = getConnection();
                   PreparedStatement pstmt = conn.prepareStatement(sql)
           )
        {
            pstmt.setString(1, pessoa.getNome());
            pstmt.setString(2, pessoa.getCpf());
            pstmt.setString(3, pessoa.getEmail());
            pstmt.setString(4, pessoa.getSenha());
            pstmt.setString(5, pessoa.getStatus());
            pstmt.setString(6, pessoa.getCurso());
            pstmt.setBoolean(7, pessoa.getSituacao());
            int count = pstmt.executeUpdate();
            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean updatePessoa(Pessoa pessoa) {
        final String sql = "UPDATE pessoa SET nome=?, cpf=?, email=?, senha=?, status=?, curso=?, situacao=? WHERE id=?";
        try
           (
                   Connection conn = getConnection();
                   PreparedStatement pstmt = conn.prepareStatement(sql)
           )
        {
            pstmt.setString(1, pessoa.getNome());
            pstmt.setString(2, pessoa.getCpf());
            pstmt.setString(3, pessoa.getEmail());
            pstmt.setString(4, pessoa.getSenha());
            pstmt.setString(5, pessoa.getStatus());
            pstmt.setString(6, pessoa.getCurso());
            pstmt.setBoolean(7, pessoa.getSituacao());
            pstmt.setLong(8, pessoa.getId());
            int count = pstmt.executeUpdate();
            return count > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean DeletePessoa(long id) {
        final String sql = "DELETE FROM pessoa WHERE id=?";
        try
           (
                   Connection conn = getConnection();
                   PreparedStatement pstmt = conn.prepareStatement(sql)
           )
        {
            pstmt.setLong(1, id);
            int deletado = pstmt.executeUpdate();
            if (deletado == 0) {
                return false;
            } else return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static Pessoa resultsetToPessoa(ResultSet rs) throws SQLException {
        Pessoa p = new Pessoa();
        p.setId(rs.getLong("id"));
        p.setCpf(rs.getString("cpf"));
        p.setNome(rs.getString("nome"));
        p.setEmail(rs.getString("email"));
        p.setSenha(rs.getString("senha"));
        p.setStatus(rs.getString("status"));
        p.setCurso(rs.getString("curso"));
        p.setSituacao(rs.getBoolean("situacao"));

        return p;
    }

    public static void main(String[] args) {
        System.out.println(selectPessoas());
    }
}
