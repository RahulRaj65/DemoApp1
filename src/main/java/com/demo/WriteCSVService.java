package com.demo;

import java.io.PrintWriter;
import java.util.List;

import javax.persistence.Id;

import com.demo.entity.FinalCertBean;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvException;

public class WriteCSVService {
	
	public static void writeToCSV(PrintWriter writer,List<FinalCertBean> list) {
		try {

            ColumnPositionMappingStrategy<FinalCertBean> mapStrategy
                    = new ColumnPositionMappingStrategy<>();

            mapStrategy.setType(FinalCertBean.class);
            String[] columns = new String[]{"NVIC", "ADDMOD", "VEHCAT","EFFECTIVEDATE","CHANGETIMESTAMP","EFFECTIVEENDDATE","ENDDATETIMESTAMP","COMPANY","ACCEPTCRIT","INTERNETJEP"};
            mapStrategy.setColumnMapping(columns);

            StatefulBeanToCsv<FinalCertBean> btcsv = new StatefulBeanToCsvBuilder<FinalCertBean>(writer)
                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
                    .withMappingStrategy(mapStrategy)
                    .withSeparator(',')
                    .build();

            btcsv.write(list);

        } catch (CsvException ex) {

        	System.out.println("Error mapping Bean to CSV"+ex);
        }
	}

}
