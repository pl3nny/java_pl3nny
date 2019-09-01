package com.pl3nny;

public class Client {
    private int client_id;
    public Client (){}

    public Client(int client_id) {
        this.client_id = client_id;
    }

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }
}
