package com.nanfeng.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {

    // 数组类型
    private String[] courses;

    private List<String> list;

    private Map<String,String> map;

    private Set<String> set;

    private List<Course> courseList;

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void test() {
        System.out.println(this.courses);
        System.out.println(this.list);
        System.out.println(this.map);
        System.out.println(this.set);
        System.out.println(this.courseList);
    }
}
