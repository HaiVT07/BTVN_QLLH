public class Lop {
  public   int id;
  public   String nameClass;

    public Lop() {
    }

    public Lop(int id, String nameClass) {
        this.id = id;
        this.nameClass = nameClass;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    @Override
    public String toString() {
        return "Lop{" +
                "id=" + id +
                ", nameClass='" + nameClass + '\'' +
                '}';
    }
}
