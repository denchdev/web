import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;


@ManagedBean(name = "problem")
@SessionScoped
public class Tasks {
    private LinkedList<Task> list = new LinkedList<Task>();
    private String name;
    private String taskName;
    private boolean editable;

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Tasks() {
    }
    public Tasks(String name) {
        this.name=name;
    }

    public LinkedList<Task> getList() {
        return list;
    }

    public void setList(LinkedList<Task> list) {
        this.list = list;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public boolean isEditable() {
        return editable;
    }
    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    public String editDo()
    {
        editable = true;
        return null;
    }
    public String editSave(String name)
    {
        this.name = name;
        editable = false;
        return null;
    }


    public String add()
    {
        list.add(0, new Task(taskName));
        return null;
    }

    public String deleteTask(Task task)
    {
        list.remove(task);
        return null;
    }
    public String upTask(Task task)
    {
        int i = list.indexOf(task) - 1;
        if(i > -1)
        {
        list.remove(task);
        list.add(i, task);
        }
        return null;
    }
}
