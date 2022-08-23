package hello.sampleSpring.repository;

import hello.sampleSpring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {

    Member save(Member member);
    Optional<Member> findById(Long Id);
    Optional<Member> findByName(String name);
    List<Member> findAll();

}
