package com.example.myDemo110.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyDto { //DTo - то что передается на фронт

    @JsonProperty("idJson")
    private int id;


    @JsonProperty("name")
    private String driverName;


}
