import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        /*
        OkDataService ds = new OkDataService();        
        ArrayList<Employee> empList = ds.readFile();
        if (empList.size() > 0) {
            printEmployees(empList);
        }
        */
        ReDataService ds = new ReDataService();
        ArrayList<Employee> empList = ds.readFile();
        if (empList != null) {
            printEmployees(empList);
        }        
    }
    private static void printEmployees(ArrayList<Employee> empList) {
        for(Employee emp : empList) {
            System.out.println(emp.name);
        }
    }
}
