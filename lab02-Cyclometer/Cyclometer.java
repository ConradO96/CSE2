// By Conrad Ozarek
//Feb. 05, 2016
// 
public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args) {
        
        //values of the trip
        int secsTrip1=480;    //time of first trip in seconds
        int secsTrip2=3220;    //time of second trip in seconds
        int countsTrip1=1561;    //number of rotations of the wheel in first trip
        int countsTrip2=9037;    //number of rotations of the wheel in second trip
        
        //constants for every trip
        double wheelDiameter=27.0,    //wheel diameter
        PI=3.14159,    //constant for pi
        feetPerMile=5280,    //constant conversion for feet to miles
        inchesPerFoot=12,    //constant conversion for inches to feet
        secondsPerMinute=60;    //constant conversion for seconds to minutes
        double distanceTrip1, distanceTrip2, totalDistance;    //creates a double for the individual and total distances
        
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
                //prints out first trip length in time and the number of wheel rotations
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
                //prints out second trip length in time and the number of wheel rotations
            
            //We are calculating first trip length in time and the number of wheel rotations
            //as well as the second trip length in time and the number of wheel rotations
            
            distanceTrip1=countsTrip1*wheelDiameter*PI;
            //sets a value to distanceTrip1 by using other variables with values in a calculation
            distanceTrip1/=inchesPerFoot*feetPerMile; 
            //converts the value and continues the calculation for the total distance of the first trip
            distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
            //sets a value to the distance of trip 2 by using other variables with values and a calculation
            totalDistance=distanceTrip1+distanceTrip2;
            //sets a value for the total distance by taking the sum of the first and second trip
            
            System.out.println("Trip 1 was "+distanceTrip1+" miles.");
            System.out.println("Trip 2 was "+distanceTrip2+" miles.");
            System.out.println("The total distance was "+totalDistance+" miles.");
            //three lines above prints final values for distances
            
    }   //end of main method
}   //end of class