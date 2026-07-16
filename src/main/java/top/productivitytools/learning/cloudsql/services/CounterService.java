package top.productivitytools.learning.cloudsql.services;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import top.productivitytools.learning.cloudsql.repositories.CounterRepo;
import top.productivitytools.learning.cloudsql.entities.Counter;

@Service
@RequiredArgsConstructor
@Slf4j
public class CounterService {
    private final CounterRepo counterRepo;

    @Transactional
    public Integer incrementCounter(Integer id) {
        Counter counter = counterRepo.findById(id).orElseThrow(() -> new RuntimeException("Counter not found"));
        Integer currentValue = counter.getCounterValue();
        currentValue++;
        counter.setCounterValue(currentValue);
        counterRepo.save(counter);
        return currentValue;
    }
}
