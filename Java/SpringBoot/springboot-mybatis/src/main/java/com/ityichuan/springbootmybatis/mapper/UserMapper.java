package com.ityichuan.springbootmybatis.mapper;

import com.ityichuan.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Yichuan
 * @date 8/28/22 0 7:18 PM
 */
@Mapper
@Repository
public interface UserMapper {

    @Select("SELECT * FROM t_user")
    public List<User> findAll();
}
