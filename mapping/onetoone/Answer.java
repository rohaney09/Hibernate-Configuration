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
public class Answer {
    @Id
    private int answer_id;
    private String answer;

    @OneToOne(mappedBy = "answer")
    private String question;
}
