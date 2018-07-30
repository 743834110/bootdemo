package com.lingnan.bootdemo.mapper;

import com.lingnan.bootdemo.BootDemoApplication;
import com.lingnan.bootdemo.bean.Pager;
import com.lingnan.bootdemo.bean.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootDemoApplication.class)
public class StudentMapperTest {

    @Autowired
    private StudentMapper studentDao;

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Test
    public void testAdd(){
        Student student = new Student("ff", 25, "54545");
        this.studentDao.add(student);

    }

    @Test
    public void testUpdate(){
        Student student = new Student(5, "ff", 25, "54fdfdf545");
        this.studentDao.update(student);
        student = this.studentDao.queryStudentById(5);
        this.logger.info(student.toString());
    }

    @Test
    public void testListStudent(){
        Student student = new Student("ff", null, null);
        Pager<Student> pager = new Pager<>(student, 2, 2);
        List<Student> studentList = this.studentDao.listStudent(pager);
        this.logger.info(studentList.toString());
    }

    @Test
    public void generalMapperMethod(){
        this.studentDao.selectByExample(new Student("ff", null, null));
    }
}
