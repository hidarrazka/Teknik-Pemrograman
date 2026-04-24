package com.p2p.service;
import com.p2p.domain.*;
import lombok.extern.slf4j.Slf4j;
import java.math.BigDecimal;
@Slf4j
public class LoanService {
    private static final String ERROR_BORROWER_NOT_VERIFIED = "Borrower not verified";
    private static final String ERROR_INVALID_AMOUNT = "Loan amount must be greater than zero";
    public Loan createLoan(Borrower borrower, BigDecimal amount) {
        // =========================
        // VALIDASI UTAMA (TC-01)
        // =========================
        // Jika borrower belum terverifikasi,
        // maka proses harus dihentikan
        validateBorrower(borrower);
        //==========================
        // VALIDASI (TC0-02)
        //==========================
        validateAmount(amount);
        // Membuat objek loan baru
        Loan loan = new Loan();
        
                // =========================
        // LOGIC SEDERHANA (sementara)
        // =========================
        // Jika credit score tinggi → APPROVED
        // Jika tidak → REJECTED
        determineLoanStatus(borrower,loan);
        return loan;
    }
    private void validateBorrower(Borrower borrower) {
        if (!borrower.canApplyLoan()) {
            throw new IllegalArgumentException(ERROR_BORROWER_NOT_VERIFIED);
        }
    }
    private void validateAmount(BigDecimal amount){
        if(amount == null || amount.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException(ERROR_INVALID_AMOUNT);
        }
    }
    private void determineLoanStatus(Borrower borrower, Loan Loan){
        if(borrower.getCreditScore() >= getCreditThreshold()){
            Loan.approve();
        } else{
            Loan.reject();
        }
    }
    private int getCreditThreshold(){
        return 600;
    }
}
