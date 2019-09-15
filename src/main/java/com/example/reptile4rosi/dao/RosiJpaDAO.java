package com.example.reptile4rosi.dao;

import com.example.reptile4rosi.entity.RosiDO;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * JPA 接口
 *
 * @since 2019-09-13
 */
public interface RosiJpaDAO extends JpaRepository<RosiDO, Long> {

    RosiDO findByDataIdEquals(Integer dataId);

    List<RosiDO> findAllByDataIdBetweenOrderByDataIdDesc(Integer start, Integer end);

    List<RosiDO> findAllByAlbumTypeEquals(Integer albumType);
}
