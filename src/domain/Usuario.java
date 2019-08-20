/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author angue
 */
public class Usuario {
    private int id_usuario; 
    private String usuario;
    private String password;
    
    public int getId_usuario(){
        return id_usuario;   
    }
    public void setId_usuario(int id_usuario){
        this.id_usuario = id_usuario;
    }
    
    public String getUsuario(){
        return usuario;
    }
    public void Usuario(String usuario){
        this.usuario = usuario;
    }
    
    public String Password(){
        return password;
    }
    public void Password(String password){
        this.password = password;
    }
            
}
