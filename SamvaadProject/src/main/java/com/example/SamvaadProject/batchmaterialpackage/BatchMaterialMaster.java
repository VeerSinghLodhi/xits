package com.example.SamvaadProject.batchmaterialpackage;

import com.example.SamvaadProject.batchmasterpackage.BatchMaster;
import com.example.SamvaadProject.coursepackage.CourseMaster;
import com.example.SamvaadProject.pdfpackage.PdfMaster;
import jakarta.persistence.*;

@Entity(name = "batch_material_master")
public class BatchMaterialMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long batchMaterialId;

    @ManyToOne
    @JoinColumn(name = "pdfId")
    private PdfMaster pdfMaster;

    @ManyToOne
    @JoinColumn(name = "batchId")
    private BatchMaster batch;

    public Long getBatchMaterialId() {
        return batchMaterialId;
    }

    public void setBatchMaterialId(Long batchMaterialId) {
        this.batchMaterialId = batchMaterialId;
    }

    public PdfMaster getPdfMaster() {
        return pdfMaster;
    }

    public void setPdfMaster(PdfMaster pdfMaster) {
        this.pdfMaster = pdfMaster;
    }

    public BatchMaster getBatch() {
        return batch;
    }

    public void setBatch(BatchMaster batch) {
        this.batch = batch;
    }
}
