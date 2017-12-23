package com.example.android.miwok;

/**
 * Created by Fatih YILMAZ on 23.12.2017.
 * This class is only created for understanding of class structure.
 * It will never used in the project.
 */

public class ReportCard {
    private String fullName;
    private int studentNumber;

    private double englishGrade;
    private double mathGrade;
    private double historyGrade;
    private double biologyGrade;

    public ReportCard() {
        this.fullName = "";
        this.studentNumber = 0;
        this.englishGrade = 0;
        this.mathGrade = 0;
        this.historyGrade = 0;
        this.biologyGrade = 0;
    }

    public ReportCard(String fullName, int studentNumber) {
        this.fullName = fullName;
        this.studentNumber = studentNumber;
        this.englishGrade = 0;
        this.mathGrade = 0;
        this.historyGrade = 0;
        this.biologyGrade = 0;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getEnglishGrade() {
        return englishGrade;
    }

    public void setEnglishGrade(double englishGrade) {
        if ((fullName != "") && (studentNumber != 0)) {
            this.englishGrade = englishGrade;
        }
    }

    public double getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(double mathGrade) {
        if ((fullName != "") && (studentNumber != 0)) {

            this.mathGrade = mathGrade;
        }
    }

    public double getHistoryGrade() {
        return historyGrade;
    }

    public void setHistoryGrade(double historyGrade) {
        if ((fullName != "") && (studentNumber != 0)) {
            this.historyGrade = historyGrade;
        }
    }

    public double getBiologyGrade() {
        return biologyGrade;
    }

    public void setBiologyGrade(double biologyGrade) {
        if ((fullName != "") && (studentNumber != 0)) {
            this.biologyGrade = biologyGrade;
        }
    }

    @Override
    public String toString() {
        return "Name: " + fullName +
                ", Student Number: " + studentNumber +
                ", English Grade: " + englishGrade +
                ", Math Grade: " + mathGrade +
                ", History Grade: " + historyGrade +
                ", Biology Grade: " + biologyGrade;
    }
}
