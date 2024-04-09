/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Conexion;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.cloud.FirestoreClient;
import java.util.Map;

/**
 *
 * @author perfil
 */
public class PersonaProvider {

    public static boolean RetornarUid(String uid) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
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
    
}
