package com.lingnan.bootdemo.mapper;

import com.lingnan.bootdemo.bean.Pager;
import com.lingnan.bootdemo.bean.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

@Mapper
public interface StudentMapper extends MySqlMapper<Student>, tk.mybatis.mapper.common.Mapper<Student> {

     int add(Student student);

     int update(Student student);

     int deleteByIds(String ids);

     Student queryStudentById(Integer id);

     List<Student> listStudent(Pager<Student> studentPager);


}
