package com.mongoapp.repository;

import com.mongoapp.entity.Member;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MemberMongoRepository extends MongoRepository<Member, String> {
    public Member findMemberByName(String name);
}
