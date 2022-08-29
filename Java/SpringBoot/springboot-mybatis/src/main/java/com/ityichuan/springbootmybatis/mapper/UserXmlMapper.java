package com.ityichuan.springbootmybatis.mapper;

import com.ityichuan.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Yichuan
 * @date 8/28/22 0 7:38 PM
 */
@Mapper
@Repository
public interface UserXmlMapper {
    public List<User> findAll();
}
