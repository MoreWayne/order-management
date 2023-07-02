package com.example.ordermanagement.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DataDTO {

    private LocalDate date;

    private String name;

    private String number;

    private String price;

    private String comment;
}
