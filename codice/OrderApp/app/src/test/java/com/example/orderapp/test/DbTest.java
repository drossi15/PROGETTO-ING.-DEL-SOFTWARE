package com.example.orderapp.test;

import android.util.Log;

import com.example.orderapp.attività.MainActivity;
import com.example.orderapp.database.ConnectionHelper;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;
//test database
public class DbTest {

    @Test
    public void InserimentoPrenotazioneTest(){
        ConnectionHelper h=new ConnectionHelper();
        Connection c;
        c=h.connectionDB();
        Assert.assertEquals(true, h.Insert_prenotazione("19:00","mario","3345687894",2,c));

    }
    @Test
    public void InserimentoOridneTest(){
        ConnectionHelper h=new ConnectionHelper();
        Connection c;
        c=h.connectionDB();
        Assert.assertEquals(true, h.Insert_Ordine(20,2,c));

    }

    @Test
    public void CalcoloPrezzoTest(){
        ConnectionHelper h=new ConnectionHelper();
        Connection c;
        c=h.connectionDB();
        int[]q={1,1,0,0,0,0,0,0};
        Assert.assertEquals(22,h.Calcola_prezzo(q,c));
    }
}
