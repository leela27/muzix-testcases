package com.stackroute.muzix.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import java.util.Collection;

@Document(collection = "Tracks")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Track {
    @Id
    private  int trackId;
    private String trackName;
    private  String trackComments;

}
