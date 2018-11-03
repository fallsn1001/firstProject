package cn.jiyun.druid05.mapper;

import cn.jiyun.druid05.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from employee")
    List<Employee> findAll();
}
