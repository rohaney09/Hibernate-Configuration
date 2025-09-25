package org.rohan.mapping.manytomany;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
@Entity
public class student {
    @Id
    @Column(name = "rollNumber")
    private int rollNumber;
    @Column(name = "Student_Name")
    private String stdName;
    @Column(name = "Student_gender")
    private String gender;
    @ManyToMany
    private List<project> projects;

}
