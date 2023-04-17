package HashMapImplementation;

import java.util.Objects;

public class Employee {
    String name;
    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public boolean equals(Object obj){
        if(obj== null || getClass() != obj.getClass())
            return false;
        if(obj==this)
            return true;
        Employee employee = (Employee) obj;
        return (this.getId()==employee.getId() && this.getName()== employee.getName());
    }


}
