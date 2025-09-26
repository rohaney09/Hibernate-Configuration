package org.rohan.mapping.hibernate_querry_language;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@NoArgsConstructor                  // Generates default constructor
@AllArgsConstructor                 // Generates constructor with all fields
@Getter                             // Generates getters for all fields
@Setter                             // Generates setters for all fields
@ToString                           // Generates toString() method
@Builder
@Entity
@Table(name = "Student_Record")
public class studentRecord {
    @Id
    @Column(name = "Roll")
    private int roll;
    private String name;
    private int marks;
}
