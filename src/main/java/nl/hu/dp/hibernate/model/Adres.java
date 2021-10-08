package nl.hu.dp.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name="Adres", schema = "public")
public class Adres {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="adres_id")

    private int id;
    private String postcode;
    private String huisnummer;
    private String straat;
    private String woonplaats;

    @OneToOne
    @JoinColumn(name = "adres_id")

    private Reiziger reiziger;

    public Adres() {
    }

    public int getId() {
        return id;
    }



    public void setId(int id) {
        this.id = id;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getHuisnummer() {
        return huisnummer;
    }

    public void setHuisnummer(String huisnummer) {
        this.huisnummer = huisnummer;
    }

    public String getStraat() {
        return straat;
    }

    public void setStraat(String straat) {
        this.straat = straat;
    }

    public String getWoonplaats() {
        return woonplaats;
    }

    public void setWoonplaats(String woonplaats) {
        this.woonplaats = woonplaats;
    }

    public Reiziger getReiziger() {
        return reiziger;
    }

    public Reiziger setReiziger(int reiziger_id) {
        return reiziger;
    }

    public void setReiziger(Reiziger reiziger) {
        this.reiziger = reiziger;
    }

    public String toString() {
        return " Adres {#" + id + " " + postcode +"-" + huisnummer + "} ";
    }
}
