package cz.czechitas.java2webapps.ukol5.controller;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.Period;

public class RegistraceForm {
    @NotBlank(message = "Jméno nesmí být prázdné")
    private String jmeno;
    @NotBlank(message = "Příjmení nesmí být prázdné")
    private String prijmeni;
    @NotNull(message = "Zadejte datum narození.")
    private LocalDate datumNarozeni;
    @NotNull(message = "Vyberte pohlaví")
    private PohlaviEnum pohlavi;
    @NotNull(message = "Vyberte turnus.")
    private TurnusEnum turnus;
    @Email(message = "Neplatný formát e-mailové adresy.")
    private String email;
    //TODO
    private String telefon;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public LocalDate getDatumNarozeni() {
        return datumNarozeni;
    }

    public void setDatumNarozeni(LocalDate datumNarozeni) {
        this.datumNarozeni = datumNarozeni;
    }

    public int getVek(){
        Period period = datumNarozeni.until(LocalDate.now());
        return period.getYears();
    }

    public PohlaviEnum getPohlavi() {
        return pohlavi;
    }

    public void setPohlavi(PohlaviEnum pohlavi) {
        this.pohlavi = pohlavi;
    }

    public TurnusEnum getTurnus() {
        return turnus;
    }

    public void setTurnus(TurnusEnum turnus) {
        this.turnus = turnus;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
