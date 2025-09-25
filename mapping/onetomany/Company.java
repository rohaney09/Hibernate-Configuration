package org.rohan.mapping.onetomany;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Company {
    @Id
   private int company_id;
   private String company_name;

   @OneToMany(mappedBy = "company")
   private List<Employee> employees;


}
