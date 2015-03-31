import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.LinkedList;

@ManagedBean
@SessionScoped
public class ManagerTasks implements Serializable{
    private LinkedList<Tasks> list = new LinkedList<Tasks>();
    int count = 1;

    public ManagerTasks() {
    }

    public LinkedList<Tasks> getList() {return list;}

    public void setList(LinkedList<Tasks> list) {this.list = list;}

    public void add()
    {
        list.add(new Tasks("Todo list #" + count++));
    }
    public String deleteTasks(Tasks tasks)
    {
        list.remove(tasks);
        return null;
    }

}
