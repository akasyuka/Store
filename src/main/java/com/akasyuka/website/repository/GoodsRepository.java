package com.akasyuka.website.repository;

import com.akasyuka.website.entity.Goods;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GoodsRepository extends CrudRepository<Goods, Long> {
    @Override
    default Optional<Goods> findById(Long aLong) {
        return Optional.empty();
    }
}