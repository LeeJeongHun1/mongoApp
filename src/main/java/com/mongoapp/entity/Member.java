package com.mongoapp.entity;

import com.mongoapp.dto.MemberDto;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
//@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Document(collection = "member")
public class Member {

    @Id
    private ObjectId id;
    private String name;
    private String email;
    private Address address;
    private String age;


    @Builder(builderMethodName = "createMember")
    public Member(MemberDto member) {
        this.name = member.getName();
        this.email = member.getEmail();
        this.address = member.getAddress();
        this.age = member.getAge();
    }
}
