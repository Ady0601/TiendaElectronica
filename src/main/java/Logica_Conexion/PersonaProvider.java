/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Conexion;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.ArrayList;
import java.util.Map;
import Logica_Negocio.Persona;
import Logica_Negocio.Producto;
/**
 *
 * @author perfil
 */
public class PersonaProvider {

    
   CollectionReference reference;
    public static Firestore db;
    
    public static boolean GuardarPersona(String colection, String documento, Map<String, Object> data){
        db = FirestoreClient.getFirestore();
        try{
            DocumentReference docRef = db.collection(colection).document(documento);
            ApiFuture<WriteResult> result = docRef.set(data);
            System.out.println("Guardado corectamente");
            return true;
            
        } catch (Exception e){
            System.out.println("Error:" + e.getMessage());
        }
        return false;
    }
    public static boolean RetornarUid(String uid) {
        ArrayList<String> uids = new ArrayList<>();
        boolean rta = true;

        try {
            CollectionReference persona = Conexion.db.collection("Persona");
            ApiFuture<QuerySnapshot> querySnap = persona.get(); //navegar entre lo que tenemos doumentos-colecion

            for (DocumentSnapshot document : querySnap.get().getDocuments()) {
                uids.add(document.getString("uid"));
            }

            for (int i = 0; i < uids.size(); i++) {
                if (uid.equals(uids.get(i))) {
                    return rta;
                } else {
                    return !rta;
                }

            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        return rta;
    }

   public static ArrayList<Persona> CargarInfoPersonaCodigo (String codigo){
      Persona objper;
      Persona objper1= null;
      
      
      ArrayList<Persona>lspersona= new ArrayList<>();
      ArrayList<Producto> lsprod= new ArrayList<>();
      
       try{
           CollectionReference persona = Conexion.db.collection("Persona");
           ApiFuture<QuerySnapshot> querySnap= persona.get();
       for (DocumentSnapshot document : querySnap.get().getDocuments()){
           
           objper = new Persona( document.getString("Nombre"),
                    document.getString("Apellido"),
                   document.getString("Cedula"),
                   document.getString("Direccion"),
                   document.getString("Uid"),
                   document.getString("Producto"),
               document.getString("Nom_img")
           
           );
                  
           lspersona.add(objper);
       }
       }catch (Exception e){
           System.out.println("Error" + e.getMessage());
       }
   
   
        return lspersona;   
       }       
}   
   
    

    

