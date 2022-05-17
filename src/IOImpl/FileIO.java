package IOImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO implements IO
{

    //Skal denne her klasse skrive bookings til filer? Eller skal I have en klasse, der bruger FileIO til at sende Booking objekter over -
    //og skriver dem dertil.
    public String[] readRoomData()
    {
        //lav et array ud fra en enkelt fil, der indeholder CSV for et hotel.

        File file = new File("src/RoomData.csv");
        String[] data = new String[40];

        try
        {
            Scanner scan = new Scanner(file);
            int i = 0; //counter variabel

            String header = scan.nextLine();//Ignorer header

            while (scan.hasNextLine())
            {
                data[i] = scan.nextLine();
                //System.out.println(data[i]);
                i++;

            }
        }
        catch (FileNotFoundException e)
        {

            data = null;
        }
        return data;
    }


    @Override
    public void bookNewGuest() {

    }

    @Override
    public void checkAvailableRoom() {

    }

    @Override
    public void checkGuestIn() {

    }

    @Override
    public void checkGuestOut() {

    }

    @Override
    public void changeBooking() {

    }
}