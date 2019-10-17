package edu.cn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * @program DemoJdbc
 * @description:
 * @author:
 * @create:2019-10-17 08:49:52
 **/

@Repository
public class MoviePerformerDAOImpl implements MoviePerformerDAO {


    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public MoviePerformer queryById(Integer id) {
        return null;
    }

    @Override
    public List<MoviePerformer> queryByName(String name) {

        String sql = "select * from performer where name = ?";
        return jdbcTemplate.query(sql,new MoviePerformerRowMapper(),name);

    }

    class MoviePerformerRowMapper implements RowMapper<MoviePerformer>{

        @Override
        public MoviePerformer mapRow(ResultSet resultSet, int i) throws SQLException {
            MoviePerformer moviePerformer = new MoviePerformer();
            moviePerformer.setId(resultSet.getInt(1));
            moviePerformer.setMovieTitle(resultSet.getString(2));
            moviePerformer.setName(resultSet.getString(3));
            moviePerformer.setRepresentive(resultSet.getString(5));


            return moviePerformer;
        }
    }
}
