package org.rohan.mapping.crud;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
@Entity
public class Doctor {
    @Id
    @Column(name = "Doctor_ID")
    private int id;
    @Column(name = "Doctor_Name")
    private String name;
    @Column(name = "Doctor_Fees")
    private int fees;
}

