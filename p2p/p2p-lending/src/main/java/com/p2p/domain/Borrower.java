package com.p2p.domain;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Borrower {

    // Status verifikasi KYC
    private boolean verified;

    // Nilai credit score borrower
    private int creditScore;

    // Constructor untuk inisialisasi data borrower
    public Borrower(boolean verified, int creditScore) {
        this.verified = verified;
        this.creditScore = creditScore;
    }

    // Getter untuk mengecek apakah borrower sudah verified
    public boolean isVerified() {
        return verified;
    }

    // Getter untuk mengambil credit score
    public int getCreditScore() {
        return creditScore;
    }
    public boolean canApplyLoan() {
        return verified;
    }
}
// Class ini merepresentasikan pinjaman
