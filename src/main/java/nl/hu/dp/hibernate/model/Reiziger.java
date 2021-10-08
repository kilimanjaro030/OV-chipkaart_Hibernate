package nl.hu.dp.hibernate.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="reiziger", schema = "public")
public class Reiziger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="reiziger_id")
    private int id;
    private String voorletters;
    private String tussenvoegsel;
    private String achternaam;
    private Date geboortedatum;
    @OneToOne
    @JoinColumn(name = "reiziger_id")
    private Adres adres;
    @OneToMany
    @JoinColumn(name = "reiziger_id")
    private List<OVChipkaart> ovChipkaarten = new ArrayList<>();

    public Reiziger() {
    }

    public List<OVChipkaart> getOvChipkaarten() {
        return ovChipkaarten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVoorletters() {
        return voorletters;
    }

    public void setVoorletters(String voorletters) {
        this.voorletters = voorletters;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public String toString() {
        String s = "";
        if(tussenvoegsel == null){
            s = s + " Reiziger =[" + id + ": " + voorletters + ". "  + achternaam + " " + "(" + geboortedatum + ")] " + adres.toString();
        }else{
            s = s + " Reiziger =[" + id + ": " + voorletters + ". " + tussenvoegsel + " " + achternaam + " " + "(" + geboortedatum + ")] " + adres.toString();
        }
        return s;
    }
}