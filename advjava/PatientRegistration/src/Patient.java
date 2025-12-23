public class Patient {
    private int Sno;
    private String Name;
    private String Disease;

    public Patient() {
        super();
    }

    public Patient(int Sno, String Name, String Disease) {
        super();
        this.Sno = Sno;
        this.Name = Name;
        this.Disease = Disease;
    }

    public int getSno() {
        return Sno;
    }

    public void setSno(int sno) {
        this.Sno = sno;  
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;  
    }

    public String getDisease() {
        return Disease;
    }

    public void setDisease(String disease) {
        this.Disease = disease;  
        }

	@Override
	public String toString() {
		return "Patient [Sno=" + Sno + ", Name=" + Name + ", Disease=" + Disease + "]";
	}
    
}
