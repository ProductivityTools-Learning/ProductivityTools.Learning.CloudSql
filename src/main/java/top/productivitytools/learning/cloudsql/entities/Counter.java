package top.productivitytools.learning.cloudsql.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Counter")
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "counter_value")
    private Integer counterValue;

    public Counter(Integer counterValue, String shortName) {
        this.counterValue = counterValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCounterValue() {
        return counterValue;
    }

    public void setCounterValue(Integer counterValue) {
        this.counterValue = counterValue;
    }
}
