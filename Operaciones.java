import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {
    public static void operations(List<Person> arr,int tiempo,int contador) {
        Iterator<Person> itr=arr.iterator();
        
        while(itr.hasNext()){
            Person personita = itr.next();

            System.out.println("\n tiempo="+tiempo);
            personita.setoperations(personita.getoperations()-1);
            if(personita.getName()=="Alex"){              
                contador++;
                if(personita.getoperations()==0){
                    System.out.println("Operaciones realizadas:"+contador);
                    System.out.println("Operaciones completadas");
                    return ;
                }                    
            }

            if(personita.getoperations() == 0) {
                itr.remove();
            }
            System.out.println("Operaciones realizadas:"+contador);
            tiempo++;
        }

        Result.operations(arr, tiempo, contador);

    }
}

class Change {
    public static List<Person> oneList(int Alex,List<Integer> arr) {
        List<Person> people = new ArrayList<>();
        String defaultName="None";
        for(int i=0; i<arr.size(); i++){
            if(Alex==i){
                people.add(new Person("Alex",arr.get(i)));    
            }
            people.add(new Person(defaultName,arr.get(i)));
        }
        return people;
    }
}


public class Operaciones {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Numero de cliente que deseas ser, ejemplo: 2");
        int Alex = Integer.parseInt(bufferedReader.readLine().trim());
        System.out.println("ingresa las operaciones de los clientes, ejemplo: 1 2 5 ");
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        int tiempo=0,contador=0;
        Result.operations(Change.oneList(Alex-1, arr),tiempo,contador);
        bufferedReader.close();
    }
}

