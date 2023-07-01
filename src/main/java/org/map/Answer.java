package org.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Answer {
    @Id
    @Column(name = "answer_id")

    private int answerId;
    private  String answer;
    @OneToOne(mappedBy = "answer")
    private  Questions question;

    public Questions getQuestion() {
        return question;
    }

    public void setQuestion(Questions question) {
        this.question = question;
    }

    public Answer() {
    }

    public Answer(int answerId, String answer,Questions question) {
        this.answerId = answerId;
        this.answer = answer;
        this.question=question;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
