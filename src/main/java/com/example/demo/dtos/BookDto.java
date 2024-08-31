package com.example.demo.dtos;



public class BookDto {
    private Long id;
    private String fname;
    private String lname;
    private String teloremail;

    public BookDto(Long id, String fname, String lname, String teloremail) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.teloremail = teloremail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getTeloremail() {
        return teloremail;
    }

    public void setTeloremail(String teloremail) {
        this.teloremail = teloremail;
    }
}
