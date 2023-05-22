package com.Binde.rewardyourteacher.dto;

import com.Binde.rewardyourteacher.enums.SchoolType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SchoolResponse {
    private int id;
    private String name;
    private SchoolType schoolType;
    private String address;
    private String city;
    private String state;

}
