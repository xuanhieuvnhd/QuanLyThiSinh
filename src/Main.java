import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerCandidate managerCandidate = new ManagerCandidate();
        while (true) {
            System.out.println("-------------Quan Ly Thi Sinh-------------");
            System.out.println("1. Them thi sinh");
            System.out.println("2. Hien thi thong tin thi sinh");
            System.out.println("3. Tim thi sinh theo ma thi sinh");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("------------------------------------------------");
            System.out.print("--- > Hay chon chuc nang: ");
            String line = scanner.nextLine();
            switch (line) {
                case "1" -> {
                    System.out.println("---------------------------------");
                    System.out.println("a. Them thi sinh khoi A");
                    System.out.println("b. Them thi sinh khoi B");
                    System.out.println("c. Them thi sinh khoi C");
                    System.out.println("----------------------------------");
                    System.out.print("Chon a, b hoac c de them thi sinh: ");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a" -> managerCandidate.add(createCadidate(scanner, "a"));
                        case "b" -> managerCandidate.add(createCadidate(scanner, "b"));
                        case "c" -> managerCandidate.add(createCadidate(scanner, "c"));
                        default -> System.err.println("Khong hop le");
                    }
                }
                case "2" -> managerCandidate.showInfor();
                case "3" -> {
                    System.out.print("Nhap ma so thi sinh muon tim: ");
                    String id = scanner.nextLine();
                    Candidate candidate = managerCandidate.searchById(id);
                    if (candidate == null) {
                        System.err.println("Khong tim thay");
                    } else {
                        System.out.println(candidate.toString());
                    }
                }
                case "0" -> System.exit(0);
                default -> System.err.println("Khong hop le");

            }
        }
    }
    public static Candidate createCadidate(Scanner scanner, String cate) {
        System.out.print("Nhap ma thi sinh: ");
        String id = scanner.nextLine();
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
        System.out.print("Nhap dia chi: ");
        String address = scanner.nextLine();
        System.out.print("Nhap diem uu tien: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if (cate.equals("a")) {
            return new CandidateA(id, name,address,priority);
        } else if (cate.equals("b")) {
            return new CandidateB(id, name,address,priority);
        } else {
            return new CandidateC(id, name,address,priority);
        }
    }
}
