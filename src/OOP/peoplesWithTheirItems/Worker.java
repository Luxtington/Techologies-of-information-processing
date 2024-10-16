package OOP.peoplesWithTheirItems;

import java.util.ArrayList;
import java.util.List;

public class Worker
{
    private String surname;
    private Department department;

    public Worker(String surname)
    {
        this.surname = surname;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setDepartment(Department department)
    {
        if (this.department == department) return;
        if (this.department != null)
        {
            if (this == this.department.getChief())
            {
                this.department.setChief(null); // chief goes in another department
            }
            this.department.removeWorker(this);
        }
        if (department != null)
        {
            department.addWorker(this);
        }
        this.department = department;
    }

    public Department getDepartment()
    {
        return department;
    }

    public String showAllWorkers()
    {
        String res = "";
        for (int i = 0; i<department.getCurrCountWorkers(); i++)
        {
            List<Worker> workers = department.getListWorkers();
            res+=workers.get(i).getSurname();
            res+=" ";
        }
        return res;
    }

    public String toString()
    {
        if (department == null)
            return surname + " doesn't work in someone department";
        if (department.getChief() == this)
            return surname + " is the chief of " + department.getTitle() + " department";
        return surname + " works in " + department;
    }
}
