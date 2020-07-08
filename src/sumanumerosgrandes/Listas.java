package sumanumerosgrandes;




public class Listas {
    Nodo cab;
    
    public Listas(){
        cab=null;
    }
    
    
    void meter_nodo(String x){
        Nodo p=new Nodo(x);
        Nodo q = cab;
        Nodo s = null;
        while(q!=null){
          s = q;
          q = q.sig;
        }
        if(s==null){
            cab=p;  
        }else{
            s.sig = p;
            p.ant = s;
        }      
    }
    
    
    public void imprimir_delante(){
        Nodo q =cab;
        while(q!=null){
            System.out.print(q.info);
            q=q.sig;
        }
        System.out.println();
    }
    
    String Escribir_atras(){ 
        String cadena="";
        Nodo q =cab;
        Nodo s =null;
        while(q!=null){
            s = q;
            q = q.sig;
        }
        while(s != null){
            cadena=cadena+s.info;
            s = s.ant;
            
        }
        return cadena;
    } 
    
    
    
    
   
     
}
