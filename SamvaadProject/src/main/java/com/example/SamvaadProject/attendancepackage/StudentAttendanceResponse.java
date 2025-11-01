package com.example.SamvaadProject.attendancepackage;

import com.example.SamvaadProject.admissionpackage.AdmissionMaster;

import java.util.List;

public class StudentAttendanceResponse {

    private List<AdmissionMaster> students;
    private List<AttendanceMaster> attendance;

    public StudentAttendanceResponse() {
    }

    public StudentAttendanceResponse(List<AdmissionMaster> students, List<AttendanceMaster> attendance) {
        this.students = students;
        this.attendance = attendance;
    }

    public List<AdmissionMaster> getStudents() {
        return students;
    }

    public void setStudents(List<AdmissionMaster> students) {
        this.students = students;
    }

    public List<AttendanceMaster> getAttendance() {
        return attendance;
    }

    public void setAttendance(List<AttendanceMaster> attendance) {
        this.attendance = attendance;
    }
}
