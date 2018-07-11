package me.wrj.haifa.demo;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Haifa App Java Demo!" );

        while (true){
            System.out.println("current time is "+LocalDateTime.now());
            try {
                Thread.sleep(3000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
