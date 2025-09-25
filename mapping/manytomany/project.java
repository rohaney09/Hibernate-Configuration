package org.rohan.mapping.manytomany;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
@EqualsAndHashCode
@Entity
public class project {
    @Id
    @Column(name = "ID")
    private int id;
    @Column(name = "Project_Name")
    private String projectName;
    @Column(name = "Duration")
    private int duration;
    @ManyToMany(mappedBy = "projects")
    private List<student> students;
}
