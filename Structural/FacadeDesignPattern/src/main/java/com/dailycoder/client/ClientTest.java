package com.dailycoder.client;

import com.dailycoder.facade.ExcelReport;
import com.dailycoder.facade.HtmlReport;
import com.dailycoder.facade.PdfReport;
import com.dailycoder.facade.impl.ExcelReportImpl;
import com.dailycoder.facade.impl.HtmlReportImpl;
import com.dailycoder.facade.impl.PdfReportImpl;
import com.dailycoder.facade.impl.ReportFacade;

public class ClientTest {

	public static void main(String[] args) {
	
		String reportName ="Employee Summary";

		//without using Facade pattern
		System.out.println("-----------------------without using Facade pattern-----------------------------");
		PdfReport pdfReport = new PdfReportImpl();
		pdfReport.generateReport(reportName);
		
		HtmlReport htmlReport = new HtmlReportImpl();
		htmlReport.generateReport(reportName);
		
		ExcelReport excelReport = new ExcelReportImpl();
		excelReport.generateReport(reportName);
		
		System.out.println("-----------------------With Using Facade Report-----------------------------");
		
		//With Using Facade Report
		
		ReportFacade reportFacade = new ReportFacade();
		reportFacade.generateExcelReport(reportName);
		reportFacade.generateHtmlReport(reportName);
		reportFacade.generatePdfReport(reportName);
		
	}

}
