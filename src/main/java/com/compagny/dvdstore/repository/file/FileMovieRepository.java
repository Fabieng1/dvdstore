package com.compagny.dvdstore.repository.file;

import com.compagny.dvdstore.entity.Movie;
import com.compagny.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@Repository
@Primary
public class FileMovieRepository implements MovieRepositoryInterface {

    FileWriter writer;

    @Value("${movie.file.location}")
    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileWriter getWriter() {
        return writer;
    }

    public void setWriter(FileWriter writer) {
        this.writer = writer;
    }

    public void add (Movie movie) {

        try{
            writer=new FileWriter(file, true);
            writer.write(movie.getTitle() + ";" + movie.getGenre());
            writer.close();


        }
        catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("Le film " + movie.getTitle() + " " + movie.getGenre() + " a bien été ajouté");
    }
}
