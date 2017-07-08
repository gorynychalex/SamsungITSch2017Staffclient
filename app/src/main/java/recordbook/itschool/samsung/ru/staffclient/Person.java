package recordbook.itschool.samsung.ru.staffclient;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Class Person
 */

public class Person {

    @SerializedName("id")
    @Expose
    private int id;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("surname")
    @Expose
    private String surname;

    @SerializedName("lastname")
    @Expose
    private String lastname;

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("room")
    @Expose
    private String room;

    @SerializedName("bdate")
    @Expose
    private String bdate;

    @SerializedName("checkin")
    @Expose
    private String checkin;

    @SerializedName("checkout")
    @Expose
    private String checkout;

    @SerializedName("diagnos")
    @Expose
    private String diagnos;

    @SerializedName("cdate")
    @Expose
    private String cdate;

    @SerializedName("edate")
    @Expose
    private String edate;

    @SerializedName("state")
    @Expose
    private int state;

    @SerializedName("bdate_ms")
    @Expose
    private String bdate_ms;

    @SerializedName("cdate_ms")
    @Expose
    private String cdate_ms;

    @SerializedName("edate_ms")
    @Expose
    private String edate_ms;


    public Person(){

    }

    /*
        Constructor
        @params rumNum, Name, photoId
     */
    public Person(String room, String name) {
        this.room = room;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    public String getDiagnos() {
        return diagnos;
    }

    public void setDiagnos(String diagnos) {
        this.diagnos = diagnos;
    }

    public String getCdate() {
        return cdate;
    }

    public void setCdate(String cdate) {
        this.cdate = cdate;
    }

    public String getEdate() {
        return edate;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public String getBdate_ms() {
        return bdate_ms;
    }

    public void setBdate_ms(String bdate_ms) {
        this.bdate_ms = bdate_ms;
    }

    public String getCdate_ms() {
        return cdate_ms;
    }

    public void setCdate_ms(String cdate_ms) {
        this.cdate_ms = cdate_ms;
    }

    public String getEdate_ms() {
        return edate_ms;
    }

    public void setEdate_ms(String edate_ms) {
        this.edate_ms = edate_ms;
    }
}
