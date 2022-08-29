public class CandidateB extends Candidate{
    public static final String MON_TOAN = "Toan";
    public static final String MON_HOA = "Hoa";
    public static final String MON_SINH = "Sinh";

    public CandidateB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "Khoi B{" +
                "Ma thi sinh: '" + id + '\'' +
                ", Ten: " + name + '\'' +
                ", Dia chi: '" + address + '\'' +
                ", Diem uu tien: " + priority + ", Mon hoc: " + MON_TOAN + " - " + MON_SINH + " - " + MON_HOA +
                '}';
    }
}
