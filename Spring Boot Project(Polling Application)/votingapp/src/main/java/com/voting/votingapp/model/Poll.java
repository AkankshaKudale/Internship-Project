package com.voting.votingapp.model;

import jakarta.annotation.sql.DataSourceDefinitions;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
public class Poll {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String question;

    @ElementCollection
    private List<OptionVote> options = new ArrayList<>();

 //   @ElementCollection
  //  private List<Integer> votes = new ArrayList<>();

    // Getters
    public Long getId() { return id; }
    public String getQuestion() { return question; }
    public List<OptionVote> getOptions() { return options; }
    //public List<Integer> getVotes() { return votes; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setQuestion(String question) { this.question = question; }
    public void setOptions(List<OptionVote> options) { this.options = options; }
    //public void setVotes(List<Integer> votes) { this.votes = votes; }
}
