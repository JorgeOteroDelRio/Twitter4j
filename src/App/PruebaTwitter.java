/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;



/**
 *
 * @author jota
 */
public class PruebaTwitter {

    /**
     * @param args the command line arguments
     * @throws twitter4j.TwitterException
     */
    public static void main(String[] args) throws TwitterException {
       Twitter twitter = TwitterFactory.getSingleton();
       String message="Probando a twittear desde java";
       Status status = twitter.updateStatus(message);  

    }
    
}
