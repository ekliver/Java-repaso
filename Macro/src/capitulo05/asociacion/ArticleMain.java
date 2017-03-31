/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capitulo05.asociacion;

import java.util.Iterator;

/**
 *
 * @author Pc
 */
public class ArticleMain {
    public static void main(String[] args) {
        
    //Creamos la lista
    Articles lista = new Articles();
    Iterator it;
    Article art;

    
    //Le agregamos elementos
    lista.add(new Article(10,"Impresora",150.0));
    lista.add(new Article(20,"Monitor",320.0));
    lista.add(new Article(30,"Teclado",25.0));
    
    
    it=lista.getList().iterator();
    
    while(it.hasNext()){
    art=(Article) it.next();
        System.out.println(art.getCode()+"\t"+
        art.getName()+"\t"+art.getPrice());
    }
    
    
    }
}
