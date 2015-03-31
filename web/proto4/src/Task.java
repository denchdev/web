import javax.faces.event.ValueChangeEvent;

public class Task {
    private boolean done;
    private String name;
    private boolean editable;

    public Task() {
    }
    public Task(String name) {
        this.name = name;
    }

    public boolean isDone() {
        return done;
    }
    public void setDone(boolean done) {
        this.done = done;
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

    public String doning()
    {
        name = "Выполнено";
        return null;
    }

    public void boxListener(ValueChangeEvent event)
    {
        System.out.println(event.getNewValue().toString());
        if(event.getNewValue().toString().equals("true")) done = true;
        if(event.getNewValue().toString().equals("false")) done = false;
    }


}
