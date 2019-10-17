package edu.cn;

import java.util.List;

public interface MoviePerformerDAO {
    public MoviePerformer queryById(Integer id);
    public List<MoviePerformer> queryByName(String name);
}
