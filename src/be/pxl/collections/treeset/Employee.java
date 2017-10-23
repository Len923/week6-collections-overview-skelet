package be.pxl.collections.treeset;

public class Employee implements Comparable<Employee>{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " " + salary;
    }

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(salary>o.getSalary()){
			return 1;
		} else if(salary<o.getSalary()){
			return -1;
		}
		return 0;
	}
}
