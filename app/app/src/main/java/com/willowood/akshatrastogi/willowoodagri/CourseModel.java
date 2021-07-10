package com.willowood.akshatrastogi.willowoodagri;

public class CourseModel {

    private String course_name;
    private String course_points;

    // Constructor
    public CourseModel(String course_name, String course_rating) {
        this.course_name = course_name;
        this.course_points = course_rating;
    }

    // Getter and Setter
    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_points() {
        return course_points;
    }

    public void setCourse_points(String course_rating) {
        this.course_points = course_rating;
    }

}
