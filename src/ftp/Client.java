/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftp;
import java.io.*;
import java.net.*;
/**
 *
 * @author Uditk
 */
public class Client {
    public static void main(String args[]) throws Exception
    {
        byte b[] = new byte[2000];
        Socket s1 = new Socket("localhost",6969);
        InputStream s = s1.getInputStream();
        FileOutputStream f1 = new FileOutputStream("C:\\Users\\Uditk\\Desktop\\done.txt");
        s.read(b, 0, b.length);
        f1.write(b,0,b.length);
        
    }
}