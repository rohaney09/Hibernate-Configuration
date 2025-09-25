package org.example;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity(name = "student") // Specifies the table name for this entity
public class student {

    @Id // Marks this field as the primary key
    private int id;

    @Column(name = "student_name") // Maps this field to a specific column name
    private String name;

    @Column(name = "student_city") // Maps this field to a specific column name
    private String city;

    private Certificate certi;


}
