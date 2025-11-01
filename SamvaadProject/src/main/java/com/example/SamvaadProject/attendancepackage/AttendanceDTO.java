package com.example.SamvaadProject.attendancepackage;

public class AttendanceDTO {

    private String admission_id;
    private String name;
    private String status;
    private Long attendanceId;
    private String attendanceDate;

    public AttendanceDTO() {
    }

    public AttendanceDTO(String admission_id, String name, String status, Long attendanceId) {
        this.admission_id = admission_id;
        this.name = name;
        this.status = status;
        this.attendanceId = attendanceId;
    }

    public AttendanceDTO(String admission_id, String status, String attendanceDate) {
        this.admission_id = admission_id;
        this.status = status;
        this.attendanceDate = attendanceDate;
    }

    public String getAttendanceDate() {
        return attendanceDate;
    }

    public void setAttendanceDate(String attendanceDate) {
        this.attendanceDate = attendanceDate;
    }

    public Long getAttendanceId() {
        return attendanceId;
    }

    public void setAttendanceId(Long attendanceId) {
        this.attendanceId = attendanceId;
    }

    public String getAdmission_id() {
        return admission_id;
    }

    public void setAdmission_id(String admission_id) {
        this.admission_id = admission_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
