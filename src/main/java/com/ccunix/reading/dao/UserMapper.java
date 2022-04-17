package com.ccunix.reading.dao;

import com.ccunix.reading.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
@Repository
public interface UserMapper {
    List<User> getAll();
}
