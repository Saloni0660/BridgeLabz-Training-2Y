import java.util.*;

public class HospitalSystem {
    public static void main(String[] args) {

        Patient p1 = new InPatient("P101", "Alice", 30, 5, 2000);
        Patient p2 = new OutPatient("P102", "Bob", 25, 500);

        // Adding records
        ((MedicalRecord)p1).addRecord("Admitted for surgery");
        ((MedicalRecord)p1).addRecord("Recovery progressing well");

        ((MedicalRecord)p2).addRecord("Consulted for fever");
        ((MedicalRecord)p2).addRecord("Prescribed medication");

        System.out.println(p1.getPatientDetails());
        System.out.println("Bill: " + p1.calculateBill());
        ((MedicalRecord)p1).viewRecords();

        System.out.println("\n" + p2.getPatientDetails());
        System.out.println("Bill: " + p2.calculateBill());
        ((MedicalRecord)p2).viewRecords();
    }
}

abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    private String diagnosis;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    public abstract double calculateBill();

    public String getPatientDetails() {
        return "PatientID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void addToMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    public List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory);
    }
}

interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("InPatient Records: " + records);
    }
}

class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("OutPatient Records: " + records);
    }
}
