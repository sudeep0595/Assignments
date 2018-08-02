
public class EmployeeVo {
	// instance variable empid, empname, annualincome, incometax.
	private int empid;
	private String empname;
	private double annualincome;
	private double incometa;

	public EmployeeVo() {
	}

	public EmployeeVo(int empid, String empname, double annualincome, double incometa) {
		this.empid = empid;
		this.empname = empname;
		this.annualincome = annualincome;
		this.incometa = incometa;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public double getAnnualincome() {
		return annualincome;
	}

	public void setAnnualincome(double annualincome) {
		this.annualincome = annualincome;
	}

	public double getIncometa() {
		return incometa;
	}

	public void setIncometa(double incometa) {
		this.incometa = incometa;
	}

	@Override
	public String toString() {
		return "EmplyeeVo [empid=" + empid + ", empname=" + empname + ", annualincome=" + annualincome + ", incometa="
				+ incometa + "]";
	}

	@Override
	public int hashCode() {
		final int flag = 31;
		int res = 1;
		long temp;
		temp = Double.doubleToLongBits(annualincome);
		res = flag * res + (int) (temp ^ (temp >>> 32));
		res = flag * res + empid;
		res = flag * res + ((empname == null) ? 0 : empname.hashCode());
		temp = Double.doubleToLongBits(incometa);
		res = flag * res + (int) (temp ^ (temp >>> 32));
		return res;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeVo other = (EmployeeVo) obj;
		if (Double.doubleToLongBits(annualincome) != Double.doubleToLongBits(other.annualincome))
			return false;
		if (empid != other.empid)
			return false;
		if (empname == null) {
			if (other.empname != null)
				return false;
		} else if (!empname.equals(other.empname))
			return false;
		if (Double.doubleToLongBits(incometa) != Double.doubleToLongBits(other.incometa))
			return false;
		return true;
	}
}