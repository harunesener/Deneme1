package com.harun.denemeler.codeacademy;

public class Droid{

    String name;
    int batteryLevel;

    public Droid(String droidName){
        name=droidName;
        batteryLevel = 100;
    }

    public String toString(){
        String message = "Hello, I am the droid :" + name;
        return message;
    }

    public void performTask (String taskName){
        System.out.println( name + " is performing task: " + taskName  );
        batteryLevel = batteryLevel - 10;
    }

    public void energyReports(){
        System.out.println(name + " Battery Level is : " + batteryLevel);
    }

    public void energyTransfer(Droid d, int energyLevel){
        batteryLevel = batteryLevel + energyLevel;
        d.batteryLevel = d.batteryLevel - energyLevel;
    }

    public static void main(String[]args){
        Droid myDroid = new Droid("Codey");
        Droid myDroid2 = new Droid("Harun");

        myDroid.performTask("Dance");
        myDroid.performTask("Study");
        myDroid.performTask("Talk");

        myDroid2.performTask("Jump");
        myDroid2.performTask("Walk");


        myDroid.energyReports();
        myDroid2.energyReports();

        myDroid.energyTransfer(myDroid2,30);

        System.out.println("---------Transfer sonrası-------");
        myDroid.energyReports();
        myDroid2.energyReports();

    }
}