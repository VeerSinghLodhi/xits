package com.example.SamvaadProject.pdfpackage;

public class PdfDTO {

    private String documentName;
    private String uploadedAt;
    private Long pdfId;

    public PdfDTO() {
    }

    public PdfDTO(String documentName, String uploadedAt, Long pdfId) {
        this.documentName = documentName;
        this.uploadedAt = uploadedAt;
        this.pdfId = pdfId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(String uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

    public Long getPdfId() {
        return pdfId;
    }

    public void setPdfId(Long pdfId) {
        this.pdfId = pdfId;
    }
}
