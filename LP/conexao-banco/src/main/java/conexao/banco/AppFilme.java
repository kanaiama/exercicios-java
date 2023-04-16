package conexao.banco;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class AppFilme {
    public static void main(String[] args) {
        Conexao conexao = new Conexao();
        JdbcTemplate con = conexao.getConnection();
        
        con.execute("drop table if exists filme;");
        
        con.execute("create table filme ("
                + "id int primary key auto_increment,"
                + "nome varchar(45),"
                + "ano_lancamento int"
                + ");");
        
        con.update("insert into filme values (null, 'Sherek 5', 2023)");
        
        String nomeFilme = "Her";
        Integer anoLancamento = 2023;
        
        con.update(String.format("insert into filme values "
                + "(null, '%s', %d)", nomeFilme, anoLancamento));
        
        Filme novoFilme = new Filme
        (null, "A volta de quem não foi 2", 2077);
        
        con.update(String.format("insert into filme values "
                + "(null, '%s', %d)",
                novoFilme.getNome(), novoFilme.getAnoLancamento()));
        
        List<Filme> filmes = con.query(
                "select * from filme;",
                new BeanPropertyRowMapper(Filme.class));
        
        
        System.out.println(filmes);
        System.out.println("");
        
        List<Filme> filmesComWhere = con.query(
                "select * from filme where ano_lancamento > 2023;",
                new BeanPropertyRowMapper(Filme.class));
        
        System.out.println(filmesComWhere);
        System.out.println("");
        
//        con.update(
//                "update filme set nome = 'Shrek 4' where id = ? and nome = ?"
//                , 1, "Shrek 5");

          con.update(String.format(
               "update filme set nome = 'Shrek 4' where id = %d and nome = '%s'"
               , 1, "Shrek 5"));
          
          con.update(String.format(
               "delete from filme where id = %d", 3));
          
          filmes = con.query(
                "select * from filme;",
                new BeanPropertyRowMapper(Filme.class));
          
          System.out.println(filmes);
          

    }
}
