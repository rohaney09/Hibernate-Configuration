package org.rohan.mapping.onetoone;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Entity
public class Question {
    @Id
    private int question_id;
    private String question;
    @OneToOne
    private Answer answer;
}
