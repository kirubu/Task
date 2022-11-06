class EmployeeManagement 
{
    public static void main(String[] args) 
    {
        int da = 0;
        String designation = "";
        Employee[] emp = new Employee[7];
        emp[0] = new Employee(1001, "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000);    
        emp[1] = new Employee(1002, "Sushma", "23/08/2012", "c", "PM", 30000, 12000, 9000);    
        emp[2] = new Employee(1003, "Rahul", "12/11/2008", "k", "Acct", 10000, 8000, 1000);    
        emp[3] = new Employee(1004, "Chahat", "29/01/2013", "r", "Front Desk", 12000, 6000, 2000);    
        emp[4] = new Employee(1005, "Ranjan", "16/07/2005", "m", "Engg", 50000, 20000, 20000);    
        emp[5] = new Employee(1006, "Suman", "01/01/2000", "e", "Manufactuing", 23000, 9000, 4400);    
        emp[6] = new Employee(1007, "Tenmay", "12/06/2006", "c", "PM", 29000, 12000, 10000);
        if(args.length>0)
        {
            Employee searchObj=null;
            int id = Integer.parseInt(args[0]);
            for(int i=0;i<7;i++)
            {
                if(id == emp[i].empNo)
                    searchObj = emp[i];
            }
            if(searchObj==null)
            {
                System.out.println("There is no emplyoee with id "+args[0]);
            }
            else
            {
                switch(searchObj.designationCode)
                {
                    case "e":
                        da = 20000;
                        designation = "Engineer";
                        break;
                    case "c":
                        da = 32000;
                        designation = "Consultant";
                        break;
                    case "k":
                        da = 12000;
                        designation = "Clerk";
                        break;
                    case "r":
                        da = 15000;
                        designation = "Receptionist";
                        break;
                    case "m":
                        da = 40000;
                        designation = "Manager";
                        break;
                    default:
                        da = 0;
                        break;
                }
                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(searchObj.empNo+"\t"+searchObj.empName+"\t\t"+searchObj.department+"\t\t"+designation+"\t"+((searchObj.basic+searchObj.hra+da)-searchObj.it));
            }
        }
        else
            System.out.println("Pass the value in command line args");  
    }    
}
