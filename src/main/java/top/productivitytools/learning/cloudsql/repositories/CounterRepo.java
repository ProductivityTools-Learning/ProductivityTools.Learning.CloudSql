package top.productivitytools.learning.cloudsql.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import top.productivitytools.learning.cloudsql.entities.Counter;

public interface CounterRepo extends JpaRepository<Counter, Integer> {

}