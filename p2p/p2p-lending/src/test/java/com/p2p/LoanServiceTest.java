package com.p2p;

import com.p2p.domain.*;
import com.p2p.service.LoanService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import lombok.extern.slf4j.Slf4j;
import java.math.BigDecimal;
@Slf4j
public class LoanServiceTest {
    @Test
    void shouldRejectLoanWhenBorrowerNotVerified() {

        // =====================================================
        // SCENARIO:
        // Borrower tidak terverifikasi (KYC = false)
        // Ketika borrower mengajukan pinjaman
        // Maka sistem harus menolak dengan melempar exception
        // =====================================================

        // =========================
        // Arrange (Initial Condition)
        // =========================
        // Borrower belum lolos proses KYC
        Borrower borrower = new Borrower(false, 700);

        // Service untuk pengajuan loan
        LoanService loanService = new LoanService();

        // Jumlah pinjaman valid
        BigDecimal amount = BigDecimal.valueOf(1000);

        // =========================
        // Act & Assert (Action + Expected Result)
        // =========================
        // Borrower mencoba mengajukan loan - harus throw exception
        assertThrows(IllegalArgumentException.class, () -> {
            loanService.createLoan(borrower, amount);
        });
    }
    @Test
    void shouldRejectLoanWhenAmountIsZeroOrNegative(){
        // =========================
        // Arrange (Initial Condition)
        // =========================
        // Borrower belum lolos proses KYC
        Borrower borrower = new Borrower(true, 700);
        LoanService loanService = new LoanService();
        // =========================
        // Act & Assert (Action + Expected Result)
        // =========================
        // Borrower mencoba mengajukan loan - harus throw exception
        BigDecimal zeroAmount = BigDecimal.valueOf(0);
        assertThrows(IllegalArgumentException.class, () -> {
            loanService.createLoan(borrower, zeroAmount);
        });
        BigDecimal negativeAmount = BigDecimal.valueOf(-100);
        assertThrows(IllegalArgumentException.class,()->{
            loanService.createLoan(borrower, negativeAmount);
        });
        
    }
    @Test
    void shouldApproveLoanWhenCreditScoreHigh(){
        // =========================
        // Arrange (Initial Condition)
        // =========================
        // Borrower belum lolos proses KYC
        Borrower borrower = new Borrower(true, 700);
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.valueOf(1000);
        // =========================
        // Act & Assert (Action + Expected Result)
        // =========================
        // Borrower mencoba mengajukan loan - harus throw exception
        Loan loan = loanService.createLoan(borrower, amount);
        assertEquals(Loan.Status.APPROVED, loan.getStatus());
    }
    @Test
    void shouldRejectLoanWhenCreditScoreLow(){
    // =========================
        // Arrange (Initial Condition)
        // =========================
        // Borrower belum lolos proses KYC
        Borrower borrower = new Borrower(true, 500);
        LoanService loanService = new LoanService();
        BigDecimal amount = BigDecimal.valueOf(1000);
        // =========================
        // Act & Assert (Action + Expected Result)
        // =========================
        // Borrower mencoba mengajukan loan - harus throw exception
        Loan loan = loanService.createLoan(borrower, amount);
        assertEquals(Loan.Status.REJECTED, loan.getStatus());        
    }
}