package com.mongoapp.dto;

import com.mongoapp.entity.Address;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberDto {
    private String name;
    private String email;
    private Address address;
    private String age;

}
