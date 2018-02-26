/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onedollar;

/**
 *
 * @author zeina
 */
public class Client {
    private final String _id;
    private String _prenom;
    private String _nom;
    private String _telephone;
    private String _rue;
    private String _ville;
    private String _etat;
    private String _code;
    private String _pays;
    private String _mail;
    
    public Client(ClientBuilder cb) {
       _id = cb._id;
       _prenom = cb._prenom;
       _nom = cb._nom;
       _telephone = cb._telephone;
       _rue = cb._rue;
       _ville = cb._ville;
       _etat = cb._etat;
       _code = cb._code;
       _pays = cb._pays;
       _mail = cb._mail;     
    }
    
    public static class ClientBuilder {
      private final String _id;
      private String _prenom;
      private String _nom;
      private String _telephone;
      private String _rue;
      private String _ville;
      private String _etat;
      private String _code;
      private String _pays;
      private String _mail; 
      
      public ClientBuilder(String id) {
        _id = id;
      }
       public ClientBuilder prenom(String prenom){
             _prenom = prenom;
             return this;
      }
      public ClientBuilder nom(String nom){
             _nom = nom;
             return this;
      } 
      public ClientBuilder telephone(String telephone){
             _telephone = telephone;
             return this;
      }
      public ClientBuilder rue(String rue){
             _rue = rue;
             return this;
      }
      public ClientBuilder ville(String ville){
             _ville = ville;
             return this;
      } 
      public ClientBuilder etat(String etat){
             _etat = etat;
             return this;
      } 
      public ClientBuilder code(String code){
             _code = code;
             return this;
      } 
      public ClientBuilder pays(String pays){
             _pays = pays;
             return this;
      } 
      public ClientBuilder mail(String mail){
             _mail = mail;
             return this;
      }
      
      public Client build() {
          return new Client(this);
      }
    }      
}
