package edu.cn.dao;

import edu.cn.pojo.MoviePerformer;

import java.util.List;

public interface MoviePerformerDAO {
    public MoviePerformer queryById(Integer id);
    public List<MoviePerformer> queryByName(String name);
    public List<MoviePerformer> queryAll();
    public int insertMoviePerformer(MoviePerformer moviePerformer);

}
