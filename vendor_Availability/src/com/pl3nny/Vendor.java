package com.pl3nny;

import java.util.Date;

public class Vendor {
    private int id;
    private Date[] date;
    private Client[] client;
    private int drivers;

    public Vendor(int id, int numberOfDrivers, int numberOfClients) {
        this.id = id;
        this.client = new Client[numberOfClients];
        this.date = new Date[numberOfClients];
        this.drivers = drivers;

        for (int i = 0; i < numberOfClients; i++) {
            client[i] = new Client();
            date[i] = new Date();
        }
    }

    public int getId() {
        return id;
    }

    public Date getDate(int index) {
        return date[index];
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(int index, Date date) {
        this.date[index] = date;
    }

    public void setDrivers(int drivers){
        this.drivers = drivers;
    }

    public int getDrivers(){
        return drivers;
    }

    public String printVendorID(){
        return "vendor_id: " + id;
    }

    public String printDate(int index){
        return "datetime: " + date[index].toString();
    }

    public String printClientID(int index){
        return "client_id: " + getClientID(this.date[index]);
    }

    public String printDrivers(){
        return "drivers: " + drivers;
    }

    public void setClient_id(int index, int client_id){
        client[index].setClient_id(client_id);
    }

    public boolean is_Driver_Available(Date date){
        for(int i = 0; i < this.date.length; i++){
            if(this.date[i] == date || this.drivers <= 0) {
                // create logic for drivers availability

                if(this.drivers < 0){
                    this.drivers = 0;
                }

                return false;
            }
        }
        return true;
    }

    public boolean is_Vendor_Available(int id, Date date){
        if(this.id == id && !is_Driver_Available(date)) {
            for(int i = 0; i < this.date.length; i++){
                if(this.date[i] == date){
                    return false;
                }
            }
        }
        return true;
    }

    public int getClientID(Date date){
        for(int i = 0; i < this.date.length; i++){
            if(this.date[i] == date) {
                return client[i].getClient_id();
            }
        }
        return -1;
    }
}
