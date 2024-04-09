/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Conexion;

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
    
}
