package com.example.reptile4rosi.dao;

import com.example.reptile4rosi.entity.RosiImgDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * JPA 接口
 *
 * @since 2019-09-13
 */
public interface RosiImgJpaDAO extends JpaRepository<RosiImgDO, Long> {

    RosiImgDO findByImgUrlEquals(String imgUrl);

    List<RosiImgDO> findAllByDataIdEquals(Integer dataId);
}
