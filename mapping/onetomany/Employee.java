package org.rohan.mapping.onetomany;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Employee {
    @Id
    private int Emp_id;
    private String Emp_name;
    private String Domain;
    @ManyToOne
    private Company company;

}
