/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftp;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JTextField;
/**
 *
 * @author Uditk
 */
public class Server {
    String convert(String s)
    {
        Queue<Character> q = new LinkedList<Character>();
        for(int i=0;i<s.length();i++)
        {
            
            if(s.charAt(i)=='/'){
            q.add('/'); q.add('/');
            }
            else
            {
                q.add(s.charAt(i));
            }
        }
        String s2 = "";
          Iterator value = q.iterator(); 
         for (Character p : q) { 
            s2+=p; 
        } 
        return s2;
    }
    public static void main(String args[]) throws SocketException,IOException,Exception
    {
        ServerSocket s = new ServerSocket(6969);
        Socket s1 = s.accept();
        JTextField path = new JTextField("Enter the Path");
        
        FileInputStream f1 = new FileInputStream("C:\\Users\\Uditk\\Desktop\\I Miss You.mp3");
        byte [] b = new byte[2000];
        f1.read(b, 0, b.length);
        OutputStream os = s1.getOutputStream();
     // os.write(b, 0, b.length);
    }
}
