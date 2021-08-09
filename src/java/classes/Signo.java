/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Gabriel
 */
public class Signo
{

    private Date data;

    public Signo(Date data)
    {
        this.data = data;

    }

    public Signo()
    {
    }

    public Date getData()
    {
        return data;
    }

    public void setData(Date data)
    {
        this.data = data;
    }

    public String getSigno(String data)
    {
        String signo = "";
        String temp[] = data.split("-");
        int mes = Integer.parseInt(temp[1]);
        int dia = Integer.parseInt(temp[2]);

        switch (mes)
        {
            case 1:
                if(dia < 21)
                    signo = "Capricornio";
                else
                    signo = "Aquario";
                break;
            case 2:
                if(dia < 19)
                    signo = "Aquario";
                else
                    signo = "Peixes";
                break;
            case 3:
                if(dia < 21)
                    signo = "Peixes";
                else
                    signo = "Aries";
                break;
            case 4:
                if(dia < 21)
                    signo = "Aries";
                else
                    signo = "Touro";
                break;
            case 5:
                if(dia < 21)
                    signo = "Touro";
                else
                    signo = "Gemeos";
                break;
            case 6:
                if(dia < 21)
                    signo = "Gemeos";
                else
                    signo = "Cancer";
                break;
            case 7:
                if(dia < 22)
                    signo = "Cancer";
                else
                    signo = "Leao";
                break;
            case 8:
                if(dia < 23)
                    signo = "Leao";
                else
                    signo = "Virgem";
                break;
            case 9:
                if(dia < 23)
                    signo = "Virgem";
                else
                    signo = "Libra";
                break;
            case 10:
                if(dia < 23)
                    signo = "Libra";
                else
                    signo = "Escorpiao";
                break;
            case 11:
                if(dia < 22)
                    signo = "Escorpiao";
                else
                    signo = "Sagitario";
                break;
            case 12:
                if(dia < 22)
                    signo = "Sagitario";
                else
                    signo = "Capricornio";
                break;
        }
        
        return signo;
    }
}
