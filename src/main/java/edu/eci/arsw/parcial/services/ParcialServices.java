/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.parcial.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ProtocolException;

/**
 *
 * @author 2105700
 */
public interface ParcialServices {
    
    /**
     *
     * @param cityName
     * @return
     */
    public String getWeatherByCityName(String cityName) throws MalformedURLException, ProtocolException, IOException;
    
}
