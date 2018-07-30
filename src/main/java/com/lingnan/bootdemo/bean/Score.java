package com.lingnan.bootdemo.bean;

public class Score {

    private Student student;

    private Course course;

    private float score;

    public Score(Student student, Course course, float score) {
        this.student = student;
        this.course = course;
        this.score = score;
    }

    public Score() {
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" +
                "student=" + student +
                ", course=" + course +
                ", score=" + score +
                '}';
    }
}
