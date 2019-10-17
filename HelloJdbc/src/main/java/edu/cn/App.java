package edu.cn;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        MoviePerformerDAO moviePerformerDAO = new MoviePerformerDAOImpl();
  //      MoviePerformer moviePerformer = moviePerformerDAO.queryById(78);
   //     System.out.println(moviePerformer.getMovieTitle() + " " +
     //                       moviePerformer.getName());

        List<MoviePerformer> list = moviePerformerDAO.queryByName("刘嘉玲");
        for(MoviePerformer performer:list){
            System.out.println(performer.getMovieTitle() + " " +
                    performer.getName() + " " + performer.getRepresentive());
        }

    }
}
