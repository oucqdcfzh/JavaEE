package edu.cn.service;

import edu.cn.dao.MoviePerformerDAO;
import edu.cn.pojo.MoviePerformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program HelloMVC
 * @description:
 * @author:
 * @create:2019-10-17 05:50:35
 **/
@Service
public class MoviePerformerServiceImpl implements MoviePerformerService{

    @Autowired
    private MoviePerformerDAO moviePerformerDAOImpl;

    @Override
    public List<MoviePerformer> queryByName(String name) {
        return moviePerformerDAOImpl.queryByName(name);
    }
}
