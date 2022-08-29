public class CandidateA extends Candidate{
    public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";
    public CandidateA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "Khoi A{" +
                "Ma thi sinh: '" + id + '\'' +
                ", Ten: '" + name + '\'' +
                ", Dia chi: '" + address + '\'' +
                ", Diem uu tien: " + priority + ", Mon hoc: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA +
                '}';
    }
}
