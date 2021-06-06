package com.dailycoder.facade.impl;

import com.dailycoder.facade.ExcelReport;
import com.dailycoder.facade.HtmlReport;
import com.dailycoder.facade.PdfReport;

public class ReportFacade {

	private PdfReport pdfReport;
	private HtmlReport htmlReport;
	private ExcelReport excelReport;
	
	public ReportFacade() {
		pdfReport = new PdfReportImpl();
		htmlReport = new HtmlReportImpl();
		excelReport = new ExcelReportImpl();
	}
	
	public void generatePdfReport(String reportName) {
		pdfReport.generateReport(reportName);
	}
	
	public void generateHtmlReport(String reportName) {
		
		htmlReport.generateReport(reportName);
	}
	
	public void generateExcelReport(String reportName) {
		excelReport.generateReport(reportName);
	}
	
}
