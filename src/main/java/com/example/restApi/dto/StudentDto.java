package com.example.restApi.dto;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
 public  class StudentDto {
    private    Integer  id  ;
    private   String  name ;
    private   String  email ;
    private   Integer  age ;
}
