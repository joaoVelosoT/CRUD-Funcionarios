package models;

public class Pessoa {

	private String nome;
	private double salarioBruto;
	private int numeroDependentes;
	private boolean vr;
	private boolean va;
	private boolean vt;
	private String planoDeSaude;
	
	
	public Pessoa(String nome, double salarioBruto, int numeroDependentes, boolean vr, boolean va, boolean vt,
			String planoDeSaude) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.numeroDependentes = numeroDependentes;
		this.vr = vr;
		this.va = va;
		this.vt = vt;
		this.planoDeSaude = planoDeSaude;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getSalarioBruto() {
		return salarioBruto;
	}


	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}


	public int getNumeroDependentes() {
		return numeroDependentes;
	}


	public void setNumeroDependentes(int numeroDependentes) {
		this.numeroDependentes = numeroDependentes;
	}


	public boolean isVr() {
		return vr;
	}


	public void setVr(boolean vr) {
		this.vr = vr;
	}


	public boolean isVa() {
		return va;
	}


	public void setVa(boolean va) {
		this.va = va;
	}


	public boolean isVt() {
		return vt;
	}


	public void setVt(boolean vt) {
		this.vt = vt;
	}


	public String getPlanoDeSaude() {
		return planoDeSaude;
	}


	public void setPlanoDeSaude(String planoDeSaude) {
		this.planoDeSaude = planoDeSaude;
	}
	
	
	
}
