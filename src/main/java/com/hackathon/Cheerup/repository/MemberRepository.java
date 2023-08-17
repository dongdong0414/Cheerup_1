package com.hackathon.Cheerup.repository;

import com.hackathon.Cheerup.entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {
}
