package com.example.demo.Repository;
import java.util.ArrayList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Entity.LibroEntity;


@Repository
public interface LibroRepository extends JpaRepository<LibroEntity, Integer> {

    public ArrayList<LibroEntity> findAll();

    


}
