import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReDataService {
    String fileName = "emp.txt";
    public ArrayList<Employee> readFile() {
        ArrayList<Employee> empList = null;
        try {
            empList = tryReadFile();
        } catch (FileNotFoundException e) {
            System.err.println("Hiba! A fájl nem található!");
            System.err.println(e.getMessage());
        }
        return empList;
    }
    private ArrayList<Employee> tryReadFile() 
            throws FileNotFoundException {
        ArrayList<Employee> empList = new ArrayList<>();
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while(sc.hasNext()) {
            String line = sc.nextLine();
            String[] lineArray = line.split(":");
            Employee emp = new Employee(
                Integer.parseInt(lineArray[0]),
                lineArray[1],
                lineArray[2],
                Double.parseDouble(lineArray[3])
            );
            empList.add(emp);
        }
        sc.close();
        return empList;
    }    
}
