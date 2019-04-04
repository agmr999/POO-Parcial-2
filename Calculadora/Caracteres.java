import java.util.ArrayList;


public class Caracteres {
    private ArrayList<Character> Pila;
    private ArrayList<Character> Pila2;
    private ArrayList<Character> Cola;

    public Caracteres(){
        Pila = new ArrayList<Character>();
        Pila2 = new ArrayList<Character>();
        Cola = new ArrayList<Character>();
    }

    public void add(char carac)throws PrimersignoExcepcion, SignosPegadosExcepcion{
        if(Pila.isEmpty()&&(carac=='+'||carac=='-'||carac=='*'||carac=='/'||carac=='^'||carac==')')){
            throw new PrimersignoExcepcion("No se puede");
        }
        if(!Pila.isEmpty()&&(Pila.get(Pila.size()-1)=='+'||Pila.get(Pila.size()-1)=='-'||Pila.get(Pila.size()-1)=='*'||Pila.get(Pila.size()-1)=='/'||Pila.get(Pila.size()-1)=='^')
        &&(carac=='+'||carac=='-'||carac=='*'||carac=='/'||carac=='^')){
            throw new SignosPegadosExcepcion("Error");
        }
        Pila.add(carac);
    }

    public void Polaca(){
        int a=0;
        for(Character t : Pila){
        if(t=='A'||t=='B'||t=='C'||t=='D'||t=='E'||t=='F'||t=='G'||t=='H'||t=='I'||t=='J'||t=='V'||t=='W'||t=='X'||t=='Y'||t=='Z'){
            Cola.add(t);
        }
        else{
            switch(t){
                case '+':
                case '-':
                if(Pila2.isEmpty()){
                    Pila2.add(t);
                }
                else{
                    while(a==0&&(Pila2.get(Pila2.size()-1)=='*'||Pila2.get(Pila2.size()-1)=='/'||Pila2.get(Pila2.size()-1)=='^')){
                    if(Pila2.get(Pila2.size()-1)!='('){
                    Cola.add(Pila2.remove(Pila2.size()-1));
                    if(Pila2.isEmpty()){
                        Pila2.add(t);
                        a=1;
                    } 
                    }
                    else{
                        Pila2.add(t);
                        a=1;
                    }   
                    }
                if(a==0){
                    Pila2.add(t);
                }   
                }
                break;
                case '*':
                case '/':
                if(Pila2.isEmpty()){
                    Pila2.add(t);
                }
                else{
                    while(a==0&&(Pila2.size()-1)=='^'){
                    if(Pila2.get(Pila2.size()-1)!='('){
                    Cola.add(Pila2.remove(Pila2.size()-1));
                    if(Pila2.isEmpty()){
                        Pila2.add(t);
                        a=1;
                    } 
                    }
                    else{
                        Pila2.add(t);
                        a=1;
                    }   
                    }
                if(a==0){
                    Pila2.add(t);
                }   
                }
                break;
                case '^':
                    Pila2.add(t);
                break;
                case '(':
                    Pila2.add(t);
                break;
                case ')':
                while(Pila2.get(Pila2.size()-1)!='('){
                    Cola.add(Pila2.remove(Pila2.size()-1)); 
                }
                Cola.remove(Pila2.remove(Pila2.size()-1));
                break;
            }
        }
        }
        for(int x=Pila2.size()-1;x>=0;x--){
            Cola.add(Pila2.remove(x)); 
        }
    }

    public void remove(){
        Pila.remove(Pila.size()-1);
    }

    public void Reset(){
        Pila.clear();
        Cola.clear();
    }

    public String Getcola(){
        StringBuffer cadena = new StringBuffer();
        for(Character x : Cola){
            cadena = cadena.append(x);
        }
        return (cadena.toString());
    }

    /**
     * @return the pila
     */
    public ArrayList<Character> getPila() {
        return Pila;
    }

    public String Getstring() {
        StringBuffer cadena = new StringBuffer();
        for(Character t : Pila){
            cadena = cadena.append(t);
        }
        return (cadena.toString());
    }
}