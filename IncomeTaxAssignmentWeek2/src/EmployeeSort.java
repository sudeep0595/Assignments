import java.util.Comparator;

public class EmployeeSort implements Comparator<EmployeeVo> {

	public EmployeeSort() {

	}

	@Override
	public int compare(EmployeeVo e1, EmployeeVo e2) {

		return (int) (e1.getIncometa() - e2.getIncometa());
	}

	
}
