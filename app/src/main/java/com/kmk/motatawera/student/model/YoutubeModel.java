package com.kmk.motatawera.student.model;

public class YoutubeModel {

    private String subject_id;
    private String subject_name;
    private String video_id;
    private String video_name;
    private int video_branch;
    private int video_department;
    private int video_grad;

    public YoutubeModel() {
    }

    public YoutubeModel(String subject_id, String subject_name, String video_id, String video_name, int video_branch, int video_department, int video_grad) {
        this.subject_id = subject_id;
        this.subject_name = subject_name;
        this.video_id = video_id;
        this.video_name = video_name;
        this.video_branch = video_branch;
        this.video_department = video_department;
        this.video_grad = video_grad;
    }

    public String getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(String subject_id) {
        this.subject_id = subject_id;
    }

    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getVideo_id() {
        return video_id;
    }

    public void setVideo_id(String video_id) {
        this.video_id = video_id;
    }

    public String getVideo_name() {
        return video_name;
    }

    public void setVideo_name(String video_name) {
        this.video_name = video_name;
    }

    public int getVideo_branch() {
        return video_branch;
    }

    public void setVideo_branch(int video_branch) {
        this.video_branch = video_branch;
    }

    public int getVideo_department() {
        return video_department;
    }

    public void setVideo_department(int video_department) {
        this.video_department = video_department;
    }

    public int getVideo_grad() {
        return video_grad;
    }

    public void setVideo_grad(int video_grad) {
        this.video_grad = video_grad;
    }
}
