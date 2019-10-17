package edu.cn;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @program HelloJdbc
 * @description:
 * @author:
 * @create:2019-10-15 08:45:44
 **/

public class MoviePerformerDAOImpl implements MoviePerformerDAO{
    private Connection connection;

    @Override
    public MoviePerformer queryById(Integer id) {
        MoviePerformer moviePerformer = null;
        connection = ConnectionDemo.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from performer where id = ?");
            preparedStatement.setInt(1,id);
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()){
                moviePerformer = new MoviePerformer();
                moviePerformer.setId(rs.getInt(1));
                moviePerformer.setMovieTitle(rs.getString(2));
                moviePerformer.setName(rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return moviePerformer;
    }

    @Override
    public List<MoviePerformer> queryByName(String name) {
        List<MoviePerformer> list = new ArrayList<MoviePerformer>();
        MoviePerformer moviePerformer = null;
        connection = ConnectionDemo.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from performer where name = ?");
            preparedStatement.setString(1,name);
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();

            while(rs.next()){
                moviePerformer = new MoviePerformer();
                moviePerformer.setId(rs.getInt(1));
                moviePerformer.setMovieTitle(rs.getString(2));
                moviePerformer.setName(rs.getString(3));
                moviePerformer.setRepresentive(rs.getString(5));
                list.add(moviePerformer);
               System.out.println("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
