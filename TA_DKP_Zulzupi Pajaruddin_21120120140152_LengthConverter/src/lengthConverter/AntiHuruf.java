/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lengthConverter;

/**
 *
 * @author DELL
 */
public class AntiHuruf extends Exception{
    
    @Override
    public String getMessage() {
        return "Nilai yang dimasukkan harus berupa angka";
    }
    
}
