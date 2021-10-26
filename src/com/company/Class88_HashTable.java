package com.company;

import java.util.Hashtable;

class Temp12{
    int i;
    Temp12(int i){
        this.i = i;
    }
    public int hashCode(){
        return i;
    }
    public String toString(){
        return i+"";
    }
}

public class Class88_HashTable {
    public static void main(String[] args) {
        Hashtable hs = new Hashtable();         // if you change initial capacity let 9 then divide by 9 or hashCode code change -> return i%9;
        hs.put(new Temp12(5),"A");          // 5%11 = 5
        hs.put(new Temp12(2),"B");          // 2%11 = 2
        hs.put(new Temp12(6),"C");          // 6%11 = 6
        hs.put(new Temp12(15),"D");         // 15%11 = 4
        hs.put(new Temp12(23),"E");         // 23%11 = 1
        hs.put(new Temp12(16),"F");         // 16%11 = 5
        System.out.println(hs);         // Print  value to use hashCode -> top to bottom and right to left
    }
}
