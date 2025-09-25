package org.example;

import lombok.*;

import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Embeddable
public class Certificate {
    private String course;
    private String duration;
}
