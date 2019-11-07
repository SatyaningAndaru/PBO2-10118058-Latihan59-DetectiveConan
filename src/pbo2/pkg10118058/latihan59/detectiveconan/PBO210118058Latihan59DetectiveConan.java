/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118058.latihan59.detectiveconan;

/**
 *
 * @author user
 */
public class PBO210118058Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     * Nama:Satyaning Andaru bawalaksana
     * Nim: 10118058
     * kelas : If-2
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainCharacter conan = new MainCharacter("Investigator","Conan Edogawa","Tokyo" 
                 ,true,"Menyelesaikan Kasus");
        MainCharacter ran = new MainCharacter("Karate","Ran Mouri","Osaka",false,"Sama seperti Shinichi");
        SupportCharacter eisuke = new SupportCharacter("Teman Sekelas Ran Mouri"
                ,"Eisuke Hondo","Osaka",false);
        conan.displayCharacter();
        ran.displayCharacter();
        eisuke.displayCharacter();
    }
    
}
