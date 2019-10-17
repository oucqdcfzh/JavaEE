package edu.cn.service;

import edu.cn.pojo.MoviePerformer;

import java.util.List;

public interface MoviePerformerService {
    public List<MoviePerformer> queryByName(String name);
}
