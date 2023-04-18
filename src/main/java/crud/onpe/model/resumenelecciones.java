package crud.onpe.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class resumenelecciones {
	
	@Id
	private String TotalP1;
	private float  PorcentajeP1;
	private String TotalP2;
	private float  PorcentajeP2;
	private String Votaron;
	private String DeParticipacion;
	private String DeAusentismo;
	private String ElectoresHabiles;
	private String TOTALACTAS;
	private String PROCESADAS;
	private String CONTABILIZADAS;
	private int PARAENVIO; 
	private int PORPROCESAR;
	private String PORCENTOTAL;
	private String PORCENPROCESADAS;
	private String PORCENCONTABILIZADAS;
	private String PORCENPARAENVIO;
	private String PORCENPORPROCESAR;
	

	public float getPorcentajeP1() {
		return PorcentajeP1;
	}
	public void setPorcentajeP1(float porcentajeP1) {
		PorcentajeP1 = porcentajeP1;
	}
	public float getPorcentajeP2() {
		return PorcentajeP2;
	}
	public void setPorcentajeP2(float porcentajeP2) {
		PorcentajeP2 = porcentajeP2;
	}
	public String getDeParticipacion() {
		return DeParticipacion;
	}
	public void setDeParticipacion(String deParticipacion) {
		DeParticipacion = deParticipacion;
	}
	public String getDeAusentismo() {
		return DeAusentismo;
	}
	public void setDeAusentismo(String deAusentismo) {
		DeAusentismo = deAusentismo;
	}
	public String getTOTALACTAS() {
		return TOTALACTAS;
	}
	public void setTOTALACTAS(String tOTALACTAS) {
		TOTALACTAS = tOTALACTAS;
	}
	public String getPROCESADAS() {
		return PROCESADAS;
	}
	public void setPROCESADAS(String pROCESADAS) {
		PROCESADAS = pROCESADAS;
	}
	public String getCONTABILIZADAS() {
		return CONTABILIZADAS;
	}
	public void setCONTABILIZADAS(String cONTABILIZADAS) {
		CONTABILIZADAS = cONTABILIZADAS;
	}
	public int getPORPROCESAR() {
		return PORPROCESAR;
	}
	public void setPORPROCESAR(int pORPROCESAR) {
		PORPROCESAR = pORPROCESAR;
	}

	public String getTotalP1() {
		return TotalP1;
	}
	public void setTotalP1(String totalP1) {
		TotalP1 = totalP1;
	}
	public String getTotalP2() {
		return TotalP2;
	}
	public void setTotalP2(String totalP2) {
		TotalP2 = totalP2;
	}
	public String getVotaron() {
		return Votaron;
	}
	public void setVotaron(String votaron) {
		Votaron = votaron;
	}
	public String getElectoresHabiles() {
		return ElectoresHabiles;
	}
	public void setElectoresHabiles(String electoresHabiles) {
		ElectoresHabiles = electoresHabiles;
	}
	public String getPORCENTOTAL() {
		return PORCENTOTAL;
	}
	public void setPORCENTOTAL(String pORCENTOTAL) {
		PORCENTOTAL = pORCENTOTAL;
	}
	public String getPORCENPROCESADAS() {
		return PORCENPROCESADAS;
	}
	public void setPORCENPROCESADAS(String pORCENPROCESADAS) {
		PORCENPROCESADAS = pORCENPROCESADAS;
	}
	public String getPORCENCONTABILIZADAS() {
		return PORCENCONTABILIZADAS;
	}
	public void setPORCENCONTABILIZADAS(String pORCENCONTABILIZADAS) {
		PORCENCONTABILIZADAS = pORCENCONTABILIZADAS;
	}

	public int getPARAENVIO() {
		return PARAENVIO;
	}
	public void setPARAENVIO(int pARAENVIO) {
		PARAENVIO = pARAENVIO;
	}
	public String getPORCENPARAENVIO() {
		return PORCENPARAENVIO;
	}
	public void setPORCENPARAENVIO(String pORCENPARAENVIO) {
		PORCENPARAENVIO = pORCENPARAENVIO;
	}
	public String getPORCENPORPROCESAR() {
		return PORCENPORPROCESAR;
	}
	public void setPORCENPORPROCESAR(String pORCENPORPROCESAR) {
		PORCENPORPROCESAR = pORCENPORPROCESAR;
	}

	

	
}
