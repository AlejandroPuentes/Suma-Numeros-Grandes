/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumanumerosgrandes;

/**
 *
 * @author User
 */
public class SumaNumerosGrandes {
    String cadena1;
    String cadena2;
    Listas list1;
    Listas list2;
    Listas suma;
    
    SumaNumerosGrandes(String cad1,String cad2){
        this.cadena1=cad1;
        this.cadena2=cad2;
        suma = new Listas();
        list1 = new Listas();
        list2 = new Listas();
        
    }
    
    public void  tamano(){
        if(cadena1.length()>cadena2.length()){
            String s="0";
            int tam =cadena1.length();
            while(cadena2.length()!=tam){
                cadena2=s+cadena2;
            }
            
        }else{
            String s="0";
            int tam =cadena2.length();
            while(cadena1.length()!=tam){
                cadena1=s+cadena1;
            }
            
        }
    }

    
    private String rellenar(String cad){
        String s="0";        
        while((cad.length()%4)!=0){
            cad=s+cad;
        }
        return cad;
    } 
    
     
    
    void divide2(){
        int c = 0;
        cadena1=rellenar(cadena1);
        cadena2=rellenar(cadena2);
        String ss = "";
        String tt = "";
        
                
        for (int i = 0; i <= cadena1.length(); i++) {

            if (c < 4) {
                tt += cadena2.charAt(i);
                ss += cadena1.charAt(i);
                
            } else {
                
                
                list2.meter_nodo(tt);
                list1.meter_nodo(ss);
                ss = "";
                tt = "";
                if (i < cadena1.length()) {
                    ss += cadena1.charAt(i);
                    tt += cadena2.charAt(i);
                }
                c = 0;
            }
            c++;
        }
    }
    
    
    void Escribir_atras(){
        int cont = 0;
        Nodo q2 = list2.cab;
        Nodo q1 =list1.cab;
        Nodo s1 = null;
        Nodo s2 = null;
        while(q1!=null){
            s1 = q1;
            s2 = q2;
            q1 = q1.sig;            
            q2 = q2.sig;
        }
        int aux = 0;
        while(s1 != null && s2!= null){
            String sumas = String.valueOf(Integer.parseInt(s1.info)+Integer.parseInt(s2.info)+aux);
            sumas=rellenar(sumas);
            if(Integer.parseInt(sumas) > 10000){
                sumas= sumas.substring(1,5);
                suma.meter_nodo(sumas);
                aux=1;
            }else{
                suma.meter_nodo(sumas);
                aux=0;
            }
            s1 = s1.ant;
            s2 = s2.ant;
        }
    } 

    public String   mostrar (){
        return suma.Escribir_atras();
    }

    
}
