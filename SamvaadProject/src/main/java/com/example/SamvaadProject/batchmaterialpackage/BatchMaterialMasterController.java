package com.example.SamvaadProject.batchmaterialpackage;

import com.example.SamvaadProject.batchmasterpackage.BatchMasterRepository;
import com.example.SamvaadProject.pdfpackage.PdfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class BatchMaterialMasterController {

    @Autowired
    PdfRepository pdfRepository;

    @Autowired
    BatchMasterRepository batchMasterRepository;

    @Autowired
    BatchMaterialRepository batchMaterialRepository;

    @PostMapping("/faculty/batchmaretial")
    @ResponseBody
    public ResponseEntity<Map<String,Boolean>> getSaveBatchMaterial(@RequestParam("batchIdForMaterial")Long batchId,@RequestParam("pdfIdForMaterial")Long pdfId){
        System.out.println("Batch Id "+batchId);
        System.out.println("PDF Id "+pdfId);
        Map<String,Boolean>response=new HashMap<>();
        BatchMaterialMaster batchMaterialMaster=new BatchMaterialMaster();
        batchMaterialMaster.setPdfMaster(pdfRepository.findById(pdfId).orElse(null));
        batchMaterialMaster.setBatch(batchMasterRepository.findById(batchId).orElse(null));
        batchMaterialRepository.save(batchMaterialMaster);
        response.put("message",true);
        return ResponseEntity.ok(response);
    }
}
