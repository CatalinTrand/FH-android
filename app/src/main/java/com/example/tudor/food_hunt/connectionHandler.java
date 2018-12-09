package com.example.tudor.food_hunt;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.atomic.AtomicReference;

public class connectionHandler extends Thread {
    Object[] data;
    //user
    static final int CREATE_USER = 0;
    static final int DELETE_USER = 1;
    static final int EDIT_USER = 2;
    static final int LOGIN_USER = 3;
    static final int LOGOUT_USER = 4;
    //orders
    static final int CREATE_ORDER = 10;
    static final int DELETE_ORDER = 11;
    static final int GET_ORDERS = 12;
    static final int GET_ORDERS_ARCHIVED = 13;
    static final int DELIVER_ORDER = 14;
    static final int ARCHIVE_ORDER = 15;
    //offers
    static final int CREATE_OFFER = 20;
    static final int DELETE_OFFER = 21;
    static final int EDIT_OFFER = 22;
    static final int GET_OFFERS = 23;
    static final int FLUSH_OFFERS = 24;
    //truck
    static final int UPDATE_TRUCK_POSITION = 30;
    //schedules
    //TODO

    int type;

    AtomicReference<Object> response;

    private static StringBuffer getUrlSource(String link, String urlParameters) throws IOException {
        URL obj = new URL(link);
        HttpsURLConnection con = (HttpsURLConnection) obj.openConnection();

        //header
        con.setRequestMethod("POST");
        //request
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

        int responseCode = con.getResponseCode();
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();
        return response;
    }

    public connectionHandler(int type, Object[] data) {
        this.type = type;
        this.data = data;
        response = null;
    }

    public void run() {
        String link = "foodhunt.us-east-2.elasticbeanstalk.com/foodhunt-server/webservice/";
        switch (type) {
            //Users
            case CREATE_USER:
                link += "createUser";
                String name = (String) data[0];
                String address = (String) data[1];
                String phone = (String) data[2];
                String email = (String) data[3];
                String type = (String) data[4];
                String password = (String) data[5];
                try {
                    String urlParameters = "name=" + name + "&address=" + address + "&phone=" + phone + "&email=" + email + "&type=" + type + "&password=" + password;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case DELETE_USER:
                link += "deleteUser";
                String id = (String) data[0];
                try {
                    String urlParameters = "id=" + id;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case EDIT_USER:
                link += "editUser";
                name = (String) data[0];
                address = (String) data[1];
                phone = (String) data[2];
                email = (String) data[3];
                type = (String) data[4];
                id = (String) data[5];
                try {
                    String urlParameters = "name=" + name + "&address=" + address + "&phone=" + phone + "&email=" + email + "&type=" + type + "&id=" + id;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case LOGIN_USER:
                link += "loginUser";
                email = (String) data[0];
                password = (String) data[1];
                try {
                    String urlParameters = "email=" + email + "&password=" + password;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case LOGOUT_USER:
                link += "logoutUser";
                break;
            //Orders
            case CREATE_ORDER:
                link += "createOrder";
                id = (String) data[0];
                String offers = (String) data[0];
                address = (String) data[0];
                phone = (String) data[0];
                try {
                    String urlParameters = "truckID=" + id + "&offers=" + offers + "&address=" + address + "&phone=" + phone;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case DELETE_ORDER:
                link += "deleteOrder";
                id = (String) data[0];
                try {
                    String urlParameters = "id=" + id;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case ARCHIVE_ORDER:
                link += "archiveOrder";
                id = (String) data[0];
                try {
                    String urlParameters = "id=" + id;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case DELIVER_ORDER:
                link += "deliverOrder";
                id = (String) data[0];
                try {
                    String urlParameters = "id=" + id;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case GET_ORDERS:
                link += "getOrders";
                id = (String) data[0];
                try {
                    String urlParameters = "truckID=" + id;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case GET_ORDERS_ARCHIVED:
                link += "getOrdersArchived";
                try {
                    String urlParameters = "";
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            //Offers
            case CREATE_OFFER:
                link += "createOffer";
                id = (String) data[0];
                name = (String) data[1];
                String price = (String) data[2];
                String quantity = (String) data[3];
                try {
                    String urlParameters = "truckID=" + id + "&name=" + name + "&price=" + price + "&quantity=" + quantity;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case DELETE_OFFER:
                link += "deleteOffer";
                id = (String) data[0];
                try {
                    String urlParameters = "id=" + id;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case EDIT_OFFER://TODO
                link += "editOffer";
                String truckID = (String) data[0];
                name = (String) data[1];
                price = (String) data[2];
                quantity = (String) data[3];
                String available = (String) data[4];
                id = (String) data[5];
                try {
                    String urlParameters = "truckID="+truckID+"&name="+name+"&price="+price+"&quantity="+quantity+"&available="+available+"&id="+id;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case GET_OFFERS:
                link += "getOffers";
                String lat = (String) data[0];
                String lng = (String) data[1];
                String radius = (String) data[2];
                try {
                    String urlParameters = "lat=" + lat +"&lng="+lng+"&radius="+radius;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case FLUSH_OFFERS:
                link += "flushOffers";
                try {
                    String urlParameters = "";
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            //Trucks
            case UPDATE_TRUCK_POSITION:
                link += "updateTruckPosition";
                id = (String) data[0];
                lat = (String) data[1];
                lng = (String) data[2];
                try {
                    String urlParameters = "truckID=" + id + "&lat=" + lat + "&lng=" + lng;
                    this.response = new AtomicReference<>((Object)getUrlSource(link, urlParameters));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            //Schedules
            //TODO
        }
    }
}
