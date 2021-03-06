package demo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the tbllists database table.
 */
@Entity
@Table(name = "tbllists")
@NamedQuery(name = "Tbllist.findAll", query = "SELECT t FROM Tbllist t")
public class Tbllist implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    private int listid;

    private String name;

    public Tbllist() {
    }

    public int getListid() {
        return this.listid;
    }

    public void setListid(int listid) {
        this.listid = listid;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}