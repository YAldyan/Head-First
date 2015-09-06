/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DesignPattern.ObserverPattern;

/**
 *
 * @author 7
 */
public class WeatherStation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        WeatherData wd = new WeatherData();
        
        @SuppressWarnings("unused")
		CurrentConditionDisplay ccd = new CurrentConditionDisplay(wd) ;
        
//        StatisticDisplay sd = new StatisticDisplay();
//        ForecastDisplay fd = new ForecastDisplay();
        
        wd.setMeasurement(80, 65, 30.4f);
        wd.setMeasurement(82, 70, 29.2f);
        wd.setMeasurement(78, 90, 29.2f);
    }
    
}
