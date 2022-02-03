package org.zerock.ex2.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.ex2.entity.Memo;

import java.util.List;

public interface MemoRepository extends JpaRepository<Memo,Long> {

    List<Memo> findByMnoBetweenOrderByMnoDesc(Long from, Long to);

    //Pageable 사용하여 간결하게
    Page<Memo> findByMnoBetween(Long from, Long to, Pageable pageable);

    //삭제처리
    void deleteMemoByMnoLessThan(Long num);
}
