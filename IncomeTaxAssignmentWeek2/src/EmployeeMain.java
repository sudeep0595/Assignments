import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EmployeeMain {

	public EmployeeMain() {

	}

	public static void main(String[] args) {
		EmployeeBo bo = new EmployeeBo();
		EmployeeSort ro = new EmployeeSort();

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number of Employees");
		int number = sc.nextInt();

		ArrayList<EmployeeVo> list = new ArrayList<EmployeeVo>();

		try {
			for (int i = 0; i < number; i++) {
				System.out.println("enter The Employee's ID"+(i+1));
				int id = sc.nextInt();
				System.out.println("enter The Empployee's Name"+(i+1));
				String EmpName = sc.next();
				System.out.println("enter The Employee's AnnualIncome"+(i+1));
				double annual = sc.nextDouble();
				list.add(new EmployeeVo(id, EmpName, annual, 0));
				bo.CalincomeTax(list.get(i));
			}
		} catch (Exception e) {
			
			System.out.println("Wrong Data input");
		}
		
		for (EmployeeVo emplyeeVo : list) {
			System.out.println(emplyeeVo);
		}
		Collections.sort(list, ro);
		
		System.out.println("sorted list is");
		for (EmployeeVo emplyeeVo : list) {
			System.out.println(emplyeeVo);
		}
		sc.close();

	}

}
