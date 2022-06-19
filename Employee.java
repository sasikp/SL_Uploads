package program.jav.inner.classes;

public class Employee{
	
	private int salary=10000;
	
	class PermEmployee {
		int PE01 = salary;
		double hike = 0.45;
		double PE02 = PE01 + PE01*hike;
		
		void display() {
			System.out.println("Salary of Permanent Employee: " + PE01);
			System.out.println("Hike: " + hike);
			System.out.println("Salary after hike: " + PE02);
			
		}
	}
	
	class TempEmployee {
		int TE01 = salary;
		double hike = 0.30;
		double TE02 = TE01 + TE01*hike;
		
		void display() {
			System.out.println("Salary of Temporary Employee: " + TE01);
			System.out.println("Hike: " + hike);
			System.out.println("Salary after hike: " + TE02);
			
		}
	}

	void ContractMethod() {
		class ContEmployee {
			int CE01 = salary;
			double hike = 0.30;
			double CE02 = CE01 + CE01*hike;
			
			void display() {
				System.out.println("Salary of Contract Employee: " + CE01);
				System.out.println("Hike: " + hike);
				System.out.println("Salary after hike: " + CE02);
				
			}
				
		}
		
		ContEmployee cont = new ContEmployee(); 
        cont.display();
		
	}

	public static void main(String[] args) {
		Employee emp = new Employee();
		Employee.PermEmployee pEmp = emp.new PermEmployee();
		pEmp.display();
		Employee.TempEmployee tEmp = emp.new TempEmployee();
		tEmp.display();
		emp.ContractMethod();
		
	}

}