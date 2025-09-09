package assignment;

public class EmployySalary {
	double salary;
	int hrperday;
	public EmployySalary(double salary, int hrperday) {
		super();
		this.salary = salary;
		this.hrperday = hrperday;
	}
	
	void addSal() {
		if (salary < 500) {
            salary += 10;
        }
	}
	 void addWork() {
	        if (hrperday > 6) {
	            salary += 5;
	        }
	    }

	    double getFinalSalary() {
	        return this.salary;
	    }
	
}
