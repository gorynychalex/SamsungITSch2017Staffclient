package recordbook.itschool.samsung.ru.staffclient;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gorynych on 06.07.17.
 */

public class PersonStateOfHealth {

    @SerializedName("id")
    private int id;

    @SerializedName("patient")
    private int personId;

    @SerializedName("state")
    private int state;

    @SerializedName("date")
    private String date;

    @SerializedName("cdate")
    private String cdate;

    @SerializedName("edate")
    private String edate;

    @SerializedName("date_ms")
    private String date_ms;

    @SerializedName("cdate_ms")
    private String cdate_ms;

    @SerializedName("edate_ms")
    private String edate_ms;

    public PersonStateOfHealth() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public String getDate_ms() {
        return date_ms;
    }

    public void setDate_ms(String date_ms) {
        this.date_ms = date_ms;
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
