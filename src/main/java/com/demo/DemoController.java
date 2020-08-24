package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.entity.FinalCertBean;
import com.demo.repository.FinalCertRepository;

@RestController
@RequestMapping("/demoApp")
public class DemoController {

	@PersistenceContext
	private EntityManager entityManager;
	@Autowired 
	private FinalCertRepository finalCertRepository;
		 

	@GetMapping("/getDataFromSP")
	public void GetColor(HttpServletResponse response) throws IOException {
		response.setContentType("text/csv");
		StoredProcedureQuery query = entityManager.createStoredProcedureQuery("TREFR_ACCEPT_CRIT");
		query.execute();
		List<FinalCertBean> finalCertList= new ArrayList<FinalCertBean>();
		finalCertList = finalCertRepository.findAll(); 
		WriteCSVService.writeToCSV(response.getWriter(), finalCertList);
		//writeCities  (response.getWriter(), cities);
        for (FinalCertBean finalCertBean : finalCertList) {
    		System.out.println(""+finalCertBean.getACCEPTCRIT());				
    		System.out.println(""+finalCertBean.getADDMOD());					
    		System.out.println(""+finalCertBean.getCHANGETIMESTAMP());					
    		System.out.println(""+finalCertBean.getNVIC());					    		
    		
		}		
	}

}
