/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Objects;

/**
 *
 * @author Laboratorio 2023
 */
public class TipoProducto {
    
    private int id;
    private String tag;

    public TipoProducto() {
    }

    public TipoProducto(String tag) {
        this.tag = tag;
    }
    
    public TipoProducto(int id, String tag) {
        this.id = id;
        this.tag = tag;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.id;
        hash = 37 * hash + Objects.hashCode(this.tag);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoProducto other = (TipoProducto) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.tag, other.tag);
    }

    @Override
    public String toString() {
        return "TipoProducto{" + "id=" + id + ", tag=" + tag + '}';
    }
    
}
